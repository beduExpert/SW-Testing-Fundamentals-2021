# Ejemplo 3 – Primer Script PlayWright

## Objetivo

* Conocer una herramienta de automatización de pruebas web y apis rest, usando código JS
* Ejecutar un escenario de pruebas en varios navegadores

## Desarrollo

>**💡 Nota para experto(a)**
>
> Este lenguaje se puede realizar pruebas usando TypeScript o JavaScript.
>PlayWright tiene soporte directamente de Microsoft

### Instalacion 

>npm i -D @playwright/test
<img>
>npx playwright install
<img>

### Creación de archivos
>Crear el test /foo.spec.js (o tests/foo.spec.ts para TypeScript) en la carpeta test de tu proyecto.
<img>

>Agregar el siguiente código, para JS




const { test, expect } = require('@playwright/test');

test('Ejemplo 3_sesion 8_ BEDU', async ({ page }) => {
  await page.goto('https://playwright.dev/');
  const title = page.locator('.navbar__inner .navbar__title');
  await expect(title).toHaveText('Playwright');
});


<IMG>
### Ejecuciones
Ejecutar las pruebas que estan guardadas en la carpeta “test”

>npx playwright test

<img>

Playwright permite ejecutar la prueba usando Chromium browser

npx playwright test –headed

<img>

Podemos usar un navegador especifico con la siguiente linea
npx playwright test --browser=firefox
<img>

Finalmente Tambien Podemos usar todos los navegadores en una sola linea
>npx playwright test --browser=all
<img>

### Grabar commandos
>npx playwright codegen https://blazedemo.com/index.php

Codigo generado

>
Code 
 <img>

