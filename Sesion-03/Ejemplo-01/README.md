# Ejemplo 1 - Pruebas Unitarias

## Objetivo

Desarrollar pruebas unitarias en un programa de software, utilizando el framework de pruebas TestNG y el lenguaje de programación Java lo cual ayudará al alumno a entender cómo desarrollar este tipo de pruebas y su utilidad.

## Desarrollo

Para este ejemplo utilizaremos el programa utilizado en la sesión anterior para calcular la inversion en distintos plazos.

En las sesiones anteriores estuvimos utilizando un enfoque de pogramación estructurada. Es decir, la ejecución del programa era secuencial y en algunos casos mandabamos a llamar funciones. Ya que la mayoría de cosas que se hacen en Java es con un enfoque de programación orientado a objetos el programa de la sesión anterior fue modificado utilizando este enfoque.

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
        	mensaje = "Gracias por invertir con nosotros";
        } else {
	    	mensaje = "Gracias por su prefrencia, esperamos verlo pronto.";
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

El primer paso será agregar el framework TestNG y una clase de este tipo.

![image](https://user-images.githubusercontent.com/67882289/135738752-b121fe31-4394-448d-b734-a7b71b0c4209.png)

![image](https://user-images.githubusercontent.com/67882289/135738784-ae2c86d7-d5ce-485b-aa11-a852b04cc5fc.png)

![image](https://user-images.githubusercontent.com/67882289/135738799-b92ce825-453c-42e2-a1da-781c050f1af1.png)

Una vez creada la clase, posicionamos el mouse como se muestra la imagen y damos click.

![image](https://user-images.githubusercontent.com/67882289/135738829-41e833a3-5e54-4369-b420-b97d6b22b0ae.png)

Con esto la librearía de TestNG será agregada al proyecto.

![image](https://user-images.githubusercontent.com/67882289/135738838-c308f380-1b9c-464b-b0c1-b2fb24da6f9a.png)

Cuando hacemos pruebas unitarias debemos analizar nuestro código para entender cómo vamos a inyectar entradas a la unidad de interés y que salidas vamos a poder utilizar para poder monitorear el comportamiento esperado.

Si observamos el código podemos apreciar que modificando las variables de cantidadOriginal y plazo en la clase Inversion podremos ejercitar las entradas y leyendo las variables de cantidadCompuesta y tasa podemos monitorear las salidas. 

<img width="648" alt="image" src="https://user-images.githubusercontent.com/67882289/135736913-748f3c28-5af6-4710-9c10-0f01d1090989.png">

Para poder acceder a las entradas y leer de las salidas utilizaremos las siguientes funciones dentro de la clase:

<img width="421" alt="image" src="https://user-images.githubusercontent.com/67882289/135737188-32ec0046-f7e4-45bf-badd-2894aeee0171.png">

TestNG nos va a permitir agrupar nuestras pruebas unitarias en archivos y cada prueba será representada como una función. Para que el TestNG reconozca la función como una prueba, debe de colocarse la notación @Test antes de cada función. Primero comenzaremos con la primer prueba para verificar que la tasa sea correcta con un plazo de 1 año.

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
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInversion {

   @Test
   public void verificarTasaConPlazoUno() {
	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(1);
	inv.imprimirResumenInversion();
	
   }
	
}

```
Al igual que otros frameworks y lenguajes de programación, TestNG y java usan los assertions para poder comparar un comportamiento actual contra un comportamiento esperado. Existen varias formas de hacer un assertion, sin embargo el más usado y recomendado es el Assert.assertEquals().

```
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInversion {

   @Test
   public void verificarTasaConPlazoUno() {
	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(1);
	inv.imprimirResumenInversion();
	
	Assert.assertEquals(inv.getTasa(), 0.05);
   }

}

```
Para poder ejecutar la prueba sólo hay que dar click derecho y selecciona la opción de Run TestNG test.

![image](https://user-images.githubusercontent.com/67882289/135737912-6ab27a9e-a5cc-45f6-9da9-01e82d4aa547.png)

Al terminar se puede observar en consola un resumen de las pruebas ejecutadas y un tab con los resultados detallados de TestNG.

![image](https://user-images.githubusercontent.com/67882289/135737944-8f0377c7-769d-420f-bd96-09d44822e4d3.png)

![image](https://user-images.githubusercontent.com/67882289/135737950-b78bb518-cf17-4085-a08f-db3813391870.png)

Para crear las pruebas faltantes simplemente hay que copiar y pegar el código, modificando los valores necesarios.

```
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInversion {

    @Test
    public void verificarTasaConPlazoUno() {
	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(1);
	inv.imprimirResumenInversion();
	
	Assert.assertEquals(inv.getTasa(), 0.05);
    }
   
    @Test
    public void verificarTasaConPlazoDos() {

	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(2);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.07);
    }
	
    @Test
    public void verificarTasaConPlazoTres() {

	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(3);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.1);
    }
	
    @Test
    public void verificarTasaConPlazoDiez() {

	Inversion inv = new Inversion();
	inv.setCantidadOriginal(1500);
	inv.setPlazo(10);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.1);
    }
}

```
Vamos a ejecutar las pruebas nuevamente, en esta ocasión podemos ver que 2 de las pruebas fallaron.

![image](https://user-images.githubusercontent.com/67882289/135738040-903be90f-2a65-48ff-98dc-3cde02a671a8.png)

<img width="890" alt="image" src="https://user-images.githubusercontent.com/67882289/135738149-17ba03bd-b900-4596-a154-2cb8896c2d44.png">

<img width="890" alt="image" src="https://user-images.githubusercontent.com/67882289/135738153-029f6ddf-36cf-4935-b9d2-66d55fe363ff.png">

Al observar el detalle de los resultados podemos observar:

- La prueba que verifica la tasa con plazo dos falla porque esperaba una tasa de 0.07 pero el programa entrego 0.08.
- La prueba que verrifica la tasa con plazo diez falla porque esperaba una tasa de 0.1 pero el programa entrego 0.0.

Vamos al código original, para ver que es lo que está pasando... Al observar la función de calcularTasa() que se manda a llamar desde la función imprimirResumenInversion() podemos ver los siguientes detalles:

<img width="644" alt="image" src="https://user-images.githubusercontent.com/67882289/135738338-3821e7b9-985c-4c82-84ee-fa5cb4f956a5.png">

Así se mostraría la función correctamente.

```
    private double calcularTasa(int plazo) {
		
    	double tasa = 0;
		
    	if (plazo == 1) {
    		tasa = 0.05;
    	} else if (plazo == 2) {
    		tasa = 0.07;
    	} else if (plazo >= 3) {
    		tasa = 0.10;
    	} else {
    		tasa = 0.0;
    	}
		
    	return tasa;
    }

```
Si volvemos a ejecutar las pruebas podemos observar que no se encontraron fallas.

![image](https://user-images.githubusercontent.com/67882289/135738435-df4ceff8-7ca3-4e00-a5d9-6389cf935fdb.png)

![image](https://user-images.githubusercontent.com/67882289/135738444-159345a5-c59c-412a-9cb3-d9df7ff32efa.png)

Para finalizar se propone una versión mejorada de la clase TestInversion. Observese que se está utilizando la anotación @BeforeTest, al usar está anotación está función se ejecutara antes de cada prueba.

```
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestInversion {

    Inversion inv;
	
    @BeforeTest
    public void preConditions() {
	inv = new Inversion();
	inv.setCantidadOriginal(1500);
    }
	
    @Test
    public void verificarTasaConPlazoUno() {
	inv.setPlazo(1);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.05);
    }
	
    @Test
    public void verificarTasaConPlazoDos() {
	inv.setPlazo(2);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.07);
    }
	
    @Test
    public void verificarTasaConPlazoTres() {
	inv.setPlazo(3);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.1);
    }
	
    @Test
    public void verificarTasaConPlazoDiez() {
	inv.setPlazo(10);
	inv.imprimirResumenInversion();
		
	Assert.assertEquals(inv.getTasa(), 0.1);
    }
}

```
