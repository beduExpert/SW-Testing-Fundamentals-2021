# Ejemplo 3 – Primer Script PlayWright

## Objetivo

* Conocer una herramienta de automatización de pruebas web y apis rest, usando código JS
* Ejecutar un escenario de pruebas en varios navegadores

## Desarrollo

>**💡 Nota para experto(a)**
>
> Este lenguaje se puede realizar pruebas usando TypeScript o JavaScript.
> PlayWright tiene soporte directamente de Microsoft

### Instalacion 

```
npm i -D @playwright/test
```

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo1.png">

```
npx playwright install
```
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo2.png">

### Creación de archivos

> Crear el test /foo.spec.js (o tests/foo.spec.ts para TypeScript) en la carpeta test de tu proyecto.

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo3.png">

> Agregar el siguiente código, para JS

```
const { test, expect } = require('@playwright/test');

test('Ejemplo 3_sesion 8_ BEDU', async ({ page }) => {
  await page.goto('https://playwright.dev/');
  const title = page.locator('.navbar__inner .navbar__title');
  await expect(title).toHaveText('Playwright');
});
```

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo4.png">

### Ejecuciones

> Ejecutar las pruebas que estan guardadas en la carpeta “test”

```
npx playwright test
```
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo5.png">

> Playwright permite ejecutar la prueba usando Chromium browser

```
npx playwright test –headed
```
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo6.png">


> Podemos usar un navegador especifico con la siguiente linea

```
npx playwright test --browser=firefox
```

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo7.png">

Finalmente Tambien Podemos usar todos los navegadores en una sola linea

```
npx playwright test --browser=all
```

<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo8.png">

### Grabar commandos
```
npx playwright codegen https://blazedemo.com/index.php
```
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-08/Ejemplo-03/assets/ejemplo9.png">

> Codigo generado

```

const { test, expect } = require('@playwright/test');

test('Ejemplo usando codegen  ', async ({ page }) => {
    await page.goto('https://blazedemo.com/index.php');
    await page.selectOption('select[name="fromPort"]', 'Mexico City');
    await page.selectOption('select[name="toPort"]', 'London');
    await page.click('text=Find Flights');
    await expect(page).toHaveURL('https://blazedemo.com/reserve.php');
    await page.click('text=Choose This Flight');
    await expect(page).toHaveURL('https://blazedemo.com/purchase.php');
    await page.click('[placeholder="First Last"]');
    await page.fill('[placeholder="First Last"]', 'LuisCarlosMarca');
    await page.press('[placeholder="First Last"]', 'Tab');
    await page.fill('[placeholder="123 Main St."]', 'La Dorada');
    await page.fill('[placeholder="Anytown"]', '');
    await page.dblclick('[placeholder="123 Main St."]');
    await page.click('text=Travel The World home Your flight from TLV to SFO has been reserved. Airline: Un', {
      clickCount: 4
    });
    await page.dblclick('[placeholder="123 Main St."]');
    await page.fill('[placeholder="123 Main St."]', 'Cr 34');
    await page.click('[placeholder="Anytown"]');
    await page.fill('[placeholder="Anytown"]', 'Ld');
    await page.dblclick('[placeholder="State"]');
    await page.fill('[placeholder="State"]', 'Caldas');
    await page.press('[placeholder="State"]', 'Control+-');
    await page.click('text=Credit Card Number');
    await page.press('[placeholder="Credit Card Number"]', 'Control+-');
    await page.press('[placeholder="Credit Card Number"]', 'Control+-');
    await page.click('text=Card Type');
    await page.press('text=Travel The World home Your flight from TLV to SFO has been reserved. Airline: Un', 'Control+-');
    await page.click('form div:has-text("Zip Code")', {
      button: 'right'
    });
    await page.press('text=Travel The World home Your flight from TLV to SFO has been reserved. Airline: Un', 'Alt++');
    await page.fill('[placeholder="Credit Card Number"]', '23242342343242');
    await page.click('[placeholder="John Smith"]');
    await page.fill('[placeholder="John Smith"]', 'LC');
    await page.click('text=Purchase Flight');
    await expect(page).toHaveURL('https://blazedemo.com/confirmation.php');
  });
  

```
