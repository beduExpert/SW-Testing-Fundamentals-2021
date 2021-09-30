
# Sesión #: Fundamentos del Software Testing.

## :dart: Objetivos

- Identificar los objetivos principales del Software Testing.
- Reconocer los 7 principios del Testing.  
- Definir el proceso fundamental del Software Testing.
- Sintetizar el concepto de psicología del Software Testing.

## ⚙ Requisitos

+ Comprobar si se tiene accesso a la herramienta Blockly en la siguiente liga: https://developers.google.com/blockly

## 🎩 Buenas prácticas

En el testing la forma en como comunicamos defectos y áreas de oportunidad de los procesos y productos de trabajo que se analizan debe ser de forma impersonal, basada en medida de lo posible con hechos y siempre respetando el punto de vista de las demás personas. Es importante recordar que el ser humano tiene cierta intoleracia a recibir críticas negativas de su trabajo.

## Validación de Prework

1. :dart: ¿Qué es un producto de software?
    - Un producto que compras por medio de una aplicación de software.
    - Un producto para fabricar software.
    - Componentes especializados que usan industrias de tecnologías.
    - Conjunto de atributos hechos a base de códigos y algoritmos para realizar una tarea determinada por medio de instrucciones.

2. ¿En qué año se originó la palabra “bug”?
    - 1945
    - 1960
    - 1955
    - 1990

3. ¿Por qué se originan los errores en el software?
    - Algunos lenguajes de programación son defectuosos.
    - No se les invierte suficientes recursos a los proyectos.
    - Los defectos siempre están presentes y no se pueden corregir.
    - Los errores son causados por las personas.

4. ¿Qué es calidad?
    - Productos a bajo costo.
    - Conjunto de características deseables que cumplen con la función para la que fueron diseñadas.
    - Características de un objeto que están bien diseñadas.
    - Satisfacer las necesidades sociales e individuales.

5. Es un ejemplo de producto de software
    - Tarjeta digital.
    - Televisión.
    - Aplicación de un dispositivo móvil.
    - Horno de microondas.

## Ejemplos de Productos de Software

Aplicaciones Móviles\
![image](https://user-images.githubusercontent.com/67882289/135359111-c7451d4e-2363-4e69-bc3f-f09926f44702.jpeg)

Videojuegos\
![image](https://user-images.githubusercontent.com/67882289/135359186-2bd17c34-4769-4b57-9085-12e813697bcd.jpeg)

Páginas Web\
![image](https://user-images.githubusercontent.com/67882289/135359198-6ff6f408-f4b4-453c-b427-89bb9d129f52.png)

Software en Automóviles\
![image](https://user-images.githubusercontent.com/67882289/135359204-64ad387b-2f8a-4098-9a0b-434c2b3a7b57.jpeg)

## Origenes de los defectos.

Como se mencionó en el prework los defectos en el Software son producidos por las personas al cometer errores debido a factores como el estrés, la complejidad del código que se esté desarrollando o incluso factores difíciles de predecir.

<img width="567" alt="image" src="https://user-images.githubusercontent.com/67882289/135387179-58352757-a7b7-43b9-b165-40e878dfa889.png">

## ¿Porqué es importante la calidad del software?

Como cualquier otro producto que utilizamos, si un producto de software resulta altamente defectuoso se puede producir lo siguiente:

- Insatisfacción de los clientes.
- Pérdidas económicas de las empresas.
- Afectación de la imagen.
- Daños a la integridad de los usuarios.

## ¿Qué es el Software Testing?

“Es un conjunto de actividades y etapas conducidas a lo largo del desarrollo de un producto de software que si son llevadas a cabo de forma correcta permiten encontrar defectos preferentemente en etapas tempranas del desarrollo del producto para reducir costos de producción, incrementar la calidad y reducir el nivel de riesgo”.

Los principales objetivos del softwre testing son:

- Encontrar defectos.
- Incrementar la confianza en el nivel de calidad de los productos.
- Aportar información para poder tomar decisiones.
- Prevenir defectos.

El testing por sí sólo no resuelve los defecto, es hasta que el defecto se reporta y el desarrollador debuggea el código que se remueve.

![image](https://user-images.githubusercontent.com/67882289/135360175-a0865669-30ae-42b2-973d-42ffd129ee88.png)

## Debuggear

Testing es diferente a debuggear (debugging). Debuggear es una actividad desempeñada por los desarrolladores para que una vez reportado un defecto poder analizar el código en tiempo de ejecución.

<img width="549" alt="image" src="https://user-images.githubusercontent.com/67882289/135387869-8723615b-73cc-47cf-a77a-571ae6a4b527.png">

## Ejemplo 1 Creación de un Producto de Software con Blockly.

En este ejemplo se explica como puedes crear un programa sencillo con la herramienta blockly, una herramienta que usa programación por bloques y es fácil de entender.

## Reto 1 Crea tu propio producto de Software.

El objetivo es crear las funciones básicas de una calculadora: suma, resta, multiplicación y división, para dos números. 

Al presionar el botón correspondiente se imprimirá  el resultado con el mensaje: “El resultado de la operación suma es: 4“, modificando la operación y el resultado correspondiente.

La actividad se hará preferentemente en 4 equipos.

https://developers.google.com/blockly

![image](https://user-images.githubusercontent.com/67882289/135389652-dccdc330-1a89-4f5e-9ede-4dc40383226a.png)

<img width="427" alt="image" src="https://user-images.githubusercontent.com/67882289/135389682-53f601bc-6860-4025-bd51-6700192778ba.png">

## Los 7 Principios del Testing

- Principio 1. El Testing demuestra la presencia de defectos.

El testing es útil para demostrar que existen defectos en un sistema, mas no se puede garantizar que el sistema es libre de defectos.\
![image](https://user-images.githubusercontent.com/67882289/135391341-4016ce85-fd3f-4fb9-8d2d-d76e78c757f7.png)
- Principio 2. El testing exhaustivo es imposible.

Cualquier sistema por simple que sea puede tener una cantidad infinita de combinaciones y pruebas a realizar. Debido a que la cantidad de recursos y tiempo son limitados no se pueden probar cada una de estas combinaciones.\
<img width="553" alt="image" src="https://user-images.githubusercontent.com/67882289/135391493-8db086a6-94e5-4779-b104-f2fb9be36033.png">
- Principio 3. Principio 3. Testing en etapas tempranas del proyecto.

El costo de encontrar y remover un defecto se incrementa cuanto más tiempo el defecto permanece en el proceso de desarrollo.\
Entre más temprano se encuentre el defecto menos costoso será removerlo.\
<img width="708" alt="image" src="https://user-images.githubusercontent.com/67882289/135391551-2273f513-9de7-464c-b784-b0e040f194f3.png">
- Principio 4. Aglomeración de defectos.

Los defectos no se encuentran aleatoria ni uniformemente distribuidos en los sistemas, éstos tienden a aglomerarse en funcionalidades más complejas.\
<img width="524" alt="image" src="https://user-images.githubusercontent.com/67882289/135391625-13a1ed5d-5120-4726-803c-80866387d48d.png">
- Principio 5. La paradoja del pesticida.

Un mismo conjunto de pruebas que se ejecutan en una misma funcionalidad tienden a perder efectividad cuanto más se ejecutan.\
La falta de efectividad de las pruebas puede dar un nivel de confianza y optimismo falsos.\
<img width="582" alt="image" src="https://user-images.githubusercontent.com/67882289/135391656-80e341c7-5c68-4b93-82c3-081b5adfbff9.png">
- Principio 6. El testing es dependiente del contexto del proyecto.

El contexto del proyecto influencia cuantas pruebas deben de llevarse a cabo y cómo deben de hacerse.\
<img width="627" alt="image" src="https://user-images.githubusercontent.com/67882289/135391738-6ef7742f-95e3-44ea-84af-e80a1a2af587.png">
- Principio 7. La falacia de ausencia de defectos.

El testing no puede garantizar que un producto funcione.\
No importa que tan libre de defectos sea el producto de software si éste no cubre las expectativas del usuario final, el producto no es útil.\
<img width="569" alt="image" src="https://user-images.githubusercontent.com/67882289/135391764-13630a6a-6ff2-41a1-b615-9ef4474e4dcc.png">

## Reto 2 Principios del Testing al testear un Producto de Software

Utilizando el programa construído en la actividad anterior cómo piensas que podrías aplicar los principios del software testing si tuvieras que revisar el correcto funcionamiento de ese programa.

## Proceso Fundamental del Testing

Existen un conjunto de actividades que de alguna forma u otra pueden llevarse a cabo en un proceso de testing. Estas etapas pueden llevarse de forma paralela o traslaparse.

<img width="749" alt="image" src="https://user-images.githubusercontent.com/67882289/135496440-eedf2b0c-da57-40f0-a2a0-f0eb5b16a6ac.png">

- Planeación.

    - La planeación implica definir los objetivos y las estrategias del proceso de pruebas. En la planeación se identifican las actividades necesarias para satisfacer los objetivos y estrategias definidos.
- Control.

    - Se lleva a cabo durante todo el proceso de pruebas y se trata de continuamente medir y comparar el progreso planeado con el actual. En caso de que existan inconsistencias tomar acciones necesarias para poder regresar a los objetivos planeados.
<img width="822" alt="image" src="https://user-images.githubusercontent.com/67882289/135497621-6c3498d3-5d5e-4e97-92dd-674c44773449.png">

- Análisis.

    - En esta etapa se revisan y analizan las bases de pruebas. 
    - Las bases de pruebas pueden ser requerimientos, especificaciones de diseño, reportes de análisis de riesgo, arquitectura del sistema, etc.
    - Se priorizan las condiciones de pruebas y se identifican datos que servirán como entradas para las condiciones de pruebas.
- Diseño.

    - Se diseñan los casos de prueba a un alto nivel.
    - Se diseña el ambiente de pruebas.
    - Se genera trazabilidad entre las bases de prueba y los casos de prueba.
- Implementación.

    - Durante esta etapa se profundiza el diseño de los casos de prueba a un nivel más bajo y se actualiza trazabilidad si es necesario.
    - Se definen y planean los procedimientos de pruebas.
    - Se prepara el ambiente de pruebas y se verifica que funcione correctamente.
- Ejecución.

    - Se ejecutan los casos de pruebas ya sea manualmente o de forma automática.
    - Se comparan los resultados actuales con los esperados y éstos se registran.
    - En caso de que el resultado de una prueba sea fallo, se analiza y si se demuestra que es una incidencia ésta se registra.
- Evaluación de Criterios de Salida y Reporteo.

    - Durante esta etapa se corrobora el progreso y resultado de las pruebas contra los criterios de salida.
    - Se verifica si más test cases son requeridos.
    - Se genera un resumen de los resultados en un reporte que sea entendible para cualquier interesado del proyecto.
- Actividades de Conclusión.

    - Se colecta información de las actividades desempeñadas relacionadas a las pruebas como: experiencia, herramientas usadas y estadísticas.
    - Se analizan las lecciones aprendidas para poder utilizarlas en otros proyectos y mejorar su calidad.

## Reto 3 Recordando las Etapas del Proceso Fundamental del Testing

Vamos a recordar las etapas del proceso fundamental del software testing y qué actividades son llevadas a cabo en cada una.

## La Psicología del Software Testing

En las actividades de testing al igual que en la mayoría de otras actividades, interactuamos con otras personas. Es por eso que una comunicación efectiva se vuelve clave para poder dar a entender nuestro punto de vista.

Debido a que el testing por naturaleza es una actividad de análisis y crítica al trabajo de otras personas, debemos de comunicar nuestras opiniones:
- De forma impersonal y clara. Es decir evitando resaltar el nombre de alguien más y evitando reproches. Mejor enfatizar los beneficios e importancia de que se cree un producto de buena calidad que dará mejor imagen al equipo y seguramente mayores beneficios a largo plazo. 
- Basadas en medida de lo posible con hechos. Siempre es mejor tener evidencias sólidas de un defecto o área de oportunidad que una opinión subjetiva. Generalmente los defectos que son difíciles de explicar o no se tienen evidecias, resultan con poca atención o con mucho tiempo dedicado por el tester para poder demostrar su punto de vista. Si se piensa que un defecto puede presentar un problema crítico en el futuro, tal vez valga la pena defenderlo sino es mejor dedicar el esfuerzo y tiempo a encontrar otros defectos más severos y críticos para el sistema.
- Siempre respetando el punto de vista de las demás personas. Hay que aprender a escuchar las opiniones 

Es importante recordar que el ser humano tiene cierta intoleracia a recibir críticas negativas de su trabajo.

## 📂 Organización de la clase

- [Ejemplo 01:  Creación de un Producto de Software.](./Ejemplo-01/README.md)
    - [Reto 01: Principios del Testing al testear un Producto de Software.](./Reto-01/README.md)
    - [Reto  02: Recordando las Etapas del Proceso Fundamental del  Testing.](./Reto-02/README.md)
- [Ejemplo 02: Testeando el Producto de Software.](./Ejemplo-02/README.md)
    - [Reto 03: Conclusiones de la Psicología del Testing.](./Reto-03/README.md)
- [Postwork: Fundamentos del Software Testing.](./Postwork/README.md)
