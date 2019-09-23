import javax.swing.JOptionPane;


public class CTicket {

	public CTicket() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CReservaciones reservacion = new CReservaciones();
		JOptionPane.showMessageDialog(null,  reservacion.printReservacion());
		

	}

}
