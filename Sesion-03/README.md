
# Sesión 3: Niveles del software testing.

## :dart: Objetivos

- El alumno será capaz de analizar los niveles del software testing y en qué momento del desarrollo de software aplica cada uno.
- El alumno aprenderá a diseñar pruebas utilizando el desarrollo conducido por pruebas.

## ⚙ Requisitos

Se requiere tener instalado
- Al menos la versión de Java SE 11.
- Eclipse IDE.
- Framework de preubas TestNG.

## 🎩 Buenas prácticas

Al diseñar casos de prueba es recomendable seguir las siguientes recomendaciones:
- Utilizar mismo orden en las oraciones.
- No utilizar distintias palabras para indicar que se va a verificar algo ("validar", "checar", "probar", etc.) Sólo usar una.
- Reutilizar los enunciados que se van escribiendo.
- Evitar poner datos especificos que pueden cambiar en el futuro.

### Recapitulemos

## ¿Qué es el SDLC?

SLDC quiere decir Ciclo de Vida de Desarrollo del Software por sus siglas en inglés (Software Development Life Cycle). El Ciclo de Vida de Desarrollo del Software:

1. Especifica las diversas etapas del proceso y el orden que son llevadas a cabo.
2. Define las metas y el alcance del proyecto.
3. Involucra el testing en sus etapas.

<img width="668" alt="image" src="https://user-images.githubusercontent.com/67882289/135785911-592cd12a-d4fc-43c2-b418-dc8e7c2cfc35.png">

## Modelos del SDLC

Existen diferentes modelos de SDLC. El modelo a elegir depende de varios factores como: necesidades del proyecto, nivel de madurez de la empresa, requerimientos del cliente, etc.

Los modelos a revisar son:
- Modelo Cascada.
- Modelo en V.
- Modelo Iterativo.
- Modelo Incremental.

<img width="903" alt="image" src="https://user-images.githubusercontent.com/67882289/135788418-df1a8d4f-7bb1-4c26-b302-cb30a60a8c13.png">

## Desarrollo de Software en Agile

Agile es un conjunto de prácticas, principios y metodologías basadas en modelos incrementales o iterativos.

Agile busca cambiar la cultura de un equipo u organización al fomentar la colaboración y mejorar la comunicación entre áreas involucradas en el desarrollo de software.

<img width="760" alt="image" src="https://user-images.githubusercontent.com/67882289/135786693-8bf07027-0be7-4ba7-ac69-152baedbe722.png">

## Beneficios de Agile para el Testing.

Debido a la cultura de calidad compartida por todo el equipo, el testing tiene algunos beneficios.

- Todo el equipo es responsable de la calidad.
- El testing tiene más autonomía.
- Accesibilidad para poderse comunicar con el cliente o representantes del negocio.
- Tiende a implementar paradigmas de diseño como el TDD y BDD donde el testing es el punto de partida.

![image](https://user-images.githubusercontent.com/67882289/135788616-ad55c1bb-6df6-41c5-ba76-20637b65ba9b.jpeg)

## Validación del Prework

- ¿Cuáles son los niveles de testing?
    - Planeación, Control, Diseño, Implementación y Reporteo.
    - Aceptación, Distribución, Integración y Componente. 
    - Diseño de requisitos, diseño de arquitectura, codificación y pruebas.
    - Integración, Componente, Sistema y Aceptación.

- ¿Las pruebas de nivel componente son también llamadas pruebas unitarias?
    - Verdadero
    - Falso

- ¿Cuáles de los siguientes son ambientes de prueba y desarrollo?
    - Staging
    - Control
    - Producción
    - Testing
    - Desarrollo

- ¿Cuál de las siguientes afirmaciones es falsa?
    - Es posible tener más de un ambiente de desarrollo en un proyecto.
    - Los ambientes de recuperación sirven para prevenir al sistema en caso de desastres.
    - El ambiente de staging se usa para que los desarrolladores experimenten y creen sus pruebas unitarias.
    - Encontrar defectos en el ambiente de producción resulta costoso y puede dar una mala imagen de la compañía.

- ¿Qué es el desarrollo conducido por pruebas?
    - Es un forma de desarrollar código para que se ejecute y pruebe de forma automatizada.
    - Es una metodología la cual propone que el equipo de testing guíe a los desarrolladores al desempeñar sus actividades.
    - Se refiere a probar el código antes de que este sea liberado a los usuarios finales.
    - Es una práctica en la cual se propone diseñar las pruebas antes de que se escriba el código.

## Niveles de Testing

Se puede definir como los objetivos y actividades que ayudan a identificar los objetivos específicos del testing a lo largo de cada una de las etapas del desarrollo de software.

Los niveles de testing van de la mano con los modelos de ciclo de vida de desarrollo del software. En cada nivel se lleva a cabo el proceso fundamental de pruebas de una u otra forma.

<img width="774" alt="image" src="https://user-images.githubusercontent.com/67882289/135788952-79640532-341e-4bd8-b1f1-6b57d8cac1d6.png">

## Objetivos de los Niveles de Testing

Cada nivel de testing tiene los siguientes objetivos bien definidos.

- Métricas a considerar.
- Las bases de prueba.
- Sistema Bajo Prueba (SUT).
- Defectos típicos a buscar.
- Responsabilidades de las personas.

## Nivel Componente 

Este nivel también es conocido como nivel unitario, módulo o programa. Usa como base de prueba el código por lo cual se requiere tener acceso a él.

La mayoría de veces se lleva a cabo por los desarrolladores, sin embargo si el nivel de riesgo del proyecto es alto es llevado por testers independientes.

<img width="708" alt="image" src="https://user-images.githubusercontent.com/67882289/135789125-543049c0-ee23-4719-a4d3-0bc91af152e6.png">

## Drivers y Stubs.

Cada uno de los componentes debe de probarse de forma separada.

Ya que los módulos pueden tener dependencias hacia otros módulos a veces es necesario simular el ambiente de pruebas incluyendo estas dependencias.

Los drivers y stubs sirven para poder simular las entradas y salidas al código que se está probando.

<img width="767" alt="image" src="https://user-images.githubusercontent.com/67882289/135789182-5b3c4710-0e54-4598-838e-57d5c9365716.png">

## Nivel Integración

Este nivel se prueban interfaces entre componentes e interacciones entre distintas partes del sistema.

Las pruebas en este nivel son basadas principalmente en el diseño de la arquitectura del sistema.

El principal objetivo en este nivel es probar la comunicación entre los componentes y no su funcionalidad.

<img width="798" alt="image" src="https://user-images.githubusercontent.com/67882289/135789321-ae331a74-0fc9-4d11-91f3-30c5e1cf2e5d.png">

## Testing de Integración Big Bang

En este enfoque se plantea realizar pruebas hasta que todos los componentes son integrados.

La ventaja es que todos los componentes deben estar listos antes de comenzar las pruebas por lo cual no es necesario simular un ambiente de pruebas.

La desventaja es que consume mucho tiempo y esfuerzo encontrar la causa raíz de los defectos.

![image](https://user-images.githubusercontent.com/67882289/135789390-45e8891d-aadb-477a-9ad7-34ffbef59ce3.jpeg)

## Testing de Integración Incremental

En este otro enfoque los componentes se van añadiendo en incrementos y se conducen pruebas cada vez que se añade uno.

La ventaja es que es más fácil encontrar la causa raíz de los defectos.

La desventaja es que se invierte tiempo en crear el ambiente de pruebas con drivers y stubs.

<img width="859" alt="image" src="https://user-images.githubusercontent.com/67882289/135789460-df094872-4e1a-4486-b1fd-be62989b890e.png">

## Testing de Integración basado en Riesgo

En este último enfoque se combina la integración incremental pero se añade el análisis de los componentes o interfaces para identificar cuales son más riesgosos.

Al añadir primero los componentes más riesgosos o complejos se previenen defectos más severos al final de la integración.

<img width="782" alt="image" src="https://user-images.githubusercontent.com/67882289/135789503-01c65724-f7c3-4162-9982-5bcf35a21ca0.png">

## Pruebas Unitarias

Las pruebas unitarias son conducidas en niveles de componente e integración. El objetivo de estas pruebas es ayudar a los desarrolladores a verificar que la estructura y funcionalidad del código sea la esperada.

Como su nombre lo mencionan estas pruebas se enfocan en una unidad o pieza de código.

## Frameworks de Pruebas

Los frameworks de prueba permiten:

- Mantener las pruebas organizadas en orden jerárquico.
- Agrupar las pruebas por funcionalidad o por clases.
- Reportar resultados de forma más eficiente.

Cada lenguaje de programación usa un distinto framework de prueba y por cada lenguaje pueden existir más de un sólo framework.

<img width="788" alt="image" src="https://user-images.githubusercontent.com/67882289/135789705-faf1c4c0-5441-4853-8cbf-69de98d96039.png">

## TestNG

Como ya se vio TestNG es un framework de pruebas que nos permitirá organizar las pruebas y está pensado principalmente para pruebas a nivel componente e integración.

TestNG está pensado como una mejora de Junit al ofrecer mayores opciones para poder clasificar y ejecutar pruebas. Aunque con la versión de Junit 5 también se pueden obtener ventajas similares.

La mayoría de frameworks usan del concepto de anotación. Las cuales se colocan al inicio de cada prueba, para TestNG los más comunes son:

<img width="669" alt="image" src="https://user-images.githubusercontent.com/67882289/135789794-a9a9cb2c-fc44-4313-80ac-7b276093b44c.png">

## [Ejemplo 01: Pruebas Unitarias.](./Ejemplo-01/README.md)

## [Reto 01: Crea tus propias pruebas unitarias.](./Reto-01/README.md)

## Nivel Sistema

El nivel sistema de interesa en el comportamiento de todo el sistema como uno solo. Las bases de la prueba suelen basarse en especificaciones del sistema o requerimientos.

El objetivo es encontrar la mayor cantidad de defectos antes de que el producto se vaya a producción. En su mayoría se ejecutan pruebas de caja negra ya que no se tiene acceso al código.

<img width="793" alt="image" src="https://user-images.githubusercontent.com/67882289/135790013-5dc31a91-1741-42a8-b9c3-37337eeddb4d.png">

## Componentes de Sistemas

Es muy frecuente que el sistema se subdivida en componentes de sistemas. Al subdividir el sistema en partes más pequeñas es más sencillo desarrollar partes del sistema específicas a una funcionalidad.

El sistema subdividido en partes más pequeñas se le conoce como componentes del sistema. En cada componente deben de realizarse pruebas como si estos fueran un solo sistema.

<img width="824" alt="image" src="https://user-images.githubusercontent.com/67882289/135790046-0cf140ee-8a6e-41cb-a5a4-226826412b36.png">

## Integración de Sistemas

Al integrar todos los componentes del sistema, se debe corroborar que la comunicación entre ellos sea correcta. También debe de probarse que todo el sistema funcione como se espera. 

<img width="796" alt="image" src="https://user-images.githubusercontent.com/67882289/135790084-27d56179-1e52-4c3e-b7d2-640adf238951.png">

## Nivel Aceptación

Mientras que en los niveles anteriores se concentran en encontrar la mayor cantidad de defectos en el nivel de aceptación el objetivo principal es:

- Confirmar la funcionalidad correcta del sistema (al menos bajo condiciones normales).
- Generar confianza que sistema cumple con los requerimientos.

En este nivel se intenta responder las preguntas:

- ¿Puede liberarse el sistema?
- ¿Cuáles son los posibles riesgos al negocio?

Encontrar defectos no debería ser el objetivo principal de este nivel de pruebas. Sino buscar retroalimentación de usuarios reales.

<img width="659" alt="image" src="https://user-images.githubusercontent.com/67882289/135790246-4d0e0146-c2d4-490d-9bdd-af5f08271a5f.png">

## Pruebas de Aceptación Alpha

Este nivel toma lugar en las oficinas de los desarrolladores utilizando usuarios potenciales dentro de la organización. Los desarrolladores observan a los usuarios y anotan los problemas.

<img width="693" alt="image" src="https://user-images.githubusercontent.com/67882289/135790295-7a92e472-89d1-424b-be61-1379be009f72.png">

## Pruebas de Aceptación Beta

Para esta etapa se envía el sistema a un conjunto de usuarios que lo utilizan bajo condiciones reales de trabajo. Los usuarios envían anotaciones de las incidencias o sus comentarios. 

<img width="611" alt="image" src="https://user-images.githubusercontent.com/67882289/135790313-f1bae4b0-74e1-4c2a-bac9-c76536375618.png">

## Desarrollo Conducido por Pruebas

En este enfoque de desarrollo de software se plantea que las pruebas sean escritas antes de que el código se desarrolle.

Algunas ventajas al usar estas prácticas:

- Se obtiene colaboración de otros stakeholders para diseñar las pruebas.
- Se clarifican dudas de como probar el código.
- Se incrementa la  cobertura de pruebas.

<img width="753" alt="image" src="https://user-images.githubusercontent.com/67882289/135790739-34c5089e-cd8f-4443-891b-082245fd5dfe.png">

## TDD

TDD es utilizado comúnmente por los desarrolladores para conducir pruebas unitarias. Permite a los desarrolladores verificar si el código se comporta de acuerdo con el diseño.

Conforme el número de pruebas se incrementa es conveniente refactorizar el código.

Normalmente su utiliza un framework de pruebas como jUnit o TestNG para automatizar las pruebas.

<img width="689" alt="image" src="https://user-images.githubusercontent.com/67882289/135790834-eb2fe8ce-9520-4282-b055-168ee1193ae9.png">

## Refactorizar

Se refiere a mejorar el código sin cambiar el comportamiento de éste. El objetivo es obtener un código que sea fácil de entender y de mantener.

<img width="684" alt="image" src="https://user-images.githubusercontent.com/67882289/135790888-27860a2e-b316-44bf-84e4-a925d78ac6b7.png">

## BDD

La idea principal es: Uso de lenguaje que puede ser entendido por cualquier persona involucrada en el proyecto puedan entender el comportamiento del sistema y de las pruebas.

Herramientas como Cucumber suelen ser utilizadas para la creación de pruebas.

Las pruebas se construyen usando el formato Given-When-Then o también conocida como la Sintaxis Gherkins.

<img width="729" alt="image" src="https://user-images.githubusercontent.com/67882289/135791009-32a8aa33-f725-48e7-9315-556b48b2db2f.png">

## ATDD

El propósito de este enfoque es crear casos de prueba basados en los criterios de aceptación de las historias de usuario. Es usado en proyectos que usan metodologías Agile.

Se encuentran defectos de más alto nivel en forma más temprana al comprobar que los criterios de aceptación de cada historia son alcanzados.

<img width="584" alt="image" src="https://user-images.githubusercontent.com/67882289/135791058-175946ac-3f5c-42c3-825a-53f16c94e389.png">

## [Ejemplo 02: Desarrollo Conducido por Pruebas - TDD.](./Ejemplo-02/README.md)

## [Reto 02: Desarrollando un programa con TDD.](./Reto-02/README.md)

## Testing y CI/CD

CI/CD significa Integración Continua/Liberación Continua (Continuous Integration/Continuous Delivery).

Algunas empresas utilizan este enfoque para desarrollar software el cual plantea el proceso de integrar, probar y liberar de forma automática o semiautomática, incrementos de software usando un modelo iterativo o incremental.

El objetivo del testing en este enfoque es continuamente probar el código cada vez que un nuevo cambio se agregue.

<img width="762" alt="image" src="https://user-images.githubusercontent.com/67882289/135791164-a887c049-0603-4ecf-9695-2ae1839b815b.png">

## Integración Continua

En la integración continua cuando se sube un nuevo cambio, antes de que este se incluya en el código una suite de pruebas automatizadas es ejecutada.

Solamente si todas las pruebas pasan el nuevo cambio se integra con el demás código. Si algún error es detectado el desarrollador debe corregir el código antes de poder subirlo.

<img width="675" alt="image" src="https://user-images.githubusercontent.com/67882289/135791221-5694e613-3fb1-462d-b01f-8a6dd683b3bf.png">

## Distribución Continua (Continuous Delivery)

La etapa de distribución continua plantea el automatizar todo el proceso de integración y pruebas con una ligera intervención manual por parte de una persona que certifique que el código se puede liberar.

## Implementación Continua (Continuous Deployment) 

Esta etapa sustituye a la distribución continua, removiendo la necesidad de certificar manualmente que el código se puede integrar y liberar.

<img width="696" alt="image" src="https://user-images.githubusercontent.com/67882289/135791331-6b040ab4-4fb1-41f7-bc3f-e1506b4d032b.png">


## 📂 Organización de la clase

- [Ejemplo 01: Pruebas Unitarias.](./Ejemplo-01/README.md)
    - [Reto 01: Crea tus propias pruebas unitarias.](./Reto-01/README.md)
- [Ejemplo 02: Desarrollo Conducido por Pruebas - TDD.](./Ejemplo-02/README.md)
    - [Reto 02: Desarrollando un programa con TDD.](./Reto-02/README.md)
- [Postwork: Niveles del software testing.](./Postwork/README.md)




