#!/bin/bash

#Este script necesita privilegios de superusuario por culpa de la linea 15. (>> se ejecuta antes que sudo)

echo "Ingrese su nombre de usuario"
read nombre

sudo mkdir /home/$nombre/imgProyectoPrueba/
sudo chmod 777 /home/$nombre/imgProyectoPrueba/

sudo mkdir /home/$nombre/imgProyectoPrueba/jax_ws/
sudo chmod 777 /home/$nombre/imgProyectoPrueba/jax_ws/

sudo mkdir /home/$nombre/imgProyectoPrueba/app_desde_servidor/
sudo chmod 777 /home/$nombre/imgProyectoPrueba/app_desde_servidor/

sudo mkdir /home/$nombre/imgProyectoPrueba/app/
sudo chmod 777 /home/$nombre/imgProyectoPrueba/app/

sudo echo "texto y mas texto" >> /home/$nombre/imgProyectoPrueba/app/primera.png
sudo chmod 777 /home/$nombre/imgProyectoPrueba/app/primera.png

