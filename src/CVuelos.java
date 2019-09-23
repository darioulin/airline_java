
public class CVuelos {

	private String ID = "";
	private String Fecha = "";
	private String LugarSalida = "";
	private String LugarDestino = "";
	private String HoraSalida = "";
	private String HoraLlegada = "";
	private Double Costo = 0.00;
	
	public CVuelos() {
		ID = "q3e421et56";
		Fecha = "26/10/19";
		LugarSalida = "Villahermosa";
		LugarDestino = "Chetumal";
		HoraSalida = "20:00";
		HoraLlegada = "4:30";
		Costo = 444.00;
	}
	
	public String printVuelos() {
		String datos = "Datos del vuelo \n";
		datos += "\n Fecha: " + Fecha;
		datos += "\n LugarSalida: " + LugarSalida;
		datos += "\n LugarDestino: " + LugarDestino;
		datos += "\n HoraSalida: " + HoraSalida;
		datos += "\n HoraLlegada: " + HoraLlegada;
		datos += "\n Costo: " + Costo;
		return datos;
	}

	
}
