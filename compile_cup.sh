#!/bin/bash
java -jar java-cup-11b.jar -package compilador -parser AnalizadorSintactico sintactico.cup 
mv -f AnalizadorSintactico.java src/compilador