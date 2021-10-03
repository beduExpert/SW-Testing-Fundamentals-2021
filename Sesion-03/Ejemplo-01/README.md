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
	} else if (plazo == 3) {
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
Para poder comenzar hay que crear un nuevo proyecto en Eclipse.

<img width="806" alt="image" src="https://user-images.githubusercontent.com/67882289/135735996-b870f863-90b2-49c7-9ad5-6b4866346a72.png">

Enseguida hay que crear una nueva clase, la cual llamaremos "Inversion".

<img width="526" alt="image" src="https://user-images.githubusercontent.com/67882289/135736011-1d7ea847-f900-473c-bb5f-1c7a1acf06fa.png">

<img width="584" alt="image" src="https://user-images.githubusercontent.com/67882289/135736022-47be44e5-4929-465e-985a-6b9277478da5.png">

Después hay que copiar pegar el código del programa propuesto más arriba. Para este ejemplo no necesitaremos el código del main, ya que sólo vamos a enfoncarnos a probar el componente inversión.

<img width="891" alt="image" src="https://user-images.githubusercontent.com/67882289/135736125-b74c1761-b937-4397-9160-fd8b6b7ba3c1.png">

De acuerdo a la especificación del cliente estos son los valores que deberíamos de esperar que el programa calcule con un ejemplo de inversión inicial de $1500.

| Cantidad Original | Plazo | Tasa | Cantidad Compuesta |
| --- | --- | --- | --- |
| $1500.00 | 1 | 5% | $1575.00 |
| $1575.00 | 2 | 7% | $1685.25 |
| $1685.25 | 3 | 10% | $1853.78 |
| $1853.78 | 4 | 10% | $2039.16 |
| $2039.16 | 5 | 10% | $2243.08 |
| $2243.08 | 6 | 10% | $2467.39 |
| $2467.39 | 7 | 10% | $2714.13 |
| $2714.13 | 8 | 10% | $2985.54 |
| $2985.54 | 9 | 10% | $3284.09 |
| $3284.09 | 10 | 10% | $3612.50 |
| $3612.50 | 11 | 10% | $3973.75 |
| $3973.75 | 12 | 10% | $4371.13 |
| $4371.13 | 13 | 10% | $4808.24 |
| $4808.24 | 14 | 10% | $5289.06 |
| $5289.06 | 15 | 10% | $5817.97 |
| $5817.97 | 16 | 10% | $6399.77 |
| $6399.77 | 17 | 10% | $7039.75 |
| $7039.75 | 18 | 10% | $7743.73 |
| $7743.73 | 19 | 10% | $8518.10 |
| $8518.10 | 20 | 10% | $9369.91 |

En este ejemplo nos enfocaremos a probar que el programa nos esté regresando la tasa correcta dependiendo del plazo seleccionado. Por lo tanto nos enfocaremos a probar la función "imprimirResumenInversion()", la cual podemos considerar como una unidad.

En el ejemplo vamos a crear 4 pruebas unitarias y ejecutarlas para analizar los resultados. Las pruebas serán las siguientes:

1. Verificar que la tasa calculada para el plazo de 1 año sea igual al 5%.
2. Verificar que la tasa calculada para el plazo de 2 año sea igual al 5%.
3. Verificar que la tasa calculada para el plazo de 3 año sea igual al 10%.
4. Verificar que la tasa calculada para el plazo de 10 año sea igual al 10%.

El primer paso será agregar el framework de pruebas a las librerías de nuestro proyecto.

<img width="365" alt="image" src="https://user-images.githubusercontent.com/67882289/135736173-df8e8fc1-0657-4b9c-a3f4-963eee32cabe.png">

<img width="992" alt="image" src="https://user-images.githubusercontent.com/67882289/135736194-06dcc969-2b5e-4fd8-8557-5cc334aa334a.png">

<img width="585" alt="image" src="https://user-images.githubusercontent.com/67882289/135736200-f42089a2-46a1-4cac-8dcc-b364e2eefc39.png">

<img width="588" alt="image" src="https://user-images.githubusercontent.com/67882289/135736205-aeb188da-0a70-483c-8858-6efb9e2dec6c.png">

Damos click en "Apply and Close" y el folder de TestNG ya debe estar incluido en nuestro proyecto.

<img width="335" alt="image" src="https://user-images.githubusercontent.com/67882289/135736224-34a433b8-3547-4e8e-892b-b0e51bff333e.png">

Una vez añadida la librería TestNG, procederemos a crear otra nueva clase y nombrarla "TestInversion".

<img width="585" alt="image" src="https://user-images.githubusercontent.com/67882289/135736297-823d9655-d95b-49b2-8ea3-df2bf2551195.png">

<img width="596" alt="image" src="https://user-images.githubusercontent.com/67882289/135736302-9b426ffa-adcd-4037-b9fc-b7ca9d36fd09.png">

TestNG nos va a permitir agrupar nuestras pruebas unitarias en archivos y cada prueba será representada como una función. Para que el TestNG reconozca la función como una prueba, debe de colocarse la notación @Test antes de cada función. Primero comenzaremos con la primer prueba para verificar que la tasa sea correcta con un plazo de 1 año.

Cuando hacemos pruebas unitarias debemos analizar nuestro código para entender cómo vamos a inyectar entradas a la unidad de interés y que salidas vamos a poder utilizar para poder monitorear el comportamiento esperado.

Si observamos el código podemos apreciar que modificando las variables de cantidadOriginal y plazo en la clase Inversion podremos ejercitar las entradas y leyendo las variables de cantidadCompuesta y tasa podemos monitorear las salidas. 

<img width="648" alt="image" src="https://user-images.githubusercontent.com/67882289/135736913-748f3c28-5af6-4710-9c10-0f01d1090989.png">

Para poder acceder a las entradas y leer de las salidas utilizaremos las siguientes funciones dentro de la clase:




```
import org.testng.annotations.Test;

public class TestInversion {

   @Test
   public void verificarTasaConPlazoUno() {

   }
	
}

```
Vamos a instanciar un objeto de la clase Inversion y setear los valores que deseamos a las variables de instancia que require el objeto.

```
import org.testng.annotations.Test;

public class TestInversion {

   @Test
   public void verificarTasaConPlazoUno() {
	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(1);
   }
	
}











