# Ejemplo 2 - Desarrollo Conducido por Pruebas - TDD

## Objetivo

Ejemplificar como se construye un programa al utilizar desarrollo conducido por pruebas.

## Desarrollo

En este ejemplo vamos a desarrollar el siguiente programa utilizando TDD.

Especificación:
> Una escuela online a abierto sus puertas y por lanzamiento está ofreciendo una promoción. La escuela por el momento sólo ofrece cuatro cursos: "Software Testing", "Ciberseguridad", "Programación con Java" y "Machine Learning".
> El alumno interesado puede escoger uno de los tres cursos o los cuatro, el alumno puede recibir los siguientes descuentos al escoger más de uno:
> - Si el alumno escoge 1 no se la hará ningún descuento.
> - Si el alumno escoge 2 se le hará el 10% de precio total.
> - Si el alumno escoge 3 se le hará el 25% de precio total.
> - Si el alumno escoge 4 se le hará el 40% de precio total.
> 
> Cada curso sin descuento tiene un precio de $4000 pesos sin IVA.
> 
> Escribir un programa que muestre al usuario el catalogo de cursos y cuales de ellos desea tomar. Dependiendo de la decisión del usuario el programa debe regresar el precio total con descuento sin IVA, el descuento aplicado y el precio total con descuento con IVA, considerando un impuesto IVA del 16%.

El principio de TDD es diseñar primero los casos de pruebas, para lo cual no necesitamos una interfaz de programación. Los casos de prueba que propondremos pueden ser hechos en un bloc de notas si así se desea. De la especificación anterior proponemos los siguientes casos de prueba.

- Verificar que el programa muestre al usuario el catalogo de los 4 cursos disponibles.
- Verificar que el alumno pueda seleccionar al menos 1 curso.
- Verificar que el alumno pueda seleccionar 4 cursos.
- Verificar que el alumno no pueda seleccionar 0 curos. 
- Verificar que el usuario no pueda seleccionar 5 cursos.

# Nota:
> Aqui podemos apreciar una de las ventajas del TDD, a pesar que la especificación no indica qué debería de pasar si el alumno selecciona 0 o 5 cursos, debido a que se comenzaron a diseñar las pruebas desde un inicio podemos darnos cuentas de esta inconsistencia antes de comenzar a escribir el código. En un proyecto real esta ambigüedad debería discutirse con el representante del cliente y es así que el defecto no se hubiera resaltado hasta después de que el código ya estuviera construido.

- Verificar precio total sin descuento sin IVA cuando el alumno selecciona 1 curso.
- Verificar descuento aplicado cuando el alumno selecciona 1 curso.
- Verificar precio total sin descuento con IVA cuando el alumno selecciona 1 curso.

# Nota:
> Cuando diseñamos pruebas conviene considerar los siguientes puntos:
> - Establecer una misma palabra para indicar que se va a probar algo, es decir si se usa la palabra "verificar", ésta se debe de mantener para todos los demás casos de prueba. No es recomendable después de haber establecido una palabra como "verificar" en algunos casos, después usar: "validar", "checar", "probar", etc. Para los demás.
> - Mantener la misma estructura y orden de las palabras para todos los casos de prueba, por ejemplo si usamos la palabra "verificar" al inicio de cada oración, está la deberemos mantener al inicio de todos, después procederemos con el objeto a verificar y por último con el restante de la oración. Esto ayudará a comprendender más fácil el objetivo de los casos de prueba cuando se tienen más de 100, 1000, etc.
> - Reutilizar los casos de prueba. En los 3 casos de prueba anteriores podemos preveer que los restantes para 2,3 y 4 cursos serán muy parecidos, por lo que se recomienda que en vez de escribir uno a uno los que faltan, se copie y peguen estos tres y sólo se modifiquen las palabras de interés.
> - Procurar no colocar datos especificos que seguramente puedan cambiar en el futuro. Por ejemplo no es recomendable poner datos como 10% o igual $4000, ya que si en un futuro la especificación cambia, tendremos que actualizar todas los casos de prueba con la nueva información.

- Verificar precio total con descuento sin IVA cuando el alumno selecciona 2 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 3 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 4 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 4 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 4 cursos.

