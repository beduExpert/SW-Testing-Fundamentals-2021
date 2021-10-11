# Ejemplo 1 Plan de pruebas

## Objetivo

* Analizar correctamente cada item de un plan de pruebas funcionales, como lo son: el alcance, la estrategia y los casos de prueba  a ejecutar.
* Entender los tipos de bug y como es la forma correcta de reportarlos.

**💡 Nota para experto(a)**

> De la misma forma como aplicamos el plan de pruebas para la aplicación móvil en cuestión, aplica para cualquier tipo de software. Salvo que en algunas situaciones se puede omitir o aplicar algunos ítems.

>Happy_path: en lo que se suele en llamar el happy path y que particularmente se conocen en el mundo de las pruebas con el término “pruebas felices". Son los escenarios de pruebas mas comunes, y más fáciles de ejecutar. 

## Desarrollo

 <img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-07/Ejemplo-01/assets/ejmplo_plan%20de%20pruebas1.png">

## Historia de usuario (Épica)
- Yo como usuario comprado de vivienda quiero empezar a buscar mi próxima propiedad desde mi dispositivo móvil. Tal búsqueda pueda seleccionar el país y la ciudad que deseo la propiedad, con la opción de seleccionar el tipo de vivienda “Apartamento o Casa”.

## Criterios de aceptación:
-	El flujo del happy path no dé puede superar las 4 pantallas.
-	Después de seleccionar la intensión de compra, la aplicación le debe mostrar el módulo para hacer login, utilizando el api de Gmail, Facebook y por código OTP.
-	El orden de las vistas será:
  i.	Splash: Logo de Haus
  ii.	Home: Con un mensaje de bienvenida y un para empezar la búsqueda
  iii.	Seleccionar el país: La pantalla debe de mostrar al usuario dos opciones “Colombia y México”
  iv.	Seleccionar la ciudad: 
  1.	Para Colombia: “Bogotá, Medellín, Cali, Cartagena, Barranquilla” Habilitados. Santa marta solo visual
  2.	Para México: “Ciudad de México, Guadalajara, Querétaro, Monterrey, Torreón, San Miguel” Habilitados. Quintana Roo y Yucatán, solo visibles.
  v.	Seleccionar tipo de vivienda: Casa y Apartamento.
  vi.	Modulo login.
-	 Los diseños de las pantallas deben de estar orientadas a una buena experiencia de usuario.

## Alcance:
Sera realizar pruebas manuales y automatizadas, la cuales aseguren la calidad del comportamiento funcional de la aplicación Haus en versión 3.11.1, en las primeras 4 pantallas. Las cuáles serán un carrusel de vistas de 3 pasos, con el objetivo de buscar una propiedad, teniendo en cuenta el país, la ciudad, del usuario interesado y el tipo de vivienda que desea comprar y el dispositivo utilizado para las pruebas: Android 10

## Fuera del alcance:

- Realizar pruebas de portabilidad y usabilidad.
- Realizar pruebas de rendimiento.
- Realizar pruebas en dispositivos IOS.

## Estrategia: Pruebas de aceptación de usuario

-	Pruebas automatizadas: Desarrollar un script, el cual simulara el comportamiento de un usuario en un dispositivo móvil Android. Abriendo la aplicación como si fuera su primera vez, verificando los textos de cada pantalla, la lista de países, ciudades y tipo de viviendas, de igual forma el funcionamiento de cada botón y verificando que se visualice correctamente el módulo de login, con las formas de autenticación: Gmail, Facebook y OTP.
-	Pruebas manuales: Prueba exploratorias, el cual analizara el tamaño de los botones, posición, colores y flujo de cada paso. 


## Escenarios de prueba:
```
 Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Medellín
Y tipo de vivienda casa
Entonces el usuario visualizará la del módulo de login
```

```
Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el México para la ciudad de Ciudad de México
Y tipo de vivienda apartamento
Entonces el usuario visualizará la del módulo de login
```
```
Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el México para la ciudad de Yucatán 
Entonces el usuario visualizará la pantalla de ciudad
```
```
Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Santa Marta 
Entonces el usuario visualizará la pantalla de ciudad
```
```
Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Bogotá 
Y el usuario se vuelve al paso anterior
Entonces el usuario visualizará la pantalla del mensaje de bienvenida.
```
```
Dado que el usuario inicio la búsqueda de su propiedad
Cuando el usuario selecciona el México para la ciudad de Guadalajara 
Y el usuario se vuelve al paso anterior
Entonces el usuario visualizará la pantalla del mensaje de bienvenida.
```
## Suposiciones: 
Se requiere la aplicación Haus en versión 3.11.1 en la playstore

## Reporte de Bug:
- Sugerencias: Es confuso la selección de la divisa cuando se visualiza propiedades de los dos países, la sugerencia seria, en el perfil de usuario seleccionar una moneda, y la aplicación cambiar lo valores a esta divisa.
- 	Hallazgos: Después de seleccionar los parámetros de búsqueda de la vivienda, y hacer l	login, la vista siguiente no muestra un resultado de la consulta. 
	- Defectos: 

 <img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-07/Ejemplo-01/assets/ejmplo_plan%20de%20pruebas3.png">
