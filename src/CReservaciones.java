public class CReservaciones extends CPasajero {

	private String ID = "";
	private String Vuelos = "";
	private String Asiento = "";
	private String Pago = "";
	
	
	
	public CReservaciones() {
		CVuelos obj=new CVuelos();
		CMapaAsientos asiento= new CMapaAsientos(); 
		
		ID = "16346244";
		Vuelos = obj.printVuelos();
		Asiento = asiento.setAsiento("33A");
		Pago = "True";
	}
	
	public String printReservacion() {
		
		String datos = "Datos de su reservación: \n" + printPasajero() + "\n" ;
		
		datos += "\n" + Vuelos;
		datos += "\n Asiento: " + Asiento;
		datos += "\n Pago: " + Pago;
		
		return datos;
		
		
	}

}
