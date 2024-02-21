import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    
    public Ventana()
      {
      
      this.setSize(1000, 500);//darle un tamaño a la ventana
      this.setLocation(500, 500);//ubicacion en la pantalla
      this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
      this.setResizable(true);//no deja cambiar el tamaño de la ventana
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
      this.setMinimumSize(new Dimension(500,500));//tamaño minimo
      this.setMaximumSize(new Dimension(600,600));//tamaño maximo
      
      this.setLayout(null);//quitar molde
      
      this.iniciarComponentes();//iniciar los componentes
      this.setVisible(true);//permite que la ventana sea visible
      }
    
    public void iniciarComponentes()
    {
    	this.login();
    	JPanel registro = new JPanel();
        registro.setSize(this.getWidth()/2,this.getHeight());
        registro.setLocation(500,0);
        registro.setBackground(Color.green);
        registro.setLayout(null);//quitar molde
        
        JLabel regis_tag = new JLabel("REGISTRO",0);
        regis_tag.setSize(300, 80);
        regis_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
        regis_tag.setForeground(Color.white);//color a la letra
        regis_tag.setLocation(100,20);
        regis_tag.setOpaque(true);
        regis_tag.setBackground(Color.gray);
        registro.add(regis_tag);
        

        JLabel usr_tag = new JLabel("Nombre de usuario: ");
        usr_tag.setBounds(10, 120, 250, 40);
        usr_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_tag);
        

        JTextField usr_field = new JTextField();
        usr_field.setBounds(10, 150, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_field);
        
        JLabel bio_tag = new JLabel("bio");
        bio_tag.setBounds(10,200, 250, 40);
        bio_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_tag);
        
        JTextArea bio_area = new JTextArea();
        bio_area.setBounds(10, 240, 290, 100);
        bio_area.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_area);
        
        JLabel pre_tag = new JLabel("preferencias");
        pre_tag.setBounds(10,340, 250, 40);
        pre_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(pre_tag);
        
      //JCheckBox pre_combo = new JCheckBox("box");

      //pre_combo.setBounds(10,390, 250, 40);
      //pre_combo.setFont(new Font("Bell MT", Font.BOLD, 20));
      //pre_combo.add(pre_tag);
        
        String numer[]= {"1","2"};
        JComboBox num = new JComboBox(numer);
        num.setBounds(10, 380, 250, 40);
        registro.add(num);
        
        
        
        
        
        this.add(registro);
        
        
        
        
    }
    public void login(){
    	JPanel login = new JPanel();
        login.setSize(this.getWidth()/2,this.getHeight());
        login.setBackground(Color.red);
        login.setLayout(null);//quitamos el molde
        
        /* REGLAS GENERAELS
         * size
         * location
         * background = opaque
         * string constructor
         */
        
        JLabel login_tag = new JLabel("ACCEDER",0);
        login_tag.setSize(300, 80);
        login_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
        login_tag.setForeground(Color.white);//color a la letra
        login_tag.setLocation(100,20);
        login_tag.setOpaque(true);
        login_tag.setBackground(Color.gray);
        login.add(login_tag);
        
        //texto de nombre de usuario
        JLabel usr_tag = new JLabel("Nombre de usuario: ");
        usr_tag.setBounds(10, 120, 250, 40);
        usr_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(usr_tag);
        
        //caja de texto de usuarioi
        JTextField usr_field = new JTextField();
        usr_field.setBounds(10, 150, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(usr_field);
        
        //texto de contrasena
        JLabel pwd_tag = new JLabel("Contraseña: ");
        pwd_tag.setBounds(10, 200, 250, 40);
        pwd_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(pwd_tag);
        
        //Caja de texto contrasena
        JPasswordField pwd_field = new JPasswordField();
        pwd_field.setBounds(10, 230, 300, 40);
        pwd_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(pwd_field);
        
        //checkbox recordar contrasena
        JCheckBox remember = new JCheckBox ("Recordarme");
        remember.setBounds(10, 280, 150, 40);
        remember.setBackground(Color.red);
        login.add(remember);
        
        //texto olvido contrasena?
        JLabel forgot_tag = new JLabel("¿Olvidó la contraseña?");
        forgot_tag.setBounds(180, 280, 150, 40);
        login.add(forgot_tag);
        
        //boton aceptar
        JButton login_btn = new JButton("Acceder");
        login_btn.setBounds(100, 320, 100, 40);
        login.add(login_btn);

        
        
       
        this.add(login);
    }
    
    
    
    
    
}