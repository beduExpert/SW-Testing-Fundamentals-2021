# Reto 2 - Creando Historias de Usuario

## Objetivo

Reconocer la diferencia entre un requerimiento tradicional contra una historia de usuario usadas en modelos iterativos o incrementales y metodologías Agile.

## Desarrollo

Dada la siguiente especificación:
"Una panadería desea implementar una aplicación que al recibir el nombre y cantidad de 3 productos, muestre por pantalla en forma de lista el nombre de los productos, cantidades, precios unitarios y precios totales con 2 decimales. Escribir al menos 3 historias de usuario desde el punto de vista de un desarrollador de esta especificación."

Los productos disponibles y sus precios son:
| Producto | Precio |
| --- | --- |
| Bolillo | $1.20 |
| Telera | $1.00 |
| Baguete | $11.00 |
| Concha | $6.00 |
| Dona | $8.00 |
| Cuerno | $6.00 |
| Churro | $3.40 |
| Oreja | $6.00 |
| Panque | $6.00 |

# Solución Propuesta

| Historia de Usuario | Criterios de Aceptacion |
| --- | --- |
| Como desarrollador de la aplicación panadería, quiero implementar alguna interfaz de poder ingresar el nombre y cantidad de 3 productos, para poder almacenar la información de cada unos de ellos. | - La aplicación debe de ofrecer alguna interfaz con la que e usuario pueda ingresar 3 productos y la cantidad deseada para cada uno de ellos.\ - La información ingresada debe de ser almacenada. |
| Como desarrolladr de la aplicación panadería, quiero implementar una forma para mostrar infromación del pedido, precio unitario y precio total de cada uno de los productos ingresados, para mostrar infromación detallada de cada uno de los productos. | - La aplicación debe de mostrar el nombre del producto, la cantidad introducida por el usuario, precio unitario y precio total de cada articulo.  |
| Como desarrollador de la aplicación panadería, quiero implementar una base de datos que indique la relación de los productos y su precios, para poder obtener el precio de acuerdo al nombre de cada producto. | - El sistema debe de implementar una base de datos en forma de tabla con la relación de productos de acuerdo a la tabla mostrada anteiormente. |
| Como desarrollador de la aplicación panadería, quiero implementar la lógica que regresé el precio total de cada articulo, para después msotrarlo por pantalla. | - Implementar la lógica para poder obtener el precio total de cada articulo. |

