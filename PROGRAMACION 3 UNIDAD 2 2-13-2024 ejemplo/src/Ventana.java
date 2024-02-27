import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana()
	{
					//x     y
		this.setSize(310, 470);//tamaño a la ventana 
		this.setLocationRelativeTo(null);//centrar en la pantalla al abrir
		this.setResizable(false);//no deja cambiar el tamaño de la ventana
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa al cerrar la ventana
		
		this.setLayout(null);//quitar molde
		
		this.iniciarComponentes();
		
		this.setVisible(true);//lo hace visible
		
	}
	
	public void iniciarComponentes()
	{
		this.calculadora();
		this.repaint();
		this.validate();
	}
	
	public void calculadora()
	{
		JPanel calculadora = new JPanel();
		calculadora.setSize(this.getWidth(), this.getHeight());
		calculadora.setBackground(Color.decode("#696969"));
		calculadora.setLayout(null);
		
		//pantalla de la calculadora 
		JLabel tag_texto = new JLabel("0  ",4);
		//					x	y  ancho largo
		tag_texto.setBounds(10, 10, 270, 50);
		tag_texto.setOpaque(true);//el contorno del jlabel de hace visible
		tag_texto.setFont(new Font("Arial", Font.BOLD, 40));//tipo de la letra
		tag_texto.setForeground(Color.black);//color de la letra
		tag_texto.setBackground(Color.white);
		calculadora.add(tag_texto);
		
		//se pondran los botnes de arriba hacia abajo de izquierda a derecha
		
		//Primera fila de botones
		//boton AC
		JButton btn_1 = new JButton("AC");
		btn_1.setFont(new Font("Arial", Font.BOLD, 18));
		btn_1.setBounds(10, 70, 60, 60);
		calculadora.add(btn_1);
		
		//boton <I
		JButton btn_2 = new JButton("<I");
		btn_2.setFont(new Font("Arial", Font.BOLD, 18));
		btn_2.setBounds(80, 70, 60, 60);
		calculadora.add(btn_2);

		//boton +/-
		JButton btn_3 = new JButton("+/-");
		btn_3.setFont(new Font("Arial", Font.BOLD, 18));
		btn_3.setBounds(150, 70, 60, 60);
		calculadora.add(btn_3);
		
		//boton /
		JButton btn_4 = new JButton("/");
		btn_4.setFont(new Font("Arial", Font.BOLD, 18));
		btn_4.setBounds(220, 70, 60, 60);
		calculadora.add(btn_4);

		
		//Segunda fila de botones
		//boton 7
		JButton btn_5 = new JButton("7");
		btn_5.setFont(new Font("Arial", Font.BOLD, 18));
		btn_5.setBounds(10, 140, 60, 60);
		calculadora.add(btn_5);
		
		//boton 8
		JButton btn_6 = new JButton("8");
		btn_6.setFont(new Font("Arial", Font.BOLD, 18));
		btn_6.setBounds(80, 140, 60, 60);
		calculadora.add(btn_6);

		//boton 9
		JButton btn_7 = new JButton("9");
		btn_7.setFont(new Font("Arial", Font.BOLD, 18));
		btn_7.setBounds(150, 140, 60, 60);
		calculadora.add(btn_7);
		
		//boton x
		JButton btn_8 = new JButton("x");
		btn_8.setFont(new Font("Arial", Font.BOLD, 18));
		btn_8.setBounds(220, 140, 60, 60);
		calculadora.add(btn_8);
		
		
		//Tercer fila de botones
		//boton 4
		JButton btn_9 = new JButton("4");
		btn_9.setFont(new Font("Arial", Font.BOLD, 18));
		btn_9.setBounds(10, 210, 60, 60);
		calculadora.add(btn_9);
		
		//boton 5
		JButton btn_10 = new JButton("5");
		btn_10.setFont(new Font("Arial", Font.BOLD, 18));
		btn_10.setBounds(80, 210, 60, 60);
		calculadora.add(btn_10);

		//boton 6
		JButton btn_11 = new JButton("6");
		btn_11.setFont(new Font("Arial", Font.BOLD, 18));
		btn_11.setBounds(150, 210, 60, 60);
		calculadora.add(btn_11);
		
		//boton -
		JButton btn_12 = new JButton("-");
		btn_12.setFont(new Font("Arial", Font.BOLD, 18));
		btn_12.setBounds(220, 210, 60, 60);
		calculadora.add(btn_12);			
		
		
		//Cuarta fila de botones
		//boton 1
		JButton btn_13 = new JButton("1");
		btn_13.setFont(new Font("Arial", Font.BOLD, 18));
		btn_13.setBounds(10, 280, 60, 60);
		calculadora.add(btn_13);
		
		//boton 2
		JButton btn_14 = new JButton("2");
		btn_14.setFont(new Font("Arial", Font.BOLD, 18));
		btn_14.setBounds(80, 280, 60, 60);
		calculadora.add(btn_14);

		//boton 3
		JButton btn_15 = new JButton("3");
		btn_15.setFont(new Font("Arial", Font.BOLD, 18));
		btn_15.setBounds(150, 280, 60, 60);
		calculadora.add(btn_15);
		
		//boton +
		JButton btn_16 = new JButton("+");
		btn_16.setFont(new Font("Arial", Font.BOLD, 18));
		btn_16.setBounds(220, 280, 60, 60);
		calculadora.add(btn_16);	
		
		
		//Quinta fila de botones
		//boton %
		JButton btn_17 = new JButton("%");
		btn_17.setFont(new Font("Arial", Font.BOLD, 18));
		btn_17.setBounds(10, 350, 60, 60);
		calculadora.add(btn_17);
		
		//boton 0
		JButton btn_18 = new JButton("0");
		btn_18.setFont(new Font("Arial", Font.BOLD, 18));
		btn_18.setBounds(80, 350, 60, 60);
		calculadora.add(btn_18);

		//boton .
		JButton btn_19 = new JButton(".");
		btn_19.setFont(new Font("Arial", Font.BOLD, 18));
		btn_19.setBounds(150, 350, 60, 60);
		calculadora.add(btn_19);
		
		//boton =
		JButton btn_20 = new JButton("=");
		btn_20.setFont(new Font("Arial", Font.BOLD, 18));
		btn_20.setBounds(220, 350, 60, 60);
		calculadora.add(btn_20);
		
		
		this.add(calculadora);
		
		
	}
}
