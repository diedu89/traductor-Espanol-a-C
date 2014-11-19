#!/bin/bash
java -jar java-cup-11b.jar -package compilador -parser AnalizadorSintactico -expect 14 sintactico.cup 
mv -f AnalizadorSintactico.java src/compilador