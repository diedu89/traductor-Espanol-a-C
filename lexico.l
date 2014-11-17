package compilador;
import java_cup.runtime.*;

//clases para implementar observers en analizadores para disparar acciones en los eventos de los analisis

interface TokenListener {
    public void encuentraToken(String tokenName, Symbol tokenValue, String texto);
    public void errorToken(int fila, int columna, String texto);
}

interface SintacticoListener {
   public void errorSintaxis(Symbol cur_token, String tokenName);
}

%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%line
%column
%unicode
%public
%class AnalizadorLexico
%implements java_cup.runtime.Scanner
%function next_token
%type java_cup.runtime.Symbol
%eofclose

%{

	//metodo para poder agregar listener
	TokenListener listener;
	public void addListener(TokenListener listener){
	   this.listener = listener;
	}

	Symbol newToken(int tokenId, String tokenName) {
		Symbol symbol = new Symbol(tokenId, yyline, yycolumn);
		listener.encuentraToken(tokenName, symbol, yytext());
	   return new Symbol(tokenId, yyline, yycolumn, tokenId);
	}

	Symbol newToken(int tokenId, String tokenName, Object value) {
		Symbol symbol = new Symbol(tokenId, yyline, yycolumn, value);
		listener.encuentraToken(tokenName, symbol, yytext());
	   return new Symbol(tokenId, yyline, yycolumn, value);
	}

%}


/*-*
 * definicion de expresiones:
 */
LETRA           = [A-Za-z]
DIGITO_NO_CERO  = [1-9]
DIGITO          = [0-9]
ALFANUMERICO    = {LETRA}|{DIGITO}
OTRO            = [_]
IDENTIFICADOR   = {LETRA}({ALFANUMERICO}|{OTRO})*
ENTERO          = {DIGITO_NO_CERO}{DIGITO}* | {DIGITO}
FLOAT 			 = {ENTERO}\.{DIGITO}*
CHAR            = '.'
COMENTARIO      = COMENTA.*FIN_COM
BLANCO          = [ \n\t]
BOOL 				 = TRUE | FALSE | true | false
CADENA			 = \"[^\"]*\"

%%
/**
 * reglas lexicas:
 */

/* keywords primero */ 

PROGRAMA | programa    			{ return newToken(sym.PROGRAMA_K, "PROGRAMA_K"); }
INICIO | inicio      			{ return newToken(sym.INICIO_BLOQUE, "INICIO_BLOQUE"); }
FIN | fin          				{ return newToken(sym.FIN_BLOQUE, "FIN_BLOQUE"); }
COMENTA | comenta     			{ return newToken(sym.INICIO_COMENTARIO, "INICIO_COMENTARIO"); }
FIN_COM | fin_com    			{ return newToken(sym.FIN_COMENTARIO, "FIN_COMENTARIO"); }
LEER | leer         				{ return newToken(sym.LEER, "LEER"); }
DESPLEGAR | desplegar  			{ return newToken(sym.DESPLEGAR, "DESPLEGAR"); }
DECLARAR | declarar    			{ return newToken(sym.DECLARAR, "DECLARAR"); }
VECTOR | vector 					{ return newToken(sym.VECTOR, "VECTOR"); }
MATRIZ | matriz 					{ return newToken(sym.MATRIZ, "MATRIZ"); }
MODULO | modulo	    			{ return newToken(sym.MODULO_K, "MODULO_K"); }
RECIBE | recibe	    			{ return newToken(sym.RECIBE, "RECIBE"); }
DEVUELVE | devuelve     		{ return newToken(sym.DEVUELVE, "DEVUELVE"); }
ENTERO | entero	    			{ return newToken(sym.TIPO, "ENTERO", yytext().toUpperCase()); }
FLOTANTE | flotante     		{ return newToken(sym.TIPO, "FLOTANTE", yytext().toUpperCase()); }
BOOLEANO | booleano     		{ return newToken(sym.TIPO, "BOOLEANO", yytext().toUpperCase()); }
CARACTER | caracter     		{ return newToken(sym.TIPO, "CARACTER", yytext().toUpperCase()); }
SI | si 		    					{ return newToken(sym.SI, "SI"); }
SINO | sino 		    			{ return newToken(sym.SINO, "SINO"); }
FIN_SI | fin_si       			{ return newToken(sym.FIN_SI, "FIN_SI"); }
DESDE | desde        			{ return newToken(sym.DESDE, "DESDE"); }
HASTA | hasta        			{ return newToken(sym.HASTA, "HASTA"); }
FIN_DESDE | fin_desde    		{ return newToken(sym.FIN_DESDE, "FIN_DESDE"); }
MIENTRAS | mientras     		{ return newToken(sym.MIENTRAS, "MIENTRAS"); }
FIN_MIENTRAS | fin_mientras 	{ return newToken(sym.FIN_MIENTRAS, "FIN_MIENTRAS"); }
DESDE | desde        		 	{ return newToken(sym.DESDE, "DESDE"); }
FIN_MIENTRAS | fin_mientras 	{ return newToken(sym.FIN_MIENTRAS, "FIN_MIENTRAS"); }
O | o 		 						{ return newToken(sym.OR, "OR"); }
Y | y			 						{ return newToken(sym.AND, "AND"); }

/*  */
{ENTERO}    	 { return newToken(sym.ENTERO, "ENTERO", yytext()); }
{FLOAT}    	 	 { return newToken(sym.FLOTANTE, "FLOTANTE", yytext()); }
{CHAR}    	 	 { return newToken(sym.CARACTER, "CARACTER", yytext()); }
{BOOL}    	 	 { return newToken(sym.BOOLEANO, "BOOLEANO", yytext().toUpperCase()); }
{CADENA}			 { return newToken(sym.CADENA, "CADENA", yytext()); }

{IDENTIFICADOR} { return newToken(sym.IDENTIFICADOR, "IDENTIFICADOR", yytext()); }

","				 { return newToken(sym.COMA, "COMA"); }
"*"             { return newToken(sym.OP_POR, "OP_POR"); }
"+"             { return newToken(sym.OP_MAS, "OP_MAS"); }
"-"             { return newToken(sym.OP_MENOS, "OP_MENOS"); }
"/"             { return newToken(sym.OP_DIV, "OP_DIV"); }
"("             { return newToken(sym.PAR_IZQ, "PAR_IZQ"); }
")"             { return newToken(sym.PAR_DER, "PAR_DER"); }
"="             { return newToken(sym.OP_IGUAL, "OP_IGUAL"); }
"<"             { return newToken(sym.COMP_MAYOR, "COMP_MAYOR"); }
">"             { return newToken(sym.COMP_MENOR, "COMP_MENOR"); }
"<="            { return newToken(sym.COMP_MENOR_IGUAL, "COMP_MENOR_IGUAL"); }
">="            { return newToken(sym.COMP_MAYOR_IGUAL, "COMP_MAYOR_IGUAL"); }
"!="            { return newToken(sym.COMP_DIFERENTE, "COMP_DIFERENTE"); }
"["				 { return newToken(sym.CORCHETE_IZQ, "CORCHETE_IZQ"); }
"]"				 { return newToken(sym.CORCHETE_DER, "CORCHETE_DER"); }
{COMENTARIO}    { System.out.println("Comentario reconocido: " + yytext()); }
{BLANCO}        {  }
.               { 
	listener.errorToken(yyline, yycolumn, yytext());
	System.out.println("Caracter ilegal, '" + yytext() + "' linea: " + (yyline - 1) + ", columna: " + yycolumn); 
}