# Ejemplo #1 - Tabla de decisiones

## Objetivo

* Identificar todas las combinaciones importantes de las condiciones
* Elegir correctamente las condiciones, acciones y valores que se usaran en la toma de decision del metodo.

## Desarrollo


Ta
Suponga que un cliente planea comprar un auto nuevo, para el cual debe adquirir un seguro obligatorio con alguna compañia especifica, y la empresa tiene un plan de descuentos segun el perfil del cliente.
<b>Reglas de negocio</b>
<ul>

<li>Un cliente nuevo recibira un descuento del 15% en la poliza de seguro </li>

<li>Si es un Cliente  tiene una poliza activa con la compañia aseguradora, tendra un 10 % en su poliza nueva </li>
	
<li>Si el cliente entrega su vehiculo como parte de pago tendra un 20 %, pero no podra sumarse al descuento del 15 % </li>

<li>Si el cliente entrega su vehiculo como parte de pago y ademas tiene una poliza activa con la compañia aseguradora tendra un descuento acumulado (10%+20%) 30%  </li>

</ul>

Condiciones: 

<ol>
<li> Cliente nuevo 15% </li>
<li> Cliente con poliza activa 10% </li>
<li> Cliente entrega vehiculo 20% </li>

</ol>

<b> Formula: Para calcular el total de combinaciones</b>

2<sup>3</sup> = 8

<b> Tabla final</b>


<table class="tg">
<thead>
  <tr>
    <th class="tg-0pky"><span style="font-weight:bold">Condiciones</span></th>
    <th class="tg-0pky">1</th>
    <th class="tg-0pky">2</th>
    <th class="tg-0pky">3</th>
    <th class="tg-0pky">4</th>
    <th class="tg-0pky">5</th>
    <th class="tg-0pky">6</th>
    <th class="tg-0pky">7</th>
    <th class="tg-0pky">8</th>
    <th class="tg-0lax"><span style="font-weight:bold">Formula</span></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">Cliente nuevo 15%</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0lax">8/2=4</td>
  </tr>
  <tr>
    <td class="tg-0pky">Cliente con poliza activa 10 %</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0lax">4/2=2</td>
  </tr>
  <tr>
    <td class="tg-0pky">Cliente entrega vehiculo 20%</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0pky">V</td>
    <td class="tg-0pky">F</td>
    <td class="tg-0lax">2/2=1</td>
  </tr>
  <tr>
    <td class="tg-0lax">Acciones / salidas</td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
    <td class="tg-0lax"></td>
  </tr>
  <tr>
    <td class="tg-0lax">Porcentaje Aplicado</td>
    <td class="tg-0lax">x</td>
    <td class="tg-0lax">x</td>
    <td class="tg-0lax">20 %</td>
    <td class="tg-0lax">15%</td>
    <td class="tg-0lax">30 %</td>
    <td class="tg-0lax">10 %</td>
    <td class="tg-0lax">20 %</td>
    <td class="tg-0lax">0</td>
    <td class="tg-0lax"></td>
  </tr>
</tbody>
</table>



>**💡 Nota para experto(a)**
>
> Es importante a la hora de encontrar impresiciones en los requisitos del producto

