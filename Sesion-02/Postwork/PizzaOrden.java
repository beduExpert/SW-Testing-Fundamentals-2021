package proyecto_junit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class PizzaOrden {

	private boolean opcionVeg = false;
	private String ingrediente1 = "", ingrediente2 = "", ingrediente3 = "";

	public void desplegarMensajeInicio() {
		System.out.println("Bienvenido a la aplicación para ordenar pizza.\n\n"
				+ "Sigue las instrucciones por favor.\n\n");
	}

	public boolean getOpcionVeg() {
		return this.opcionVeg;
	}

	public void setOpcionVeg(String opcion_veg) {
		if (opcion_veg.equals("Y")) {
			this.opcionVeg = true;
		} else {
			this.opcionVeg = false;
		}
	}
	
	public String getIngrediente1() {
		return ingrediente1;
	}

	public void setIngrediente1(String ingrediente1) {
		this.ingrediente1 = letraIngredienteAString(ingrediente1);
	}

	public String getIngrediente2() {
		return ingrediente2;
	}

	public void setIngrediente2(String ingrediente2) {
		this.ingrediente2 = letraIngredienteAString(ingrediente2);
	}

	public String getIngrediente3() {
		return ingrediente3;
	}

	public void setIngrediente3(String ingrediente3) {
		this.ingrediente3 = letraIngredienteAString(ingrediente3);
	}
	
	public void preguntarPizzaVegetariana() {
		System.out.println("¿Deseas pizza vegetariana (Y/N)?");
		Scanner input = new Scanner(System.in);
		setOpcionVeg(input.next());
	}
	
	public void desplegarMensajeDefault() {
		System.out.println("Todas las pizzas contienen Salsa de Tomate y Queso Mozzarella.\n\n");
	}

	public void desplegarIngredientes() {
		
		System.out.print("Selecciona 3 ingredientes de la siguiente  lista: \n"
								+ "[a] Pimiento \n"
								+ "[b] Hongos \n"
								+ "[c] Espinaca \n");
		
		if (!opcionVeg) {
			System.out.print(	  "[d] Peperoni \n" 
								+ "[e] Jamon \n" 
								+ "[f] Salchicha \n");
		}
							
		System.out.println(		  "[o] Ninguno \n\n");
							
	}	
	
	public void guardarIngredientes() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrediente 1: ");
		setIngrediente1(input.next());
		System.out.println("Ingrediente 2: ");
		setIngrediente2(input.next());
		System.out.println("Ingrediente 3: ");
		setIngrediente3(input.next());
		
	}
	
	public void desplegarResumenOrden() {
		if (this.opcionVeg) {
			System.out.println("La pizza a ordenar es vegetariana.\n");
		} else {
			System.out.println("La pizza a ordenar no es vegetariana.\n");
		}
		
		System.out.println("Los ingredientes seleccionados son: \n");

		String ingredientes = "";
		if (getIngrediente1() != "Opcion_Invalida") { ingredientes = getIngrediente1() + ","; }
		if (getIngrediente2() != "Opcion_Invalida") { ingredientes = getIngrediente2() + ","; }
		if (getIngrediente3() != "Opcion_Invalida") { ingredientes = getIngrediente3() + ","; }
		
		System.out.println(ingredientes.substring(0,ingredientes.length()-1));
	}
		
	private String letraIngredienteAString(String letraIngrediente) {
		     if (letraIngrediente.equals("a")) { return "Pimiento"; }
		else if (letraIngrediente.equals("b")) { return "Hongos"; }
		else if (letraIngrediente.equals("c")) { return "Espinaca"; }
		else if (letraIngrediente.equals("d")) { return "Peperoni"; }
		else if (letraIngrediente.equals("e")) { return "Jamon"; }
		else if (letraIngrediente.equals("f")) { return "Salchicha"; }
		else { return "Opcion_Invalida"; }		
	}
	
}
