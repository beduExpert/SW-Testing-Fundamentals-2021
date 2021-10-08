# Ejemplo 3 – Análisis de código con SonarQube

## Objetivo

*Instalar e implementar la herramienta de análisis de código locamente
* Identificar mejoras de código de manera temprana

## Desarrollo
>**💡 Nota para experto(a)**
> Code Smell: No son fallos o bugs del código, pero si indican deficiencias en el diseño software o patrón de desarrollo, que puede ralentizar el funcionamiento del aplicativo o aumentar el riesgo de errores o fallos en el futuro.

SonarQueb, es una herramienta de revisión automática de código para detectar bugs, vulnerabilidades y “code smell” en algún código fuente. Se puede integrar con su flujo de trabajo existente para permitir la inspección continua de código en las ramas de su proyecto.

Después de la descarga del paquete:
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-06/Ejemplo-03/assets/ejemplo3_1.png">
Después, de descomprimir el archivo .zip, copiamos la carpeta al disco local (C:)
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-06/Ejemplo-03/assets/ejemplo3_2.png">
El siguiente paso es ejecutar SonarQube, para ello abrimos una consola de Windows o CMD e ingresamos el siguiente comando para llegar a la carpeta de SonarQube.
Cd .. / ENTER – Cd .. /enter  - Cd “nombre_carpeta_sonar_Qube”
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-06/Ejemplo-03/assets/ejemplo3_3.png">
En la carpeta “C:\sonarqube-9.1.0.47736\conf” modificar el archivo “wrapper.conf”
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-06/Ejemplo-03/assets/ejemplo3_5.png">
Después de guardar el archivo, podemos ejecutar StartSonar.bat en la carpeta /bin/Windows-x86-64
<img src="https://github.com/beduExpert/SW-Testing-Fundamentals-2021/blob/main/Sesion-06/Ejemplo-03/assets/ejemplo3_4.png">

