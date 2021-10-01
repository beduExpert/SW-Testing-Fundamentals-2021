# Ejemplo 2 - Creando un programa usando un modelo incremental.

## Objetivo

Demostrar la diferencia de desarrollar un producto usando un modelo incremental contra uno secuencial.

## Desarrollo

Para este ejemplo retomaremos las historias de usuario del reto 2.

Historia 1.

>Como desarrollador de la aplicación panadería, quiero implementar alguna interfaz de poder ingresar el nombre y cantidad de 3 productos, para poder almacenar la >información de cada unos de ellos.

>Criterios de aceptación.
>- La aplicación debe de ofrecer alguna interfaz con la que e usuario pueda ingresar 3 productos y la cantidad deseada para cada uno de ellos.
>- La información ingresada debe de ser almacenada.

En nuestro caso al usar la herramienta JDOODLE, ésta ya implementa una interfaz con la que el usuario puede ingresar información sobre los productos.

<img width="511" alt="image" src="https://user-images.githubusercontent.com/67882289/135670511-55955bbc-c365-4614-83fa-cf5fad15c32f.png">

Sólo restaría agregar el código para poder almacenar la información. En este caso se propone usar dos arreglos de 3 posiciones y un ciclo "for" para guardar la información.

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	String[] items = new String[3];
	int[] quantities = new int[3];

	for(int i=0;i<3;i++) {
		items[i] = input.next();
		quantities[i] = input.nextInt();
	}
		
    }
  
}

```
Historia 2.

>Como desarrollador de la aplicación panadería, quiero implementar una base de datos que indique la relación de los productos y su precios, para poder obtener el >precio de acuerdo al nombre de cada producto.

>Criterios de Aceptación
>- El sistema debe de implementar una base de datos en forma de tabla con la relación de productos de acuerdo a la tabla que se muestra a continuación.

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

Antes de poder mostrar información en la pantalla necesitamos implementar el mecanismo que alamacene la relación entre los productos disponibles. En este ejemplo se propone el uso de un "map" para poder llevar esta relación.

```
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	Map<String, Float> map = new HashMap<String, Float>();
	map.put("Bolillo",			 1.20f);
	map.put("Telera",			 1.00f);
	map.put("Baguete",			11.00f);
	map.put("Concha",			 6.00f);
	map.put("Dona",				 8.00f);
	map.put("Cuerno",			 6.00f);
	map.put("Churro",			 3.40f);
	map.put("Oreja",			 6.00f);
	map.put("Panque",			 6.00f);

	String[] items = new String[3];
	int[] quantities = new int[3];

	for(int i=0;i<3;i++) {
		items[i] = input.next();
		quantities[i] = input.nextInt();
	}
		
    }
  
}

```
Historia 3.

> Como desarrollador de la aplicación panadería, quiero implementar la lógica que regresé el precio total de cada articulo, para después msotrarlo por pantalla.

> Criterios de Aceptación.
> - Implementar la lógica para poder obtener el precio total de cada articulo.



