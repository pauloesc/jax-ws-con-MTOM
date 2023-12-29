package principal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.ws.soap.MTOMFeature;

import latam.Brasil;
import latam.BrasilService;
import ws_cliente_imagenes.ErrorCargaArchivo_Exception;
import ws_cliente_imagenes.ImgFuncionalidades;
import ws_cliente_imagenes.ImgFuncionalidadesService;

public class Programa {

	public static void main(String[] args) {

		BrasilService bs = new BrasilService();
		
		/*
		 * Observar que Brasil es una interface, sin embargo no da error la asignacion Brasil b = bs.getBrasilPort().
		 * 
		 * bs.getBrasilPort(); seguramente sea una clase que implementa dicha interface por eso no hay problema.
		 * 
		 * Lo que leei indica que la ser la interface menos generica que lo retornado por bs.getBrasilPort(),
		 * entonces la asignacion no falla (polimorfismo)
		 */
		Brasil b = bs.getBrasilPort();
		System.out.println(b.rio("texto"));
		
		//ahora vamos a probar la transferencia de imagenes 
		//------------------------------------------
		
		ImgFuncionalidadesService i_fun = new ImgFuncionalidadesService();
		
		boolean enabled = true;
		int threshold = 1;
		ImgFuncionalidades conexion_img_fun = i_fun.getImgFuncionalidadesPort(new MTOMFeature(enabled, threshold));
		
		//definir la img a subir
        String fileName = "primera.png";
        String filePath = "/home/paulo/imgProyectoPrueba/app/" + fileName;
        File file = new File(filePath);
        
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            
            byte[] imageBytes = new byte[(int) file.length()];
            inputStream.read(imageBytes);
             
            conexion_img_fun.subirImg(file.getName(), imageBytes);
 
            inputStream.close();
            System.out.println("Imagen subida");
            
        } catch (IOException ex) {
            System.err.println(ex);
        } 

        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Presiona Enter para continuar...");
        scanner.nextLine();
        System.out.println("Continuación del programa...");
        scanner.close();
        
        
        
        // downloads another file
        fileName = "deRegreso.extension";
        filePath = "/home/paulo/imgProyectoPrueba/app_desde_servidor/" + fileName;
        byte[] fileBytes = null;
		try {
			fileBytes = conexion_img_fun.descargarImg("primera.png");
		} catch (ErrorCargaArchivo_Exception e) {
			e.printStackTrace();
		}
         
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(fileBytes);
            outputStream.close();
             
        } catch (IOException ex) {
            System.err.println(ex);
        }
        
        
        System.out.println("Generando un error");
        try {
			fileBytes = conexion_img_fun.descargarImg("no_existe");
		} catch (ErrorCargaArchivo_Exception e) {
			System.out.println(e.getMessage());
			System.out.println("-------");
			e.printStackTrace();
			System.out.println("-------");
			//throw new Exception("Error al cagar al archivo", e);
		}
        
	}

}
