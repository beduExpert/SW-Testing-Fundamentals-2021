# Ejemplo 2 - Desarrollo Conducido por Pruebas - TDD

## Objetivo

Ejemplificar como se construye un programa al utilizar desarrollo conducido por pruebas.

## Desarrollo

En este ejemplo vamos a desarrollar el siguiente programa utilizando TDD.

Especificación:
> Una escuela online a abierto sus puertas y por lanzamiento está ofreciendo una promoción. La escuela por el momento sólo ofrece cuatro cursos: "Programación con Java", "Software Testing", "Ciberseguridad" y "Machine Learning".
> El alumno interesado puede escoger uno de los tres cursos o los cuatro, el alumno puede recibir los siguientes descuentos al escoger más de uno:
> - Si el alumno escoge 1 no se la hará ningún descuento.
> - Si el alumno escoge 2 se le hará el 10% de precio total.
> - Si el alumno escoge 3 se le hará el 25% de precio total.
> - Si el alumno escoge 4 se le hará el 40% de precio total.
> 
> Cada curso sin descuento tiene un precio de $4000 pesos sin IVA.
> 
> Escribir un programa que muestre al usuario el catalogo de cursos y pregunté cuántos desea tomar. Dependiendo de la decisión del alumno el programa debe regresar el precio total con descuento sin IVA, el descuento aplicado y el precio total con descuento con IVA, considerando un impuesto IVA del 16%.
>
> El siguiente archivo texto adjunto representa como debe mostrarse la interfaz con el catálogo de cursos. 

![image](https://user-images.githubusercontent.com/67882289/135773698-3dc8315d-1691-49cb-9eff-9423e0e9a495.png)

El principio de TDD es diseñar primero los casos de pruebas, para lo cual no necesitamos una interfaz de programación. Los casos de prueba que propondremos pueden ser hechos en un bloc de notas si así se desea. De la especificación anterior proponemos los siguientes casos de prueba.

- Verificar que el programa muestre al usuario el catalogo de los 4 cursos disponibles.
- Verificar que el alumno pueda seleccionar al menos 1 curso.
- Verificar que el alumno pueda seleccionar 4 cursos.
- Verificar que el alumno no pueda seleccionar 0 curos. 
- Verificar que el usuario no pueda seleccionar 5 cursos.

### Nota:
> Aqui podemos apreciar una de las ventajas del TDD, a pesar que la especificación no indica qué debería de pasar si el alumno selecciona 0 o 5 cursos, debido a que se comenzaron a diseñar las pruebas desde un inicio podemos darnos cuentas de esta inconsistencia antes de comenzar a escribir el código. En un proyecto real esta ambigüedad debería discutirse con el representante del cliente y es así que el defecto no se hubiera resaltado hasta después de que el código ya estuviera construido.

- Verificar precio total sin descuento sin IVA cuando el alumno selecciona 1 curso.
- Verificar descuento aplicado cuando el alumno selecciona 1 curso.
- Verificar precio total sin descuento con IVA cuando el alumno selecciona 1 curso.

### Nota:
> Cuando diseñamos pruebas conviene considerar los siguientes puntos:
> - Establecer una misma palabra para indicar que se va a probar algo, es decir si se usa la palabra "verificar", ésta se debe de mantener para todos los demás casos de prueba. No es recomendable después de haber establecido una palabra como "verificar" en algunos casos, después usar: "validar", "checar", "probar", etc. Para los demás.
> - Mantener la misma estructura y orden de las palabras para todos los casos de prueba, por ejemplo si usamos la palabra "verificar" al inicio de cada oración, está la deberemos mantener al inicio de todos, después procederemos con el objeto a verificar y por último con el restante de la oración. Esto ayudará a comprendender más fácil el objetivo de los casos de prueba cuando se tienen más de 100, 1000, etc.
> - Reutilizar los casos de prueba. En los 3 casos de prueba anteriores podemos preveer que los restantes para 2,3 y 4 cursos serán muy parecidos, por lo que se recomienda que en vez de escribir uno a uno los que faltan, se copie y peguen estos tres y sólo se modifiquen las palabras de interés.
> - Procurar no colocar datos especificos que seguramente puedan cambiar en el futuro. Por ejemplo no es recomendable poner datos como 10% o igual $4000, ya que si en un futuro la especificación cambia, tendremos que actualizar todas los casos de prueba con la nueva información.

- Verificar precio total con descuento sin IVA cuando el alumno selecciona 2 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 2 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 3 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 3 cursos.
- Verificar precio total con descuento sin IVA cuando el alumno selecciona 4 cursos.
- Verificar descuento aplicado cuando el alumno selecciona 4 cursos.
- Verificar precio total con descuento con IVA cuando el alumno selecciona 4 cursos.

Para este ejemplo vamos a diseñar las primeras 5 pruebas y desarrollaremos el código necesario para poder cubrirlas. Primero hay que crear una clase TestNG y vaciar los casos de prueba propuestos con el código necesario para que pasen.

```
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEscuelaOnline {
	
  @Test
  public void verificarQueSeMuestreCatalogoConCursosDisponibles() {
	  Assert.assertEquals(true, true);
  }

  @Test
  public void verificarQueAlumnoPuedaSeleccionar1Curso() {
	  Assert.assertEquals(true, true);
  }

  @Test
  public void verificarQueAlumnoPuedaSeleccionar4Cursos() {
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void verificarQueAlumnoNoPuedaSeleccionar0Cursos() {
	  Assert.assertEquals(true, true);
  }  
  
  @Test
  public void verificarQueAlumnoNoPuedaSeleccionar5Cursos() {
	  Assert.assertEquals(true, true);
  }
  
}
```
Si ejecutamos los casos de prueba podemos darnos cuenta que pasan.

<img width="971" alt="image" src="https://user-images.githubusercontent.com/67882289/135771117-2571e13f-6559-49dc-b3f6-2f2d20895ccf.png">

<img width="972" alt="image" src="https://user-images.githubusercontent.com/67882289/135771124-5c8c2b32-8c11-44fe-acb3-2c148b1b99a8.png">

Para comenzar a desarrollar el código de la aplicación debemos crear una nueva clase que llamaremos "EscuelaOnline".

![image](https://user-images.githubusercontent.com/67882289/135769783-5c114adb-8bc0-49b3-870a-15e04905e2b3.png)

![image](https://user-images.githubusercontent.com/67882289/135769824-46f8373b-f15f-4342-bfab-3c29cf8b57f4.png)

Para poder mostrar el catalogo de cursos necesitamos crear un método que muestre este contenido. Para esto crearemos un método de la siguiente forma:

```
public class EscuelaOnline {

    public String mostrarCatalogoDeCursos() {
		
	String mensaje = "";
		
		mensaje = "Bienvenido a la Escuela Online.\n" + 
				"\n" +
				"Estos son los cursos que ofrecemos:\n" +
				"\n" +
				"[1] Programación con Java\n" +
				"[2] Software Testing\n" +
				"[3] Ciberseguridad" +
				"[4] Machine Learning\n" +
				"\n" +
				"¿Cuántos deseas tomar? (1,2,3 ó 4).";
				
	System.out.println(mensaje);
		
	return mensaje;
		
    }	
}
```
A propósito dejamos un argumento de retorno para poder verificar el contenido del mensaje en nuestro caso de prueba. Regresando a la prueba agregaremos el código para poder leer este mensaje.

```
  @Test
  public void verificarQueSeMuestreCatalogoConCursosDisponibles() {
	  EscuelaOnline cursos = new EscuelaOnline();
	  Assert.assertEquals(cursos.mostrarCatalogoDeCursos(), true);
  }
```
Si corremos nuevamente los casos de prueba, comprobaremos que el primer caso de prueba falla debido al código que insertamos.

<img width="951" alt="image" src="https://user-images.githubusercontent.com/67882289/135771311-93b4f556-fd21-40cc-9ec5-0f875cd17f18.png">

<img width="971" alt="image" src="https://user-images.githubusercontent.com/67882289/135773794-99c65964-9a5a-48f8-b301-003ded230d7e.png">

Necesitamos una forma de poder leer el archivo de texto adjunto donde viene cómo debe mostrarse el catálogo de cursos (archivo adjunto en la misma carpeta donde se encuentra este Ejemplo). Se recominda copiar y pegar este archivo en la carpeta "src" del proyecto "TDD".

<img width="308" alt="image" src="https://user-images.githubusercontent.com/67882289/135772096-a1a8a543-0b03-454e-9b4d-e48f6a0aae0c.png">

Para leer el contenido del archivo de texto proponemos el siguiente código.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEscuelaOnline {
	
  @Test
  public void verificarQueSeMuestreCatalogoConCursosDisponibles() {
	  EscuelaOnline cursos = new EscuelaOnline();
	  Assert.assertEquals(cursos.mostrarCatalogoDeCursos(), true);
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
Cómo funciona el método "leerArchivoDeTexto()" está fuera del alcance de este curso, sin embargo es importante notar que dentro de la clase donde estamos colocando nuestros casos de prueba creamos este método. De esto podemos enfatizar que mientras no coloquemos ningún tipo de anotación antes de un método este no será considerado para ejecutarse con TestNG.

Con esto ya podremos leer el contenido del archivo de texto "Catalogo_Cursos.txt", guardarlo en una variable y completar nuestro caso de prueba.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEscuelaOnline {
	
  @Test
  public void verificarQueSeMuestreCatalogoConCursosDisponibles() throws FileNotFoundException {
	  EscuelaOnline cursos = new EscuelaOnline();
	  String resultado_esperado = leerArchivoDeTexto("src/Catalogo_Cursos.txt");
	  
	  Assert.assertEquals(cursos.mostrarCatalogoDeCursos(), resultado_esperado);
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
Aunque si volvemos a correr la prueba notamos que ésta falla. Si observamos el resultado esperado contra el actual que nos reporta TestNG podremos darnos cuenta que hace falta un caracter de retorno de línea después de "Ciberseguridad".

<img width="946" alt="image" src="https://user-images.githubusercontent.com/67882289/135773850-35ea5964-c1a3-43f0-b664-2f210f8969f2.png">

<img width="528" alt="image" src="https://user-images.githubusercontent.com/67882289/135773861-c39d314f-8cb2-4d8b-8e37-e2b2f64663e6.png">

Corrigiendo estos detalles y nuevamente volviendo a correr las pruebas.

<img width="976" alt="image" src="https://user-images.githubusercontent.com/67882289/135772677-cc7eb2d1-b513-4bed-9974-c6bb5abd5b57.png">

Con esto podemos comprobar la ventaja de usar TDD, en este momento tenemos una muy alta confiabilidad de que lo que nos pide la especificación es lo que implementamos y no tendremos que resolver algún defecto posteriormente.

El último paso para este caso de prueba es refactorizar el código de ella, para lo cual instansearemos el objeto por medio de una función que se ejecute antes de cada prueba.

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
Ahora vamos a implementar el código para las 4 pruebas faltantes:

```
  @Test
  public void verificarQueAlumnoPuedaSeleccionar1Curso() {
	  Assert.assertEquals(true, true);
  }

  @Test
  public void verificarQueAlumnoPuedaSeleccionar4Cursos() {
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void verificarQueAlumnoNoPuedaSeleccionar0Cursos() {
	  Assert.assertEquals(true, true);
  }  
  
  @Test
  public void verificarQueAlumnoNoPuedaSeleccionar5Cursos() {
	  Assert.assertEquals(true, true);
  }
```
Vamos a crear un atributo dentro de la clase EscuelaOnline que guarde cuántos cursos se inscribió el alumno y el setter y getter para poder acceder y modificar este atributo.

```
public class EscuelaOnline {

    private int numeroDeCursosInscritos;
	
    public int getNumeroDeCursosInscritos() {
	return numeroDeCursosInscritos;
    }

    public void setNumeroDeCursosInscritos(int numeroDeCursosInscritos) {
	this.numeroDeCursosInscritos = numeroDeCursosInscritos;
    }

    public String mostrarCatalogoDeCursos() {
		
	String mensaje = "";
		
	mensaje = "Bienvenido a la Escuela Online.\n" + 
			"\n" +
			"Estos son los cursos que ofrecemos:\n" +
			"\n" +
			"[1] Programación con Java\n" +
			"[2] Software Testing\n" +
			"[3] Ciberseguridad" +
			"[4] Machine Learning\n" +
			"\n" +
			"¿Cuántos deseas tomar? (1,2,3 ó 4).";
				
	System.out.println(mensaje);
		
	return mensaje;
		
    }
}

```
Con esto ya podemos modificar el valor de este atributo y podemos colocal este código en nuestros casos de preuba.

```
    @Test
    public void verificarQueAlumnoPuedaSeleccionar1Curso() {
	cursos.setNumeroDeCursosInscritos(1);
	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), true);
    }

    @Test
    public void verificarQueAlumnoPuedaSeleccionar4Cursos() {
	cursos.setNumeroDeCursosInscritos(4);
	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), true);
    }
  
    @Test
    public void verificarQueAlumnoNoPuedaSeleccionar0Cursos() {
	cursos.setNumeroDeCursosInscritos(0);
	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), true);
    }  
  
    @Test
    public void verificarQueAlumnoNoPuedaSeleccionar5Cursos() {
	cursos.setNumeroDeCursosInscritos(5);
	Assert.assertEquals(cursos.getNumeroDeCursosInscritos(), true);
    }
```
Si corremos la pruebas podemos ver que éstas fallan.

<img width="961" alt="image" src="https://user-images.githubusercontent.com/67882289/135774473-47b1b9f7-c33a-4538-9199-3e77b2033f6c.png">

Para los casos de prueba con 1 y 4 cursos sólo agregando como resultado esperado 1 y 4 las preubas pasarían, así que no habría que hacer más. Sin embargo para los casos de 0 y 5 cursos deberíamos de implementar alguna medida para saber que esta es una opción invalida. 

En un proyecto real este caso negativo deberíamos platicarlo con un representante del cliente para saber que valor debería de devolver en estos casos. Para el ejemplo vamos a suponer que si el alumno ingresa 0 o un número mayor 4, debemos esperar un entero igual a 99.

En la clase EscuelaOnline vamos a añadir esta lógica en el setter del atributo "numeroDeCursosInscritos".

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

Corrigiendo el código a nuestros casos de pruebas, éstos ya deberían de pasar.
```
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
```

<img width="962" alt="image" src="https://user-images.githubusercontent.com/67882289/135775229-fff19efc-0a81-46e0-a677-b7b6a300d8ff.png">

Con esto concluimos este ejemplo.
