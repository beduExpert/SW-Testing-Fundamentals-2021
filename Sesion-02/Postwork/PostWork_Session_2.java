package proyecto_junit;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max_ingredientes = 3;
		PizzaOrden nuevaOrden = new PizzaOrden();
		
		nuevaOrden.preguntarPizzaVegetariana();
		nuevaOrden.desplegarMensajeDefault();

		if (nuevaOrden.getOpcion_veg()) {
			nuevaOrden.desplegarIngredientesVegetarianos();
		} else {
			nuevaOrden.desplegarIngredientesNoVegetarianos();
		}
		
		nuevaOrden.guardarIngredientes();
		nuevaOrden.desplegarResumenOrden();
	}

}

class PizzaOrden {
	
	private boolean opcion_veg = false;
	private String ingrediente_1 = "", ingrediente_2 = "", ingrediente_3 = "";

	public PizzaOrden() {
		System.out.println("Bienvenido a la aplicación para ordenar pizza.\n\n"
							+ "Sigue las instrucciones por favor.\n\n");
	}

	public boolean getOpcion_veg() {
		return opcion_veg;
	}

	public void setOpcion_veg(String opcion_veg) {
		if (opcion_veg.equals("Y")) {
			this.opcion_veg = true;
		} else {
			this.opcion_veg = false;
		}
	}
	
	public String getIngrediente_1() {
		return ingrediente_1;
	}

	public void setIngrediente_1(String ingrediente_1) {
		this.ingrediente_1 = ingrediente_1;
	}

	public String getIngrediente_2() {
		return ingrediente_2;
	}

	public void setIngrediente_2(String ingrediente_2) {
		this.ingrediente_2 = ingrediente_2;
	}

	public String getIngrediente_3() {
		return ingrediente_3;
	}

	public void setIngrediente_3(String ingrediente_3) {
		this.ingrediente_3 = ingrediente_3;
	}
	
	public void preguntarPizzaVegetariana() {
		System.out.println("¿Deseas pizza vegetariana (Y/N)?");
		Scanner input = new Scanner(System.in);
		setOpcion_veg(input.next());
	}
	
	public void desplegarMensajeDefault() {
		System.out.println("Todas las pizzas contienen Salsa de Tomate y Queso Mozzarella.\n\n");
	}
	
	public void desplegarIngredientesVegetarianos() {
		System.out.println("Selecciona 3 ingredientes de la siguiente  lista: \n"
							+ "[a] Pimiento \n"
							+ "[b] Hongos \n"
							+ "[c] Espinaca \n"
							+ "[o] Ninguno \n\n");
	}
	
	public void desplegarIngredientesNoVegetarianos() {
		System.out.println("Selecciona 3 ingredientes de la siguiente  lista: \n"
							+ "[a] Pimiento \n"
							+ "[b] Hongos \n"
							+ "[c] Espinaca \n"
							+ "[d] Peperoni \n"
							+ "[e] Jamon \n"
							+ "[f] Salchicha \n"							
							+ "[o] Ninguno \n\n");
	}
	
	public void guardarIngredientes() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrediente 1: ");
		setIngrediente_1(input.next());
		System.out.println("Ingrediente 2: ");
		setIngrediente_2(input.next());
		System.out.println("Ingrediente 3: ");
		setIngrediente_3(input.next());
		
		System.out.println(getIngrediente_1() + getIngrediente_2() + getIngrediente_3());
		
	}
	
	public void desplegarResumenOrden() {
		if (this.opcion_veg) {
			System.out.println("La pizza a ordenar es vegetariana.\n");
		} else {
			System.out.println("La pizza a ordenar no es vegetariana.\n");
		}
		
		System.out.println("Los ingredientes seleccionados son: \n");
		imprimirIngrediente(this.ingrediente_1, ",");
		imprimirIngrediente(this.ingrediente_2, ",");
		imprimirIngrediente(this.ingrediente_3, "");
	}
		
	private void imprimirIngrediente(String ingrediente, String separator) {
		if (ingrediente.equals("a")) { System.out.print("Pimiento");	System.out.print(separator); }
		else if (ingrediente.equals("b")) { System.out.print("Hongos");		System.out.print(separator); }
		else if (ingrediente.equals("c")) { System.out.print("Espinaca");	System.out.print(separator); }
		else if (ingrediente.equals("d")) { System.out.print("Peperoni");	System.out.print(separator); }
		else if (ingrediente.equals("e")) { System.out.print("Jamon");		System.out.print(separator); }
		else if (ingrediente.equals("f")) { System.out.print("Salchicha");	System.out.print(separator); }
		else { System.out.print(""); }
	}
}
