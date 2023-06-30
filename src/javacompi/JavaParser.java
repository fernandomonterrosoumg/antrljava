// Generated from Java.g4 by ANTLR 4.9.2
package javacompi;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_typeDeclaration = 2, 
		RULE_classOrInterfaceDeclaration = 3, RULE_classOrInterfaceModifiers = 4, 
		RULE_classOrInterfaceModifier = 5, RULE_modifiers = 6, RULE_classDeclaration = 7, 
		RULE_normalClassDeclaration = 8, RULE_typeParameters = 9, RULE_typeParameter = 10, 
		RULE_typeBound = 11, RULE_enumDeclaration = 12, RULE_enumBody = 13, RULE_enumConstants = 14, 
		RULE_enumConstant = 15, RULE_enumBodyDeclarations = 16, RULE_interfaceDeclaration = 17, 
		RULE_normalInterfaceDeclaration = 18, RULE_typeList = 19, RULE_classBody = 20, 
		RULE_interfaceBody = 21, RULE_classBodyDeclaration = 22, RULE_memberDecl = 23, 
		RULE_memberDeclaration = 24, RULE_genericMethodOrConstructorDecl = 25, 
		RULE_genericMethodOrConstructorRest = 26, RULE_methodDeclaration = 27, 
		RULE_fieldDeclaration = 28, RULE_interfaceBodyDeclaration = 29, RULE_interfaceMemberDecl = 30, 
		RULE_interfaceMethodOrFieldDecl = 31, RULE_interfaceMethodOrFieldRest = 32, 
		RULE_methodDeclaratorRest = 33, RULE_voidMethodDeclaratorRest = 34, RULE_interfaceMethodDeclaratorRest = 35, 
		RULE_interfaceGenericMethodDecl = 36, RULE_voidInterfaceMethodDeclaratorRest = 37, 
		RULE_constructorDeclaratorRest = 38, RULE_constantDeclarator = 39, RULE_variableDeclarators = 40, 
		RULE_variableDeclarator = 41, RULE_constantDeclaratorsRest = 42, RULE_constantDeclaratorRest = 43, 
		RULE_variableDeclaratorId = 44, RULE_variableInitializer = 45, RULE_arrayInitializer = 46, 
		RULE_modifier = 47, RULE_packageOrTypeName = 48, RULE_enumConstantName = 49, 
		RULE_typeName = 50, RULE_type = 51, RULE_classOrInterfaceType = 52, RULE_primitiveType = 53, 
		RULE_variableModifier = 54, RULE_typeArguments = 55, RULE_typeArgument = 56, 
		RULE_qualifiedNameList = 57, RULE_formalParameters = 58, RULE_formalParameterDecls = 59, 
		RULE_formalParameterDeclsRest = 60, RULE_methodBody = 61, RULE_constructorBody = 62, 
		RULE_qualifiedName = 63, RULE_literal = 64, RULE_annotations = 65, RULE_annotation = 66, 
		RULE_annotationName = 67, RULE_elementValuePairs = 68, RULE_elementValuePair = 69, 
		RULE_elementValue = 70, RULE_elementValueArrayInitializer = 71, RULE_annotationTypeDeclaration = 72, 
		RULE_annotationTypeBody = 73, RULE_annotationTypeElementDeclaration = 74, 
		RULE_annotationTypeElementRest = 75, RULE_annotationMethodOrConstantRest = 76, 
		RULE_annotationMethodRest = 77, RULE_annotationConstantRest = 78, RULE_defaultValue = 79, 
		RULE_block = 80, RULE_blockStatement = 81, RULE_localVariableDeclarationStatement = 82, 
		RULE_localVariableDeclaration = 83, RULE_variableModifiers = 84, RULE_statement = 85, 
		RULE_catches = 86, RULE_catchClause = 87, RULE_catchType = 88, RULE_finallyBlock = 89, 
		RULE_resourceSpecification = 90, RULE_resources = 91, RULE_resource = 92, 
		RULE_formalParameter = 93, RULE_switchBlockStatementGroups = 94, RULE_switchBlockStatementGroup = 95, 
		RULE_switchLabel = 96, RULE_forControl = 97, RULE_forInit = 98, RULE_enhancedForControl = 99, 
		RULE_forUpdate = 100, RULE_parExpression = 101, RULE_expressionList = 102, 
		RULE_statementExpression = 103, RULE_constantExpression = 104, RULE_expression = 105, 
		RULE_assignmentOperator = 106, RULE_conditionalExpression = 107, RULE_conditionalOrExpression = 108, 
		RULE_conditionalAndExpression = 109, RULE_inclusiveOrExpression = 110, 
		RULE_exclusiveOrExpression = 111, RULE_andExpression = 112, RULE_equalityExpression = 113, 
		RULE_instanceOfExpression = 114, RULE_relationalExpression = 115, RULE_relationalOp = 116, 
		RULE_shiftExpression = 117, RULE_shiftOp = 118, RULE_additiveExpression = 119, 
		RULE_multiplicativeExpression = 120, RULE_unaryExpression = 121, RULE_unaryExpressionNotPlusMinus = 122, 
		RULE_castExpression = 123, RULE_primary = 124, RULE_identifierSuffix = 125, 
		RULE_creator = 126, RULE_createdName = 127, RULE_innerCreator = 128, RULE_arrayCreatorRest = 129, 
		RULE_classCreatorRest = 130, RULE_explicitGenericInvocation = 131, RULE_nonWildcardTypeArguments = 132, 
		RULE_typeArgumentsOrDiamond = 133, RULE_nonWildcardTypeArgumentsOrDiamond = 134, 
		RULE_selector = 135, RULE_superSuffix = 136, RULE_explicitGenericInvocationSuffix = 137, 
		RULE_arguments = 138;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "packageDeclaration", "typeDeclaration", "classOrInterfaceDeclaration", 
			"classOrInterfaceModifiers", "classOrInterfaceModifier", "modifiers", 
			"classDeclaration", "normalClassDeclaration", "typeParameters", "typeParameter", 
			"typeBound", "enumDeclaration", "enumBody", "enumConstants", "enumConstant", 
			"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
			"typeList", "classBody", "interfaceBody", "classBodyDeclaration", "memberDecl", 
			"memberDeclaration", "genericMethodOrConstructorDecl", "genericMethodOrConstructorRest", 
			"methodDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
			"interfaceMemberDecl", "interfaceMethodOrFieldDecl", "interfaceMethodOrFieldRest", 
			"methodDeclaratorRest", "voidMethodDeclaratorRest", "interfaceMethodDeclaratorRest", 
			"interfaceGenericMethodDecl", "voidInterfaceMethodDeclaratorRest", "constructorDeclaratorRest", 
			"constantDeclarator", "variableDeclarators", "variableDeclarator", "constantDeclaratorsRest", 
			"constantDeclaratorRest", "variableDeclaratorId", "variableInitializer", 
			"arrayInitializer", "modifier", "packageOrTypeName", "enumConstantName", 
			"typeName", "type", "classOrInterfaceType", "primitiveType", "variableModifier", 
			"typeArguments", "typeArgument", "qualifiedNameList", "formalParameters", 
			"formalParameterDecls", "formalParameterDeclsRest", "methodBody", "constructorBody", 
			"qualifiedName", "literal", "annotations", "annotation", "annotationName", 
			"elementValuePairs", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
			"annotationTypeDeclaration", "annotationTypeBody", "annotationTypeElementDeclaration", 
			"annotationTypeElementRest", "annotationMethodOrConstantRest", "annotationMethodRest", 
			"annotationConstantRest", "defaultValue", "block", "blockStatement", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "variableModifiers", 
			"statement", "catches", "catchClause", "catchType", "finallyBlock", "resourceSpecification", 
			"resources", "resource", "formalParameter", "switchBlockStatementGroups", 
			"switchBlockStatementGroup", "switchLabel", "forControl", "forInit", 
			"enhancedForControl", "forUpdate", "parExpression", "expressionList", 
			"statementExpression", "constantExpression", "expression", "assignmentOperator", 
			"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
			"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
			"instanceOfExpression", "relationalExpression", "relationalOp", "shiftExpression", 
			"shiftOp", "additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"unaryExpressionNotPlusMinus", "castExpression", "primary", "identifierSuffix", 
			"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
			"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
			"nonWildcardTypeArgumentsOrDiamond", "selector", "superSuffix", "explicitGenericInvocationSuffix", 
			"arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
			"'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", 
			"ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", 
			"XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", 
			"Identifier", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				annotations();
				setState(293);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					setState(279);
					packageDeclaration();
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
						{
						{
						setState(280);
						typeDeclaration();
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ABSTRACT:
				case CLASS:
				case ENUM:
				case FINAL:
				case INTERFACE:
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
				case STATIC:
				case STRICTFP:
				case AT:
					{
					setState(286);
					classOrInterfaceDeclaration();
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
						{
						{
						setState(287);
						typeDeclaration();
						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PACKAGE) {
					{
					setState(297);
					packageDeclaration();
					}
				}

				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
					{
					{
					setState(300);
					typeDeclaration();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(306);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PACKAGE);
			setState(310);
			qualifiedName();
			setState(311);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeDeclaration);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case CLASS:
			case ENUM:
			case FINAL:
			case INTERFACE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				classOrInterfaceDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceDeclarationContext extends ParserRuleContext {
		public ClassOrInterfaceModifiersContext classOrInterfaceModifiers() {
			return getRuleContext(ClassOrInterfaceModifiersContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() throws RecognitionException {
		ClassOrInterfaceDeclarationContext _localctx = new ClassOrInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classOrInterfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			classOrInterfaceModifiers();
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
			case ENUM:
				{
				setState(318);
				classDeclaration();
				}
				break;
			case INTERFACE:
			case AT:
				{
				setState(319);
				interfaceDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifiersContext extends ParserRuleContext {
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public ClassOrInterfaceModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifiersContext classOrInterfaceModifiers() throws RecognitionException {
		ClassOrInterfaceModifiersContext _localctx = new ClassOrInterfaceModifiersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classOrInterfaceModifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					classOrInterfaceModifier();
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifiersContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_modifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(332);
					modifier();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				normalClassDeclaration();
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				enumDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(CLASS);
			setState(343);
			match(Identifier);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(344);
				typeParameters();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(347);
				match(EXTENDS);
				setState(348);
				type();
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(351);
				match(IMPLEMENTS);
				setState(352);
				typeList();
				}
			}

			setState(355);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LT);
			setState(358);
			typeParameter();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				typeParameter();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Identifier);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(369);
				match(EXTENDS);
				setState(370);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			type();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(374);
				match(BITAND);
				setState(375);
				type();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(JavaParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(ENUM);
			setState(382);
			match(Identifier);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(383);
				match(IMPLEMENTS);
				setState(384);
				typeList();
				}
			}

			setState(387);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LBRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(390);
				enumConstants();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(393);
				match(COMMA);
				}
			}

			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(396);
				enumBodyDeclarations();
				}
			}

			setState(399);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			enumConstant();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					enumConstant();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationsContext annotations() {
			return getRuleContext(AnnotationsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(409);
				annotations();
				}
			}

			setState(412);
			match(Identifier);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(413);
				arguments();
				}
			}

			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(416);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(SEMI);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(420);
				classBodyDeclaration();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_interfaceDeclaration);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				normalInterfaceDeclaration();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				annotationTypeDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(INTERFACE);
			setState(431);
			match(Identifier);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(432);
				typeParameters();
				}
			}

			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(435);
				match(EXTENDS);
				setState(436);
				typeList();
				}
			}

			setState(439);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			type();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(442);
				match(COMMA);
				setState(443);
				type();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(LBRACE);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(450);
				classBodyDeclaration();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(LBRACE);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(459);
				interfaceBodyDeclaration();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public MemberDeclContext memberDecl() {
			return getRuleContext(MemberDeclContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classBodyDeclaration);
		int _la;
		try {
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(468);
					match(STATIC);
					}
				}

				setState(471);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				modifiers();
				setState(473);
				memberDecl();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclContext extends ParserRuleContext {
		public GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() {
			return getRuleContext(GenericMethodOrConstructorDeclContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() {
			return getRuleContext(VoidMethodDeclaratorRestContext.class,0);
		}
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclContext memberDecl() throws RecognitionException {
		MemberDeclContext _localctx = new MemberDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_memberDecl);
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				genericMethodOrConstructorDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				memberDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				match(VOID);
				setState(480);
				match(Identifier);
				setState(481);
				voidMethodDeclaratorRest();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(Identifier);
				setState(483);
				constructorDeclaratorRest();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				interfaceDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				classDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_memberDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			type();
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(489);
				methodDeclaration();
				}
				break;
			case 2:
				{
				setState(490);
				fieldDeclaration();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() {
			return getRuleContext(GenericMethodOrConstructorRestContext.class,0);
		}
		public GenericMethodOrConstructorDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodOrConstructorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorDeclContext genericMethodOrConstructorDecl() throws RecognitionException {
		GenericMethodOrConstructorDeclContext _localctx = new GenericMethodOrConstructorDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_genericMethodOrConstructorDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			typeParameters();
			setState(494);
			genericMethodOrConstructorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodOrConstructorRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public ConstructorDeclaratorRestContext constructorDeclaratorRest() {
			return getRuleContext(ConstructorDeclaratorRestContext.class,0);
		}
		public GenericMethodOrConstructorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodOrConstructorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGenericMethodOrConstructorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericMethodOrConstructorRestContext genericMethodOrConstructorRest() throws RecognitionException {
		GenericMethodOrConstructorRestContext _localctx = new GenericMethodOrConstructorRestContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericMethodOrConstructorRest);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BOOLEAN:
				case BYTE:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case LONG:
				case SHORT:
				case Identifier:
					{
					setState(496);
					type();
					}
					break;
				case VOID:
					{
					setState(497);
					match(VOID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500);
				match(Identifier);
				setState(501);
				methodDeclaratorRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(Identifier);
				setState(503);
				constructorDeclaratorRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public MethodDeclaratorRestContext methodDeclaratorRest() {
			return getRuleContext(MethodDeclaratorRestContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_methodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(Identifier);
			setState(507);
			methodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			variableDeclarators();
			setState(510);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public InterfaceMemberDeclContext interfaceMemberDecl() {
			return getRuleContext(InterfaceMemberDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceBodyDeclaration);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				modifiers();
				setState(513);
				interfaceMemberDecl();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclContext extends ParserRuleContext {
		public InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() {
			return getRuleContext(InterfaceMethodOrFieldDeclContext.class,0);
		}
		public InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() {
			return getRuleContext(InterfaceGenericMethodDeclContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() {
			return getRuleContext(VoidInterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMemberDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclContext interfaceMemberDecl() throws RecognitionException {
		InterfaceMemberDeclContext _localctx = new InterfaceMemberDeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMemberDecl);
		try {
			setState(525);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				interfaceMethodOrFieldDecl();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				interfaceGenericMethodDecl();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				match(VOID);
				setState(521);
				match(Identifier);
				setState(522);
				voidInterfaceMethodDeclaratorRest();
				}
				break;
			case INTERFACE:
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				interfaceDeclaration();
				}
				break;
			case CLASS:
			case ENUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
				classDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() {
			return getRuleContext(InterfaceMethodOrFieldRestContext.class,0);
		}
		public InterfaceMethodOrFieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldDeclContext interfaceMethodOrFieldDecl() throws RecognitionException {
		InterfaceMethodOrFieldDeclContext _localctx = new InterfaceMethodOrFieldDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_interfaceMethodOrFieldDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			type();
			setState(528);
			match(Identifier);
			setState(529);
			interfaceMethodOrFieldRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodOrFieldRestContext extends ParserRuleContext {
		public ConstantDeclaratorsRestContext constantDeclaratorsRest() {
			return getRuleContext(ConstantDeclaratorsRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public InterfaceMethodOrFieldRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodOrFieldRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodOrFieldRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodOrFieldRestContext interfaceMethodOrFieldRest() throws RecognitionException {
		InterfaceMethodOrFieldRestContext _localctx = new InterfaceMethodOrFieldRestContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interfaceMethodOrFieldRest);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				constantDeclaratorsRest();
				setState(532);
				match(SEMI);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				interfaceMethodDeclaratorRest();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorRestContext methodDeclaratorRest() throws RecognitionException {
		MethodDeclaratorRestContext _localctx = new MethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_methodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			formalParameters();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(538);
				match(LBRACK);
				setState(539);
				match(RBRACK);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(545);
				match(THROWS);
				setState(546);
				qualifiedNameList();
				}
			}

			setState(551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(549);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(550);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidMethodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidMethodDeclaratorRestContext voidMethodDeclaratorRest() throws RecognitionException {
		VoidMethodDeclaratorRestContext _localctx = new VoidMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_voidMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			formalParameters();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(554);
				match(THROWS);
				setState(555);
				qualifiedNameList();
				}
			}

			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(558);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(559);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() throws RecognitionException {
		InterfaceMethodDeclaratorRestContext _localctx = new InterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_interfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			formalParameters();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(563);
				match(LBRACK);
				setState(564);
				match(RBRACK);
				}
				}
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(570);
				match(THROWS);
				setState(571);
				qualifiedNameList();
				}
			}

			setState(574);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceGenericMethodDeclContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceMethodDeclaratorRestContext interfaceMethodDeclaratorRest() {
			return getRuleContext(InterfaceMethodDeclaratorRestContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public InterfaceGenericMethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceGenericMethodDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInterfaceGenericMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceGenericMethodDeclContext interfaceGenericMethodDecl() throws RecognitionException {
		InterfaceGenericMethodDeclContext _localctx = new InterfaceGenericMethodDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceGenericMethodDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			typeParameters();
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(577);
				type();
				}
				break;
			case VOID:
				{
				setState(578);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(581);
			match(Identifier);
			setState(582);
			interfaceMethodDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidInterfaceMethodDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public VoidInterfaceMethodDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidInterfaceMethodDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVoidInterfaceMethodDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidInterfaceMethodDeclaratorRestContext voidInterfaceMethodDeclaratorRest() throws RecognitionException {
		VoidInterfaceMethodDeclaratorRestContext _localctx = new VoidInterfaceMethodDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_voidInterfaceMethodDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			formalParameters();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(585);
				match(THROWS);
				setState(586);
				qualifiedNameList();
				}
			}

			setState(589);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorRestContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(JavaParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorRestContext constructorDeclaratorRest() throws RecognitionException {
		ConstructorDeclaratorRestContext _localctx = new ConstructorDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constructorDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			formalParameters();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(592);
				match(THROWS);
				setState(593);
				qualifiedNameList();
				}
			}

			setState(596);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_constantDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(Identifier);
			setState(599);
			constantDeclaratorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			variableDeclarator();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(602);
				match(COMMA);
				setState(603);
				variableDeclarator();
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			variableDeclaratorId();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(610);
				match(ASSIGN);
				setState(611);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorsRestContext extends ParserRuleContext {
		public ConstantDeclaratorRestContext constantDeclaratorRest() {
			return getRuleContext(ConstantDeclaratorRestContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstantDeclaratorsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorsRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorsRestContext constantDeclaratorsRest() throws RecognitionException {
		ConstantDeclaratorsRestContext _localctx = new ConstantDeclaratorsRestContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constantDeclaratorsRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			constantDeclaratorRest();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(615);
				match(COMMA);
				setState(616);
				constantDeclarator();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorRestContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ConstantDeclaratorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaratorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantDeclaratorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorRestContext constantDeclaratorRest() throws RecognitionException {
		ConstantDeclaratorRestContext _localctx = new ConstantDeclaratorRestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_constantDeclaratorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(622);
				match(LBRACK);
				setState(623);
				match(RBRACK);
				}
				}
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(629);
			match(ASSIGN);
			setState(630);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(Identifier);
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(633);
				match(LBRACK);
				setState(634);
				match(RBRACK);
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableInitializer);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(LBRACE);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(645);
				variableInitializer();
				setState(650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(646);
						match(COMMA);
						setState(647);
						variableInitializer();
						}
						} 
					}
					setState(652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(653);
					match(COMMA);
					}
				}

				}
			}

			setState(658);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(JavaParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(JavaParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(JavaParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public TerminalNode NATIVE() { return getToken(JavaParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(JavaParser.TRANSIENT, 0); }
		public TerminalNode VOLATILE() { return getToken(JavaParser.VOLATILE, 0); }
		public TerminalNode STRICTFP() { return getToken(JavaParser.STRICTFP, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_modifier);
		int _la;
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(660);
				annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageOrTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_packageOrTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnumConstantName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(670);
				classOrInterfaceType();
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(671);
					match(LBRACK);
					setState(672);
					match(RBRACK);
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				primitiveType();
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(679);
					match(LBRACK);
					setState(680);
					match(RBRACK);
					}
					}
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassOrInterfaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(Identifier);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(689);
				typeArguments();
				}
			}

			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(692);
				match(DOT);
				setState(693);
				match(Identifier);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(694);
					typeArguments();
					}
				}

				}
				}
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(JavaParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(JavaParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(JavaParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(JavaParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(JavaParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public TerminalNode FINAL() { return getToken(JavaParser.FINAL, 0); }
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableModifier);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				annotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(LT);
			setState(709);
			typeArgument();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(710);
				match(COMMA);
				setState(711);
				typeArgument();
				}
				}
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public TerminalNode EXTENDS() { return getToken(JavaParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeArgument);
		int _la;
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(QUESTION);
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(721);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(722);
					type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			qualifiedName();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(728);
				match(COMMA);
				setState(729);
				qualifiedName();
				}
				}
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(LPAREN);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(736);
				formalParameterDecls();
				}
			}

			setState(739);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalParameterDeclsRestContext formalParameterDeclsRest() {
			return getRuleContext(FormalParameterDeclsRestContext.class,0);
		}
		public FormalParameterDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDecls; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsContext formalParameterDecls() throws RecognitionException {
		FormalParameterDeclsContext _localctx = new FormalParameterDeclsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_formalParameterDecls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			variableModifiers();
			setState(742);
			type();
			setState(743);
			formalParameterDeclsRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterDeclsRestContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JavaParser.COMMA, 0); }
		public FormalParameterDeclsContext formalParameterDecls() {
			return getRuleContext(FormalParameterDeclsContext.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(JavaParser.ELLIPSIS, 0); }
		public FormalParameterDeclsRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterDeclsRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameterDeclsRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterDeclsRestContext formalParameterDeclsRest() throws RecognitionException {
		FormalParameterDeclsRestContext _localctx = new FormalParameterDeclsRestContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameterDeclsRest);
		int _la;
		try {
			setState(752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				variableDeclaratorId();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(746);
					match(COMMA);
					setState(747);
					formalParameterDecls();
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(750);
				match(ELLIPSIS);
				setState(751);
				variableDeclaratorId();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(Identifier);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(759);
				match(DOT);
				setState(760);
				match(Identifier);
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(JavaParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(JavaParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(JavaParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(JavaParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(JavaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(JavaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationsContext annotations() throws RecognitionException {
		AnnotationsContext _localctx = new AnnotationsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_annotations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(769); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(768);
					annotation();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(771); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public AnnotationNameContext annotationName() {
			return getRuleContext(AnnotationNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(AT);
			setState(774);
			annotationName();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(775);
				match(LPAREN);
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(776);
					elementValuePairs();
					}
					break;
				case 2:
					{
					setState(777);
					elementValue();
					}
					break;
				}
				setState(780);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public AnnotationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNameContext annotationName() throws RecognitionException {
		AnnotationNameContext _localctx = new AnnotationNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_annotationName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(Identifier);
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(784);
				match(DOT);
				setState(785);
				match(Identifier);
				}
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			elementValuePair();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(792);
				match(COMMA);
				setState(793);
				elementValuePair();
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(Identifier);
			setState(800);
			match(ASSIGN);
			setState(801);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_elementValue);
		try {
			setState(806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				conditionalExpression();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				annotation();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				elementValueArrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elementValueArrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(LBRACE);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				setState(809);
				elementValue();
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(810);
						match(COMMA);
						setState(811);
						elementValue();
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
			}

			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(819);
				match(COMMA);
				}
			}

			setState(822);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(JavaParser.AT, 0); }
		public TerminalNode INTERFACE() { return getToken(JavaParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_annotationTypeDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(AT);
			setState(825);
			match(INTERFACE);
			setState(826);
			match(Identifier);
			setState(827);
			annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<AnnotationTypeElementDeclarationContext> annotationTypeElementDeclaration() {
			return getRuleContexts(AnnotationTypeElementDeclarationContext.class);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration(int i) {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(LBRACE);
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE) | (1L << SEMI))) != 0) || _la==Identifier || _la==AT) {
				{
				{
				setState(830);
				annotationTypeElementDeclaration();
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifiersContext modifiers() {
			return getRuleContext(ModifiersContext.class,0);
		}
		public AnnotationTypeElementRestContext annotationTypeElementRest() {
			return getRuleContext(AnnotationTypeElementRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_annotationTypeElementDeclaration);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				modifiers();
				setState(839);
				annotationTypeElementRest();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementRestContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() {
			return getRuleContext(AnnotationMethodOrConstantRestContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public AnnotationTypeElementRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationTypeElementRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementRestContext annotationTypeElementRest() throws RecognitionException {
		AnnotationTypeElementRestContext _localctx = new AnnotationTypeElementRestContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_annotationTypeElementRest);
		try {
			setState(864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				type();
				setState(845);
				annotationMethodOrConstantRest();
				setState(846);
				match(SEMI);
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				normalClassDeclaration();
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(849);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case INTERFACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				normalInterfaceDeclaration();
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(853);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				enumDeclaration();
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(857);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(860);
				annotationTypeDeclaration();
				setState(862);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(861);
					match(SEMI);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodOrConstantRestContext extends ParserRuleContext {
		public AnnotationMethodRestContext annotationMethodRest() {
			return getRuleContext(AnnotationMethodRestContext.class,0);
		}
		public AnnotationConstantRestContext annotationConstantRest() {
			return getRuleContext(AnnotationConstantRestContext.class,0);
		}
		public AnnotationMethodOrConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodOrConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodOrConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodOrConstantRestContext annotationMethodOrConstantRest() throws RecognitionException {
		AnnotationMethodOrConstantRestContext _localctx = new AnnotationMethodOrConstantRestContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_annotationMethodOrConstantRest);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				annotationMethodRest();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(867);
				annotationConstantRest();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationMethodRestContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationMethodRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationMethodRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationMethodRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationMethodRestContext annotationMethodRest() throws RecognitionException {
		AnnotationMethodRestContext _localctx = new AnnotationMethodRestContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_annotationMethodRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(Identifier);
			setState(871);
			match(LPAREN);
			setState(872);
			match(RPAREN);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(873);
				defaultValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationConstantRestContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public AnnotationConstantRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationConstantRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnnotationConstantRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationConstantRestContext annotationConstantRest() throws RecognitionException {
		AnnotationConstantRestContext _localctx = new AnnotationConstantRestContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_annotationConstantRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(DEFAULT);
			setState(879);
			elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(LBRACE);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(882);
				blockStatement();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(888);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public ClassOrInterfaceDeclarationContext classOrInterfaceDeclaration() {
			return getRuleContext(ClassOrInterfaceDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_blockStatement);
		try {
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(890);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				classOrInterfaceDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			localVariableDeclaration();
			setState(896);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			variableModifiers();
			setState(899);
			type();
			setState(900);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifiersContext extends ParserRuleContext {
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public VariableModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVariableModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableModifiersContext variableModifiers() throws RecognitionException {
		VariableModifiersContext _localctx = new VariableModifiersContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_variableModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(902);
				variableModifier();
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(JavaParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(JavaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(JavaParser.DO, 0); }
		public TerminalNode TRY() { return getToken(JavaParser.TRY, 0); }
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(JavaParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(JavaParser.LBRACE, 0); }
		public SwitchBlockStatementGroupsContext switchBlockStatementGroups() {
			return getRuleContext(SwitchBlockStatementGroupsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JavaParser.RBRACE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(JavaParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(JavaParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(JavaParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode CONTINUE() { return getToken(JavaParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_statement);
		int _la;
		try {
			setState(994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(ASSERT);
				setState(910);
				expression();
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(911);
					match(COLON);
					setState(912);
					expression();
					}
				}

				setState(915);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(IF);
				setState(918);
				parExpression();
				setState(919);
				statement();
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(920);
					match(ELSE);
					setState(921);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(924);
				match(FOR);
				setState(925);
				match(LPAREN);
				setState(926);
				forControl();
				setState(927);
				match(RPAREN);
				setState(928);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(930);
				match(WHILE);
				setState(931);
				parExpression();
				setState(932);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(934);
				match(DO);
				setState(935);
				statement();
				setState(936);
				match(WHILE);
				setState(937);
				parExpression();
				setState(938);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(940);
				match(TRY);
				setState(941);
				block();
				setState(947);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(942);
					catches();
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(943);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(946);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(949);
				match(TRY);
				setState(950);
				resourceSpecification();
				setState(951);
				block();
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(952);
					catches();
					}
				}

				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(955);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(958);
				match(SWITCH);
				setState(959);
				parExpression();
				setState(960);
				match(LBRACE);
				setState(961);
				switchBlockStatementGroups();
				setState(962);
				match(RBRACE);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(964);
				match(SYNCHRONIZED);
				setState(965);
				parExpression();
				setState(966);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(968);
				match(RETURN);
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(969);
					expression();
					}
				}

				setState(972);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(973);
				match(THROW);
				setState(974);
				expression();
				setState(975);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(977);
				match(BREAK);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(978);
					match(Identifier);
					}
				}

				setState(981);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(982);
				match(CONTINUE);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(983);
					match(Identifier);
					}
				}

				setState(986);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(987);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(988);
				statementExpression();
				setState(989);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(991);
				match(Identifier);
				setState(992);
				match(COLON);
				setState(993);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(996);
				catchClause();
				}
				}
				setState(999); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CATCH );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(JavaParser.CATCH, 0); }
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(CATCH);
			setState(1002);
			match(LPAREN);
			setState(1003);
			variableModifiers();
			setState(1004);
			catchType();
			setState(1005);
			match(Identifier);
			setState(1006);
			match(RPAREN);
			setState(1007);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			qualifiedName();
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1010);
				match(BITOR);
				setState(1011);
				qualifiedName();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(JavaParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(FINALLY);
			setState(1018);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JavaParser.SEMI, 0); }
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResourceSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(LPAREN);
			setState(1021);
			resources();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1022);
				match(SEMI);
				}
			}

			setState(1025);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			resource();
			setState(1032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1028);
					match(SEMI);
					setState(1029);
					resource();
					}
					} 
				}
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			variableModifiers();
			setState(1036);
			classOrInterfaceType();
			setState(1037);
			variableDeclaratorId();
			setState(1038);
			match(ASSIGN);
			setState(1039);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			variableModifiers();
			setState(1042);
			type();
			setState(1043);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupsContext extends ParserRuleContext {
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public SwitchBlockStatementGroupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroups; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupsContext switchBlockStatementGroups() throws RecognitionException {
		SwitchBlockStatementGroupsContext _localctx = new SwitchBlockStatementGroupsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_switchBlockStatementGroups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1045);
				switchBlockStatementGroup();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_switchBlockStatementGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1051);
					switchLabel();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1054); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(1056);
				blockStatement();
				}
				}
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(JavaParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(JavaParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_switchLabel);
		try {
			setState(1072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1062);
				match(CASE);
				setState(1063);
				constantExpression();
				setState(1064);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(CASE);
				setState(1067);
				enumConstantName();
				setState(1068);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1070);
				match(DEFAULT);
				setState(1071);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JavaParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JavaParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forControl);
		int _la;
		try {
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
					{
					setState(1075);
					forInit();
					}
				}

				setState(1078);
				match(SEMI);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1079);
					expression();
					}
				}

				setState(1082);
				match(SEMI);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(1083);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forInit);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1088);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1089);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public VariableModifiersContext variableModifiers() {
			return getRuleContext(VariableModifiersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			variableModifiers();
			setState(1093);
			type();
			setState(1094);
			match(Identifier);
			setState(1095);
			match(COLON);
			setState(1096);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(LPAREN);
			setState(1101);
			expression();
			setState(1102);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JavaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JavaParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			expression();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1105);
				match(COMMA);
				setState(1106);
				expression();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			conditionalExpression();
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) {
				{
				setState(1117);
				assignmentOperator();
				setState(1118);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(JavaParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(JavaParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(JavaParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(JavaParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JavaParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JavaParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(JavaParser.XOR_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(JavaParser.MOD_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JavaParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JavaParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JavaParser.URSHIFT_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (ASSIGN - 66)) | (1L << (ADD_ASSIGN - 66)) | (1L << (SUB_ASSIGN - 66)) | (1L << (MUL_ASSIGN - 66)) | (1L << (DIV_ASSIGN - 66)) | (1L << (AND_ASSIGN - 66)) | (1L << (OR_ASSIGN - 66)) | (1L << (XOR_ASSIGN - 66)) | (1L << (MOD_ASSIGN - 66)) | (1L << (LSHIFT_ASSIGN - 66)) | (1L << (RSHIFT_ASSIGN - 66)) | (1L << (URSHIFT_ASSIGN - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JavaParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JavaParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			conditionalOrExpression();
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(1125);
				match(QUESTION);
				setState(1126);
				expression();
				setState(1127);
				match(COLON);
				setState(1128);
				conditionalExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public List<ConditionalAndExpressionContext> conditionalAndExpression() {
			return getRuleContexts(ConditionalAndExpressionContext.class);
		}
		public ConditionalAndExpressionContext conditionalAndExpression(int i) {
			return getRuleContext(ConditionalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(JavaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(JavaParser.OR, i);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_conditionalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			conditionalAndExpression();
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1133);
				match(OR);
				setState(1134);
				conditionalAndExpression();
				}
				}
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(JavaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(JavaParser.AND, i);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitConditionalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_conditionalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			inclusiveOrExpression();
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1141);
				match(AND);
				setState(1142);
				inclusiveOrExpression();
				}
				}
				setState(1147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> BITOR() { return getTokens(JavaParser.BITOR); }
		public TerminalNode BITOR(int i) {
			return getToken(JavaParser.BITOR, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			exclusiveOrExpression();
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1149);
				match(BITOR);
				setState(1150);
				exclusiveOrExpression();
				}
				}
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> CARET() { return getTokens(JavaParser.CARET); }
		public TerminalNode CARET(int i) {
			return getToken(JavaParser.CARET, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			andExpression();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CARET) {
				{
				{
				setState(1157);
				match(CARET);
				setState(1158);
				andExpression();
				}
				}
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> BITAND() { return getTokens(JavaParser.BITAND); }
		public TerminalNode BITAND(int i) {
			return getToken(JavaParser.BITAND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			equalityExpression();
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(1165);
				match(BITAND);
				setState(1166);
				equalityExpression();
				}
				}
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<InstanceOfExpressionContext> instanceOfExpression() {
			return getRuleContexts(InstanceOfExpressionContext.class);
		}
		public InstanceOfExpressionContext instanceOfExpression(int i) {
			return getRuleContext(InstanceOfExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(JavaParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(JavaParser.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(JavaParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(JavaParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			instanceOfExpression();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(1173);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1174);
				instanceOfExpression();
				}
				}
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceOfExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(JavaParser.INSTANCEOF, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public InstanceOfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceOfExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInstanceOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstanceOfExpressionContext instanceOfExpression() throws RecognitionException {
		InstanceOfExpressionContext _localctx = new InstanceOfExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_instanceOfExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			relationalExpression();
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTANCEOF) {
				{
				setState(1181);
				match(INSTANCEOF);
				setState(1182);
				type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1185);
			shiftExpression();
			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) {
				{
				{
				setState(1186);
				relationalOp();
				setState(1187);
				shiftExpression();
				}
				}
				setState(1193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOpContext extends ParserRuleContext {
		public TerminalNode LE() { return getToken(JavaParser.LE, 0); }
		public TerminalNode GE() { return getToken(JavaParser.GE, 0); }
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitRelationalOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_relationalOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (GT - 67)) | (1L << (LT - 67)) | (1L << (LE - 67)) | (1L << (GE - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOpContext> shiftOp() {
			return getRuleContexts(ShiftOpContext.class);
		}
		public ShiftOpContext shiftOp(int i) {
			return getRuleContext(ShiftOpContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_shiftExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			additiveExpression();
			setState(1202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1197);
					shiftOp();
					setState(1198);
					additiveExpression();
					}
					} 
				}
				setState(1204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShiftOpContext extends ParserRuleContext {
		public Token t1;
		public Token t2;
		public Token t3;
		public List<TerminalNode> LT() { return getTokens(JavaParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(JavaParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(JavaParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(JavaParser.GT, i);
		}
		public ShiftOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitShiftOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOpContext shiftOp() throws RecognitionException {
		ShiftOpContext _localctx = new ShiftOpContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_shiftOp);
		try {
			setState(1212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1205);
				((ShiftOpContext)_localctx).t1 = match(LT);
				setState(1206);
				((ShiftOpContext)_localctx).t2 = match(LT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1208);
				((ShiftOpContext)_localctx).t2 = match(GT);
				setState(1209);
				((ShiftOpContext)_localctx).t3 = match(GT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1210);
				((ShiftOpContext)_localctx).t1 = match(GT);
				setState(1211);
				((ShiftOpContext)_localctx).t2 = match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(JavaParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(JavaParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(JavaParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(JavaParser.SUB, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			multiplicativeExpression();
			setState(1219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(1215);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1216);
				multiplicativeExpression();
				}
				}
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(JavaParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(JavaParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(JavaParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(JavaParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(JavaParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(JavaParser.MOD, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			unaryExpression();
			setState(1227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) {
				{
				{
				setState(1223);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (MUL - 83)) | (1L << (DIV - 83)) | (1L << (MOD - 83)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1224);
				unaryExpression();
				}
				}
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_unaryExpression);
		try {
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1230);
				match(ADD);
				setState(1231);
				unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(SUB);
				setState(1233);
				unaryExpression();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1234);
				match(INC);
				setState(1235);
				unaryExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 4);
				{
				setState(1236);
				match(DEC);
				setState(1237);
				unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(1238);
				unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public TerminalNode TILDE() { return getToken(JavaParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode BANG() { return getToken(JavaParser.BANG, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public TerminalNode INC() { return getToken(JavaParser.INC, 0); }
		public TerminalNode DEC() { return getToken(JavaParser.DEC, 0); }
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitUnaryExpressionNotPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1241);
				match(TILDE);
				setState(1242);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1243);
				match(BANG);
				setState(1244);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1245);
				castExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1246);
				primary();
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK || _la==DOT) {
					{
					{
					setState(1247);
					selector();
					}
					}
					setState(1252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(1253);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_castExpression);
		try {
			setState(1271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1258);
				match(LPAREN);
				setState(1259);
				primitiveType();
				setState(1260);
				match(RPAREN);
				setState(1261);
				unaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1263);
				match(LPAREN);
				setState(1266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1264);
					type();
					}
					break;
				case 2:
					{
					setState(1265);
					expression();
					}
					break;
				}
				setState(1268);
				match(RPAREN);
				setState(1269);
				unaryExpressionNotPlusMinus();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public IdentifierSuffixContext identifierSuffix() {
			return getRuleContext(IdentifierSuffixContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_primary);
		int _la;
		try {
			int _alt;
			setState(1314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1273);
				parExpression();
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(THIS);
				setState(1276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1275);
					arguments();
					}
				}

				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1278);
				match(SUPER);
				setState(1279);
				superSuffix();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(1280);
				literal();
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(1281);
				match(NEW);
				setState(1282);
				creator();
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1283);
				nonWildcardTypeArguments();
				setState(1287);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUPER:
				case Identifier:
					{
					setState(1284);
					explicitGenericInvocationSuffix();
					}
					break;
				case THIS:
					{
					setState(1285);
					match(THIS);
					setState(1286);
					arguments();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 7);
				{
				setState(1289);
				match(Identifier);
				setState(1294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1290);
						match(DOT);
						setState(1291);
						match(Identifier);
						}
						} 
					}
					setState(1296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				}
				setState(1298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1297);
					identifierSuffix();
					}
					break;
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1300);
				primitiveType();
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1301);
					match(LBRACK);
					setState(1302);
					match(RBRACK);
					}
					}
					setState(1307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1308);
				match(DOT);
				setState(1309);
				match(CLASS);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 9);
				{
				setState(1311);
				match(VOID);
				setState(1312);
				match(DOT);
				setState(1313);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSuffixContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public IdentifierSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIdentifierSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSuffixContext identifierSuffix() throws RecognitionException {
		IdentifierSuffixContext _localctx = new IdentifierSuffixContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_identifierSuffix);
		int _la;
		try {
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1316);
					match(LBRACK);
					setState(1317);
					match(RBRACK);
					}
					}
					setState(1320); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LBRACK );
				setState(1322);
				match(DOT);
				setState(1323);
				match(CLASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1324);
				match(LBRACK);
				setState(1325);
				expression();
				setState(1326);
				match(RBRACK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				arguments();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1329);
				match(DOT);
				setState(1330);
				match(CLASS);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1331);
				match(DOT);
				setState(1332);
				explicitGenericInvocation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1333);
				match(DOT);
				setState(1334);
				match(THIS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1335);
				match(DOT);
				setState(1336);
				match(SUPER);
				setState(1337);
				arguments();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1338);
				match(DOT);
				setState(1339);
				match(NEW);
				setState(1341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1340);
					nonWildcardTypeArguments();
					}
				}

				setState(1343);
				innerCreator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_creator);
		try {
			setState(1355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1346);
				nonWildcardTypeArguments();
				setState(1347);
				createdName();
				setState(1348);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				createdName();
				setState(1353);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1351);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1352);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JavaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JavaParser.DOT, i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_createdName);
		int _la;
		try {
			setState(1372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				match(Identifier);
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1358);
					typeArgumentsOrDiamond();
					}
				}

				setState(1368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1361);
					match(DOT);
					setState(1362);
					match(Identifier);
					setState(1364);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1363);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitInnerCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(Identifier);
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1375);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1378);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JavaParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JavaParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JavaParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JavaParser.RBRACK, i);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			match(LBRACK);
			setState(1408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1381);
				match(RBRACK);
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1382);
					match(LBRACK);
					setState(1383);
					match(RBRACK);
					}
					}
					setState(1388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1389);
				arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				{
				setState(1390);
				expression();
				setState(1391);
				match(RBRACK);
				setState(1398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1392);
						match(LBRACK);
						setState(1393);
						expression();
						setState(1394);
						match(RBRACK);
						}
						} 
					}
					setState(1400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
				}
				setState(1405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1401);
						match(LBRACK);
						setState(1402);
						match(RBRACK);
						}
						} 
					}
					setState(1407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			arguments();
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1411);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			nonWildcardTypeArguments();
			setState(1415);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			match(LT);
			setState(1418);
			typeList();
			setState(1419);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_typeArgumentsOrDiamond);
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				match(LT);
				setState(1422);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1423);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JavaParser.LT, 0); }
		public TerminalNode GT() { return getToken(JavaParser.GT, 0); }
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNonWildcardTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				match(LT);
				setState(1427);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationContext explicitGenericInvocation() {
			return getRuleContext(ExplicitGenericInvocationContext.class,0);
		}
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public InnerCreatorContext innerCreator() {
			return getRuleContext(InnerCreatorContext.class,0);
		}
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_selector);
		int _la;
		try {
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				match(DOT);
				setState(1432);
				match(Identifier);
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1433);
					arguments();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1436);
				match(DOT);
				setState(1437);
				explicitGenericInvocation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1438);
				match(DOT);
				setState(1439);
				match(THIS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1440);
				match(DOT);
				setState(1441);
				match(SUPER);
				setState(1442);
				superSuffix();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1443);
				match(DOT);
				setState(1444);
				match(NEW);
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1445);
					nonWildcardTypeArguments();
					}
				}

				setState(1448);
				innerCreator();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1449);
				match(LBRACK);
				setState(1450);
				expression();
				setState(1451);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_superSuffix);
		int _la;
		try {
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1455);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(DOT);
				setState(1457);
				match(Identifier);
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1458);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(JavaParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1463);
				match(SUPER);
				setState(1464);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1465);
				match(Identifier);
				setState(1466);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JavaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JavaParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(LPAREN);
			setState(1471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(1470);
				expressionList();
				}
			}

			setState(1473);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u05c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\3\2\3\2\3\2\7\2\u011c"+
		"\n\2\f\2\16\2\u011f\13\2\3\2\3\2\7\2\u0123\n\2\f\2\16\2\u0126\13\2\5\2"+
		"\u0128\n\2\3\2\3\2\3\2\5\2\u012d\n\2\3\2\7\2\u0130\n\2\f\2\16\2\u0133"+
		"\13\2\3\2\5\2\u0136\n\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u013e\n\4\3\5\3\5"+
		"\3\5\5\5\u0143\n\5\3\6\7\6\u0146\n\6\f\6\16\6\u0149\13\6\3\7\3\7\5\7\u014d"+
		"\n\7\3\b\7\b\u0150\n\b\f\b\16\b\u0153\13\b\3\t\3\t\5\t\u0157\n\t\3\n\3"+
		"\n\3\n\5\n\u015c\n\n\3\n\3\n\5\n\u0160\n\n\3\n\3\n\5\n\u0164\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13\u016c\n\13\f\13\16\13\u016f\13\13\3\13\3\13"+
		"\3\f\3\f\3\f\5\f\u0176\n\f\3\r\3\r\3\r\7\r\u017b\n\r\f\r\16\r\u017e\13"+
		"\r\3\16\3\16\3\16\3\16\5\16\u0184\n\16\3\16\3\16\3\17\3\17\5\17\u018a"+
		"\n\17\3\17\5\17\u018d\n\17\3\17\5\17\u0190\n\17\3\17\3\17\3\20\3\20\3"+
		"\20\7\20\u0197\n\20\f\20\16\20\u019a\13\20\3\21\5\21\u019d\n\21\3\21\3"+
		"\21\5\21\u01a1\n\21\3\21\5\21\u01a4\n\21\3\22\3\22\7\22\u01a8\n\22\f\22"+
		"\16\22\u01ab\13\22\3\23\3\23\5\23\u01af\n\23\3\24\3\24\3\24\5\24\u01b4"+
		"\n\24\3\24\3\24\5\24\u01b8\n\24\3\24\3\24\3\25\3\25\3\25\7\25\u01bf\n"+
		"\25\f\25\16\25\u01c2\13\25\3\26\3\26\7\26\u01c6\n\26\f\26\16\26\u01c9"+
		"\13\26\3\26\3\26\3\27\3\27\7\27\u01cf\n\27\f\27\16\27\u01d2\13\27\3\27"+
		"\3\27\3\30\3\30\5\30\u01d8\n\30\3\30\3\30\3\30\3\30\5\30\u01de\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01e9\n\31\3\32\3\32"+
		"\3\32\5\32\u01ee\n\32\3\33\3\33\3\33\3\34\3\34\5\34\u01f5\n\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01fb\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u0207\n\37\3 \3 \3 \3 \3 \3 \3 \5 \u0210\n \3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\5\"\u021a\n\"\3#\3#\3#\7#\u021f\n#\f#\16#\u0222\13#"+
		"\3#\3#\5#\u0226\n#\3#\3#\5#\u022a\n#\3$\3$\3$\5$\u022f\n$\3$\3$\5$\u0233"+
		"\n$\3%\3%\3%\7%\u0238\n%\f%\16%\u023b\13%\3%\3%\5%\u023f\n%\3%\3%\3&\3"+
		"&\3&\5&\u0246\n&\3&\3&\3&\3\'\3\'\3\'\5\'\u024e\n\'\3\'\3\'\3(\3(\3(\5"+
		"(\u0255\n(\3(\3(\3)\3)\3)\3*\3*\3*\7*\u025f\n*\f*\16*\u0262\13*\3+\3+"+
		"\3+\5+\u0267\n+\3,\3,\3,\7,\u026c\n,\f,\16,\u026f\13,\3-\3-\7-\u0273\n"+
		"-\f-\16-\u0276\13-\3-\3-\3-\3.\3.\3.\7.\u027e\n.\f.\16.\u0281\13.\3/\3"+
		"/\5/\u0285\n/\3\60\3\60\3\60\3\60\7\60\u028b\n\60\f\60\16\60\u028e\13"+
		"\60\3\60\5\60\u0291\n\60\5\60\u0293\n\60\3\60\3\60\3\61\3\61\5\61\u0299"+
		"\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\7\65\u02a4\n\65\f\65"+
		"\16\65\u02a7\13\65\3\65\3\65\3\65\7\65\u02ac\n\65\f\65\16\65\u02af\13"+
		"\65\5\65\u02b1\n\65\3\66\3\66\5\66\u02b5\n\66\3\66\3\66\3\66\5\66\u02ba"+
		"\n\66\7\66\u02bc\n\66\f\66\16\66\u02bf\13\66\3\67\3\67\38\38\58\u02c5"+
		"\n8\39\39\39\39\79\u02cb\n9\f9\169\u02ce\139\39\39\3:\3:\3:\3:\5:\u02d6"+
		"\n:\5:\u02d8\n:\3;\3;\3;\7;\u02dd\n;\f;\16;\u02e0\13;\3<\3<\5<\u02e4\n"+
		"<\3<\3<\3=\3=\3=\3=\3>\3>\3>\5>\u02ef\n>\3>\3>\5>\u02f3\n>\3?\3?\3@\3"+
		"@\3A\3A\3A\7A\u02fc\nA\fA\16A\u02ff\13A\3B\3B\3C\6C\u0304\nC\rC\16C\u0305"+
		"\3D\3D\3D\3D\3D\5D\u030d\nD\3D\5D\u0310\nD\3E\3E\3E\7E\u0315\nE\fE\16"+
		"E\u0318\13E\3F\3F\3F\7F\u031d\nF\fF\16F\u0320\13F\3G\3G\3G\3G\3H\3H\3"+
		"H\5H\u0329\nH\3I\3I\3I\3I\7I\u032f\nI\fI\16I\u0332\13I\5I\u0334\nI\3I"+
		"\5I\u0337\nI\3I\3I\3J\3J\3J\3J\3J\3K\3K\7K\u0342\nK\fK\16K\u0345\13K\3"+
		"K\3K\3L\3L\3L\3L\5L\u034d\nL\3M\3M\3M\3M\3M\3M\5M\u0355\nM\3M\3M\5M\u0359"+
		"\nM\3M\3M\5M\u035d\nM\3M\3M\5M\u0361\nM\5M\u0363\nM\3N\3N\5N\u0367\nN"+
		"\3O\3O\3O\3O\5O\u036d\nO\3P\3P\3Q\3Q\3Q\3R\3R\7R\u0376\nR\fR\16R\u0379"+
		"\13R\3R\3R\3S\3S\3S\5S\u0380\nS\3T\3T\3T\3U\3U\3U\3U\3V\7V\u038a\nV\f"+
		"V\16V\u038d\13V\3W\3W\3W\3W\3W\5W\u0394\nW\3W\3W\3W\3W\3W\3W\3W\5W\u039d"+
		"\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03b3"+
		"\nW\3W\5W\u03b6\nW\3W\3W\3W\3W\5W\u03bc\nW\3W\5W\u03bf\nW\3W\3W\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03cd\nW\3W\3W\3W\3W\3W\3W\3W\5W\u03d6\nW"+
		"\3W\3W\3W\5W\u03db\nW\3W\3W\3W\3W\3W\3W\3W\3W\5W\u03e5\nW\3X\6X\u03e8"+
		"\nX\rX\16X\u03e9\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\7Z\u03f7\nZ\fZ\16Z\u03fa"+
		"\13Z\3[\3[\3[\3\\\3\\\3\\\5\\\u0402\n\\\3\\\3\\\3]\3]\3]\7]\u0409\n]\f"+
		"]\16]\u040c\13]\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3`\7`\u0419\n`\f`\16`\u041c"+
		"\13`\3a\6a\u041f\na\ra\16a\u0420\3a\7a\u0424\na\fa\16a\u0427\13a\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0433\nb\3c\3c\5c\u0437\nc\3c\3c\5c\u043b"+
		"\nc\3c\3c\5c\u043f\nc\5c\u0441\nc\3d\3d\5d\u0445\nd\3e\3e\3e\3e\3e\3e"+
		"\3f\3f\3g\3g\3g\3g\3h\3h\3h\7h\u0456\nh\fh\16h\u0459\13h\3i\3i\3j\3j\3"+
		"k\3k\3k\3k\5k\u0463\nk\3l\3l\3m\3m\3m\3m\3m\3m\5m\u046d\nm\3n\3n\3n\7"+
		"n\u0472\nn\fn\16n\u0475\13n\3o\3o\3o\7o\u047a\no\fo\16o\u047d\13o\3p\3"+
		"p\3p\7p\u0482\np\fp\16p\u0485\13p\3q\3q\3q\7q\u048a\nq\fq\16q\u048d\13"+
		"q\3r\3r\3r\7r\u0492\nr\fr\16r\u0495\13r\3s\3s\3s\7s\u049a\ns\fs\16s\u049d"+
		"\13s\3t\3t\3t\5t\u04a2\nt\3u\3u\3u\3u\7u\u04a8\nu\fu\16u\u04ab\13u\3v"+
		"\3v\3w\3w\3w\3w\7w\u04b3\nw\fw\16w\u04b6\13w\3x\3x\3x\3x\3x\3x\3x\5x\u04bf"+
		"\nx\3y\3y\3y\7y\u04c4\ny\fy\16y\u04c7\13y\3z\3z\3z\7z\u04cc\nz\fz\16z"+
		"\u04cf\13z\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u04da\n{\3|\3|\3|\3|\3|\3|\3"+
		"|\7|\u04e3\n|\f|\16|\u04e6\13|\3|\5|\u04e9\n|\5|\u04eb\n|\3}\3}\3}\3}"+
		"\3}\3}\3}\3}\5}\u04f5\n}\3}\3}\3}\5}\u04fa\n}\3~\3~\3~\5~\u04ff\n~\3~"+
		"\3~\3~\3~\3~\3~\3~\3~\3~\5~\u050a\n~\3~\3~\3~\7~\u050f\n~\f~\16~\u0512"+
		"\13~\3~\5~\u0515\n~\3~\3~\3~\7~\u051a\n~\f~\16~\u051d\13~\3~\3~\3~\3~"+
		"\3~\3~\5~\u0525\n~\3\177\3\177\6\177\u0529\n\177\r\177\16\177\u052a\3"+
		"\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\3\177\3\177\3\177\3\177\5\177\u0540\n\177\3\177\5\177"+
		"\u0543\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5"+
		"\u0080\u054c\n\u0080\5\u0080\u054e\n\u0080\3\u0081\3\u0081\5\u0081\u0552"+
		"\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0557\n\u0081\7\u0081\u0559\n"+
		"\u0081\f\u0081\16\u0081\u055c\13\u0081\3\u0081\5\u0081\u055f\n\u0081\3"+
		"\u0082\3\u0082\5\u0082\u0563\n\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3"+
		"\u0083\3\u0083\7\u0083\u056b\n\u0083\f\u0083\16\u0083\u056e\13\u0083\3"+
		"\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0577\n"+
		"\u0083\f\u0083\16\u0083\u057a\13\u0083\3\u0083\3\u0083\7\u0083\u057e\n"+
		"\u0083\f\u0083\16\u0083\u0581\13\u0083\5\u0083\u0583\n\u0083\3\u0084\3"+
		"\u0084\5\u0084\u0587\n\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u0593\n\u0087\3\u0088\3"+
		"\u0088\3\u0088\5\u0088\u0598\n\u0088\3\u0089\3\u0089\3\u0089\5\u0089\u059d"+
		"\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\5\u0089\u05a9\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u05b0\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\5\u008a"+
		"\u05b6\n\u008a\5\u008a\u05b8\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u05be\n\u008b\3\u008c\3\u008c\5\u008c\u05c2\n\u008c\3\u008c\3\u008c"+
		"\3\u008c\2\2\u008d\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\2\r\6\2\3\3\24\24#%()\n\2\3\3\24\24  #%(),,\60\60\63\63\n\2\5\5\7\7\n"+
		"\n\20\20\26\26\35\35\37\37\'\'\4\2\23\23**\3\2\65:\4\2DD[e\4\2KKNN\4\2"+
		"EFLM\3\2ST\4\2UVZZ\3\2QR\2\u061b\2\u0135\3\2\2\2\4\u0137\3\2\2\2\6\u013d"+
		"\3\2\2\2\b\u013f\3\2\2\2\n\u0147\3\2\2\2\f\u014c\3\2\2\2\16\u0151\3\2"+
		"\2\2\20\u0156\3\2\2\2\22\u0158\3\2\2\2\24\u0167\3\2\2\2\26\u0172\3\2\2"+
		"\2\30\u0177\3\2\2\2\32\u017f\3\2\2\2\34\u0187\3\2\2\2\36\u0193\3\2\2\2"+
		" \u019c\3\2\2\2\"\u01a5\3\2\2\2$\u01ae\3\2\2\2&\u01b0\3\2\2\2(\u01bb\3"+
		"\2\2\2*\u01c3\3\2\2\2,\u01cc\3\2\2\2.\u01dd\3\2\2\2\60\u01e8\3\2\2\2\62"+
		"\u01ea\3\2\2\2\64\u01ef\3\2\2\2\66\u01fa\3\2\2\28\u01fc\3\2\2\2:\u01ff"+
		"\3\2\2\2<\u0206\3\2\2\2>\u020f\3\2\2\2@\u0211\3\2\2\2B\u0219\3\2\2\2D"+
		"\u021b\3\2\2\2F\u022b\3\2\2\2H\u0234\3\2\2\2J\u0242\3\2\2\2L\u024a\3\2"+
		"\2\2N\u0251\3\2\2\2P\u0258\3\2\2\2R\u025b\3\2\2\2T\u0263\3\2\2\2V\u0268"+
		"\3\2\2\2X\u0274\3\2\2\2Z\u027a\3\2\2\2\\\u0284\3\2\2\2^\u0286\3\2\2\2"+
		"`\u0298\3\2\2\2b\u029a\3\2\2\2d\u029c\3\2\2\2f\u029e\3\2\2\2h\u02b0\3"+
		"\2\2\2j\u02b2\3\2\2\2l\u02c0\3\2\2\2n\u02c4\3\2\2\2p\u02c6\3\2\2\2r\u02d7"+
		"\3\2\2\2t\u02d9\3\2\2\2v\u02e1\3\2\2\2x\u02e7\3\2\2\2z\u02f2\3\2\2\2|"+
		"\u02f4\3\2\2\2~\u02f6\3\2\2\2\u0080\u02f8\3\2\2\2\u0082\u0300\3\2\2\2"+
		"\u0084\u0303\3\2\2\2\u0086\u0307\3\2\2\2\u0088\u0311\3\2\2\2\u008a\u0319"+
		"\3\2\2\2\u008c\u0321\3\2\2\2\u008e\u0328\3\2\2\2\u0090\u032a\3\2\2\2\u0092"+
		"\u033a\3\2\2\2\u0094\u033f\3\2\2\2\u0096\u034c\3\2\2\2\u0098\u0362\3\2"+
		"\2\2\u009a\u0366\3\2\2\2\u009c\u0368\3\2\2\2\u009e\u036e\3\2\2\2\u00a0"+
		"\u0370\3\2\2\2\u00a2\u0373\3\2\2\2\u00a4\u037f\3\2\2\2\u00a6\u0381\3\2"+
		"\2\2\u00a8\u0384\3\2\2\2\u00aa\u038b\3\2\2\2\u00ac\u03e4\3\2\2\2\u00ae"+
		"\u03e7\3\2\2\2\u00b0\u03eb\3\2\2\2\u00b2\u03f3\3\2\2\2\u00b4\u03fb\3\2"+
		"\2\2\u00b6\u03fe\3\2\2\2\u00b8\u0405\3\2\2\2\u00ba\u040d\3\2\2\2\u00bc"+
		"\u0413\3\2\2\2\u00be\u041a\3\2\2\2\u00c0\u041e\3\2\2\2\u00c2\u0432\3\2"+
		"\2\2\u00c4\u0440\3\2\2\2\u00c6\u0444\3\2\2\2\u00c8\u0446\3\2\2\2\u00ca"+
		"\u044c\3\2\2\2\u00cc\u044e\3\2\2\2\u00ce\u0452\3\2\2\2\u00d0\u045a\3\2"+
		"\2\2\u00d2\u045c\3\2\2\2\u00d4\u045e\3\2\2\2\u00d6\u0464\3\2\2\2\u00d8"+
		"\u0466\3\2\2\2\u00da\u046e\3\2\2\2\u00dc\u0476\3\2\2\2\u00de\u047e\3\2"+
		"\2\2\u00e0\u0486\3\2\2\2\u00e2\u048e\3\2\2\2\u00e4\u0496\3\2\2\2\u00e6"+
		"\u049e\3\2\2\2\u00e8\u04a3\3\2\2\2\u00ea\u04ac\3\2\2\2\u00ec\u04ae\3\2"+
		"\2\2\u00ee\u04be\3\2\2\2\u00f0\u04c0\3\2\2\2\u00f2\u04c8\3\2\2\2\u00f4"+
		"\u04d9\3\2\2\2\u00f6\u04ea\3\2\2\2\u00f8\u04f9\3\2\2\2\u00fa\u0524\3\2"+
		"\2\2\u00fc\u0542\3\2\2\2\u00fe\u054d\3\2\2\2\u0100\u055e\3\2\2\2\u0102"+
		"\u0560\3\2\2\2\u0104\u0566\3\2\2\2\u0106\u0584\3\2\2\2\u0108\u0588\3\2"+
		"\2\2\u010a\u058b\3\2\2\2\u010c\u0592\3\2\2\2\u010e\u0597\3\2\2\2\u0110"+
		"\u05af\3\2\2\2\u0112\u05b7\3\2\2\2\u0114\u05bd\3\2\2\2\u0116\u05bf\3\2"+
		"\2\2\u0118\u0127\5\u0084C\2\u0119\u011d\5\4\3\2\u011a\u011c\5\6\4\2\u011b"+
		"\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0128\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\5\b\5\2\u0121"+
		"\u0123\5\6\4\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0119\3\2\2\2\u0127\u0120\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7\2"+
		"\2\3\u012a\u0136\3\2\2\2\u012b\u012d\5\4\3\2\u012c\u012b\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u0131\3\2\2\2\u012e\u0130\5\6\4\2\u012f\u012e\3\2"+
		"\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0136\7\2\2\3\u0135\u0118\3\2"+
		"\2\2\u0135\u012c\3\2\2\2\u0136\3\3\2\2\2\u0137\u0138\7\"\2\2\u0138\u0139"+
		"\5\u0080A\2\u0139\u013a\7A\2\2\u013a\5\3\2\2\2\u013b\u013e\5\b\5\2\u013c"+
		"\u013e\7A\2\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013e\7\3\2\2\2"+
		"\u013f\u0142\5\n\6\2\u0140\u0143\5\20\t\2\u0141\u0143\5$\23\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0141\3\2\2\2\u0143\t\3\2\2\2\u0144\u0146\5\f\7\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\13\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014d\5\u0086D\2\u014b"+
		"\u014d\t\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\r\3\2\2\2"+
		"\u014e\u0150\5`\61\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\17\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0157\5\22\n\2\u0155\u0157\5\32\16\2\u0156\u0154\3\2\2\2\u0156\u0155"+
		"\3\2\2\2\u0157\21\3\2\2\2\u0158\u0159\7\13\2\2\u0159\u015b\7f\2\2\u015a"+
		"\u015c\5\24\13\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3"+
		"\2\2\2\u015d\u015e\7\23\2\2\u015e\u0160\5h\65\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u0162\7\32\2\2\u0162\u0164\5"+
		"(\25\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\5*\26\2\u0166\23\3\2\2\2\u0167\u0168\7F\2\2\u0168\u016d\5\26\f"+
		"\2\u0169\u016a\7B\2\2\u016a\u016c\5\26\f\2\u016b\u0169\3\2\2\2\u016c\u016f"+
		"\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u0170\u0171\7E\2\2\u0171\25\3\2\2\2\u0172\u0175\7f\2\2"+
		"\u0173\u0174\7\23\2\2\u0174\u0176\5\30\r\2\u0175\u0173\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\27\3\2\2\2\u0177\u017c\5h\65\2\u0178\u0179\7W\2\2\u0179"+
		"\u017b\5h\65\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\31\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180"+
		"\7\22\2\2\u0180\u0183\7f\2\2\u0181\u0182\7\32\2\2\u0182\u0184\5(\25\2"+
		"\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"+
		"\5\34\17\2\u0186\33\3\2\2\2\u0187\u0189\7=\2\2\u0188\u018a\5\36\20\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\7B"+
		"\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0190\5\"\22\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3"+
		"\2\2\2\u0191\u0192\7>\2\2\u0192\35\3\2\2\2\u0193\u0198\5 \21\2\u0194\u0195"+
		"\7B\2\2\u0195\u0197\5 \21\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\37\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019b\u019d\5\u0084C\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\7f\2\2\u019f\u01a1\5\u0116\u008c\2\u01a0\u019f"+
		"\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5*\26\2\u01a3"+
		"\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4!\3\2\2\2\u01a5\u01a9\7A\2\2\u01a6"+
		"\u01a8\5.\30\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa#\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01af"+
		"\5&\24\2\u01ad\u01af\5\u0092J\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2"+
		"\2\u01af%\3\2\2\2\u01b0\u01b1\7\36\2\2\u01b1\u01b3\7f\2\2\u01b2\u01b4"+
		"\5\24\13\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b6\7\23\2\2\u01b6\u01b8\5(\25\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\5,\27\2\u01ba\'\3\2\2\2\u01bb"+
		"\u01c0\5h\65\2\u01bc\u01bd\7B\2\2\u01bd\u01bf\5h\65\2\u01be\u01bc\3\2"+
		"\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		")\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c7\7=\2\2\u01c4\u01c6\5.\30\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7>\2\2\u01cb"+
		"+\3\2\2\2\u01cc\u01d0\7=\2\2\u01cd\u01cf\5<\37\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2"+
		"\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4-\3\2\2\2\u01d5\u01de"+
		"\7A\2\2\u01d6\u01d8\7(\2\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01de\5\u00a2R\2\u01da\u01db\5\16\b\2\u01db\u01dc"+
		"\5\60\31\2\u01dc\u01de\3\2\2\2\u01dd\u01d5\3\2\2\2\u01dd\u01d7\3\2\2\2"+
		"\u01dd\u01da\3\2\2\2\u01de/\3\2\2\2\u01df\u01e9\5\64\33\2\u01e0\u01e9"+
		"\5\62\32\2\u01e1\u01e2\7\62\2\2\u01e2\u01e3\7f\2\2\u01e3\u01e9\5F$\2\u01e4"+
		"\u01e5\7f\2\2\u01e5\u01e9\5N(\2\u01e6\u01e9\5$\23\2\u01e7\u01e9\5\20\t"+
		"\2\u01e8\u01df\3\2\2\2\u01e8\u01e0\3\2\2\2\u01e8\u01e1\3\2\2\2\u01e8\u01e4"+
		"\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\61\3\2\2\2\u01ea"+
		"\u01ed\5h\65\2\u01eb\u01ee\58\35\2\u01ec\u01ee\5:\36\2\u01ed\u01eb\3\2"+
		"\2\2\u01ed\u01ec\3\2\2\2\u01ee\63\3\2\2\2\u01ef\u01f0\5\24\13\2\u01f0"+
		"\u01f1\5\66\34\2\u01f1\65\3\2\2\2\u01f2\u01f5\5h\65\2\u01f3\u01f5\7\62"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\7f\2\2\u01f7\u01fb\5D#\2\u01f8\u01f9\7f\2\2\u01f9\u01fb\5N(\2\u01fa"+
		"\u01f4\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\67\3\2\2\2\u01fc\u01fd\7f\2\2"+
		"\u01fd\u01fe\5D#\2\u01fe9\3\2\2\2\u01ff\u0200\5R*\2\u0200\u0201\7A\2\2"+
		"\u0201;\3\2\2\2\u0202\u0203\5\16\b\2\u0203\u0204\5> \2\u0204\u0207\3\2"+
		"\2\2\u0205\u0207\7A\2\2\u0206\u0202\3\2\2\2\u0206\u0205\3\2\2\2\u0207"+
		"=\3\2\2\2\u0208\u0210\5@!\2\u0209\u0210\5J&\2\u020a\u020b\7\62\2\2\u020b"+
		"\u020c\7f\2\2\u020c\u0210\5L\'\2\u020d\u0210\5$\23\2\u020e\u0210\5\20"+
		"\t\2\u020f\u0208\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020a\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210?\3\2\2\2\u0211\u0212\5h\65\2"+
		"\u0212\u0213\7f\2\2\u0213\u0214\5B\"\2\u0214A\3\2\2\2\u0215\u0216\5V,"+
		"\2\u0216\u0217\7A\2\2\u0217\u021a\3\2\2\2\u0218\u021a\5H%\2\u0219\u0215"+
		"\3\2\2\2\u0219\u0218\3\2\2\2\u021aC\3\2\2\2\u021b\u0220\5v<\2\u021c\u021d"+
		"\7?\2\2\u021d\u021f\7@\2\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2\2\2\u0220"+
		"\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0225\3\2\2\2\u0222\u0220\3\2"+
		"\2\2\u0223\u0224\7/\2\2\u0224\u0226\5t;\2\u0225\u0223\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u022a\5|?\2\u0228\u022a\7A\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u0228\3\2\2\2\u022aE\3\2\2\2\u022b\u022e\5v<\2\u022c"+
		"\u022d\7/\2\2\u022d\u022f\5t;\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2"+
		"\2\u022f\u0232\3\2\2\2\u0230\u0233\5|?\2\u0231\u0233\7A\2\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0231\3\2\2\2\u0233G\3\2\2\2\u0234\u0239\5v<\2\u0235\u0236"+
		"\7?\2\2\u0236\u0238\7@\2\2\u0237\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023e\3\2\2\2\u023b\u0239\3\2"+
		"\2\2\u023c\u023d\7/\2\2\u023d\u023f\5t;\2\u023e\u023c\3\2\2\2\u023e\u023f"+
		"\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7A\2\2\u0241I\3\2\2\2\u0242\u0245"+
		"\5\24\13\2\u0243\u0246\5h\65\2\u0244\u0246\7\62\2\2\u0245\u0243\3\2\2"+
		"\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7f\2\2\u0248\u0249"+
		"\5H%\2\u0249K\3\2\2\2\u024a\u024d\5v<\2\u024b\u024c\7/\2\2\u024c\u024e"+
		"\5t;\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\7A\2\2\u0250M\3\2\2\2\u0251\u0254\5v<\2\u0252\u0253\7/\2\2\u0253"+
		"\u0255\5t;\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0256\3\2\2"+
		"\2\u0256\u0257\5~@\2\u0257O\3\2\2\2\u0258\u0259\7f\2\2\u0259\u025a\5X"+
		"-\2\u025aQ\3\2\2\2\u025b\u0260\5T+\2\u025c\u025d\7B\2\2\u025d\u025f\5"+
		"T+\2\u025e\u025c\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261S\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0266\5Z.\2\u0264"+
		"\u0265\7D\2\2\u0265\u0267\5\\/\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2"+
		"\2\u0267U\3\2\2\2\u0268\u026d\5X-\2\u0269\u026a\7B\2\2\u026a\u026c\5P"+
		")\2\u026b\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026eW\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7?\2\2\u0271"+
		"\u0273\7@\2\2\u0272\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0274\3\2\2\2\u0277"+
		"\u0278\7D\2\2\u0278\u0279\5\\/\2\u0279Y\3\2\2\2\u027a\u027f\7f\2\2\u027b"+
		"\u027c\7?\2\2\u027c\u027e\7@\2\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2\2"+
		"\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280[\3\2\2\2\u0281\u027f"+
		"\3\2\2\2\u0282\u0285\5^\60\2\u0283\u0285\5\u00d4k\2\u0284\u0282\3\2\2"+
		"\2\u0284\u0283\3\2\2\2\u0285]\3\2\2\2\u0286\u0292\7=\2\2\u0287\u028c\5"+
		"\\/\2\u0288\u0289\7B\2\2\u0289\u028b\5\\/\2\u028a\u0288\3\2\2\2\u028b"+
		"\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0290\3\2"+
		"\2\2\u028e\u028c\3\2\2\2\u028f\u0291\7B\2\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0287\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0295\7>\2\2\u0295_\3\2\2\2\u0296\u0299"+
		"\5\u0086D\2\u0297\u0299\t\3\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2"+
		"\2\u0299a\3\2\2\2\u029a\u029b\5\u0080A\2\u029bc\3\2\2\2\u029c\u029d\7"+
		"f\2\2\u029de\3\2\2\2\u029e\u029f\5\u0080A\2\u029fg\3\2\2\2\u02a0\u02a5"+
		"\5j\66\2\u02a1\u02a2\7?\2\2\u02a2\u02a4\7@\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02b1\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02ad\5l\67\2\u02a9\u02aa\7?\2\2\u02aa"+
		"\u02ac\7@\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2"+
		"\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0"+
		"\u02a0\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b1i\3\2\2\2\u02b2\u02b4\7f\2\2\u02b3"+
		"\u02b5\5p9\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bd\3\2\2"+
		"\2\u02b6\u02b7\7C\2\2\u02b7\u02b9\7f\2\2\u02b8\u02ba\5p9\2\u02b9\u02b8"+
		"\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b6\3\2\2\2\u02bc"+
		"\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02bek\3\2\2\2"+
		"\u02bf\u02bd\3\2\2\2\u02c0\u02c1\t\4\2\2\u02c1m\3\2\2\2\u02c2\u02c5\7"+
		"\24\2\2\u02c3\u02c5\5\u0086D\2\u02c4\u02c2\3\2\2\2\u02c4\u02c3\3\2\2\2"+
		"\u02c5o\3\2\2\2\u02c6\u02c7\7F\2\2\u02c7\u02cc\5r:\2\u02c8\u02c9\7B\2"+
		"\2\u02c9\u02cb\5r:\2\u02ca\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d0\7E\2\2\u02d0q\3\2\2\2\u02d1\u02d8\5h\65\2\u02d2\u02d5\7I\2\2\u02d3"+
		"\u02d4\t\5\2\2\u02d4\u02d6\5h\65\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d1\3\2\2\2\u02d7\u02d2\3\2\2\2\u02d8"+
		"s\3\2\2\2\u02d9\u02de\5\u0080A\2\u02da\u02db\7B\2\2\u02db\u02dd\5\u0080"+
		"A\2\u02dc\u02da\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02dfu\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\7;\2\2\u02e2"+
		"\u02e4\5x=\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\3\2\2"+
		"\2\u02e5\u02e6\7<\2\2\u02e6w\3\2\2\2\u02e7\u02e8\5\u00aaV\2\u02e8\u02e9"+
		"\5h\65\2\u02e9\u02ea\5z>\2\u02eay\3\2\2\2\u02eb\u02ee\5Z.\2\u02ec\u02ed"+
		"\7B\2\2\u02ed\u02ef\5x=\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f3\3\2\2\2\u02f0\u02f1\7h\2\2\u02f1\u02f3\5Z.\2\u02f2\u02eb\3\2\2"+
		"\2\u02f2\u02f0\3\2\2\2\u02f3{\3\2\2\2\u02f4\u02f5\5\u00a2R\2\u02f5}\3"+
		"\2\2\2\u02f6\u02f7\5\u00a2R\2\u02f7\177\3\2\2\2\u02f8\u02fd\7f\2\2\u02f9"+
		"\u02fa\7C\2\2\u02fa\u02fc\7f\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2"+
		"\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0081\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u0300\u0301\t\6\2\2\u0301\u0083\3\2\2\2\u0302\u0304\5\u0086D"+
		"\2\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u0085\3\2\2\2\u0307\u0308\7g\2\2\u0308\u030f\5\u0088E\2"+
		"\u0309\u030c\7;\2\2\u030a\u030d\5\u008aF\2\u030b\u030d\5\u008eH\2\u030c"+
		"\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u0310\7<\2\2\u030f\u0309\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0087\3\2\2\2\u0311\u0316\7f\2\2\u0312\u0313\7C\2\2\u0313\u0315\7f\2"+
		"\2\u0314\u0312\3\2\2\2\u0315\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317\u0089\3\2\2\2\u0318\u0316\3\2\2\2\u0319\u031e\5\u008cG"+
		"\2\u031a\u031b\7B\2\2\u031b\u031d\5\u008cG\2\u031c\u031a\3\2\2\2\u031d"+
		"\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u008b\3\2"+
		"\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7f\2\2\u0322\u0323\7D\2\2\u0323\u0324"+
		"\5\u008eH\2\u0324\u008d\3\2\2\2\u0325\u0329\5\u00d8m\2\u0326\u0329\5\u0086"+
		"D\2\u0327\u0329\5\u0090I\2\u0328\u0325\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0327\3\2\2\2\u0329\u008f\3\2\2\2\u032a\u0333\7=\2\2\u032b\u0330\5\u008e"+
		"H\2\u032c\u032d\7B\2\2\u032d\u032f\5\u008eH\2\u032e\u032c\3\2\2\2\u032f"+
		"\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0334\3\2"+
		"\2\2\u0332\u0330\3\2\2\2\u0333\u032b\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"\u0336\3\2\2\2\u0335\u0337\7B\2\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2"+
		"\2\2\u0337\u0338\3\2\2\2\u0338\u0339\7>\2\2\u0339\u0091\3\2\2\2\u033a"+
		"\u033b\7g\2\2\u033b\u033c\7\36\2\2\u033c\u033d\7f\2\2\u033d\u033e\5\u0094"+
		"K\2\u033e\u0093\3\2\2\2\u033f\u0343\7=\2\2\u0340\u0342\5\u0096L\2\u0341"+
		"\u0340\3\2\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2"+
		"\2\2\u0344\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347\7>\2\2\u0347"+
		"\u0095\3\2\2\2\u0348\u0349\5\16\b\2\u0349\u034a\5\u0098M\2\u034a\u034d"+
		"\3\2\2\2\u034b\u034d\7A\2\2\u034c\u0348\3\2\2\2\u034c\u034b\3\2\2\2\u034d"+
		"\u0097\3\2\2\2\u034e\u034f\5h\65\2\u034f\u0350\5\u009aN\2\u0350\u0351"+
		"\7A\2\2\u0351\u0363\3\2\2\2\u0352\u0354\5\22\n\2\u0353\u0355\7A\2\2\u0354"+
		"\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0363\3\2\2\2\u0356\u0358\5&"+
		"\24\2\u0357\u0359\7A\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u0363\3\2\2\2\u035a\u035c\5\32\16\2\u035b\u035d\7A\2\2\u035c\u035b\3"+
		"\2\2\2\u035c\u035d\3\2\2\2\u035d\u0363\3\2\2\2\u035e\u0360\5\u0092J\2"+
		"\u035f\u0361\7A\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363"+
		"\3\2\2\2\u0362\u034e\3\2\2\2\u0362\u0352\3\2\2\2\u0362\u0356\3\2\2\2\u0362"+
		"\u035a\3\2\2\2\u0362\u035e\3\2\2\2\u0363\u0099\3\2\2\2\u0364\u0367\5\u009c"+
		"O\2\u0365\u0367\5\u009eP\2\u0366\u0364\3\2\2\2\u0366\u0365\3\2\2\2\u0367"+
		"\u009b\3\2\2\2\u0368\u0369\7f\2\2\u0369\u036a\7;\2\2\u036a\u036c\7<\2"+
		"\2\u036b\u036d\5\u00a0Q\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d"+
		"\u009d\3\2\2\2\u036e\u036f\5R*\2\u036f\u009f\3\2\2\2\u0370\u0371\7\16"+
		"\2\2\u0371\u0372\5\u008eH\2\u0372\u00a1\3\2\2\2\u0373\u0377\7=\2\2\u0374"+
		"\u0376\5\u00a4S\2\u0375\u0374\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\3\2\2\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037b\7>\2\2\u037b\u00a3\3\2\2\2\u037c\u0380\5\u00a6T\2\u037d\u0380\5"+
		"\b\5\2\u037e\u0380\5\u00acW\2\u037f\u037c\3\2\2\2\u037f\u037d\3\2\2\2"+
		"\u037f\u037e\3\2\2\2\u0380\u00a5\3\2\2\2\u0381\u0382\5\u00a8U\2\u0382"+
		"\u0383\7A\2\2\u0383\u00a7\3\2\2\2\u0384\u0385\5\u00aaV\2\u0385\u0386\5"+
		"h\65\2\u0386\u0387\5R*\2\u0387\u00a9\3\2\2\2\u0388\u038a\5n8\2\u0389\u0388"+
		"\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u00ab\3\2\2\2\u038d\u038b\3\2\2\2\u038e\u03e5\5\u00a2R\2\u038f\u0390"+
		"\7\4\2\2\u0390\u0393\5\u00d4k\2\u0391\u0392\7J\2\2\u0392\u0394\5\u00d4"+
		"k\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0396\7A\2\2\u0396\u03e5\3\2\2\2\u0397\u0398\7\30\2\2\u0398\u0399\5\u00cc"+
		"g\2\u0399\u039c\5\u00acW\2\u039a\u039b\7\21\2\2\u039b\u039d\5\u00acW\2"+
		"\u039c\u039a\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u03e5\3\2\2\2\u039e\u039f"+
		"\7\27\2\2\u039f\u03a0\7;\2\2\u03a0\u03a1\5\u00c4c\2\u03a1\u03a2\7<\2\2"+
		"\u03a2\u03a3\5\u00acW\2\u03a3\u03e5\3\2\2\2\u03a4\u03a5\7\64\2\2\u03a5"+
		"\u03a6\5\u00ccg\2\u03a6\u03a7\5\u00acW\2\u03a7\u03e5\3\2\2\2\u03a8\u03a9"+
		"\7\17\2\2\u03a9\u03aa\5\u00acW\2\u03aa\u03ab\7\64\2\2\u03ab\u03ac\5\u00cc"+
		"g\2\u03ac\u03ad\7A\2\2\u03ad\u03e5\3\2\2\2\u03ae\u03af\7\61\2\2\u03af"+
		"\u03b5\5\u00a2R\2\u03b0\u03b2\5\u00aeX\2\u03b1\u03b3\5\u00b4[\2\u03b2"+
		"\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b6\5\u00b4"+
		"[\2\u03b5\u03b0\3\2\2\2\u03b5\u03b4\3\2\2\2\u03b6\u03e5\3\2\2\2\u03b7"+
		"\u03b8\7\61\2\2\u03b8\u03b9\5\u00b6\\\2\u03b9\u03bb\5\u00a2R\2\u03ba\u03bc"+
		"\5\u00aeX\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc\u03be\3\2\2"+
		"\2\u03bd\u03bf\5\u00b4[\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03e5\3\2\2\2\u03c0\u03c1\7+\2\2\u03c1\u03c2\5\u00ccg\2\u03c2\u03c3\7"+
		"=\2\2\u03c3\u03c4\5\u00be`\2\u03c4\u03c5\7>\2\2\u03c5\u03e5\3\2\2\2\u03c6"+
		"\u03c7\7,\2\2\u03c7\u03c8\5\u00ccg\2\u03c8\u03c9\5\u00a2R\2\u03c9\u03e5"+
		"\3\2\2\2\u03ca\u03cc\7&\2\2\u03cb\u03cd\5\u00d4k\2\u03cc\u03cb\3\2\2\2"+
		"\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03e5\7A\2\2\u03cf\u03d0"+
		"\7.\2\2\u03d0\u03d1\5\u00d4k\2\u03d1\u03d2\7A\2\2\u03d2\u03e5\3\2\2\2"+
		"\u03d3\u03d5\7\6\2\2\u03d4\u03d6\7f\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6"+
		"\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03e5\7A\2\2\u03d8\u03da\7\r\2\2\u03d9"+
		"\u03db\7f\2\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03e5\7A\2\2\u03dd\u03e5\7A\2\2\u03de\u03df\5\u00d0i\2\u03df"+
		"\u03e0\7A\2\2\u03e0\u03e5\3\2\2\2\u03e1\u03e2\7f\2\2\u03e2\u03e3\7J\2"+
		"\2\u03e3\u03e5\5\u00acW\2\u03e4\u038e\3\2\2\2\u03e4\u038f\3\2\2\2\u03e4"+
		"\u0397\3\2\2\2\u03e4\u039e\3\2\2\2\u03e4\u03a4\3\2\2\2\u03e4\u03a8\3\2"+
		"\2\2\u03e4\u03ae\3\2\2\2\u03e4\u03b7\3\2\2\2\u03e4\u03c0\3\2\2\2\u03e4"+
		"\u03c6\3\2\2\2\u03e4\u03ca\3\2\2\2\u03e4\u03cf\3\2\2\2\u03e4\u03d3\3\2"+
		"\2\2\u03e4\u03d8\3\2\2\2\u03e4\u03dd\3\2\2\2\u03e4\u03de\3\2\2\2\u03e4"+
		"\u03e1\3\2\2\2\u03e5\u00ad\3\2\2\2\u03e6\u03e8\5\u00b0Y\2\u03e7\u03e6"+
		"\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea"+
		"\u00af\3\2\2\2\u03eb\u03ec\7\t\2\2\u03ec\u03ed\7;\2\2\u03ed\u03ee\5\u00aa"+
		"V\2\u03ee\u03ef\5\u00b2Z\2\u03ef\u03f0\7f\2\2\u03f0\u03f1\7<\2\2\u03f1"+
		"\u03f2\5\u00a2R\2\u03f2\u00b1\3\2\2\2\u03f3\u03f8\5\u0080A\2\u03f4\u03f5"+
		"\7X\2\2\u03f5\u03f7\5\u0080A\2\u03f6\u03f4\3\2\2\2\u03f7\u03fa\3\2\2\2"+
		"\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u00b3\3\2\2\2\u03fa\u03f8"+
		"\3\2\2\2\u03fb\u03fc\7\25\2\2\u03fc\u03fd\5\u00a2R\2\u03fd\u00b5\3\2\2"+
		"\2\u03fe\u03ff\7;\2\2\u03ff\u0401\5\u00b8]\2\u0400\u0402\7A\2\2\u0401"+
		"\u0400\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\7<"+
		"\2\2\u0404\u00b7\3\2\2\2\u0405\u040a\5\u00ba^\2\u0406\u0407\7A\2\2\u0407"+
		"\u0409\5\u00ba^\2\u0408\u0406\3\2\2\2\u0409\u040c\3\2\2\2\u040a\u0408"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u00b9\3\2\2\2\u040c\u040a\3\2\2\2\u040d"+
		"\u040e\5\u00aaV\2\u040e\u040f\5j\66\2\u040f\u0410\5Z.\2\u0410\u0411\7"+
		"D\2\2\u0411\u0412\5\u00d4k\2\u0412\u00bb\3\2\2\2\u0413\u0414\5\u00aaV"+
		"\2\u0414\u0415\5h\65\2\u0415\u0416\5Z.\2\u0416\u00bd\3\2\2\2\u0417\u0419"+
		"\5\u00c0a\2\u0418\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2"+
		"\2\u041a\u041b\3\2\2\2\u041b\u00bf\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u041f"+
		"\5\u00c2b\2\u041e\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u041e\3\2\2"+
		"\2\u0420\u0421\3\2\2\2\u0421\u0425\3\2\2\2\u0422\u0424\5\u00a4S\2\u0423"+
		"\u0422\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2"+
		"\2\2\u0426\u00c1\3\2\2\2\u0427\u0425\3\2\2\2\u0428\u0429\7\b\2\2\u0429"+
		"\u042a\5\u00d2j\2\u042a\u042b\7J\2\2\u042b\u0433\3\2\2\2\u042c\u042d\7"+
		"\b\2\2\u042d\u042e\5d\63\2\u042e\u042f\7J\2\2\u042f\u0433\3\2\2\2\u0430"+
		"\u0431\7\16\2\2\u0431\u0433\7J\2\2\u0432\u0428\3\2\2\2\u0432\u042c\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0433\u00c3\3\2\2\2\u0434\u0441\5\u00c8e\2\u0435"+
		"\u0437\5\u00c6d\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438"+
		"\3\2\2\2\u0438\u043a\7A\2\2\u0439\u043b\5\u00d4k\2\u043a\u0439\3\2\2\2"+
		"\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\7A\2\2\u043d\u043f"+
		"\5\u00caf\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441\3\2\2"+
		"\2\u0440\u0434\3\2\2\2\u0440\u0436\3\2\2\2\u0441\u00c5\3\2\2\2\u0442\u0445"+
		"\5\u00a8U\2\u0443\u0445\5\u00ceh\2\u0444\u0442\3\2\2\2\u0444\u0443\3\2"+
		"\2\2\u0445\u00c7\3\2\2\2\u0446\u0447\5\u00aaV\2\u0447\u0448\5h\65\2\u0448"+
		"\u0449\7f\2\2\u0449\u044a\7J\2\2\u044a\u044b\5\u00d4k\2\u044b\u00c9\3"+
		"\2\2\2\u044c\u044d\5\u00ceh\2\u044d\u00cb\3\2\2\2\u044e\u044f\7;\2\2\u044f"+
		"\u0450\5\u00d4k\2\u0450\u0451\7<\2\2\u0451\u00cd\3\2\2\2\u0452\u0457\5"+
		"\u00d4k\2\u0453\u0454\7B\2\2\u0454\u0456\5\u00d4k\2\u0455\u0453\3\2\2"+
		"\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u00cf"+
		"\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\5\u00d4k\2\u045b\u00d1\3\2\2"+
		"\2\u045c\u045d\5\u00d4k\2\u045d\u00d3\3\2\2\2\u045e\u0462\5\u00d8m\2\u045f"+
		"\u0460\5\u00d6l\2\u0460\u0461\5\u00d4k\2\u0461\u0463\3\2\2\2\u0462\u045f"+
		"\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u00d5\3\2\2\2\u0464\u0465\t\7\2\2\u0465"+
		"\u00d7\3\2\2\2\u0466\u046c\5\u00dan\2\u0467\u0468\7I\2\2\u0468\u0469\5"+
		"\u00d4k\2\u0469\u046a\7J\2\2\u046a\u046b\5\u00d8m\2\u046b\u046d\3\2\2"+
		"\2\u046c\u0467\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u00d9\3\2\2\2\u046e\u0473"+
		"\5\u00dco\2\u046f\u0470\7P\2\2\u0470\u0472\5\u00dco\2\u0471\u046f\3\2"+
		"\2\2\u0472\u0475\3\2\2\2\u0473\u0471\3\2\2\2\u0473\u0474\3\2\2\2\u0474"+
		"\u00db\3\2\2\2\u0475\u0473\3\2\2\2\u0476\u047b\5\u00dep\2\u0477\u0478"+
		"\7O\2\2\u0478\u047a\5\u00dep\2\u0479\u0477\3\2\2\2\u047a\u047d\3\2\2\2"+
		"\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u00dd\3\2\2\2\u047d\u047b"+
		"\3\2\2\2\u047e\u0483\5\u00e0q\2\u047f\u0480\7X\2\2\u0480\u0482\5\u00e0"+
		"q\2\u0481\u047f\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483"+
		"\u0484\3\2\2\2\u0484\u00df\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u048b\5\u00e2"+
		"r\2\u0487\u0488\7Y\2\2\u0488\u048a\5\u00e2r\2\u0489\u0487\3\2\2\2\u048a"+
		"\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u00e1\3\2"+
		"\2\2\u048d\u048b\3\2\2\2\u048e\u0493\5\u00e4s\2\u048f\u0490\7W\2\2\u0490"+
		"\u0492\5\u00e4s\2\u0491\u048f\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491"+
		"\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u00e3\3\2\2\2\u0495\u0493\3\2\2\2\u0496"+
		"\u049b\5\u00e6t\2\u0497\u0498\t\b\2\2\u0498\u049a\5\u00e6t\2\u0499\u0497"+
		"\3\2\2\2\u049a\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c"+
		"\u00e5\3\2\2\2\u049d\u049b\3\2\2\2\u049e\u04a1\5\u00e8u\2\u049f\u04a0"+
		"\7\34\2\2\u04a0\u04a2\5h\65\2\u04a1\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2"+
		"\u04a2\u00e7\3\2\2\2\u04a3\u04a9\5\u00ecw\2\u04a4\u04a5\5\u00eav\2\u04a5"+
		"\u04a6\5\u00ecw\2\u04a6\u04a8\3\2\2\2\u04a7\u04a4\3\2\2\2\u04a8\u04ab"+
		"\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u00e9\3\2\2\2\u04ab"+
		"\u04a9\3\2\2\2\u04ac\u04ad\t\t\2\2\u04ad\u00eb\3\2\2\2\u04ae\u04b4\5\u00f0"+
		"y\2\u04af\u04b0\5\u00eex\2\u04b0\u04b1\5\u00f0y\2\u04b1\u04b3\3\2\2\2"+
		"\u04b2\u04af\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5"+
		"\3\2\2\2\u04b5\u00ed\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b8\7F\2\2\u04b8"+
		"\u04bf\7F\2\2\u04b9\u04ba\7E\2\2\u04ba\u04bb\7E\2\2\u04bb\u04bf\7E\2\2"+
		"\u04bc\u04bd\7E\2\2\u04bd\u04bf\7E\2\2\u04be\u04b7\3\2\2\2\u04be\u04b9"+
		"\3\2\2\2\u04be\u04bc\3\2\2\2\u04bf\u00ef\3\2\2\2\u04c0\u04c5\5\u00f2z"+
		"\2\u04c1\u04c2\t\n\2\2\u04c2\u04c4\5\u00f2z\2\u04c3\u04c1\3\2\2\2\u04c4"+
		"\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u00f1\3\2"+
		"\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04cd\5\u00f4{\2\u04c9\u04ca\t\13\2\2\u04ca"+
		"\u04cc\5\u00f4{\2\u04cb\u04c9\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb"+
		"\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u00f3\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d1\7S\2\2\u04d1\u04da\5\u00f4{\2\u04d2\u04d3\7T\2\2\u04d3\u04da\5"+
		"\u00f4{\2\u04d4\u04d5\7Q\2\2\u04d5\u04da\5\u00f4{\2\u04d6\u04d7\7R\2\2"+
		"\u04d7\u04da\5\u00f4{\2\u04d8\u04da\5\u00f6|\2\u04d9\u04d0\3\2\2\2\u04d9"+
		"\u04d2\3\2\2\2\u04d9\u04d4\3\2\2\2\u04d9\u04d6\3\2\2\2\u04d9\u04d8\3\2"+
		"\2\2\u04da\u00f5\3\2\2\2\u04db\u04dc\7H\2\2\u04dc\u04eb\5\u00f4{\2\u04dd"+
		"\u04de\7G\2\2\u04de\u04eb\5\u00f4{\2\u04df\u04eb\5\u00f8}\2\u04e0\u04e4"+
		"\5\u00fa~\2\u04e1\u04e3\5\u0110\u0089\2\u04e2\u04e1\3\2\2\2\u04e3\u04e6"+
		"\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6"+
		"\u04e4\3\2\2\2\u04e7\u04e9\t\f\2\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2"+
		"\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04db\3\2\2\2\u04ea\u04dd\3\2\2\2\u04ea"+
		"\u04df\3\2\2\2\u04ea\u04e0\3\2\2\2\u04eb\u00f7\3\2\2\2\u04ec\u04ed\7;"+
		"\2\2\u04ed\u04ee\5l\67\2\u04ee\u04ef\7<\2\2\u04ef\u04f0\5\u00f4{\2\u04f0"+
		"\u04fa\3\2\2\2\u04f1\u04f4\7;\2\2\u04f2\u04f5\5h\65\2\u04f3\u04f5\5\u00d4"+
		"k\2\u04f4\u04f2\3\2\2\2\u04f4\u04f3\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6"+
		"\u04f7\7<\2\2\u04f7\u04f8\5\u00f6|\2\u04f8\u04fa\3\2\2\2\u04f9\u04ec\3"+
		"\2\2\2\u04f9\u04f1\3\2\2\2\u04fa\u00f9\3\2\2\2\u04fb\u0525\5\u00ccg\2"+
		"\u04fc\u04fe\7-\2\2\u04fd\u04ff\5\u0116\u008c\2\u04fe\u04fd\3\2\2\2\u04fe"+
		"\u04ff\3\2\2\2\u04ff\u0525\3\2\2\2\u0500\u0501\7*\2\2\u0501\u0525\5\u0112"+
		"\u008a\2\u0502\u0525\5\u0082B\2\u0503\u0504\7!\2\2\u0504\u0525\5\u00fe"+
		"\u0080\2\u0505\u0509\5\u010a\u0086\2\u0506\u050a\5\u0114\u008b\2\u0507"+
		"\u0508\7-\2\2\u0508\u050a\5\u0116\u008c\2\u0509\u0506\3\2\2\2\u0509\u0507"+
		"\3\2\2\2\u050a\u0525\3\2\2\2\u050b\u0510\7f\2\2\u050c\u050d\7C\2\2\u050d"+
		"\u050f\7f\2\2\u050e\u050c\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e\3\2"+
		"\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0513"+
		"\u0515\5\u00fc\177\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0525"+
		"\3\2\2\2\u0516\u051b\5l\67\2\u0517\u0518\7?\2\2\u0518\u051a\7@\2\2\u0519"+
		"\u0517\3\2\2\2\u051a\u051d\3\2\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2"+
		"\2\2\u051c\u051e\3\2\2\2\u051d\u051b\3\2\2\2\u051e\u051f\7C\2\2\u051f"+
		"\u0520\7\13\2\2\u0520\u0525\3\2\2\2\u0521\u0522\7\62\2\2\u0522\u0523\7"+
		"C\2\2\u0523\u0525\7\13\2\2\u0524\u04fb\3\2\2\2\u0524\u04fc\3\2\2\2\u0524"+
		"\u0500\3\2\2\2\u0524\u0502\3\2\2\2\u0524\u0503\3\2\2\2\u0524\u0505\3\2"+
		"\2\2\u0524\u050b\3\2\2\2\u0524\u0516\3\2\2\2\u0524\u0521\3\2\2\2\u0525"+
		"\u00fb\3\2\2\2\u0526\u0527\7?\2\2\u0527\u0529\7@\2\2\u0528\u0526\3\2\2"+
		"\2\u0529\u052a\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c"+
		"\3\2\2\2\u052c\u052d\7C\2\2\u052d\u0543\7\13\2\2\u052e\u052f\7?\2\2\u052f"+
		"\u0530\5\u00d4k\2\u0530\u0531\7@\2\2\u0531\u0543\3\2\2\2\u0532\u0543\5"+
		"\u0116\u008c\2\u0533\u0534\7C\2\2\u0534\u0543\7\13\2\2\u0535\u0536\7C"+
		"\2\2\u0536\u0543\5\u0108\u0085\2\u0537\u0538\7C\2\2\u0538\u0543\7-\2\2"+
		"\u0539\u053a\7C\2\2\u053a\u053b\7*\2\2\u053b\u0543\5\u0116\u008c\2\u053c"+
		"\u053d\7C\2\2\u053d\u053f\7!\2\2\u053e\u0540\5\u010a\u0086\2\u053f\u053e"+
		"\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\5\u0102\u0082"+
		"\2\u0542\u0528\3\2\2\2\u0542\u052e\3\2\2\2\u0542\u0532\3\2\2\2\u0542\u0533"+
		"\3\2\2\2\u0542\u0535\3\2\2\2\u0542\u0537\3\2\2\2\u0542\u0539\3\2\2\2\u0542"+
		"\u053c\3\2\2\2\u0543\u00fd\3\2\2\2\u0544\u0545\5\u010a\u0086\2\u0545\u0546"+
		"\5\u0100\u0081\2\u0546\u0547\5\u0106\u0084\2\u0547\u054e\3\2\2\2\u0548"+
		"\u054b\5\u0100\u0081\2\u0549\u054c\5\u0104\u0083\2\u054a\u054c\5\u0106"+
		"\u0084\2\u054b\u0549\3\2\2\2\u054b\u054a\3\2\2\2\u054c\u054e\3\2\2\2\u054d"+
		"\u0544\3\2\2\2\u054d\u0548\3\2\2\2\u054e\u00ff\3\2\2\2\u054f\u0551\7f"+
		"\2\2\u0550\u0552\5\u010c\u0087\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2"+
		"\2\u0552\u055a\3\2\2\2\u0553\u0554\7C\2\2\u0554\u0556\7f\2\2\u0555\u0557"+
		"\5\u010c\u0087\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559\3"+
		"\2\2\2\u0558\u0553\3\2\2\2\u0559\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a"+
		"\u055b\3\2\2\2\u055b\u055f\3\2\2\2\u055c\u055a\3\2\2\2\u055d\u055f\5l"+
		"\67\2\u055e\u054f\3\2\2\2\u055e\u055d\3\2\2\2\u055f\u0101\3\2\2\2\u0560"+
		"\u0562\7f\2\2\u0561\u0563\5\u010e\u0088\2\u0562\u0561\3\2\2\2\u0562\u0563"+
		"\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\5\u0106\u0084\2\u0565\u0103\3"+
		"\2\2\2\u0566\u0582\7?\2\2\u0567\u056c\7@\2\2\u0568\u0569\7?\2\2\u0569"+
		"\u056b\7@\2\2\u056a\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2"+
		"\2\2\u056c\u056d\3\2\2\2\u056d\u056f\3\2\2\2\u056e\u056c\3\2\2\2\u056f"+
		"\u0583\5^\60\2\u0570\u0571\5\u00d4k\2\u0571\u0578\7@\2\2\u0572\u0573\7"+
		"?\2\2\u0573\u0574\5\u00d4k\2\u0574\u0575\7@\2\2\u0575\u0577\3\2\2\2\u0576"+
		"\u0572\3\2\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2"+
		"\2\2\u0579\u057f\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7?\2\2\u057c"+
		"\u057e\7@\2\2\u057d\u057b\3\2\2\2\u057e\u0581\3\2\2\2\u057f\u057d\3\2"+
		"\2\2\u057f\u0580\3\2\2\2\u0580\u0583\3\2\2\2\u0581\u057f\3\2\2\2\u0582"+
		"\u0567\3\2\2\2\u0582\u0570\3\2\2\2\u0583\u0105\3\2\2\2\u0584\u0586\5\u0116"+
		"\u008c\2\u0585\u0587\5*\26\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"\u0107\3\2\2\2\u0588\u0589\5\u010a\u0086\2\u0589\u058a\5\u0114\u008b\2"+
		"\u058a\u0109\3\2\2\2\u058b\u058c\7F\2\2\u058c\u058d\5(\25\2\u058d\u058e"+
		"\7E\2\2\u058e\u010b\3\2\2\2\u058f\u0590\7F\2\2\u0590\u0593\7E\2\2\u0591"+
		"\u0593\5p9\2\u0592\u058f\3\2\2\2\u0592\u0591\3\2\2\2\u0593\u010d\3\2\2"+
		"\2\u0594\u0595\7F\2\2\u0595\u0598\7E\2\2\u0596\u0598\5\u010a\u0086\2\u0597"+
		"\u0594\3\2\2\2\u0597\u0596\3\2\2\2\u0598\u010f\3\2\2\2\u0599\u059a\7C"+
		"\2\2\u059a\u059c\7f\2\2\u059b\u059d\5\u0116\u008c\2\u059c\u059b\3\2\2"+
		"\2\u059c\u059d\3\2\2\2\u059d\u05b0\3\2\2\2\u059e\u059f\7C\2\2\u059f\u05b0"+
		"\5\u0108\u0085\2\u05a0\u05a1\7C\2\2\u05a1\u05b0\7-\2\2\u05a2\u05a3\7C"+
		"\2\2\u05a3\u05a4\7*\2\2\u05a4\u05b0\5\u0112\u008a\2\u05a5\u05a6\7C\2\2"+
		"\u05a6\u05a8\7!\2\2\u05a7\u05a9\5\u010a\u0086\2\u05a8\u05a7\3\2\2\2\u05a8"+
		"\u05a9\3\2\2\2\u05a9\u05aa\3\2\2\2\u05aa\u05b0\5\u0102\u0082\2\u05ab\u05ac"+
		"\7?\2\2\u05ac\u05ad\5\u00d4k\2\u05ad\u05ae\7@\2\2\u05ae\u05b0\3\2\2\2"+
		"\u05af\u0599\3\2\2\2\u05af\u059e\3\2\2\2\u05af\u05a0\3\2\2\2\u05af\u05a2"+
		"\3\2\2\2\u05af\u05a5\3\2\2\2\u05af\u05ab\3\2\2\2\u05b0\u0111\3\2\2\2\u05b1"+
		"\u05b8\5\u0116\u008c\2\u05b2\u05b3\7C\2\2\u05b3\u05b5\7f\2\2\u05b4\u05b6"+
		"\5\u0116\u008c\2\u05b5\u05b4\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6\u05b8\3"+
		"\2\2\2\u05b7\u05b1\3\2\2\2\u05b7\u05b2\3\2\2\2\u05b8\u0113\3\2\2\2\u05b9"+
		"\u05ba\7*\2\2\u05ba\u05be\5\u0112\u008a\2\u05bb\u05bc\7f\2\2\u05bc\u05be"+
		"\5\u0116\u008c\2\u05bd\u05b9\3\2\2\2\u05bd\u05bb\3\2\2\2\u05be\u0115\3"+
		"\2\2\2\u05bf\u05c1\7;\2\2\u05c0\u05c2\5\u00ceh\2\u05c1\u05c0\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\7<\2\2\u05c4\u0117\3\2"+
		"\2\2\u00ae\u011d\u0124\u0127\u012c\u0131\u0135\u013d\u0142\u0147\u014c"+
		"\u0151\u0156\u015b\u015f\u0163\u016d\u0175\u017c\u0183\u0189\u018c\u018f"+
		"\u0198\u019c\u01a0\u01a3\u01a9\u01ae\u01b3\u01b7\u01c0\u01c7\u01d0\u01d7"+
		"\u01dd\u01e8\u01ed\u01f4\u01fa\u0206\u020f\u0219\u0220\u0225\u0229\u022e"+
		"\u0232\u0239\u023e\u0245\u024d\u0254\u0260\u0266\u026d\u0274\u027f\u0284"+
		"\u028c\u0290\u0292\u0298\u02a5\u02ad\u02b0\u02b4\u02b9\u02bd\u02c4\u02cc"+
		"\u02d5\u02d7\u02de\u02e3\u02ee\u02f2\u02fd\u0305\u030c\u030f\u0316\u031e"+
		"\u0328\u0330\u0333\u0336\u0343\u034c\u0354\u0358\u035c\u0360\u0362\u0366"+
		"\u036c\u0377\u037f\u038b\u0393\u039c\u03b2\u03b5\u03bb\u03be\u03cc\u03d5"+
		"\u03da\u03e4\u03e9\u03f8\u0401\u040a\u041a\u0420\u0425\u0432\u0436\u043a"+
		"\u043e\u0440\u0444\u0457\u0462\u046c\u0473\u047b\u0483\u048b\u0493\u049b"+
		"\u04a1\u04a9\u04b4\u04be\u04c5\u04cd\u04d9\u04e4\u04e8\u04ea\u04f4\u04f9"+
		"\u04fe\u0509\u0510\u0514\u051b\u0524\u052a\u053f\u0542\u054b\u054d\u0551"+
		"\u0556\u055a\u055e\u0562\u056c\u0578\u057f\u0582\u0586\u0592\u0597\u059c"+
		"\u05a8\u05af\u05b5\u05b7\u05bd\u05c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}