# Ejemplo 2 - Desarrollo Conducido por Pruebas - TDD

## Objetivo

Ejemplificar como se construye un programa al utilizar desarrollo conducido por pruebas.

## Desarrollo

En este ejemplo vamos a desarrollar el siguiente programa utilizando TDD.

Especificación:
> Una escuela online a abierto sus puertas y por lanzamiento está ofreciendo una promoción. La escuela por el momento sólo ofrece cuatro cursos: "Software Testing", "Ciberseguridad", "Programación con Java" y "Machine Learning".
> El alumno interesado puede escoger uno de los tres cursos o los cuatro, el alumno puede recibir los siguientes descuentos al escoger más de uno:
> - Si el alumno escoge 1 no se la hará ningún descuento.
> - Si el alumno escoge 2 se le hará el 10% de precio total.
> - Si el alumno escoge 3 se le hará el 25% de precio total.
> - Si el alumno escoge 4 se le hará el 40% de precio total.
> 
> Cada curso sin descuento tiene un precio de $4000 pesos sin IVA.
> 
> Escribir un programa que muestre al usuario el catalogo de cursos y cuales de ellos desea tomar. Dependiendo de la decisión del alumno el programa debe regresar el precio total con descuento sin IVA, el descuento aplicado y el precio total con descuento con IVA, considerando un impuesto IVA del 16%.
>
> El siguiente archivo texto adjunto representa como debe mostrarse la interfaz con el catálogo de cursos. 

<img width="570" alt="image" src="https://user-images.githubusercontent.com/67882289/135770726-77b60d35-de15-4dc7-a83b-0742ce0b1b7d.png">

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
					"[a] Software Testing\n" +
					"[b] Ciberseguridad" +
					"[c] Programación con Java\n" +
					"[d] Machine Learning\n" +
					"Puedes registrarte a 1, 2, 3 o los 4 cursos. Inserta el número del curso que desees " +
					"incribirte, seguido de la letra \"Enter\". Para terminar tu registro inserta el caracter " +
					"\'x\' seguido de enter.";
				
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

<img width="976" alt="image" src="https://user-images.githubusercontent.com/67882289/135771341-3f40cf31-482a-42f2-804c-e7ab37651c77.png">

Necesitamos una forma de poder leer el archivo de texto adjunto donde viene cómo debe mostrarse el catálogo de cursos. (Copia y pega el texto más abajo y guardalo en un archivo de texto llamado "Catalogo_Cursos.txt", asegurate de que éste guardado en el mismo folder del proyecto).

> Bienvenido a la Escuela Online.
>
> Estos son los cursos que ofrecemos:
>
> [a] Software Testing
> [b] Ciberseguridad
> [c] Programación con Java
> [d] Machine Learning
>
> Puedes registrarte a 1, 2, 3 o los 4 cursos. Inserta el número del curso que desees incribirte, seguido de la letra "Enter". Para terminar tu registro inserta el caracter 'x' seguido de enter.












