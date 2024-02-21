import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    
    public Ventana()
      {
      this.setVisible(true);//permite que la ventana sea visible
      this.setSize(1000, 500);//darle un tamaño a la ventana
      this.setLocation(500, 500);//ubicacion en la pantalla
      this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
      this.setResizable(true);//no deja cambiar el tamaño de la ventana
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
      this.setMinimumSize(new Dimension(500,500));//tamaño minimo
      this.setMaximumSize(new Dimension(600,600));//tamaño maximo
      
      this.setLayout(null);//quitar molde
      
      this.iniciarComponentes();//iniciar los componentes
      }
    
    public void iniciarComponentes()
    {
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

        
        JPanel registro = new JPanel();
        registro.setSize(this.getWidth()/2,this.getHeight());
        registro.setLocation(500,0);
        registro.setBackground(Color.green);
       
        this.add(login);
        this.add(registro);
        
        
    }
    
}