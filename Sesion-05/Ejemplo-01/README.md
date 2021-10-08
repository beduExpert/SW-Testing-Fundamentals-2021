# Ejemplo #1 - Tabla de decisiones

## Objetivo

* Identificar todas las combinaciones importantes de las condiciones
* Elegir correctamente las condiciones y acciones, valores que se usarán en la toma de decision del metodo.

## Desarrollo


<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Ejemplo-01/assets/ejemplo_carro.jpg">

Suponga que un cliente planea comprar un auto nuevo, para el cual debe adquirir un seguro obligatorio con alguna compañía específica, y la empresa tiene un plan de descuentos según el perfil del cliente.
<b>Reglas de negocio</b>
<ul>

<li>Un cliente nuevo recibira un descuento del 15% en la póliza de seguro </li>

<li>Si es un Cliente  tiene una póliza activa con la compañia aseguradora, tendra un 10 % en su poliza nueva </li>
	
<li>Si el cliente entrega su póliza como parte de pago tendra un 20 %, pero no podrá sumarse al descuento del 15 % </li>

<li>Si el cliente entrega su póliza como parte de pago y además tiene una póliza activa con la compañía aseguradora tendrá un descuento acumulado (10%+20%) 30%  </li>

</ul>

Condiciones: 

<ol>
<li> Cliente nuevo 15% </li>
<li> Cliente con póliza activa 10% </li>
<li> Cliente entrega póliza 20% </li>

</ol>

<b> fórmula: Para calcular el total de combinaciones</b>

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
    <td class="tg-0pky">Cliente con póliza activa 10 %</td>
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
    <td class="tg-0pky">Cliente entrega vehículo 20%</td>
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
> Esta tecnica es importante a la hora de encontrar impresiciones en los requisitos del producto

