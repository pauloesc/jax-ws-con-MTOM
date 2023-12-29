# jax-ws-con-MTOM

Desarrollé este proyecto con el objetivo de aprender a exponer  web-services desde un servidor (Tomcat) en lugar de hacerlo desde el servidor virtual proporcionado por Java. Además, exploré la implementación de MTOM para mejorar la eficiencia en el intercambio de mensajes SOAP.

Quien quiera experimentar con el programa tiene que saber que tiene hardcodeado las lineas dde donde se van a extrar los archivos: /home/paulo/....
AAdemas tambien combiene ejecutar el script generarEstructuraDeCarpetas.sh para generar la estructura de directorios y archivos necesarios.

Se uso openjdk-8 y el codigo se compilo bajo el estandar 8 del lenguaje java.

Para probar si los servicios se levantaron entrar a http://localhost:8080/servidor/img

Si el servidor Y LOS SERVICIOS-WEB no esta expuestos (levantados) "mvn clean generate-sources compile package" no va a funcionar en el cliente-jax-ws, ya que necesita de los wsdl para generar las clases.
