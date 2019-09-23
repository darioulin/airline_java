
public class CPasajero {

	private String Nombre = "";
	private String Correo = "";
	private String NumeroTelefono = "";
	private String FechaNacimiento = "";
	
	public CPasajero() {
		Nombre = "Daniel Lazaro";
		Correo = "daniel@lazaro.com";
		NumeroTelefono = "9932408912";
		FechaNacimiento = "21/08/97";
	}
	
	public CPasajero(String Nombre1, String Correo1, String NumeroTelefono1, String FechaNacimiento1) {
		Nombre = Nombre1;
		Correo = Correo1;
		NumeroTelefono = NumeroTelefono1;
		FechaNacimiento = FechaNacimiento1;
	}
	
	public String printPasajero() {
		String mensaje = "Datos del Pasajero: \n";
		mensaje += "\nNombre: " + Nombre;
		mensaje += "\nCorreo: " + NumeroTelefono;
		mensaje += "\nNumero de Telefono: " + FechaNacimiento;
		mensaje += "\nCorreo: " + Correo;
		mensaje += "\n";
		
		return mensaje;
	}
	
	

}
