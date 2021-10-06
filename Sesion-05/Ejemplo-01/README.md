# Ejemplo #1 - Tabla de decisiones

## Objetivo

* Identificar todas las combinaciones importantes de las condiciones
* Elegir correctamente las condiciones y acciones, valores que se usaran en la toma de decision del metodo.

## Desarrollo


<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-05/Ejemplo-01/assets/ejemplo_carro.jpg">

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
    <th class="tg-0pky">Estudiantes</th>
    <th class="tg-0pky"></th>
    <th class="tg-0pky"></th>
    <th class="tg-0pky"></th>
    <th class="tg-0pky"></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">Retirado</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">Trabajador</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">Deudas Sin pagar</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
  <tr>
    <td class="tg-0pky">Deudas por pagar</td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
    <td class="tg-0pky"></td>
  </tr>
</tbody>
</table>



>**💡 Nota para experto(a)**
>
> Es importante a la hora de encontrar impresiciones en los requisitos del producto

