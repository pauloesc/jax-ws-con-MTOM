package imagenes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

import erroresPersonalizados.ErrorCargaArchivo;

@WebService
/*
 * threshold: especifica el tamaño (en bytes) por encima del cual los datos binarios se
 * enviarán como un archivo adjunto. Esto sería útil para habilitar MTOM solo
 * para datos que son mayores que una cantidad especificada.
 */
@MTOM(enabled = true, threshold = 1)
public class ImgFuncionalidades {
	
	@WebMethod
    public void subirImg(String fileName, byte[] imageBytes) {
		
		String filePath = "/home/paulo/imgProyectoPrueba/jax_ws/" + fileName;

        try {
        	/*
        	 * Crea un objeto FileOutputStream llamado fos para MANEGAR la escritura
        	 * de bytes en el archivo especificado en filePath.
        	 * i filePath no existe lo crea
        	 */
            FileOutputStream fos = new FileOutputStream(filePath);
            /*
             *BufferedOutputStream es una clase en Java que proporciona un búfer para mejorar el rendimiento
             * al escribir datos en un flujo de salida.
             * Básicamente, acumula datos en un búfer antes de escribirlos físicamente en el dispositivo de almacenamiento,
             * reduciendo así la cantidad de operaciones de escritura y mejorando la eficiencia.
             * En este caso el dispositivo de salida es fos
             */
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            
            outputStream.write(imageBytes);
            outputStream.close();
                          
        } catch (IOException ex) {
            System.err.println(ex);
            throw new WebServiceException(ex);
        }

	}
	
	@WebMethod
	public byte[] descargarImg(String fileName) throws ErrorCargaArchivo {

		String filePath = "/home/paulo/imgProyectoPrueba/jax_ws/" + fileName;
		         
        try {
        	/*
        	 * Se crea un objeto File llamado file que representa el archivo en la ruta especificada por filePath.
        	 */
            File file = new File(filePath);
            /*
             * se abre un "flujo" entre tu programa de Java y el archivo especificado por file.
             * Sin embargo, este paso inicial solo establece una conexión,
             * y aún no se ha leído ningún dato del archivo.
             * 
             * fis representa un canal por el cual tu programa puede leer bytes del archivo.
             * La lectura real de datos se realiza más adelante
             */
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            
            byte[] fileBytes = new byte[(int) file.length()];
            
            /*Prepara un espacio de almacenamiento para los bytes que se
             * leerán desde el archivo y se almacenarán en este array.
             */
            inputStream.read(fileBytes);
            inputStream.close();
             
            return fileBytes;
            
        } catch (IOException ex) {
            System.err.println(ex);
            throw new WebServiceException(ex);
        }
		
		
	}  
	
}