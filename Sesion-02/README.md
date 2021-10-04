
# Sesión 2: Software Testing y su Relación con el SDLC

## :dart: Objetivos

- Describir los modelos de cliclo de vida de desarrollo del software más utilizados en la industria del software.
- Realizar actividades que permitan al alumno reforzar los conocimientos adquiridos entender que papel desempeña el testing en cada uno de estos modelos.

## ⚙ Requisitos

+ Comprobar acceso a la siguiente liga: https://www.jdoodle.com/online-java-compiler/

## 🎩 Buenas prácticas

Cuando testeamos un programa es importante poner especial atención en las combinaciones negativas que no son tomadas en cuenta por el desarrollador. Por ejemplo muchas veces las condiciones default en el "else" no son implementadas en el código lo cual lleva a comportamientos inesperados en la aplicación cuando ésta no puede manejar alguna entrada inesperada.

### Recapitulemos

## ¿Qué es el software testing?

“Es un conjunto de actividades y etapas conducidas a lo largo del desarrollo de un producto de software que si son llevadas a cabo de forma correcta permiten encontrar defectos preferentemente en etapas tempranas del desarrollo del producto para reducir costos de producción, incrementar la calidad y reducir el nivel de riesgo”.

<img width="560" alt="image" src="https://user-images.githubusercontent.com/67882289/135785181-f285173a-083b-4a51-887b-8c63079df34d.png">

## Los 7 principios del Software Testing.

El saber identificar estos principios en el proceso de testing y como obtener ventaja de ellos ayuda a formar a los mejores testers.

<img width="609" alt="image" src="https://user-images.githubusercontent.com/67882289/135785273-7a36f090-f321-4510-b239-3de213ddf4de.png">

## Etapas del Proceso Fundamental del Testing.

Existen un conjunto de actividades que de alguna forma u otra pueden llevarse a cabo en un proceso de testing. Estas etapas pueden llevarse de forma paralela o traslaparse.

<img width="739" alt="image" src="https://user-images.githubusercontent.com/67882289/135785338-10108dfa-4033-4446-9560-b2862839d412.png">

## Psicología del Software Testing.

- Mentalidad test vs desarrollador.
- Sesgo del Autor.
- Características de un buen tester.
- Independencia del testing.

<img width="348" alt="image" src="https://user-images.githubusercontent.com/67882289/135785389-d31c05da-79df-4247-a950-3eba2d0c4dea.png">

## Validación del Prework.

- ¿Qué es la Ingeniería de Software?
    - Aplicación de metodologías, modelos y técnicas que permiten la obtención de un software costeable y de alta calidad.
    - Herramientas que permiten crear y probar el software automáticamente.
    - Es una profesión recientemente creada para comprender mejor los procesos involucrados en el desarrollo de software.
    - Ciencia que investiga y profundiza en conceptos técnicos de programación.

- ¿Por qué es más costoso remover defectos en etapas finales del desarrollo de software?
    - No es más costoso en todas las etapas del desarrollo, cuesta lo mismo remover los defectos.
    - Existe una penalización en cualquier proceso de desarrollo de software por cada etapa que no se detecta un defecto.
    - Conforme avanza el defecto o las consecuencias de él en el ciclo de desarrollo se requieren más esfuerzos de otras áreas y actualizar más artefactos involucrados.
    - Las personas que crearon el defecto ya no pueden estar en el equipo y es muy costoso investigar la causa raíz.

- ¿En qué beneficia Agile al testing?
    - Agile profundiza en técnicas especializadas para la creación de software, lo cual resulta en un código más libre de defectos.
    - Agile permite que el testing se involucré más en las distintas etapas del desarrollo y así obtiene mayor retroalimentación del equipo y también la proporciona.
    - Agile no beneficia al testing sólo promueve la creación de más documentación del testing a lo largo del proceso de desarrollo.
    - Agile es una metodología totalmente enfocada al testing por lo tanto todas las demás áreas deben de desempeñar las tareas de testing.

- ¿Qué es la crisis de software?
    - Es un problema en el cual pocos proyectos eran exitosos por no usar procesos ni metodologías.
    - Crisis que sufrían los programadores por la carga excesiva de trabajo.
    - Problema que ocurrió para construir software por falta recursos y herramientas.
    - Problema actual que hace que las familias convivan menos.
 
- ¿Cuál es la etapa en la que generalmente se encuentran mayores defectos en el desarrollo de software?
    - Requerimientos.
    - Código.
    - Instalación.
    - Testing

## Ciclo de Vida de Desarrollo del Software

SLDC quiere decir Ciclo de Vida de Desarrollo del Software por sus siglas en inglés (Software Development Life Cycle). El Ciclo de Vida de Desarrollo del Software:

1. Especifica las diversas etapas del proceso y el orden que son llevadas a cabo.
2. Define las metas y el alcance del proyecto.
3. Involucra el testing en sus etapas.

<img width="668" alt="image" src="https://user-images.githubusercontent.com/67882289/135785911-592cd12a-d4fc-43c2-b418-dc8e7c2cfc35.png">

## Etapas del SDLC

En general las etapas más comunes de cualquier Ciclo de Vida de Desarrollo del Software son:

1. Planeación.
2. Análisis de Requerimientos.
3. Diseño.
4. Codificación.
5. Testing.
6. Liberación.
7. Mantenimiento.

<img width="655" alt="image" src="https://user-images.githubusercontent.com/67882289/135786005-251579d4-32ff-4fe3-b57e-f6ddde841bdd.png">

## Modelos del SDLC

Existen diferentes modelos de SDLC. El modelo a elegir depende de varios factores como: necesidades del proyecto, nivel de madurez de la empresa, requerimientos del cliente, etc.

Los modelos a revisar son:

- Modelo Cascada.
- Modelo en V.
- Modelo Iterativo.
- Modelo Incremental.

## Modelo Cascada

- Es un modelo secuencial.
- La siguiente etapa sólo comienza hasta que la anterior termina.
- Es difícil implementar cambios.
- El testing es conducido hasta el final.
- Funciona para Proyecto pequeños.

<img width="839" alt="image" src="https://user-images.githubusercontent.com/67882289/135786228-66f5c205-8364-4eb7-a06c-c8191077326d.png">

## Modelo en V

- Es un modelo secuencial.
- Las actividades de testing se llevan a cabo en paralelo.
- Defectos se encuentran en etapas tempranas ya que el testing ocurre desde el inicio.
- Funciona bien con proyectos donde el nivel de seguridad es importante y con poca flexibilidad a los cambios.

<img width="990" alt="image" src="https://user-images.githubusercontent.com/67882289/135786259-5722cc06-42d2-4c3b-b28a-78bb19b24cb4.png">

## Verificación vs Validación

La verificación se enfoca a con evaluar un producto de trabajo, componente o sistema para medir si cumple con los requisitos.

La validación se enfoca a evaluar un producto de trabajo, componente o sistema para medir si cumple con las expectativas del cliente.

<img width="745" alt="image" src="https://user-images.githubusercontent.com/67882289/135786284-3681beb1-5e6a-484a-a0d3-43aecbce6471.png">

## Modelo Iterativo

- Promueve retroalimentación continua al cliente.
- Flexible a los cambios.
- Los defectos se arreglan de forma temprana después de cada iteración.
- Las iteraciones son llevadas a cabo en Sprints que duran de 2 a 3 semanas.

<img width="843" alt="image" src="https://user-images.githubusercontent.com/67882289/135786306-a5df0e65-bb98-4dd2-9508-5c0d36f9bf69.png">

## Modelo Incremental

- Retroalimentación al cliente de forma rápida.
- Cambios son añadidos después de cada incremento.
- Defectos son encontrados tempranamente.
- El desarrollo se lleva de forma secuencial en cada incremento.

<img width="820" alt="image" src="https://user-images.githubusercontent.com/67882289/135786318-48876040-a184-4a15-af4d-78d1a6581ce0.png">

## [Ejemplo 01: Creando un programa con la herramienta JDOODLE.](./Ejemplo-01/README.md)

## [Reto 01: Proyecto con modelo secuencial.](./Reto-01/README.md)

## Agile y el Software Testing

Agile es un conjunto de prácticas, principios y metodologías basadas en modelos incrementales o iterativos.

Agile busca cambiar la cultura de un equipo u organización al fomentar la colaboración y mejorar la comunicación entre áreas involucradas en el desarrollo de software.

<img width="760" alt="image" src="https://user-images.githubusercontent.com/67882289/135786693-8bf07027-0be7-4ba7-ac69-152baedbe722.png">

## Agile Manifesto

Agile presenta 4 valores que tienen gran importancia en el testing.

Agile propone dar mayor importancia a los valores en letras grandes de la figura que se muestra y en medida a los que tienen letras pequeñas.

<img width="663" alt="image" src="https://user-images.githubusercontent.com/67882289/135786712-8ea992ff-4ec0-49ea-bc75-6301d2f250a9.png">

## Beneficios de Agile para el Testing.

Debido a la cultura de calidad compartida por todo el equipo, el testing tiene algunos beneficios.

- Todo el equipo es responsable de la calidad.
- El testing tiene más autonomía.
- Accesibilidad para poderse comunicar con el cliente o representantes del negocio.
- Tiende a implementar paradigmas de diseño como el TDD y BDD donde el testing es el punto de partida.

## Retos de Agile para el Testing.

A pesar de los beneficios que aporta Agile al testing también existen algunos retos a sobrellevar.

- Bases de prueba son menos formales y frecuentemente cambian.
- Existen tiempos de entrega más cortos por lo cual también menor tiempo para probar y planear.
- Automatización de pruebas toma mayor relevancia por lo que se puede exigir mayores habilidades técnicas.

## El Poder de los tres.

“El poder de los tres” es un termino conocido en Agile, que recalca la importancia que desempeña la constante comunicación de los testers, desarrolladores y representantes del negocio para éxito del proyecto.

<img width="841" alt="image" src="https://user-images.githubusercontent.com/67882289/135786961-55921aca-6f91-4b3c-adff-4553e3f3e0de.png">

## Frameworks de Agile

Un framework de Agile es un conjunto de reglas y prácticas que sirven como guía a los equipos para desempeñar sus actividades.

A continuación se muestran los frameworks frecuentemente más utilizados en Agile.

<img width="804" alt="image" src="https://user-images.githubusercontent.com/67882289/135787048-63d4c5b9-cb1d-4a93-beed-5c703a7e4614.png">

## Las ceremonias de Agile SCRUM

Las ceremonias de scrum son frecuentemente utilizadas en varios proyectos de software a pesar de que no implementen metodologías Agiles completamente.

Su comprensión de ellas es importante para muchos proyectos.

<img width="877" alt="image" src="https://user-images.githubusercontent.com/67882289/135787077-b454fd4b-06f3-48a9-a7cf-882cb7a9257a.png">

## Historias de Usuario

En Agile generalmente los requerimientos o especificaciones se descomponen en partes más pequeñas. Estas pequeñas partes son conocidas como historias de usuario.

Una historia de usuario debe procurar únicamente describir una sola parte de la funcionalidad de una especificación.

<img width="683" alt="image" src="https://user-images.githubusercontent.com/67882289/135787096-611a95df-e6dd-47ca-90f8-b10609dcf011.png">

## [Reto 02: Creando Historias de Usuario.](./Reto-02/README.md)

## ¿Porqué usar un modelo secuencial en vez de Agile?

A pesar de que Agile ofrece diversos beneficios para el testing, hay algunos proyectos que por su naturaleza no pueden aceptar una alta flexibilidad a los cambios. 

Industrias como la aeronáutica, automotriz y de medicina no implementan por completo este tipo de metodologías.

<img width="747" alt="image" src="https://user-images.githubusercontent.com/67882289/135787121-a656b8e6-6f43-49b8-a73a-538f4a97ef45.png">

## Ciclo de Vida de Desarrollo del Testing

El ciclo de vida de pruebas de software es desempeñado en cada una de las etapas del desarrollo de software. Dependiendo del modelo a usar el proceso fundamental del testing se va usar de una u otra forma.

<img width="783" alt="image" src="https://user-images.githubusercontent.com/67882289/135787364-0441a098-5340-4db2-b5ca-aaa80440e1ec.png">

## [Ejemplo 02: Creando un programa usando un modelo incremental.](./Ejemplo-02/README.md)

## [Reto 03: Crea tu propio programa con un modelo incremental.](./Reto-03/README.md)


## 📂 Organización de la clase

- [Ejemplo 01: Creando un programa con la herramienta JDOODLE.](./Ejemplo-01/README.md)
    - [Reto 01: Proyecto con modelo secuencial.](./Reto-01/README.md)
    - [Reto 02: Creando Historias de Usuario.](./Reto-02/README.md)
- [Ejemplo 02: Creando un programa usando un modelo incremental.](./Ejemplo-02/README.md)
    - [Reto 03: Crea tu propio programa con un modelo incremental.](./Reto-03/README.md)
- [Postwork: Software Testing y su Relación con el SDLC](./Postwork/README.md)




