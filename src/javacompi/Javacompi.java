/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacompi;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
/**
 *
 * @author Fer
 */
public class Javacompi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String code = "int x = 5;\nSystem.out.println(x);\n";  // reemplaza esto con tu código

        // Crea un lexer y un parser
        //JavaLexer lexer = new JavaLexer(CharStreams.fromString(code));
        //JavaParser parser = new JavaParser(new CommonTokenStream(lexer));

        // Genera el árbol de análisis sintáctico
        //JavaParser.ProgramContext tree = parser.program();
        
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(new File("src/javacompi/input.txt")));
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        JavaVisitor visitor = new MyVisitor();
        visitor.visit(tree); 
    }
    
}
