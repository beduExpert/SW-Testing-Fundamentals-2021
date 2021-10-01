# Ejemplo 2 - ¿Cómo probar un Producto de Software?

## Objetivo

Aprender tips básicos para poder realizar pruebas en un producto de Software.

## Desarrollo

>**💡 Nota para experto(a)**

- El primer paso es entender lo que se tiene que probar, en este caso se debe de entender muy bien la especificación y funcionalidad que se está probando. La mejor forma de empezar a conocer la funcionalidad es experimentando.

Especificación: "Escribir un programa que pregunte al usuario su edad y muestre por pantalla si es mayor de edad o no."

En un programa sencillo como el antes visto es posible cometer errores si la especificación no es muy clara o se tiene poca expereiencia.

<img width="980" alt="image" src="https://user-images.githubusercontent.com/67882289/135552566-e17a2b02-acee-4666-8d99-54bd3abbdd49.png">

En este ejemplo vemos que el programa parece funcionar de forma correcta si se da un número menor a 18 se imprime el mensaje "La edad es de un mayor de edad." o "La edad es de un menor de edad." si el número es mayor.

<img width="999" alt="image" src="https://user-images.githubusercontent.com/67882289/135552840-43c8a8ae-8443-4c3d-9ac1-3b393c904f3d.png">

<img width="993" alt="image" src="https://user-images.githubusercontent.com/67882289/135552880-f080ebad-c7dd-4141-81b0-72cc8cb8bacc.png">

Con esto podemos entender el funcionamiento general del programa.

- El siguiente paso podría ser comenzar a indagar sobre los límites, en este caso los límites serían 0, 18 y ??

Aqui se demuestra un punto importante, como tester es nuestra responsabilidad preguntarnos sobre los datos que hacen falta en la especificación. En este ejemplo a pesar de que es una especificación sencilla podemos darnos cuenta que hacen falta los siguientes datos:

  - Un humano no puede tener 0 años, sin embargo el programa admite está cantidad. ¿Es esto correcto, convendría agregar un campo de meses?
  - En México la mayoría de edad se cumple a los 18 años, sin embargo es necesario cuestionarse. ¿Este programa será usado sólo en México?
  - Generalmente las especificaciones que usan edades tienden a no indicar edades máximas, sin embargo es importante preguntar a la persona que elabaoro el requerimiento cual es el límite másximo para evitar escenarios no previstos.
  - Al probar el programa y seleccionar la edad de 18, podemos darnos cuenta de que el programa no responde. Este es un claro ejemplo de un bug donde se paso por alto el límite medio.

<img width="972" alt="image" src="https://user-images.githubusercontent.com/67882289/135554043-7114ede5-2f37-4a86-84a1-87c4816099c9.png">

- Otro paso sugerido sería experimentar con caracteres no númericos. Ya que por naturaleza el programa debería funcionar con sólo caracteres númericos convendría realizar las siguietnes preguntas:
  - ¿El programa debería aceptar caracterés alfanúmericos?
  - ¿Cuál es el límite de caracteres que debería de aceptar?
  - ¿Qué tal caracteres especiales como "$", "%", "&" ó "/".

- Por último se sugiere comparar que la especificación realmente concuerde con el resultado esperado.
  - En este caso se imprime el mensaje "La edad es de un mayor de edad." o "La edad es de un menor de edad." dependiendo de la edad que se introduzca, sin embargo si analilizamos corectamente
