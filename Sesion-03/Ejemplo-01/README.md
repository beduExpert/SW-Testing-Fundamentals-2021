# Ejemplo 1 - Pruebas Unitarias

## Objetivo

Desarrollar pruebas unitarias en un programa de software, utilizando el framework de preubas TestNG y el lenguaje de programación Java lo cual ayudará al alumno a entender como desarrollar este tipo de pruebas y su utilidad.

## Desarrollo

>**💡 Nota para experto(a)**
>
> Este es un ejemplo por si el experto necesita tener en cuenta un punto clave durante el ejemplo.
>Si no es necesario, puedes borrar esta nota.

Para este ejemplo utilizaremos el programa utilizado en la sesión anterior para calcular la inversion en distintos plazos.

En las sesiones anteriores estuvimos utilizando un enfoque de pogramación estructurada. Es decir la ejecución del programa era secuencial y en algunos casos mandabamos a llamar funciones. Ya que la mayoría de cosas que se hacen en Java es con un enfoque de programación orientado a objetos el programa de la sesión anterior fue modificado utilizando este enfoque.

Este es el programa propuesto que utilizaremos:

```
import java.util.Scanner;

public class MyClass {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	Inversion inv = new Inversion();
    
    	inv.setCantidadOriginal(input.nextFloat());
    	inv.setPlazo(input.nextInt());
    	inv.imprimirResumenInversion();
    	inv.setDecisionUsuario(input.next());
    	inv.obtenerMensajeDecisionUsuario();
    }
}

class Inversion {

    private double cantidadOriginal;
    private double cantidadCompuesta;
    private int plazo;
    private double tasa;
    private String decisionUsuario;
	
    public double getCantidadOriginal() {
	return (Math.round(this.cantidadOriginal * 100.0) / 100.0);
    }

    public void setCantidadOriginal(double cantidadOriginal) {
	this.cantidadOriginal = cantidadOriginal;
    }

    public double getCantidadCompuesta() {
	return (Math.round(this.cantidadCompuesta * 100.0) / 100.0);
    }

    public void setCantidadCompuesta(double cantidadCompuesta) {
	this.cantidadCompuesta = cantidadCompuesta;
    }	
	
    public int getPlazo() {
	return this.plazo;
    }

    public void setPlazo(int plazo) {
	this.plazo = plazo;
    }

    public void setTasa(double tasa) {
	this.tasa = tasa;
    }
	
    public double getTasa() {
	return this.tasa;
    }
	
    public String getDecisionUsuario() {
	return decisionUsuario;
    }

    public void setDecisionUsuario(String decisionUsuario) {
	this.decisionUsuario = decisionUsuario;
    }    
    
    private double calcularTasa(int plazo) {
		
	double tasa = 0;
		
	if (plazo == 1) {
		tasa = 0.05;
	} else if (plazo == 2) {
		tasa = 0.08;
	} else if (plazo >= 3) {
		tasa = 0.10;
	} else {
		tasa = 0.0;
	}
		
	return tasa;
    }
	
    public void imprimirResumenInversion() {
		
	setCantidadCompuesta(this.cantidadOriginal);
		
	System.out.println("Resumen de la inversión: ");
	System.out.println("Año\t\tCantidad Original\tCantidad más Intereses\tTasa de Interés");
			
	for(int i=1;i<=this.plazo;i++) {
        	setTasa(calcularTasa(i));
		System.out.printf("%d\t\t%8.2f\t\t%8.2f\t\t%8.2f\n", (i+1), this.cantidadCompuesta, this.cantidadCompuesta * (1 * this.tasa), this.tasa);
		setCantidadCompuesta(this.cantidadCompuesta * (1 * this.tasa));
	}
		
	System.out.println("¿Estás de acuerdo con la inversión? (Y/N): ");
    }
	
    public String obtenerMensajeDecisionUsuario() {
				
	String mensaje = "";
	String decisionUsuario = getDecisionUsuario();
		
        if (decisionUsuario.equals("Y")) {
        	mensaje = "Gracias por invertir con nosotros.";
        } else {
	    	mensaje = "Gracias por su preferencia, esperamos verlo pronto.";
        }
        return mensaje;
    }
}

```

De aceurdo a la especificación del cliente estos son los valores que deberíamos de esperar que el programa calcule con un ejemplo de inversión inicial de $1500.

| Cantidad Original | Plazo | Tasa | Cantidad Compuesta |
| --- | --- | --- | --- |
| $1500 | 1 | 0.05 | $1575.00 |
| $1575 | 2 | 0.07 | $1685.25 |
| $1685.25 | 3 | 0.1 | $1853.78 |
| $1853.78 | 4 | 0.1 | $2039.16 |
| $2039.16 | 5 | 0.1 | $2243.08 |
| $2243.08 | 6 | 0.1 | $2467.39 |
| $2467.39 | 7 | 0.1 | $2714.13 |
| $2714.13 | 8 | 0.1 | $2985.54 |
| $2985.54 | 9 | 0.1 | $3284.09 |
| $3284.09 | 10 | 0.1 | $3612.50 |
| $3612.5 | 11 | 0.1 | $3973.75 |
| $3973.75 | 12 | 0.1 | $4371.13 |
| $4371.13 | 13 | 0.1 | $4808.24 |
| $4808.24 | 14 | 0.1 | $5289.06 |
| $5289.06 | 15 | 0.1 | $5817.97 |
| $5817.97 | 16 | 0.1 | $6399.77 |
| $6399.77 | 17 | 0.1 | $7039.75 |
| $7039.75 | 18 | 0.1 | $7743.73 |
| $7743.73 | 19 | 0.1 | $8518.10 |
| $8518.1 | 20 | 0.1 | $9369.91 |



