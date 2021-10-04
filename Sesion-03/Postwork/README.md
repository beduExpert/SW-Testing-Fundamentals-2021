# Postwork 3: Niveles del Software Testing.

## :dart: Objetivos

- Desarrollar pruebas en código ya existente para comprender cómo realizar pruebas a nivel componente e integración.
- Reconocer cómo diseñar pruebas conducidas por software para entender cuáles son sus ventajas comparado con el desarrollo tradicional.

## ⚙ Desarrollo

En la sesión se revisaron los distintos niveles de software testing y cuáles son los objetivos, responsabilidades y actividades específicas en cada uno de estos niveles.

También se explicó cuales son los objetivos del desarrollo conducido por pruebas y sus ventajas comparado con el desarrollo de software convencional.

Para concluir con tu aprendizaje reforzarás lo aprendido en la sesión con la siguiente actividad interactiva.

## 📃 Instrucciones

1. Los siguientes ejercicios serán parte de los entregables del Checkpoint. No dudes en contactar al Experto (a) por Slack si tienes dudas o necesitas retroalimentación.
2. Lee detenidamente las preguntas planteadas y elige la respuesta correcta.
3. Recuerda que el propósito de la actividad es reforzar tus conocimientos y poner a prueba lo aprendido.
4. Se requiere un entregable. 

## Ejercicio 1

En el postwork de la sesión anterior se trabajó en la implementación del código para la aplicación “Pizzería Bella Napoli”. Utilizando este mismo código:
- Fórmula al menos 8 pruebas unitarias utilizando el framework de pruebas TestNG.
- Copia y pega el código.
- Demuestra su funcionamiento con un video de 1 minuto de duración.

Ejemplo:

<img width="529" alt="image" src="https://user-images.githubusercontent.com/67882289/135794282-fddbf94b-520a-43ad-8e53-a3c6fdf31f05.png">

## Ejercicio 2

Para atraer más clientes a la pizzería se quiere implementar un sistema de puntuación descrito en la siguiente especificación:

> Debido al éxito en las sucursales de la Pizzería Bella Napoli se está buscando desarrollar un sistema de lealtad basado en puntos y el uso de tarjetas donde se guarde el saldo de estos puntos. Cada vez que el cliente pida una nueva orden el vendedor preguntará si el cliente cuenta con tarjeta de puntos. Si el cliente no tiene tarjeta, la orden procederá normalmente. De otra forma se analizaran el número de puntos de la siguiente forma:
> - Si el saldo en puntos es mayor a 50 y menor a 100. El cliente recibirá una orden de espagueti junto con su pedido.
> - Si el saldo es mayor a 100 y menor a 150. El cliente recibirá una orden de spaghetti y además queso extra en su orden.
> - Por último por un saldo mayor a 150. El cliente recibirá un cupón que podrá canjear por una pizza gratis además de espagueti y queso extra en su orden.
> - Una vez usado el cupón este debe de quedar registrado en el sistema.
> - Cada orden otorga 5 puntos extras al saldo del cliente.

Utilizando TestNG y TDD diseña las pruebas necesarias para poder construir el código de sistema de lealtad. Este código se realizará de forma independiente al creado en el post work anterior. Demuestra el correcto funcionamiento de tu código en un video de menos de 1 minuto.

Ejemplo:

<img width="542" alt="image" src="https://user-images.githubusercontent.com/67882289/135794579-d718e6e2-5f80-45ce-8c24-293a52a1e406.png">


## ✅ Checklist

Considera que tu proyecto debe cumplir con lo siguiente:

| Requisito | Sí lo cumple | No lo cumple |
| --- | --- | --- |
| A. Código con al menos 8 pruebas unitarias del ejercicio del postwork de la sesión anterior. |  |  |
| B. Video de menos de 1 minuto mostrando evidencia de los resultados arrojados por las pruebas unitarias. |  |  |
| C. Código de diseño pruebas TDD y de la aplicación del requerimiento del ejercicio 2. |  |  |
| D. Video de menos de un minuto mostrando el funcionamiento del ejercicio 2. |  |  |
