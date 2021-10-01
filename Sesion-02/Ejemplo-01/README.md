# Ejemplo 1 - Creando un programa con la herramienta JDOODLE

## Objetivo

Realizar un breve programa para entender como funciona la herramienta JOODLE.

## Desarrollo

JOODLE es un compilador que puede usarse en la web para desarrollar programas con código java. La ventaja de este tipo de interfaces para desarrollar código es que no se requiere ninguna instalación y se pueden usar básicamente en cualquier dispositivo que cuente con acceso a un navegador.

Para acceder a la herramienta abre la siguiente liga:
https://www.jdoodle.com/online-java-compiler/

<img width="1257" alt="image" src="https://user-images.githubusercontent.com/67882289/135561352-9057058d-20f3-4c6e-b46d-b26b99f24f26.png">

Vamos a realizar el siguiente programa:

Especificación: "Escribir un programa que pida al usuario dos números y muestre por pantalla su división. Si el divisor es cero el programa debe mostrar un error."

En la sección de Stdin Inputs podremos ingresar los datos que serán usados en nuestro programa por medio del llamado a la Standard Input.

<img width="608" alt="image" src="https://user-images.githubusercontent.com/67882289/135561939-35c209d6-5e09-44dd-9ccb-01608d95bedd.png">

En la sección de arriba es donde podremos introducir nuestro código.

<img width="681" alt="image" src="https://user-images.githubusercontent.com/67882289/135562524-680cfa42-4d2f-417b-8e6b-3d19d8d74dbe.png">

Ya que nuestro código está hecho podemos proceder a ejecutarlo con el botón "Execute".

<img width="134" alt="image" src="https://user-images.githubusercontent.com/67882289/135562607-525359e4-424a-4cc5-9921-d90677731dc5.png">

En la sección de "Result", en el recuadro negro podremos visualizar nuestro resultado.

<img width="1216" alt="image" src="https://user-images.githubusercontent.com/67882289/135562712-ab3c5e50-2839-40ca-ac59-489739944ade.png">

<img width="1219" alt="image" src="https://user-images.githubusercontent.com/67882289/135562830-3ff0b6bc-d724-4b73-ad09-d30c56994de5.png">

Como podemos comprobar la ventaja de utilizar un compilador web es que es muy sencillo de usar y entender.



## Código propuesto.

```
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        float num = Float.parseFloat(a);
        float div = Float.parseFloat(b);
        
        if (div == 0) {
            System.out.println("Error: El divisor debe de ser mayor a 0.");
        } else {
            System.out.println("El resultado de la división es: " + (num/div));
        }	

    }
}
```


