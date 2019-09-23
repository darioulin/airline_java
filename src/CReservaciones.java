
public class CReservaciones extends CPasajero {

	private String ID = "";
	private String Vuelos = "";
	private Double Costo = 0.00;
	private String Fecha = "";
	private String Pago = "";
	
	public CReservaciones() {
		ID = "16346244";
		Vuelos = "VSA-CHE";
		Costo = 444.00;
		Fecha = "26/10/19";
		Pago = "True";
	}
	
	public String printReservacion() {
		
		String datos = printPasajero() + '\n';
		datos += "\nId: " + ID;
		datos += "\n Vuelo: " + Vuelos;
		datos += "\n Costo: " + Costo;
		datos += "\n Fecha: " + Fecha;
		datos += "\n Pago: " + Pago;
		
		return datos;
		
		
	}

}
