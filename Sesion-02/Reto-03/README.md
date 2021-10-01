# Reto 3 - Crea tu propio programa con un modelo incremental.

## Objetivo

Construir un programa simulando un modelo incremental e identificar la mayor cantidad de defectos para que el alumno distinga las ventajas y desventajas de usar un modelo incremental contra uno secuencial.

## Desarrollo

Para este ejercicio se debe construir un programa con las historias de usuario que se mencionan a continuación:

Historia 1
> Como desarrollador de la aplicación para invertir dinero, quiero que implementar una interfaz donde se pregunte al usuario la cantidad a invertir y el número de años que se desea dejar la inversión para poder almacenar la información del cliente.

> Criterios de Aceptación.
> - Mostrar una interfaz donde se pregunte al usuario: cantidad a invertir y número de años.
> - Guardar la información proporcionada por el usuario.

Historia 2
> Como desarrollador de la aplicación para invertir dinero, quiero implementar una funcionalidad para poder calcular el rendimiento de la cantidad invertida dependiendo del número de años a invertir, para poder obtener el cálculo de capital e intereses generados.

> Criterios de Aceptación
> - Implementar un código para calcular los intereses dependiendo del número de años a invertir.
>   - En el primer año se genera un rendimiento del 5%.
>   - En el segundo año se genera un rendimiento del 7%
>   - En el tercer año en adelante se genera un rendimiento del 10%
> - El código debe de regresar la cantidad de intereses que se generan.

Historia 3

> Como desarrollador de la aplicación para invertir dinero, quiero implementar una forma de desplegar al usuario el capital original, el capital más intereses, los intereses por año, los intereses totales generados y la tasa de interés, para mostrar la información de interés al usuario. 

> Criterios de Aceptación
> - Implementar interfaz que despliegue la siguiente información al usuario por cada año que se desea invertir:
>   - Capital original.
>   - Capital más intereses.
>   - Intereses por año.
>   - Intereses totales.
>   - Tasa de Interés.

Historia 4

> Como desarrollador de la aplicación para invertir dinero, quiero implementar una forma de preguntar al usuario si está de acuerdo con la inversión, para poder almacenar la decisión del usuario y terminar la aplicación.

> Criterios de Aceptación

> - Implementar interfaz para preguntar al usuario si está de acuerdo con la operación.
> Si el usuario está de acuerdo se debe desplegar el mensaje "Gracias por invertir con nosotros".
> Si el usuario no está de acuerdo se debe desplegar el mensaje "Gracias por su preferencia, esperamos verlo pronto".
> - Almacenar la decisión del usuario.
