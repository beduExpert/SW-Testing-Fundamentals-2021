# Postwork 1: Tecnicas de pruebas.

## :dart: Objetivos

- Argumentar qué tipo de defectos puede haber en los diversos tipos de software.
- Demostrar los conocimientos aprendidos sobre los conceptos aprendidos durante la sesión.

## ⚙ Desarrollo

Existen muchas tipos diferentes de tecnicas de prueba de software, cada una con sus propias fortalezas y debilidades, cada tecnica individual es buena para encontrar tipos particulares de defectos y relativamente pobre para encontrar otro tipos.
Del mismo modo, las pruebas realizadas en diferentes etapas del ciclo de vida de desarrollo de software, encontrara diferentes tipos de defectos cada tecnica de prueba cae en una de varias categorias diferentes, en terminos generales hay dos categorias princiaples
estaticas y dinamicas.

Los factores de eleccion de un tecnica de prueba que se van a utilizar dependen de una serie de factores como:

- El contexto donde encontramos el componente a probar o sistema, es decir el tipo de complejidad y tipos de defectos esperados. No es lo mismo probar la pagina web de un colegio local, al sistema de un lanzamiento de un misil de la fuerza aerea.
- Requisitos funcionales y no funcionales.
- Niveles y clases de riesgo, no es lo mismo hacer el control de calidad a la modificacion un titulo de un formulario a tener que probar el modulo de notas de una facultad de ingenieria.

## 🗒️ Instrucciones

- Los siguientes ejercicios serán parte de los entregables del Checkpoint. No dudes en contactar al Experto (a) por Slack si tienes dudas o necesitas retroalimentación. 
- Lee detenidamente las preguntas planteadas y practica tu ituicion de tester.
- Recuerda que el propósito de la actividad es reforzar tus conocimientos y poner a prueba lo aprendido.
- Los archivos de texto con las soluciones las deben de subir - [aqui](./)

## Ejercicio 1

Teniendo el siguiente escenario de negocio, ¡cual seria la mejor sugerencia?:

"Equipo, tenemos que hacer unas pruebas que nos solicito el cliente, al parecer la aplicacion que estamos desarrollando debe funcionar en 4 navegadores web diferentes y en 2 sistemas operativos y en redes con distanta capacidad de velocidad de conexion
ademas, debemos garantizar una cobertura de codigo del 85 % he indicar cuales combinaciones no fueron cubiertas"

- a. Como tenemos conocimiento suficiente, podriamos iniciar un prueba de cobertura de sentencia, y cumplir lo solicitado.
- b. Aplicar unas pruebas exploratorias, seria sufucientes para cumplir con el porcentaje solicitado.
- c. Probar solo en un navegador y suponer que si funciona bien, en todos estar igual.
- D. Crear condiciones y combinaciones en una tabla de desicion con los navegadores y sistemas operativos, e iniciar investigacion del codigo fuente para aplicar otras tecnicas de caja blanca.


## Ejercicio 2

Elaborar la tecnica que requiera conveniente para el siguiente enunciado:

"El cliente requiere probar los siguientes requerimientos del aplicativo electoral"
	- Ciudadanos aptos para votar teniendo en cuenta el criterio de la edad
	- Ciudadanos aptos para votar solo si tiene la cedula registrada en la ciudad o tiene un certificado de desplazamiento forzado

Se requiere entrega en archivo de texto.

## Ejercicio 3

Caso de uso: Para una solicitud aprobada de tarjeta de credito, se debe asignar una categoria, dependiendo del ingreso reportado por el cliente

Condiciones:
- Si el cliente tiene un ingreso de $800 USD a $2000 USD, se le asignar una TDC DORADA
- Si el cliente tiene un ingreso de $2001 USD a $3500 USD, se le asignara una TDC PLATINO
- Si el cliente tine un ingreso de $3001 USD ... n, se le asignara una TDC NEGRA.

Solucion:
- Las particiiones de equivalencia para valores validos y no validos

Se requiere entrega en archivo de texto.


## Ejercicio 3

Un algoritmo valida los siguientes campos numericos:
- Valores menotres que 40 son rechazados.
- Valores entre 42 y 71 son acpetados.
- Valores mayores o iguales a 92 son rechazados.

¿Cúal de los siguientess valores cubre más los valores limites?
¿ Como agruparia las clases equivalentes ?

Se requiere entrega en archivo de texto.

## Ejercicio 4

Describa los casos de uso que probaria, si le pidieran una prueba exploratoria de la siguiente pantalla.


<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Postwork/simulador_credito.png">

Se requiere entrega en archivo de texto.
## ✅ Checklist

Considera que tu proyecto debe cumplir con lo siguiente:

| Requisito | Sí lo cumple | No lo cumple |
| --- | --- | --- |
| A. Tabla con 3 ambigüedades y/o defectos encontrados en el requerimiento del ejercicio 1a o 1b. Además un comentario u observación de cómo se podría mejorar por cada defecto o ambigüedad. |  |  |
| B. Código del programa correspondiente a la solución del ejercicio 1a o 1b. |  |  |
| C. Video menor a 1 min  que compruebe el funcionamiento del programa del punto anterior (en blockly). |  |  |
| D. Tabla con al menos 3 comentarios o defectos encontrados por el mismo autor. |  |  |
| E. Imagen del programa original pedido a otro integrante. |  |  |
| F. Tabla con al menos 3 defectos encontrados por diferente autor. |  |  |
| G. Imágenes (capturas de pantalla) con evidencias de los defectos del punto anterior. |  |  |
