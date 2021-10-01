# Reto 1 - Proyecto con modelo secuencial.

## Objetivo

Desarrollar un programa simulando un desarrollo en modelo secuencial, familiarizarse con la herramienta JDOODLE y tratar de econtrar la mayor cantidad de defectos en el programa hecho.

## Desarrollo

>**💡 Nota para experto(a)**
>
> Si el reto demora más de 25 minutos, entregar el código propuesto a los alumnos.

Se debe de desarrollar el siguiente programa que cumpla con la siguiente especificación:
"Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde."

## Tips de Java
Para obtener el primer caracter de un String puedes usar la función charAt()

```
String s = "Hello";
char c = s.charAt(0);  // -> 'H'

```

Para leer del Standard input se puede declarar una variable del tipo Scanner de la siguiente forma:

```
Scanner input = new Scanner(System.in);
String s = input.next();  // "Lee variable recibida del stdin"

```

Para convertir una a letra a un número se propone usar una función con un switch.

```
    public static int letter_to_number(char c) {
        switch(c) {
        case 'A': return 1;
        case 'B': return 2;
        case 'C': return 3;
        case 'D': return 4;
        case 'E': return 5;
        case 'F': return 6;
        case 'G': return 7;
        case 'H': return 8;
        case 'I': return 9;
        case 'J': return 10;
        case 'K': return 11;
        case 'L': return 12;
        case 'M': return 13;
        case 'N': return 14;
        case 'O': return 15;
        case 'P': return 16;
        case 'Q': return 17;
        case 'R': return 18;
        case 'S': return 19;
        case 'T': return 20;
        case 'U': return 21;
        case 'V': return 22;
        case 'W': return 23;
        case 'X': return 24;
        case 'Y': return 26;
        case 'Z': return 26;
        default:  return 0;
        }
    }

```

## Resultado

Al ejecutar el programa el resultado esperado debe ser:

<img width="1213" alt="image" src="https://user-images.githubusercontent.com/67882289/135567842-68fb0b6a-8f8c-4b4e-9d18-e5de9d620aec.png">

<img width="1222" alt="image" src="https://user-images.githubusercontent.com/67882289/135567888-272d9068-a7ec-42d5-8881-72db1fcaff34.png">

<img width="1224" alt="image" src="https://user-images.githubusercontent.com/67882289/135567925-07c81d06-e269-49fc-8e7f-3c404e52538a.png">

<img width="1216" alt="image" src="https://user-images.githubusercontent.com/67882289/135567958-aef79768-e80c-4e08-b8da-eb494b8b9889.png">



## Código Propuesto

```
import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {

	Scanner input = new Scanner(System.in);
	String name   = input.next();
	String gender = input.next();
		
	char name_letter = name.charAt(0);
		
        if ((gender.equals("M") && letter_to_number(name_letter) < 13) || 
	   (gender.equals("H") && letter_to_number(name_letter) > 14)) {
		System.out.println("¡Perteneces al grupo A!");
	}
	else if ((gender.equals("M") && letter_to_number(name_letter) > 14) && 
		(gender.equals("H") && letter_to_number(name_letter) <= 13)) {
		System.out.println("¡Perteneces al grupo B!");			
	}
	else {
		// Do Nothing
	}
    }
        
    public static int letter_to_number(char c) {
        switch(c) {
        case 'A': return 1;
        case 'B': return 2;
        case 'C': return 3;
        case 'D': return 4;
        case 'E': return 5;
        case 'F': return 6;
        case 'G': return 7;
        case 'H': return 8;
        case 'I': return 9;
        case 'J': return 10;
        case 'K': return 11;
        case 'L': return 12;
        case 'M': return 13;
        case 'N': return 14;
        case 'O': return 15;
        case 'P': return 16;
        case 'Q': return 17;
        case 'R': return 18;
        case 'S': return 19;
        case 'T': return 20;
        case 'U': return 21;
        case 'V': return 22;
        case 'W': return 23;
        case 'X': return 24;
        case 'Y': return 26;
        case 'Z': return 26;
        default:  return 0;
        }
    }
}

```


