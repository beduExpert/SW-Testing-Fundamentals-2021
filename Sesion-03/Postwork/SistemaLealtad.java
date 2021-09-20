package proyecto_junit;

public class SistemaLealtad {
	
	private boolean estatusTajeta;
	private int saldoPuntos;
	private boolean estatusCupon;


	public boolean getEstatusTarjeta() {
		return this.estatusTajeta;
	}
	
	public void setEstatusTarjeta(boolean estatusTarjeta) {
		this.estatusTajeta = estatusTarjeta;
	}

	public int getSaldoPuntos() {
		return saldoPuntos;
	}

	public void setSaldoPuntos(int saldoPuntos) {
		this.saldoPuntos = saldoPuntos;
	}
	
	public boolean getEstatusCupon() {
		return estatusCupon;
	}

	public void setEstatusCupon(boolean estatusCupon) {
		this.estatusCupon = estatusCupon;
	}	
	
	public String mostrarProductosExtras() {
		
		return null;
	}

	public void usarCupon(String respuesta) {

		if (respuesta.equals("Y")) {
			
		} else if (respuesta.equals("N")) {
			
		} else {
			
		}
	}
	
}
