# Reto 2 - Creando código con TDD.

## Objetivo

Diseñar pruebas unitarias y desarrollar código utilizando el efoque de programación de desarrollo conducido por pruebas.

## Desarrollo

En el ejemplo anterior diseñamos algunas de los casos de prueba y desarrollamos el código necesario para poder cubrirlos, en este reto debes terminar de diseñar los casos de prueba faltantes, así como el código para poder cubrirlos.

Este es el código hasta el momento:

```
public class EscuelaOnline {

    private int numeroDeCursosInscritos;
	
    public int getNumeroDeCursosInscritos() {
	return numeroDeCursosInscritos;
    }

    public void setNumeroDeCursosInscritos(int numeroDeCursosInscritos) {
	if (numeroDeCursosInscritos == 0 || numeroDeCursosInscritos > 4) {
		this.numeroDeCursosInscritos = 99;
	} else {
		this.numeroDeCursosInscritos = numeroDeCursosInscritos;
	}
    }

    public String mostrarCatalogoDeCursos() {
		
	String mensaje = "";
		
	mensaje = "Bienvenido a la Escuela Online.\n" + 
			"\n" +
			"Estos son los cursos que ofrecemos:\n" +
			"\n" +
			"[1] Programación con Java\n" +
			"[2] Software Testing\n" +
			"[3] Ciberseguridad\n" +
			"[4] Machine Learning\n" +
			"\n" +
			"¿Cuántos deseas tomar? (1,2,3 ó 4).";
				
	System.out.println(mensaje);
		
	return mensaje;
		
    }
		
}

```
Y estas son las pruebas que llevamos hasta el momento:

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEscuelaOnline {
	
    EscuelaOnline cursos;
	
    @BeforeTest
    public void preConditions() {
      cursos = new EscuelaOnline();
    }

    @Test
    public void verificarQueSeMuestreCatalogoConCursosDisponibles() throws FileNotFoundException {
      String resultado_esperado = leerArchivoDeTexto("src/Catalogo_Cursos.txt");
	    Assert.assertEquals(cursos.mostrarCatalogoDeCursos(), resultado_esperado);
    }

    @Test
    public void verificarQueAlumnoPuedaSeleccionar1Curso() {
	    cursos.setNumeroDeCursosInscritos(1);
    	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 1);
    }

    @Test
    public void verificarQueAlumnoPuedaSeleccionar4Cursos() {
    	cursos.setNumeroDeCursosInscritos(4);
    	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 4);
    }
  
    @Test
    public void verificarQueAlumnoNoPuedaSeleccionar0Cursos() {
    	cursos.setNumeroDeCursosInscritos(0);
    	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 99);
    }  
  
    @Test
    public void verificarQueAlumnoNoPuedaSeleccionar5Cursos() {
    	cursos.setNumeroDeCursosInscritos(5);
    	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 99);
    }

    private String leerArchivoDeTexto(String file_path) throws FileNotFoundException {
		
    	File file = new File(file_path);
    	Scanner scan = new Scanner(file);
    	String file_content = "";
		
      while(scan.hasNextLine()) {
  		file_content = file_content.concat(scan.nextLine() + "\n");
    }	
	  
	    return file_content.substring(0, file_content.length() - 1);
    }
}  
```
De acuerdo al diseño que propusimos en el ejemplo anterior estas son las pruebas que debemos de desarrollar.

- Verificar descuento aplicado cuando el alumno selecciona 1 curso.
- Verificar precio total sin descuento sin IVA cuando el alumno selecciona 1 curso.
- Verificar precio total sin descuento con IVA cuando el alumno selecciona 1 curso.
- Verificar descuento aplicado cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 2 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 3 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 4 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 4 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 4 cursos.

Los resultados esperados podemos obtenerlos de la siguiente tabla.

| Numero de Cursos | Descuento | Precio con Descuento | Precio con Descuento Mas IVA |
| --- | --- | --- | --- |
| 1 | 0% | 4000.00 | 4640.00 |
| 2 | 10% | 7200.00 |	8352.00 |
| 3 | 25% | 9000.00 |	10440.00 |
| 4 | 40% | 9600.00 |	11136.00 |

## Código Propuesto

Código:

```
public class EscuelaOnline {

	private double PRECIO_UNITARIO_CURSO;
	private double IVA;
	private int numeroDeCursosInscritos;
	private double descuento;
	private double precioConDescuentoSinIva;
	private double precioConDescuentoConIva;
	
	EscuelaOnline() {
		PRECIO_UNITARIO_CURSO = 4000.00;
		IVA = 1.16;
	}
	
	public int getNumeroDeCursosInscritos() {
		return this.numeroDeCursosInscritos;
	}

	public void setNumeroDeCursosInscritos(int numeroDeCursosInscritos) {
		if (numeroDeCursosInscritos == 0 || numeroDeCursosInscritos > 4) {
			this.numeroDeCursosInscritos = 99;
		} else {
			this.numeroDeCursosInscritos = numeroDeCursosInscritos;
		}
	}

	public double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public double getPrecioConDescuentoSinIva() {
		return (Math.round(this.precioConDescuentoSinIva * 100) / 100);
	}

	public void setPrecioConDescuentoSinIva(double precioConDescuentoSinIva) {
		this.precioConDescuentoSinIva = precioConDescuentoSinIva;
	}

	public double getPrecioConDescuentoConIva() {
		return (Math.round(this.precioConDescuentoConIva * 100) / 100);
	}

	public void setPrecioConDescuentoConIva(double precioConDescuentoConIva) {
		this.precioConDescuentoConIva = precioConDescuentoConIva;
	}	
	
	public String mostrarCatalogoDeCursos() {
		
		String mensaje = "";
		
		mensaje = "Bienvenido a la Escuela Online.\n" + 
					    "\n" +
					    "Estos son los cursos que ofrecemos:\n" +
    					"\n" +
		    			"[1] Programación con Java\n" +
				    	"[2] Software Testing\n" +
			    		"[3] Ciberseguridad\n" +
					    "[4] Machine Learning\n" +
    					"\n" +
		    			"¿Cuántos deseas tomar? (1,2,3 ó 4).";
				
		System.out.println(mensaje);
		
		return mensaje;
		
	}
	
	public void calcularDescuento() {
		int noCursos = getNumeroDeCursosInscritos();
		
		switch(noCursos) {
		case 1:		
			setDescuento(0.0);
		break;
		case 2:
			setDescuento(0.1);
		break;
		case 3:		
			setDescuento(0.25);
		break;
		case 4:
			setDescuento(0.4);
		break;
		}
	}
	
	public void calcularPrecioTotalConDescuentoSinIVA () {
		int noCursos = getNumeroDeCursosInscritos();
		double precio = PRECIO_UNITARIO_CURSO * noCursos * (1 - getDescuento());
		setPrecioConDescuentoSinIva(precio);
	}

	public void calcularPrecioTotalConDescuentoConIVA () {
		int noCursos = getNumeroDeCursosInscritos();
		double precio = PRECIO_UNITARIO_CURSO * noCursos * (1 - getDescuento()) * IVA;		
		setPrecioConDescuentoConIva(precio);
	}
		
}
```
Pruebas:

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestEscuelaOnline {
	
	EscuelaOnline cursos;
	double PRECIO_UNITARIO_CURSO;
	double IVA;
	
	@BeforeClass
	public void initialConditions() {
		PRECIO_UNITARIO_CURSO = 4000.00;
		IVA = 1.16;
	}

	@BeforeTest
	public void preCondiciones() {
		cursos = new EscuelaOnline();
	}
	
	@Test
	public void verificarQueSeMuestreCatalogoConCursosDisponibles() throws FileNotFoundException {
		String resultado_esperado = leerArchivoDeTexto("src/Catalogo_Cursos.txt");
		Assert.assertEquals(cursos.mostrarCatalogoDeCursos(), resultado_esperado);
	}

	@Test
	public void verificarQueAlumnoPuedaSeleccionar1Curso() {
		cursos.setNumeroDeCursosInscritos(1);
		Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 1);
	}

	@Test
	public void verificarQueAlumnoPuedaSeleccionar4Cursos() {
		cursos.setNumeroDeCursosInscritos(4);
		Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 4);
	}
	  
	@Test
	public void verificarQueAlumnoNoPuedaSeleccionar0Cursos() {
		cursos.setNumeroDeCursosInscritos(0);
		Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 99);
	}
  
	@Test
	public void verificarQueAlumnoNoPuedaSeleccionar5Cursos() {
		cursos.setNumeroDeCursosInscritos(5);
		Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), 99);
	}
	  
	@Test
	public void verificarDescuentoAplicadoCon1Curso() {
		cursos.setNumeroDeCursosInscritos(1);
		System.out.println(cursos.getNumeroDeCursosInscritos());
		
		cursos.calcularDescuento();
		Assert.assertEquals(cursos.getDescuento(), 0);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoSinIvaCon1Curso() {
		cursos.setNumeroDeCursosInscritos(1);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoSinIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoSinIva(), 4000.00);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoConIvaCon1Curso() {
		cursos.setNumeroDeCursosInscritos(1);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoConIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoConIva(), 4640.00);
	}
	
	@Test
	public void verificarDescuentoAplicadoCon2Cursos() {
		cursos.setNumeroDeCursosInscritos(2);
		cursos.calcularDescuento();
		Assert.assertEquals(cursos.getDescuento(), 0.1);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoSinIvaCon2Cursos() {
		cursos.setNumeroDeCursosInscritos(2);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoSinIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoSinIva(), 7200.00);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoConIvaCon2Cursos() {
		cursos.setNumeroDeCursosInscritos(2);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoConIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoConIva(), 8352.00);
	}
	
	@Test
	public void verificarDescuentoAplicadoCon3Cursos() {
		cursos.setNumeroDeCursosInscritos(3);
		cursos.calcularDescuento();
		Assert.assertEquals(cursos.getDescuento(), 0.25);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoSinIvaCon3Cursos() {
		cursos.setNumeroDeCursosInscritos(3);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoSinIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoSinIva(), 9000.00);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoConIvaCon3Cursos() {
		cursos.setNumeroDeCursosInscritos(3);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoConIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoConIva(), 10440.00);
	}
	
	@Test
	public void verificarDescuentoAplicadoCon4Cursos() {
		cursos.setNumeroDeCursosInscritos(4);
		cursos.calcularDescuento();
		Assert.assertEquals(cursos.getDescuento(), 0.40);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoSinIvaCon4Cursos() {
		cursos.setNumeroDeCursosInscritos(4);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoSinIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoSinIva(), 9600.00);
	}
	
	@Test
	public void verificarPrecioTotalSinDescuentoConIvaCon4Cursos() {
		cursos.setNumeroDeCursosInscritos(4);
		cursos.calcularDescuento();
		cursos.calcularPrecioTotalConDescuentoConIVA();
		Assert.assertEquals(cursos.getPrecioConDescuentoConIva(), 11136.00);
	}

	private String leerArchivoDeTexto(String file_path) throws FileNotFoundException {
		
		File file = new File(file_path);
		Scanner scan = new Scanner(file);
		String file_content = "";
		
		while(scan.hasNextLine()) {
			file_content = file_content.concat(scan.nextLine() + "\n");
		}		
	  
		return file_content.substring(0, file_content.length() - 1);
	}  
}
