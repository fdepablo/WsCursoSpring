# Proyecto Web con Spring

## Pasos para configurar Spring en un proyecto Web

1. Configurar nuestro runtime environment, con el servidor que queramos. En este caso Tomcat.
2. Crear un proyecto Dinamic Web Proyect
3. Mirar en properties -> Proyect Facet si hay algun problema con las versiones a utilizar
4. Convertir el proyecto en un proyecto Maven -> Configure -> Convert to Maven proyect
5. Meter las dependencias de Spring en nuestro proyecto
6. Arrancar el proyecto en nuestro server para probar que todo vaya bien

A partir de aqui debemos de configurar y arrancar nuestro contexto Spring. 

7. Generar el descriptor de despliegue. Boton derecho sobre el proyecto -> Jave EE -> generated deployment descriptor stub (web.xml)
8. Configurar el web.xml para que cuando arranque el tomcat, arranque tambien nuestro contexto de Spring (ver fichero web.xml)