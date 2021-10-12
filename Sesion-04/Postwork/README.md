# Postwork 4: Tipos de testing

🎯 Objetivos

- Identificar especificaciones funcionales y no funcionales en una aplicación web, al experimentar su comportamiento.
- Ejercitar distintas versiones de una aplicación web e intentar proponer la causa raíz de defectos presentes en ella, sin tener acceso al código.
- Ejecutar pruebas no funcionales utilizando jMeter en una página web para analizar características no funcionales de un sistema..


⚙ Desarrollo

En esta sesión se revisaron distintos tipos de pruebas clasificadas en 4 categorías principales: funcionales, no funcionales, relacionadas a los cambios y estructurales, el clasificar a las pruebas ayudará a definir herramientas, actividades y objetivos de acuerdo al tipo de prueba que se lleve a cabo y en las siguientes actividades se reforzarán conocimientos y se aprenderán a identificar los distintos tipos de testing.


🗒️ Instrucciones

- Los siguientes ejercicios serán parte de los entregables del Checkpoint. No dudes en contactar al Experto (a) por Slack si tienes dudas o necesitas retroalimentación. 
- Lee detenidamente las preguntas planteadas y elige la respuesta correcta.
- Recuerda que el propósito de la actividad es reforzar tus conocimientos y poner a prueba lo aprendido.


# Ejercicio 1

> La siguiente página “Demoblaze” (https://www.demoblaze.com) es una página de pruebas con completa funcionalidad. Para está actividad se plantea dividir 3 sub-funcionalidades: 

- Funcionalidad de Login.
- Funcionalidad de carrito de compras.
- Página para mostrar productos.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post1.png">

> De acuerdo a esta subdivisión deberás proponer 3 especificaciones que describan características funcionales y 3 que describan 3 características no funcionales para cada una de las sub-funcionalidades propuestas.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post2.png">

# Ejercicio 2

Durante esta sesión y anteriores se ha revisado que para poder realizar pruebas no es necesario conocer cómo está construido el código. Una de las habilidades que más se valora de un tester es la capacidad de proponer la causa raíz de los defectos tan sólo con conocer el producto que se está probando. 

> La siguiente página_https://testsheepnz.github.io/random-number.html   muestra un juego simple con la siguiente interfaz.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post3.png">

- El objetivo del juego es que al presionar el botón “Roll the dice”, el sistema debería calcular un número aleatorio entre 1 y 12. Una vez presionado el botón, el usuario debe de adivinar qué número fue calculado. Si el número dado es más bajo se desplegará el mensaje “Very Low”, si es más alto se despliega “Very High”. El juego acaba cuando el usuario adivina el número calculado y se muestra el número de intentos que tomó para poder adivinarlo.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post4.png">

- La aplicación tiene hasta 13 distintas versiones que pueden ser seleccionadas en el dropdown “Select build”.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post5.png">

Cada una de las versiones de este juego tiene al menos un defecto. Por lo que para la entrega de este ejercicio deberás seleccionar al menos 8 versiones (excepto “Demo”) y se debe tratar de proponer la causa raíz de cada uno de ellos en la siguiente tabla.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post6.png">

# Ejercicio 3

Para el último ejercicio se utilizará la herramienta de jMeter para realizar pruebas en la página Demoblaze (https://www.demoblaze.com/index.html). 

> El objetivo es simular la petición de 10, 100 y 1000 usuarios, y reportar los siguientes datos en la tabla de abajo.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post7.png">

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-04/Postwork/assets/post8.png">

# ✅CheckList


| Requisito|Sí lo cumple|No lo cumple|
|:--------------|:-------------:|--------------:|
| Tabla con 3 especificaciones funcionales y 3 no funcionales de las tres funcionalidades propuestas de la página (18 especificaciones en total). |⬜️|⬜️ |}
| Tabla con al menos una propuesta de causa raíz  de los defectos encontrados para al menos 8 versiones de la aplicación propuesta. |⬜️|⬜️ |
| Tabla con los resultados obtenidos al ejecutar la herramienta Jmeter con 10, 100 y 1000 peticiones.. |⬜️|⬜️ |
