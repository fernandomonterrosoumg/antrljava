/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacompi;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.antlr.v4.runtime.RuleContext;

public class MyVisitor extends JavaBaseVisitor<Object> {

    private Map<String, Object> variables = new HashMap<>();

    @Override
    public Object visitCompilationUnit(JavaParser.CompilationUnitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        String variableName = ctx.variableDeclaratorId().getText();
        Object value = ctx.variableInitializer().getStart().getText();
        System.out.println("ASIGNACION DE VARIABLE " + variableName + " = " + value);
        variables.put(variableName, value);
        return null;
    }

    @Override
    public Integer visitStatement(JavaParser.StatementContext ctx) {
        RuleContext rc = ctx.getPayload();

        if (ctx.WHILE() != null) {
            JavaParser.ParExpressionContext parExpressionContext = ctx.parExpression();
            JavaParser.ExpressionContext expressionContext = parExpressionContext.expression();
            Object conditionValue = visitExpression(expressionContext);

            System.out.println("CONDICION LOGICA " + expressionContext.getText());

            // Obtener el nombre de la variable
            String variableName = expressionContext.getStart().getText();
            // Obtener el valor de la variable de la tabla de variables
            int variableValue = Integer.parseInt(variables.get(variableName).toString());
            String realExpression = expressionContext.getText().replace(variableName, String.valueOf(variableValue));
            System.out.println("CONDICION SIGNIFICATIVA " + realExpression);

            while (evaluarExpresion(realExpression)) {
                // Visitar y ejecutar el bloque de código dentro del while
                super.visitStatement(ctx.statement(0));

                // Incrementar el valor de la variable en 1
                System.out.println(variableValue);
                variableValue++;

                // Actualizar el valor de la variable en la tabla de variables
                variables.put(variableName, variableValue);

                // Actualizar la expresión con el nuevo valor de la variable
                realExpression = expressionContext.getText().replace(variableName, String.valueOf(variableValue));
            }
        } else if (ctx.statementExpression() != null && ctx.statementExpression().getText().startsWith("System.out.println")) {
        } else if (ctx.statementExpression() != null) {
            String expression = ctx.statementExpression().getText();
            if (expression.startsWith("x")) {
                String[] parts = expression.split("\\s*=\\s*");
                String variableName = parts[0];
                String arithmeticExpression = parts[1];

                int x = Integer.parseInt(variables.get(variableName).toString());

                if (arithmeticExpression.contains("+")) {
                    int valueToAdd = Integer.parseInt(arithmeticExpression.split("\\+")[1]);
                    x = x + valueToAdd;
                } else if (arithmeticExpression.contains("-")) {
                    int valueToSubtract = Integer.parseInt(arithmeticExpression.split("-")[1]);
                    x = x - valueToSubtract;
                }

                variables.put(variableName, x);

                System.out.println("Suma " + variableName + " = " + x);
            } else if (expression.startsWith("edad")) {
                System.out.println("EXPRESION " + ctx.getText());
                String realExpression = ctx.getText().replaceAll("\\bedad\\b", String.valueOf(variables.get("edad").toString()));
                System.out.println("VALOR " + realExpression);

                String[] parts = realExpression.split("\\s*=\\s*");
                String variableName = parts[0].trim();
                String arithmeticExpression = parts[1];

                // This variable stores the final result
                int result = 0;

                // Split by addition and subtraction
                String[] addSubParts = arithmeticExpression.split("(?=[-+])", -1);

                for (String part : addSubParts) {
                    int temp = 0;
                    String operator = "";

                    if (part.contains("+") || part.contains("-")) {
                        operator = part.substring(0, 1);
                        part = part.substring(1);
                    }

                    part = part.replace(";", "").trim(); // remove ';' from the string

                    if (part.contains("/")) {
                        String[] divParts = part.split("/");
                        int a = variables.containsKey(divParts[0].trim()) ? Integer.parseInt(variables.get(divParts[0].trim()).toString()) : Integer.parseInt(divParts[0].trim());
                        int b = variables.containsKey(divParts[1].trim()) ? Integer.parseInt(variables.get(divParts[1].trim()).toString()) : Integer.parseInt(divParts[1].trim());
                        temp = a / b;
                    } else if (part.contains("*")) {
                        String[] multParts = part.split("\\*");
                        int a = variables.containsKey(multParts[0].trim()) ? Integer.parseInt(variables.get(multParts[0].trim()).toString()) : Integer.parseInt(multParts[0].trim());
                        int b = variables.containsKey(multParts[1].trim()) ? Integer.parseInt(variables.get(multParts[1].trim()).toString()) : Integer.parseInt(multParts[1].trim());
                        temp = a * b;
                    } else {
                        temp = variables.containsKey(part.trim()) ? Integer.parseInt(variables.get(part.trim()).toString()) : Integer.parseInt(part.trim());
                    }

                    if (operator.equals("-")) {
                        temp = -temp;
                    }
                    result += temp;
                }

                variables.put(variableName, result);

                System.out.println(variableName + " = " + result);
            }

        }
        
        return (Integer) super.visitStatement(ctx);
    }

    public static boolean evaluarExpresion(String expression) {
        // Realizar la lógica de evaluación de la expresión aquí
        // En este ejemplo, utilizamos el operador eval() de JavaScript
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        try {
            return (boolean) engine.eval(expression);
        } catch (ScriptException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object visitAssignmentOperator(JavaParser.AssignmentOperatorContext ctx) {
        String variableName = ctx.getChild(0).getText();
        Object value = visit(ctx.getChild(2));
        variables.put(variableName, value);

        return null;
    }

    @Override
    public Object visitExpression(JavaParser.ExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            return visit(ctx.getChild(0));
        } else {
            
            //System.out.println("hola "+ctx.children.size());
            //System.out.println("hola "+ctx.getChild(1).getText());
            Object leftValue = visit(ctx.getChild(0));
            Object rightValue = visit(ctx.getChild(2));
            Object operator = ctx.getChild(1).getText();
            System.out.println(operator + " :: " + rightValue + " :: " + leftValue);
            if (operator.equals("+")) {
                return leftValue.toString() + rightValue.toString();
            } else if (operator.equals("-")) {
                return (int) leftValue - (int) rightValue;
            }

            return null;
        }
    }

    @Override
    public Object visitPrimary(JavaParser.PrimaryContext ctx) {
        
        if (ctx.getChildCount() == 3) {
            return visit(ctx);
        } else if (ctx.getChildCount() == 1) {
            String variableName = ctx.getText();
            return variables.get(variableName);
        }

        return null;
    }

}
