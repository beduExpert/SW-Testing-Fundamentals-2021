# Postwork 1: Técnicas de pruebas.

## :dart: Objetivos

- Argumentar qué tipo de defectos puede haber en los diversos tipos de software.
- Demostrar lo conocimientos adquiridos, con base en los conceptos de las técnicas de pruebas durante la sesión.

## ⚙ Desarrollo

Existen muchas tipos diferentes de técnicas de prueba de software, cada una con sus propias fortalezas y debilidades, cada técnica individual es buena para encontrar tipos particulares de defectos y relativamente pobre para encontrar otro tipos.
Del mismo modo, las pruebas realizadas en diferentes etapas del ciclo de vida de desarrollo de software, encontrará diferentes tipos de defectos cada tecnica de prueba cae en una de varias categorías diferentes, en terminos generales hay dos categorías princiaples
estáticas y dinámicas.

Los factores de elección de una técnica de prueba que se van a utilizar dependen de una serie de factores como:

- El contexto donde encontramos el componente a probar o sistema, es decir el tipo de complejidad y tipos de defectos esperados. No es lo mismo probar la página web de un colegio local, al sistema de un lanzamiento de un misil de la fuerza aérea.
- Requisitos funcionales y no funcionales.
- Niveles y clases de riesgo, no es lo mismo hacer el control de calidad a la modificacion un titulo de un formulario a tener que probar el modulo de notas de una facultad de ingenieria.

## 🗒️ Instrucciones

- Los siguientes ejercicios serán parte de los entregables del Checkpoint. No dudes en contactar al Experto (a) por Slack si tienes dudas o necesitas retroalimentación. 
- Lee detenidamente las preguntas planteadas y practica tu ituicion de tester.
- Recuerda que el propósito de la actividad es reforzar tus conocimientos y poner a prueba lo aprendido.
- Los archivos de texto con las soluciones las deben de subir - [aqui](./)

## Ejercicio 1

Teniendo el siguiente escenario de negocio, ¿Cuál sería la mejor sugerencia?:

"Equipo, tenemos que hacer unas pruebas que nos solicitó el cliente, al parecer la aplicación que estamos desarrollando debe funcionar en 4 navegadores web diferentes y en 2 sistemas operativos y en redes con distanta capacidad de velocidad de conexión además, debemos garantizar una cobertura de código del 85 % e indicar cuales combinaciones no fueron cubiertas"


- a. Como tenemos conocimiento suficiente, podríamos iniciar un prueba de cobertura de sentencia, y cumplir lo solicitado.
- b. Aplicar unas pruebas exploratorias, sería suficiente para cumplir con el porcentaje solicitado.
- c. Probar solo en un navegador y suponer que si funciona bien, en todos estar igual.
- D. Crear condiciones y combinaciones en una tabla de decisión con los navegadores y sistemas operativos, e iniciar investigación del código fuente para aplicar otras técnicas de caja blanca.

## Ejercicio 2

Elaborar la técnica que requiera conveniente para el siguiente enunciado:

"El cliente requiere probar los siguientes requerimientos del aplicativo electoral"
	- Ciudadanos aptos para votar teniendo en cuenta el criterio de la edad
	- Ciudadanos aptos para votar solo si tiene el documento de identidad registrado en la ciudad o tiene un certificado de desplazamiento forzado
### Solución
Se requiere entrega en archivo de texto.

## Ejercicio 3

Caso de uso: Para una solicitud aprobada de tarjeta de crédito, se debe asignar una categoria, dependiendo del ingreso reportado por el cliente

Condiciones:
- Si el cliente tiene un ingreso de $800 USD a $2000 USD, se le asignar una TDC DORADA
- Si el cliente tiene un ingreso de $2001 USD a $3500 USD, se le asignara una TDC PLATINO
- Si el cliente tine un ingreso de $3001 USD ... n, se le asignara una TDC NEGRA.

### Solución
- Las particiones de equivalencia para valores validos y no validos

Se requiere entrega en archivo de texto.


## Ejercicio 3

¿Cuál de los siguientess valores cubre más los valores límites?
¿Cómo agruparía a las clases equivalentes ?

Un algoritmo valida los siguientes campos numéricos:
- Valores menotres que 40 son rechazados.
- Valores entre 42 y 71 son acpetados.
- Valores mayores o iguales a 92 son rechazados.

### Solución
Se requiere entrega en archivo de texto.

## Ejercicio 4

Describa los casos de uso que probaría, si le pidieran una prueba exploratoria de la siguiente pantalla.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Postwork/simulador_credito.png">
### Solución
Se requiere entrega en archivo de texto.
## ✅ Checklist

Considera que tu proyecto debe cumplir con lo siguiente:

| Requisito | Sí lo cumple | No lo cumple |
| --- | --- | --- |
|Teniendo el siguiente escenario de negocio, ¿Cuál sería la mejor sugerencia?: | ⬜  | ⬜  |
|Elaborar la técnica que requiera conveniente para el siguiente enunciado: | ⬜  | ⬜  |
| ¿Cuál de los siguientess valores cubre más los valores límites?
¿Cómo agruparía a las clases equivalentes ? |  ⬜ | ⬜  |
| Describa los casos de uso que probaría, si le pidieran una prueba exploratoria de la siguiente pantalla.|  ⬜ |  ⬜ |
