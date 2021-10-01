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

Sólo restaría agregar el código para poder almacenar la información. En este caso se propone usar dos arreglos de 3 posiciones y ciclo for para guardar la información.

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






