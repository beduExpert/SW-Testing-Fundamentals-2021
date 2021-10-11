# Ejemplo 2 - Matriz de riesgo

## Objetivo

* Aprender la correcta forma de escribir riesgos
* Analizar e identificar los riesgos funcionales de un aplicativo

## Desarrollo

>**💡 Nota para experto(a)**

> Los riesgos no siempre son orientados directamente al comportamiento de un software, tambien es importante tener en cuenta la arquitectura, los diseño y el equipo de desarrollo.

Siendo el ejemplo anterior, se aplicara la matriz de riesgo.


| Riesgo | Plan de mitigación | Impacto | Probabilidad | Resultado |
| --- | --- | --- | --- | --- |
|La probabilidad que al seleccionar un país, ocurra que las ciudades que se muestran no correspondan a este territorio. Lo que provocaría un que la consulta para encontrar la vivienda no se complete correctamente |Se mitigará este riesgo usando los casos de prueba 1-3. Con el cual se asegurará que el listado de ciudades corresponda al país seleccionado.  |  Alto| Medio |Alto  | 

|La probabilidad que, al seleccionar la ciudad, ocurra que la vista de tipo de vivienda no muestre los botones de “Casa y Apartamento”. Lo que provocaría que el usuario no podría avanzar al modulo de login|Se mitigará este riesgo usando los casos de prueba 1-3. Con el cual se asegurará que el correcto funcionamiento de la vista de tipo de vivienda. |  Alto| Medio |Alto  | 
