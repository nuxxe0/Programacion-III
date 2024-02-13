import javax.swing.JFrame;

/*
 * Heriberto Ismael Ramirez Aguilar
 * 13 de Febrero de 2024
 * Actividad 4 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		
		JFrame ventana = new JFrame("Example");
		ventana.setVisible(true);
		ventana.setSize(500, 500);
		ventana.setLocation(900, 500);
		
		//ventana.setLocationRelativeTo(null);
		
		ventana.setResizable(false);//no deja cambiar el tamaño de la ventana
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
