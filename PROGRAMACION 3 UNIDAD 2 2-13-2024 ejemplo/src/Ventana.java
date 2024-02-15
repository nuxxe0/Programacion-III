import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	public Ventana()
	  {
	  this.setVisible(true);//permite que la ventana sea visible
	  this.setSize(500, 500);//darle un tamaño a la ventana
	  this.setLocation(500, 500);//ubicacion en la pantalla
		
	  this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
		
	  this.setResizable(true);//no deja cambiar el tamaño de la ventana
		
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
		
	  this.setMinimumSize(new Dimension(250,250));//tamaño minimo
	  this.setMaximumSize(new Dimension(250,250));//tamaño maximo
	  
	  this.iniciarComponentes();//iniciar los componentes
	  }
	
	public void iniciarComponentes()
	{
		JPanel login = new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.red);
		
		this.add(login);
		
		
		
	}
	
}
