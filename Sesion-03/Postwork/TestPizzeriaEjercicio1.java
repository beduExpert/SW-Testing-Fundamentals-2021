package proyecto_junit;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPizzeriaEjercicio1 {

	CommonMethods Common;
	PizzaOrden nuevaOrden;
	String stdOutputPath;
	
	@BeforeClass
	public void initialConditions() {
		Common = new CommonMethods();
		stdOutputPath = "output_files/output.txt";
		
	}
	
	@BeforeTest
	public void preConditions() {
		nuevaOrden = new PizzaOrden();
	}
	
	@Test
	public void verificarMensajeDeInicioSeDespliega() throws FileNotFoundException {

		Common.redirectStdOutput(stdOutputPath);
		nuevaOrden.desplegarMensajeInicio();

		String actualResult = Common.readFileContents(stdOutputPath);
		String expectedResult = "Bienvenido a la aplicación para ordenar pizza.\n\n"
									+ "Sigue las instrucciones por favor.\n\n";
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarOpcionVeganaVerdadera() {
		nuevaOrden.setOpcionVeg("Y");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarOpcopnVeganaFalsa() {
		nuevaOrden.setOpcionVeg("N");
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void verificarGuardarIngrediente1ComoPimiento() {
		nuevaOrden.setIngrediente1("a");
		String actualResult = nuevaOrden.getIngrediente1();
		String expectedResult = "Pimiento";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente2ComoHongos() {
		nuevaOrden.setIngrediente2("b");
		String actualResult = nuevaOrden.getIngrediente2();
		String expectedResult = "Hongos";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente3ComoEspinaca() {
		nuevaOrden.setIngrediente3("c");
		String actualResult = nuevaOrden.getIngrediente3();
		String expectedResult = "Espinaca";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente1ComoPeperoni() {
		nuevaOrden.setIngrediente1("d");
		String actualResult = nuevaOrden.getIngrediente1();
		String expectedResult = "Peperoni";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente2ComoJamon() {
		nuevaOrden.setIngrediente2("e");
		String actualResult = nuevaOrden.getIngrediente2();
		String expectedResult = "Jamon";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente3ComoSalchicha() {
		nuevaOrden.setIngrediente3("f");
		String actualResult = nuevaOrden.getIngrediente3();
		String expectedResult = "Salchicha";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarGuardarIngrediente1ComoOpcionInvalida() {
		nuevaOrden.setIngrediente1("o");
		String actualResult = nuevaOrden.getIngrediente1();
		String expectedResult = "Opcion_Invalida";
		Assert.assertEquals(actualResult, expectedResult);		
	}
	
	@Test
	public void verificarOpcionVegAlPreguntarOpcionVeganaTrue() {
		
		String stdInputPath = "input_files/opcion_veg_true.txt";
		Common.redirectStdInput(stdInputPath);
		nuevaOrden.preguntarPizzaVegetariana();
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void verificarOpcionVegAlPreguntarOpcionVeganaFalse() {
		
		String stdInputPath = "input_files/opcion_veg_false.txt";
		Common.redirectStdInput(stdInputPath);
		nuevaOrden.preguntarPizzaVegetariana();
		boolean actualResult = nuevaOrden.getOpcionVeg();
		boolean expectedResult = false;
		Assert.assertEquals(actualResult, expectedResult);
		
	}
	
	@Test
	public void verificarListaIngredientesVegetarianos() throws FileNotFoundException {
		
		Common.redirectStdOutput(stdOutputPath);
		nuevaOrden.setOpcionVeg("Y");
		nuevaOrden.desplegarIngredientes();

		String actualResult = Common.readFileContents(stdOutputPath);
		String expectedResult = "Selecciona 3 ingredientes de la siguiente  lista: \n"
									+ "[a] Pimiento \n"
									+ "[b] Hongos \n"
									+ "[c] Espinaca \n"
									+ "[o] Ninguno \n\n";
		
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void verificarListaIngredientesNoVegetarianos() throws FileNotFoundException {
		
		Common.redirectStdOutput(stdOutputPath);
		nuevaOrden.setOpcionVeg("N");
		nuevaOrden.desplegarIngredientes();

		String actualResult = Common.readFileContents(stdOutputPath);
		String expectedResult = "Selecciona 3 ingredientes de la siguiente  lista: \n"
									+ "[a] Pimiento \n"
									+ "[b] Hongos \n"
									+ "[c] Espinaca \n"
									+ "[d] Peperoni \n"
									+ "[e] Jamon \n"
									+ "[f] Salchicha \n"							
									+ "[o] Ninguno \n\n";
		
		Assert.assertEquals(actualResult, expectedResult);
	}  

	@Test(enabled = false)
	public void guardarIngredientesComoHongos() {
		
		String stdInputPath = "input_files/ingrediente_hongos.txt";
		Common.redirectStdInput(stdInputPath);
		nuevaOrden.guardarIngredientes();
		String expectedResult = "Hongos";
		Assert.assertEquals(nuevaOrden.getIngrediente1(), expectedResult);
//		Assert.assertEquals(nuevaOrden.getIngrediente2(), expectedResult);
//		Assert.assertEquals(nuevaOrden.getIngrediente3(), expectedResult);
		
	}
}
