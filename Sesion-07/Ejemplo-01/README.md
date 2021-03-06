# Ejemplo 1 Plan de pruebas

## Objetivo

* Analizar correctamente cada item de un plan de pruebas funcionales, como lo son: el alcance, la estrategia y los casos de prueba  a ejecutar.
* Entender los tipos de bug y como es la forma correcta de reportarlos.

**馃挕 Nota para experto(a)**

> De la misma forma como aplicamos el plan de pruebas para la aplicaci贸n m贸vil en cuesti贸n, aplica para cualquier tipo de software. Salvo que en algunas situaciones se puede omitir o aplicar algunos 铆tems.

>Happy_path: en lo que se suele en llamar el happy path y que particularmente se conocen en el mundo de las pruebas con el t茅rmino 鈥減ruebas felices". Son los escenarios de pruebas mas comunes, y m谩s f谩ciles de ejecutar. 

## Desarrollo

 <img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-07/Ejemplo-01/assets/ejmplo_plan%20de%20pruebas1.png">

## Historia de usuario (脡pica)
- Yo como usuario comprado de vivienda quiero empezar a buscar mi pr贸xima propiedad desde mi dispositivo m贸vil. Tal b煤squeda pueda seleccionar el pa铆s y la ciudad que deseo la propiedad, con la opci贸n de seleccionar el tipo de vivienda 鈥淎partamento o Casa鈥?.

## Criterios de aceptaci贸n:
-	El flujo del happy path no d茅 puede superar las 4 pantallas.
-	Despu茅s de seleccionar la intensi贸n de compra, la aplicaci贸n le debe mostrar el m贸dulo para hacer login, utilizando el api de Gmail, Facebook y por c贸digo OTP.
-	El orden de las vistas ser谩:
  i.	Splash: Logo de Haus
  ii.	Home: Con un mensaje de bienvenida y un para empezar la b煤squeda
  iii.	Seleccionar el pa铆s: La pantalla debe de mostrar al usuario dos opciones 鈥淐olombia y M茅xico鈥?
  iv.	Seleccionar la ciudad: 
  1.	Para Colombia: 鈥淏ogot谩, Medell铆n, Cali, Cartagena, Barranquilla鈥? Habilitados. Santa marta solo visual
  2.	Para M茅xico: 鈥淐iudad de M茅xico, Guadalajara, Quer茅taro, Monterrey, Torre贸n, San Miguel鈥? Habilitados. Quintana Roo y Yucat谩n, solo visibles.
  v.	Seleccionar tipo de vivienda: Casa y Apartamento.
  vi.	Modulo login.
-	 Los dise帽os de las pantallas deben de estar orientadas a una buena experiencia de usuario.

## Alcance:
Sera realizar pruebas manuales y automatizadas, la cuales aseguren la calidad del comportamiento funcional de la aplicaci贸n Haus en versi贸n 3.11.1, en las primeras 4 pantallas. Las cu谩les ser谩n un carrusel de vistas de 3 pasos, con el objetivo de buscar una propiedad, teniendo en cuenta el pa铆s, la ciudad, del usuario interesado y el tipo de vivienda que desea comprar y el dispositivo utilizado para las pruebas: Android 10

## Fuera del alcance:

- Realizar pruebas de portabilidad y usabilidad.
- Realizar pruebas de rendimiento.
- Realizar pruebas en dispositivos IOS.

## Estrategia: Pruebas de aceptaci贸n de usuario

-	Pruebas automatizadas: Desarrollar un script, el cual simulara el comportamiento de un usuario en un dispositivo m贸vil Android. Abriendo la aplicaci贸n como si fuera su primera vez, verificando los textos de cada pantalla, la lista de pa铆ses, ciudades y tipo de viviendas, de igual forma el funcionamiento de cada bot贸n y verificando que se visualice correctamente el m贸dulo de login, con las formas de autenticaci贸n: Gmail, Facebook y OTP.
-	Pruebas manuales: Prueba exploratorias, el cual analizara el tama帽o de los botones, posici贸n, colores y flujo de cada paso. 


## Escenarios de prueba:
```
 Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Medell铆n
Y tipo de vivienda casa
Entonces el usuario visualizar谩 la del m贸dulo de login
```

```
Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el M茅xico para la ciudad de Ciudad de M茅xico
Y tipo de vivienda apartamento
Entonces el usuario visualizar谩 la del m贸dulo de login
```
```
Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el M茅xico para la ciudad de Yucat谩n 
Entonces el usuario visualizar谩 la pantalla de ciudad
```
```
Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Santa Marta 
Entonces el usuario visualizar谩 la pantalla de ciudad
```
```
Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el Colombia para la ciudad de Bogot谩 
Y el usuario se vuelve al paso anterior
Entonces el usuario visualizar谩 la pantalla del mensaje de bienvenida.
```
```
Dado que el usuario inicio la b煤squeda de su propiedad
Cuando el usuario selecciona el M茅xico para la ciudad de Guadalajara 
Y el usuario se vuelve al paso anterior
Entonces el usuario visualizar谩 la pantalla del mensaje de bienvenida.
```
## Suposiciones: 
Se requiere la aplicaci贸n Haus en versi贸n 3.11.1 en la playstore

## Reporte de Bug:
- Sugerencias: Es confuso la selecci贸n de la divisa cuando se visualiza propiedades de los dos pa铆ses, la sugerencia seria, en el perfil de usuario seleccionar una moneda, y la aplicaci贸n cambiar lo valores a esta divisa.
- 	Hallazgos: Despu茅s de seleccionar los par谩metros de b煤squeda de la vivienda, y hacer l	login, la vista siguiente no muestra un resultado de la consulta. 
	- Defectos: 

 <img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-07/Ejemplo-01/assets/ejmplo_plan%20de%20pruebas3.png">
