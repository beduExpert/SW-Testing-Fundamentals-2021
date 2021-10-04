
# Sesión 4: Tipos de software testing.

## :dart: Objetivos

Agregar los objetivos de las sesión (Mínimo poner tres objetivos y Borrar está linea una vez se hay leido )

- El alumno será capaz de analizar la clasificación de los distintos tipos de testing, por medio de ejemplos y ejercicios prácticos, a fin de aplicarlos durante el desarrollo de software.

## ⚙ Requisitos

- Instalar Apache Jmeter

## 🎩 Buenas prácticas

Agregar buenas prácticas en caso de que la sesión lo requierea, de no ser así borrar está intrucción una vez se haya leido.

### Recapitulemos

## ¿Qué son los niveles de Testing?

Se puede definir como los objetivos y actividades que ayudan a identificar los objetivos específicos del testing a lo largo de cada una de las etapas del desarrollo de software.

Los niveles de testing van de la mano con los modelos de ciclo de vida de desarrollo del software.

En cada nivel se lleva a cabo el proceso fundamental de pruebas de una u otra forma.

<img width="764" alt="image" src="https://user-images.githubusercontent.com/67882289/135795551-12431bb4-041e-4af6-a265-0eafac39cc53.png">

## Nivel Componente

Este nivel también es conocido como nivel unitario, modulo o programa.

Este nivel usa como base de prueba el código por lo cual se requiere tener acceso a él.

La mayoría de veces se lleva a cabo por los desarrolladores, sin embargo si el nivel de riesgo del proyecto es alto es llevado por testers independientes.

<img width="841" alt="image" src="https://user-images.githubusercontent.com/67882289/135795634-e22dac68-a97c-46c4-a8e0-f50df474db8f.png">

## Nivel Integración

Este nivel se prueban interfaces entre componentes e interacciones entre distintas partes del sistema.

Las pruebas en este nivel son basadas principalmente en el diseño de la arquitectura del sistema.

El principal objetivo en este nivel es probar la comunicación entre los componentes y no su funcionalidad.

<img width="753" alt="image" src="https://user-images.githubusercontent.com/67882289/135795674-bc1623b3-6b9d-4ce8-b3ca-2cbe4187d8ac.png">

## Nivel Sistema

El nivel sistema de interesa en el comportamiento de todo el sistema como uno solo.

Las bases de la prueba suelen basarse en especificaciones del sistema o requerimientos.

El objetivo es encontrar la mayor cantidad de defectos antes de que el producto se vaya a producción.

En su mayoría se ejecutan pruebas de caja negra ya que no se tiene acceso al código.

<img width="789" alt="image" src="https://user-images.githubusercontent.com/67882289/135795769-f9d3e928-fe42-4e0b-af54-5ec8eacbe6a3.png">

## Nivel Aceptación

Mientras que en los niveles anteriores se concentran en encontrar la mayor cantidad de defectos en el nivel de aceptación el objetivo principal es:

- Confirmar la funcionalidad correcta del sistema (al menos bajo condiciones normales).
- Generar confianza que sistema cumple con los requerimientos.

<img width="655" alt="image" src="https://user-images.githubusercontent.com/67882289/135795793-9711a595-4b24-45ee-8093-104ec580e391.png">

## Desarrollo Conducido por Pruebas

En este enfoque de desarrollo de software se plantea que las pruebas sean escritas antes de que el código se desarrolle.

Algunas ventajas al usar estas prácticas:

- Se obtiene colaboración de otros stakeholders para diseñar las pruebas.
- Se clarifican dudas de como probar el código.
- Se incrementa la  cobertura de pruebas.

<img width="731" alt="image" src="https://user-images.githubusercontent.com/67882289/135795923-f2f2c303-4e61-45f0-ba23-2d893e23da09.png">

# ¿Qué es el CI/CD?

CI/CD significa Integración Continua/Liberación Continua (Continuous Integration/Continuous Delivery).

Algunas empresas utilizan este enfoque para desarrollar software el cual plantea el proceso de integrar, probar y liberar de forma automática o semiautomática, incrementos de software usando un modelo iterativo o incremental.

El objetivo del testing en este enfoque es continuamente probar el código cada vez que un nuevo cambio se agregue.

<img width="777" alt="image" src="https://user-images.githubusercontent.com/67882289/135795988-64c41a07-a1cd-483f-8e16-04ef5b8c85ff.png">

## Objetivos de Tipos de Testing

Los tipos de prueba se introducen como una forma de claramente definir el objetivo de un nivel de pruebas para un proyecto de software.

Seleccionar el tipo de prueba apropiado facilita hacer y comunicar decisiones a cerca del testing, al enfocarse en un objetivo específico.

Los tipos de pruebas a revisar en la sesión son:

- Pruebas Funcionales.
- Pruebas no Funcionales.
- Pruebas relacionadas a los cambios.
- Testing Estructural.

<img width="750" alt="image" src="https://user-images.githubusercontent.com/67882289/135796091-d2445be1-b551-45f4-9535-d78e3d6901d2.png">

## Testing Funcional

El objetivo de este tipo de pruebas es probar el comportamiento o funcionalidad del producto. Normalmente están basadas en especificaciones del sistema o en requerimientos y en el caso de proyectos Agile estás se basan en historias de usuario.

Estas pruebas son usadas principalmente en niveles de sistema y aceptación donde no se tiene acceso al código.

<img width="512" alt="image" src="https://user-images.githubusercontent.com/67882289/135796419-989a2e7f-64e3-466d-8738-26c0b867148e.png">

<img width="1045" alt="image" src="https://user-images.githubusercontent.com/67882289/135796285-bd9b120e-4044-4ad3-915d-231ce4e2a93c.png">

## Testing No Funcional

El objetivo de este tipo de pruebas es probar los atributos de calidad del sistema. Para estas pruebas se requiere alguna manera de medir el atributo de interés por ejemplo el tiempo de respuesta.

Las pruebas no funcionales se pueden conducir en cualquier nivel de pruebas.

Los subtipos de pruebas no funcionales están especificados en la norma ISO/IEC 25010.

<img width="608" alt="image" src="https://user-images.githubusercontent.com/67882289/135796366-ae5b9f92-bd8b-4090-a12c-d5d0ed75fba9.png">

<img width="1057" alt="image" src="https://user-images.githubusercontent.com/67882289/135796874-a003c79c-fb60-4a13-a271-fbe85b754bc4.png">

## Pruebas de Rendimiento (Performance Testing)

El objetivo de interés con este tipo de pruebas es medir el tiempo de respuesta a entradas del usuario del sistema que se esté probando.

<img width="803" alt="image" src="https://user-images.githubusercontent.com/67882289/135796537-60cd15e5-af35-4994-8354-dd1726917754.png">

## Pruebas de Estrés (Stress Testing)

En estas pruebas se estresa al sistema con múltiples entradas hasta provocar que falle.

El objetivo es conocer los limites máximos que el sistema puede soportar, como por ejemplo el número de usuarios máximo que pueden estar navegando en una página al mismo tiempo.

<img width="715" alt="image" src="https://user-images.githubusercontent.com/67882289/135796623-c36adea4-cd94-45d3-9bf9-36d14f54e125.png">

## Pruebas de Carga (Load Testing)

A diferencia de las pruebas de estrés, en estas pruebas se añaden cargas al sistema dentro de límites establecidos.

El objetivo es entender como se comporta el sistema cuando está sometido a un estrés permitido.

<img width="710" alt="image" src="https://user-images.githubusercontent.com/67882289/135796695-7f935aa6-b73a-4d20-89b4-150333c0a18c.png">

## Pruebas de Robustes (Robustness Testing)

El interés de las pruebas de robustez es analizar los siguientes aspectos:

- En el caso de que suceda una falla o algo inesperado observar como se comporta el sistema. 
- Si el sistema falla, observar como se recupera al regresar a valores permitidos.

<img width="584" alt="image" src="https://user-images.githubusercontent.com/67882289/135796787-f078c3ee-9eb6-4374-ada4-f54449c21042.png">

## Pruebas de Usabilidad (Usability Testing)

Un sistema puede ser muy estable y con pocos errores de código, sin embargo si este no es útil, comprensible y fácil de utilizar para los usuarios, es muy probable que no tenga éxito.

Las pruebas de usabilidad comprueban que un sistema cumpla con las expectativas del usuario.

<img width="420" alt="image" src="https://user-images.githubusercontent.com/67882289/135796930-a4ed0dad-6938-4565-92a3-e92282b0d18c.png">

## Pruebas de Fiabilidad (Reliability Testing)

La fiabilidad comprueba que un producto de software cumpla sus funciones por un ciclo de operaciones y periodo de tiempo predeterminados.

Por ejemplo que no se pierda información y que siga operando correctamente el software después de apagar y prender un dispositivo 100 veces.



## 📂 Organización de la clase

Agregar los ejemplos y retos que va a requerir la sesión (Borrar está linea una vez se hay leido)

- [Ejemplo 01:  Nombre del ejemplo](./Ejemplo-01/README.md)
    - [Reto 01: Nombre del reto 01](./Reto-01/README.md)
    - [Reto  02: Nombre del reto 02](./Reto-02/README.md)
- [Ejemplo 02: Nombre del ejemplo 02](./Ejemplo-02/README.md)
    - [Reto 03: Nombre del reto 03](./Reto-03/README.md)
- [Postwork: Nombre del postwork](./Postwork/README.md)




