# Reto 3 - Crea tu propio programa con un modelo incremental.

## Objetivo

Construir un programa simulando un modelo incremental e identificar la mayor cantidad de defectos para que el alumno distinga las ventajas y desventajas de usar un modelo incremental contra uno secuencial.

>**馃挕 Nota para experto(a)**
>
> Si el reto demora m谩s de 25 minutos, entregar el c贸digo propuesto a los alumnos.

## Desarrollo

Para este ejercicio se debe construir un programa con las historias de usuario que se mencionan a continuaci贸n:

Historia 1
> Como desarrollador de la aplicaci贸n para invertir dinero, quiero que implementar una interfaz donde se pregunte al usuario la cantidad a invertir y el n煤mero de a帽os que se desea dejar la inversi贸n para poder almacenar la informaci贸n del cliente.

> Criterios de Aceptaci贸n.
> - Mostrar una interfaz donde se pregunte al usuario: cantidad a invertir y n煤mero de a帽os.
> - Guardar la informaci贸n proporcionada por el usuario.

Encontrando Defectos Historia 1
> Reunanse en equipos e intenten encontrar y documentar la mayor cantidad de defectos.

| Defecto | Descripci贸n | Posible Causa Raiz |
| --- | --- | --- |
| #1 |  |  |
| #2 |  |  |
| #3 |  |  |
| #N |  |  |

Historia 2
> Como desarrollador de la aplicaci贸n para invertir dinero, quiero implementar una funcionalidad para poder calcular el rendimiento de la cantidad invertida dependiendo del n煤mero de a帽os a invertir, para poder obtener el c谩lculo de capital e intereses generados.

> Criterios de Aceptaci贸n
> - Implementar un c贸digo para calcular los intereses dependiendo del n煤mero de a帽os a invertir.
>   - En el primer a帽o se genera un rendimiento del 5%.
>   - En el segundo a帽o se genera un rendimiento del 7%
>   - En el tercer a帽o en adelante se genera un rendimiento del 10%
> - El c贸digo debe de regresar la cantidad de intereses que se generan.

Encontrando Defectos Historia 2
> Reunanse en equipos e intenten encontrar y documentar la mayor cantidad de defectos.

| Defecto | Descripci贸n | Posible Causa Raiz |
| --- | --- | --- |
| #1 |  |  |
| #2 |  |  |
| #3 |  |  |
| #N |  |  |

Historia 3
> Como desarrollador de la aplicaci贸n para invertir dinero, quiero implementar una forma de desplegar al usuario el capital original, el capital m谩s intereses y la tasa de inter茅s, para mostrar la informaci贸n de inter茅s al usuario. 

> Criterios de Aceptaci贸n
> - Implementar interfaz que despliegue la siguiente informaci贸n al usuario por cada a帽o que se desea invertir:
>   - Capital original.
>   - Capital m谩s intereses.
>   - Tasa de Inter茅s.

Encontrando Defectos Historia 3
> Reunanse en equipos e intenten encontrar y documentar la mayor cantidad de defectos.

| Defecto | Descripci贸n | Posible Causa Raiz |
| --- | --- | --- |
| #1 |  |  |
| #2 |  |  |
| #3 |  |  |
| #N |  |  |

Historia 4

> Como desarrollador de la aplicaci贸n para invertir dinero, quiero implementar una forma de preguntar al usuario si est谩 de acuerdo con la inversi贸n, para poder almacenar la decisi贸n del usuario y terminar la aplicaci贸n.

> Criterios de Aceptaci贸n

> - Implementar interfaz para preguntar al usuario si est谩 de acuerdo con la operaci贸n.
> - Si el usuario est谩 de acuerdo se debe desplegar el mensaje "Gracias por invertir con nosotros".
> - Si el usuario no est谩 de acuerdo se debe desplegar el mensaje "Gracias por su preferencia, esperamos verlo pronto".
> - Almacenar la decisi贸n del usuario.

Encontrando Defectos Historia 4
> Reunanse en equipos e intenten encontrar y documentar la mayor cantidad de defectos.

| Defecto | Descripci贸n | Posible Causa Raiz |
| --- | --- | --- |
| #1 |  |  |
| #2 |  |  |
| #3 |  |  |
| #N |  |  |

Para est谩 actividad el c贸digo propuesto tiene defectos para poder trabajar la actividad de econtrar defectos.

## C贸digo propuesto Historia 1

<img width="606" alt="image" src="https://user-images.githubusercontent.com/67882289/135689201-9d7d7c17-fc4d-42bd-b6d4-b64478e0a85e.png">

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	float cantidad = input.nextFloat();
	int plazo = input.nextInt();
		
    }
  
}

```

## C贸digo propuesto Historia 2

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	float cantidad = input.nextFloat();
	int plazo = input.nextInt();
		
    }
  
    public static float calcularIntereses(float cantidad, int plazo) {
		
	float interes = 0;
		
	if (plazo == 1) {
		interes = cantidad * 0.05f;
	} else if (plazo == 2) {
		interes = cantidad * 0.07f;
	} else if (plazo >= 3) {
		interes = cantidad * 0.10f;
	} else {
		// Do Nothing
	}	
	return interes;
    }
}

```

## C贸digo propuesto Historia 3

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	float cantidad = input.nextFloat();
	int plazo = input.nextInt();
	float interes = 0;
	
	System.out.println("Resumen de la inversi贸n: ");
	System.out.println("A帽o\t\tCantidad Original\t\tCantidad m谩s Intereses\t\tTasa de Inter茅s");
		
	for(int i=1;i<=plazo;i++) {
		interes = calcularIntereses(cantidad, i);
		System.out.printf("%d\t\t%8.2f\t\t%8.2f\t\t%8.2f\n", (i+1), cantidad, cantidad+interes, interes);
	}
		
    }
  
    public static float calcularIntereses(float cantidad, int plazo) {
		
	float interes = 0;
		
	if (plazo == 1) {
		interes = cantidad * 0.05f;
	} else if (plazo == 2) {
		interes = cantidad * 0.07f;
	} else if (plazo >= 3) {
		interes = cantidad * 0.10f;
	} else {
		// Do Nothing
	}	
	return interes;
    }
}

```

## C贸digo propuesto Historia 4

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

	float cantidad = input.nextFloat();
	int plazo = input.nextInt();
	float interes = 0;
	
	System.out.println("Resumen de la inversi贸n: ");
	System.out.println("A帽o\t\tCantidad Original\t\tCantidad m谩s Intereses\t\tTasa de Inter茅s");
		
	for(int i=1;i<=plazo;i++) {
		interes = calcularIntereses(cantidad, i);
		System.out.printf("%d\t\t%8.2f\t\t%8.2f\t\t%8.2f\n", (i+1), cantidad, cantidad+interes, interes);
	}
		
	System.out.println("驴Est谩s de acuerdo con la inversi贸n? (Y/N): ");
	String decisionUsuario = input.next();
	mensajeDecisionUsuario(decisionUsuario);
		
    }
  
    public static float calcularIntereses(float cantidad, int plazo) {
		
	float interes = 0;
		
	if (plazo == 1) {
		interes = cantidad * 0.05f;
	} else if (plazo == 2) {
		interes = cantidad * 0.07f;
	} else if (plazo >= 3) {
		interes = cantidad * 0.10f;
	} else {
		// Do Nothing
	}	
	return interes;
    }
    
    public static void mensajeDecisionUsuario(String decisionUsuario) {
	    
        if (decisionUsuario == "Y") {
	        System.out.println("Gracias por invertir con nosotros.");
	} else {
	        System.out.println("Gracias por su preferencia, esperamos verlo pronto.");
	}	    
    }    
    
}

```


