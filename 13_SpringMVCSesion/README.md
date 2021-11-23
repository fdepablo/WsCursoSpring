# Session en Spring MVC 

En este proyecto vamos a ver como podemos trabajar con el objeto Session en Spring MVC


## Configuracion

Como primer paso debemos de crear un proyecto web y meter las dependecias que necesitaremos de Spring Context y Spring MVC. Se puede convertir luego el proyecto a maven para meter las librerias de forma simple.

El siguiente paso sera configurar el contexto de spring y nuestro FrontController para que Tomcat lo instancie al arrancar el servidor, para ello modificaremos el web.xml para dar del alta el servlet de spring.

Como tercer paso, configuramos nuestro fichero xml del contexto de Spring (applicationContext.xml) para dar de alta el resto de los beans que usaremos en nuestra aplicacion. Dicho fichero tiene que estar situado al mismo nivel que el web.xml

Una vez hecho esto ya podemos empezar a hacer la aplicacion y crear los controladores.

## Visualizacion del ejemplo

Entrando por index.html empezaremos viendo la parte del saludo

