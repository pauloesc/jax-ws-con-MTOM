package erroresPersonalizados;

public class ErrorCargaArchivo extends Exception {


	/*
	 * debido a que Exception implementa la interface serializable
	 * "ErrorCargaArchivo" tiene que tener un identificador de version serial
	 */
	private static final long serialVersionUID = 1L;


	public ErrorCargaArchivo() {

		super("No se encontro el archivo");

	}

}