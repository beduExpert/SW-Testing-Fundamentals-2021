# Ejemplo #2 - Cobertura de sentencias

## 🎯Objetivo

* Poner en práctica el concepto de cobertura
* Comprender qué es un sentencia de código

## Desarrollo

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Ejemplo-02/assets/pruebas_dinamicas.png">

Cada línea es una sentencia del sistema

<ol>

<li> Leer A </li>

<li>Sumar = A + 1 </li>
	
<li> Imprimir Suma  </li>

</ol>

De igual forma se considera una sentencia, a varias sentencias que se pueden agrupar, por que siempre se ejecutarán juntas.

1) Si (A>10) Entonces
	Imprimir A
   Fin Si
   
La cobertura consiste en medir :

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Ejemplo-02/assets/cobertura_sentencias.png">

## Ejemplo:

<b>Algoritmo</b>

1) Leer A
2) Leer B
3) Si A > B Entonces
4)    C =0
5) Fin Si 

Si tomamos como valores A= 12 y B = 10 solo necesitaríamos un caso de prueba para lograr la cobertura completa.

<b>Cobertura de sentencia = # Sentencias ejecutadas (5) / # sentencias ejecutables (5) = 1 = 100 % </b>

>**💡 Nota para experto(a)**

> Las pruebas de caja negra por lo general logran una cobertura del 60 -70 % sobre el numero total de las sentencias del sistema, por ello es importante complementarla para lograr mas cobertura, usando tecnicas de caja blanca.

