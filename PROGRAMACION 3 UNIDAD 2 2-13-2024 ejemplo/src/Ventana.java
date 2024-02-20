import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	public Ventana()
	  {
	  this.setVisible(true);//permite que la ventana sea visible
	  this.setSize(1000, 500);//darle un tamaño a la ventana
	  this.setLocation(500, 500);//ubicacion en la pantalla
	  this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
	  this.setResizable(true);//no deja cambiar el tamaño de la ventana
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
	  this.setMinimumSize(new Dimension(250,250));//tamaño minimo
	  this.setMaximumSize(new Dimension(250,250));//tamaño maximo
	  
	  this.setLayout(null);//quitar molde
	  
	  this.iniciarComponentes();//iniciar los componentes
	  }
	
	public void iniciarComponentes()
	{
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2,this.getHeight());
		login.setBackground(Color.red);
		login.setLayout(null);//quitamos el molde
		
		//REGLAS GENERAELS
		//size
		//location
		//background = opaque
		//string constructor
		JLabel login_tag = new JLabel("ACCEDER",0);
		login_tag.setSize(300, 80);
		login_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
		login_tag.setForeground(Color.white);//color a la letra
		login_tag.setLocation(100,20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.gray);
		login.add(login_tag);
		
		
		JLabel usr_tag = new JLabel("Nombre de usuario: ");
		usr_tag.setBounds(10, 120, 200, 40);
		login.add(usr_tag);

		usr_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2,this.getHeight());
		registro.setLocation(500,0);
		registro.setBackground(Color.green);
		
		this.add(login);
		//this.add(registro);
		
		
	}
	
}
