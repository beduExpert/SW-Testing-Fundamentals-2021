# Reto 1 - Crea tus propias pruebas unitarias.

## Objetivo

Crear pruebas unitarias faltantes del programa Inversion.

## Desarrollo

En el ejemplo anterior creamos las pruebas unitarias para la función "imprimirResumenInversion()", pero nos falto verificar la cantidadCompuesta.

Ahora es turno del alumno para realizar las siguientes actividades:

1. Crear las pruebas unitarias para la "cantidadCompuesta" para palzo 1, plazo 2, plazo 3 y plazo 17.
2. Crear las pruebas unitaruas para la función "obtenerMensajeDecisionUsuario()".
3. Correjir los errores encontrados en el código y correr nuevamente las pruebas.

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

## Código propuesto

La solución propuesta para este ejercicio es la siguiente:

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
    
    @Test
    public void verificarCantidadCompuestaConPlazoUno() {
    	inv.setPlazo(1);
    	inv.imprimirResumenInversion();
    	
    	Assert.assertEquals(inv.getCantidadCompuesta(), 1575.00);
    }
    
    @Test
    public void verificarCantidadCompuestaConPlazoDos() {
    	inv.setPlazo(2);
    	inv.imprimirResumenInversion();
    	
    	Assert.assertEquals(inv.getCantidadCompuesta(), 1685.25);
    }
    
    @Test
    public void verificarCantidadCompuestaConPlazoTres() {
    	inv.setPlazo(3);
    	inv.imprimirResumenInversion();
    	
    	Assert.assertEquals(inv.getCantidadCompuesta(), 1853.78);
    }
	
    @Test
    public void verificarCantidadCompuestaConPlazoCuatro() {
    	inv.setPlazo(18);
    	inv.imprimirResumenInversion();
    	
    	Assert.assertEquals(inv.getCantidadCompuesta(), 7743.73);
    }
    
    @Test
    public void verificarMensajeInversionAceptada() {
    	inv.setDecisionUsuario("Y");
    	String mensaje = inv.obtenerMensajeDecisionUsuario();
    	
    	Assert.assertEquals(mensaje, "Gracias por invertir con nosotros.");
    }
    
    @Test
    public void verificarMesajeInversionNoAceptada() {
      inv.setDecisionUsuario("N");
    	String mensaje = inv.obtenerMensajeDecisionUsuario();
    	
    	Assert.assertEquals(mensaje, "Gracias por su preferencia, esperamos verlo pronto.");
    }
}

```
