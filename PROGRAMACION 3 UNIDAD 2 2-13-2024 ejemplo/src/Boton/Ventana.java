package Boton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends JFrame implements MouseListener, KeyListener{

	JPanel btn_panel = new JPanel();
	public Ventana() {

	    this.setVisible(true);
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setMinimumSize(new Dimension(500,500));
		this.setMaximumSize(new Dimension(800,600));

		this.setLocationRelativeTo(null);
	    this.setLayout(null);
	    addMouseListener(this);
	    addKeyListener(this);
	    this.iniciarComponentes();
	}
	
	
	public void iniciarComponentes()
    {
    	this.botones();
    	this.repaint();
    	this.validate();
        
    }
	
	 public void botones () {

	    	btn_panel.setSize(this.getWidth(),this.getHeight());
	    	btn_panel.setLocation(0,0);
	    	btn_panel.setBackground(Color.decode("#57FFD4"));
	    	btn_panel.setLayout(null);//quitar molde
	    	this.add(btn_panel);
	    	
		    JButton superButton = new JButton("Crear cuenta");
		    superButton.setBounds(150, 550, 200, 40);
		    superButton.setFont(new Font("Bell MT", Font.BOLD, 20));
		    btn_panel.add(superButton);
		    superButton.addActionListener(new ActionListener() 
		    {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//cordenadas y tamaño para el boton de manera random
					
					int x = (int)Math.floor(Math.random()*450+1);
					int y = (int)Math.floor(Math.random()*650+1);
					int w = (int)Math.floor(Math.random()*120+1);
					int h = (int)Math.floor(Math.random()*120+1);

					//color aleatorio para el boton
					Random rand = new Random();
					float r = rand.nextFloat();
					float g = rand.nextFloat();
					float b = rand.nextFloat();
					Color randomColor = new Color(r, g, b);
					
					//se genera un boton random
					JButton otroBotton = new JButton(r+","+g+","+b);
					otroBotton.setBounds(x,y,w,h);
					otroBotton.setOpaque(true);
					otroBotton.setBorder(BorderFactory.createLineBorder(randomColor,5));
					
					//al presionar el boton aparece el texto que tiene dentro
					otroBotton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							//eliminar los botones que hayan aparecido presionando el boton que aparece botonoes random
							JButton yo = ((JButton)e.getSource());
							btn_panel.remove(yo);
							getContentPane().repaint();
							//JOptionPane.showMessageDialog(null, otroBotton.getText());	
						}
					});
					//repintar uwu

					btn_panel.add(otroBotton);
					getContentPane().repaint();
	                getContentPane().revalidate();
					}
				
		    });

	
	 }


	 //KEY LISTENER
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se presiono: " + e.getKeyChar());
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//el 8 es el codigo de la tecla borrar
		if(e.getKeyCode() == 8) {
			btn_panel.removeAll();
			getContentPane().repaint();
			
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}


	//MOUSE LISTENER//////////////////////////////////////////
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("se presiono uwu");
		//se ombienen la cordenada del mouse al presionar
		int x=e.getX()-10;
	    int y=e.getY()-25;
		int w = (int)Math.floor(Math.random()*120+1);
		int h = (int)Math.floor(Math.random()*120+1);

		//color aleatorio para el boton
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		Color randomColor = new Color(r, g, b);
		
		//se genera un boton random
		JButton otroBotton = new JButton(r+","+g+","+b);
		otroBotton.setBounds(x,y,w,h);
		otroBotton.setOpaque(true);
		otroBotton.setBorder(BorderFactory.createLineBorder(randomColor,5));
		btn_panel.add(otroBotton);
		
		//al presionar el boton aparece el texto que tiene dentro
		otroBotton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(null, otroBotton.getText());	
			}
		});
		//repintar uwu
		getContentPane().repaint();
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, g, b);
		
		btn_panel.setBackground(randomColor);
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	 
}