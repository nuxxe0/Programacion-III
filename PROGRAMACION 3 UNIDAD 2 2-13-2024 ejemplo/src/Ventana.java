import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    
    public Ventana()
      {
      
      this.setSize(1000, 700);//darle un tamaño a la ventana
      this.setLocation(500, 500);//ubicacion en la pantalla
      this.setLocationRelativeTo(null);//centrar la ventana en la pantalla
      this.setResizable(true);//no deja cambiar el tamaño de la ventana
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar el programa por defecto
      this.setMinimumSize(new Dimension(500,500));//tamaño minimo
      this.setMaximumSize(new Dimension(800,600));//maño maximo
      
      this.setLayout(null);//quitar molde
      
      this.iniciarComponentes();//iniciar los componentes
      this.setVisible(true);//permite que la ventana sea visible
      }
    
    public void iniciarComponentes()
    {
    	this.login();
    	
    	//this.registro();
    
    	//this.admin();
    	
    	this.repaint();
    	this.validate();
        
        
        
    }
    public void login(){
    	JPanel login = new JPanel();
        login.setSize(this.getWidth()/2,this.getHeight());
        login.setBackground(Color.decode("#5F70DF"));
        login.setLayout(null);//quitamos el molde
        
        /* REGLAS GENERAELS
         * size
         * location
         * background = opaque
         * string constructor
         */
        
        
        
        JLabel login_tag = new JLabel("User Login",0);
        login_tag.setSize(300, 80);
        login_tag.setFont(new Font("Arial", Font.BOLD, 30));
        login_tag.setForeground(Color.white);//color a la letra
        login_tag.setLocation(100,20);
        //login_tag.setOpaque(true);
        //login_tag.setBackground(Color.gray);
        login.add(login_tag);
        
        //img
        //JLabel logo = new JLabel();
        //logo.setIcon(new ImageIcon(getClass().getResource("vaca2.png")));
        //logo.setBounds(100, 50, 256, 256);
        //login.add(logo);
        
        JLabel account_tag = new JLabel("My Account",0);
        account_tag.setSize(300, 80);
        account_tag.setFont(new Font("Arial", Font.BOLD, 35));
        account_tag.setForeground(Color.yellow);//color a la letra
        account_tag.setLocation(100,80);
        login.add(account_tag);
        
        //texto de nombre de usuario
        JLabel usr_tag = new JLabel("Enter your username");
        usr_tag.setBounds(100, 150, 230, 40);
        usr_tag.setFont(new Font("Arial", Font.BOLD, 18));
        usr_tag.setForeground(Color.white);
        login.add(usr_tag);
        
        //caja de texto de usuarioi
        JTextField usr_field = new JTextField();
        usr_field.setBounds(100, 190, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(usr_field);
        
        //imagen usuario
        JLabel logo_usuario = new JLabel();
        logo_usuario.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
        logo_usuario.setBounds(70, 200, 16, 16);
        login.add(logo_usuario);
        
        JLabel borde_usuario = new JLabel();
        borde_usuario.setBounds(63, 194, 30, 30);
        borde_usuario.setBackground(Color.decode("#E8D55F"));
        borde_usuario.setOpaque(true);
        login.add(borde_usuario);
        
        
        //texto de contrasena
        JLabel pwd_tag = new JLabel("Enter Your Password");
        pwd_tag.setBounds(100, 250, 250, 40);
        pwd_tag.setFont(new Font("Arial", Font.BOLD, 18));
        pwd_tag.setForeground(Color.white);
        login.add(pwd_tag);
        
        //Caja de texto contrasena
        JPasswordField pwd_field = new JPasswordField();
        pwd_field.setBounds(100, 290, 300, 40);
        pwd_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        login.add(pwd_field);
        
        
      //imagen contraseña
        JLabel logo_passw = new JLabel();
        logo_passw.setIcon(new ImageIcon(getClass().getResource("cerrar.png")));
        logo_passw.setBounds(70, 300, 16, 16);
        login.add(logo_passw);
        
        JLabel borde_passw = new JLabel();
        borde_passw.setBounds(63, 294, 30, 30);
        borde_passw.setBackground(Color.decode("#E8D55F"));
        borde_passw.setOpaque(true);
        login.add(borde_passw);
        
        
        /*
        //checkbox recordar contrasena
        //JCheckBox remember = new JCheckBox ("Recordarme");
        //remember.setBounds(10, 280, 150, 40);
        //remember.setBackground(Color.red);
        //login.add(remember);
         * 
         */
        
        
        //boton login
        JButton login_btn = new JButton("Login");
        login_btn.setBounds(180, 350, 140, 60);
        login_btn.setFont(new Font("Arial", Font.BOLD, 23));
        login_btn.setBackground(Color.decode("#E8D55F"));
        login.add(login_btn);
        
      //texto no  tiene contraseña?
        JLabel forgot_tag = new JLabel("Don´t have an account?");
        forgot_tag.setBounds(180, 430, 150, 40);
        forgot_tag.setFont(new Font("Arial", Font.BOLD, 12));
        forgot_tag.setForeground(Color.white);
        login.add(forgot_tag);
        
      //boton sing up
        JButton sing_btn = new JButton("Sing up");
        sing_btn.setBounds(210, 470, 80, 30);
        sing_btn.setFont(new Font("Arial", Font.BOLD, 12));
        sing_btn.setBackground(Color.decode("#E8D55F"));
        login.add(sing_btn);
        
        
        
        JLabel fondo_insano = new JLabel("");
        fondo_insano.setSize(430, 340);
        fondo_insano.setBackground(Color.decode("#515FBA"));
        fondo_insano.setLocation(30, 90);
        fondo_insano.setOpaque(true);
        login.add(fondo_insano);

       
        
       
        this.add(login);
    }
    
    public void registro() {
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
        

        //texto usuario
        JLabel usr_tag = new JLabel("Nombre de usuario: ");
        usr_tag.setBounds(10, 120, 250, 40);
        usr_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_tag);
        

        //caja de texto usuario
        JTextField usr_field = new JTextField();
        usr_field.setBounds(10, 150, 300, 40);
        usr_field.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(usr_field);
        
        //texto bio
        JLabel bio_tag = new JLabel("bio");
        bio_tag.setBounds(10,200, 250, 40);
        bio_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_tag);
        
        
        //caja de texto text area bio
        JTextArea bio_area = new JTextArea();
        bio_area.setBounds(10, 240, 290, 100);
        bio_area.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(bio_area);
        
        //texto preferencia
        JLabel pre_tag = new JLabel("preferencias");
        pre_tag.setBounds(10,340, 250, 40);
        pre_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(pre_tag);
        
        //checkbox 1
        JCheckBox itemBox1 = new JCheckBox("Papas");
        itemBox1.setBounds(10, 380, 100, 40);
        itemBox1.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox1.setOpaque(false);
        registro.add(itemBox1);
        
        //checkbox 2
        JCheckBox itemBox2 = new JCheckBox("Dulces");
        itemBox2.setBounds(110, 380, 100, 40);
        itemBox2.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox2.setOpaque(false);
        registro.add(itemBox2);
        
        //checkbox 3
        JCheckBox itemBox3 = new JCheckBox("Papas");
        itemBox3.setBounds(220, 380, 100, 40);
        itemBox3.setFont(new Font("Bell MT", Font.BOLD, 20));
        itemBox3.setOpaque(false);
        registro.add(itemBox3);
        
        //texto terminos
        JLabel term_tag = new JLabel("Terminos");
        term_tag.setBounds(10, 420, 100, 40);
        term_tag.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(term_tag);

        //radioButtom si Acepto terminos 
        JRadioButton siAceptRadio = new JRadioButton ("Acepto terminos");
        siAceptRadio.setBounds(10, 460, 180, 40);
        siAceptRadio.setFont(new Font("Bell MT", Font.BOLD, 20));
        siAceptRadio.setOpaque(false);
        registro.add(siAceptRadio);
        
        //radioButtom no Acepto terminos 
        JRadioButton noAceptRadio = new JRadioButton ("No acepto terminos");
        noAceptRadio.setBounds(200, 460, 200, 40);
        noAceptRadio.setFont(new Font("Bell MT", Font.BOLD, 20));
        noAceptRadio.setOpaque(false);
        registro.add(noAceptRadio);
        
        //juntar los radiobutton de terminos
        ButtonGroup term = new ButtonGroup();
        term.add(siAceptRadio);
        term.add(noAceptRadio);
        
        
	    String colonias[]= {"Centro","Camino real","Conchalito", "Ayuntamiento"};
	    
	    JComboBox locations = new JComboBox(colonias);
        locations.setBounds(10, 500, 300, 40);
        locations.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(locations);
	      
	    JButton registroButton = new JButton("Crear cuenta");
	    registroButton.setBounds(10, 550, 150, 40);
	    registroButton.setFont(new Font("Bell MT", Font.BOLD, 20));
        registro.add(registroButton);
	      
        
        
        this.add(registro);
    }
    
    public void admin() {
    	
    	//añadir panel
    	JPanel admin_panel = new JPanel();
    	admin_panel.setSize(this.getWidth(),this.getHeight());
    	admin_panel.setLocation(0,0);
    	admin_panel.setBackground(Color.decode("#57FFD4"));
    	admin_panel.setLayout(null);//quitar molde
    	
    	//añadir un menu
    	JMenuBar barra = new JMenuBar();
    	JMenu menu_file = new JMenu("Archivo");
    	JMenuItem open_item = new JMenuItem("Abrir archivo ...");
    	JMenuItem crate_item = new JMenuItem("Crear archivo ...");
    	
    	barra.add(menu_file);
    	menu_file.add(open_item);
    	menu_file.add(crate_item);
    	
    	
    	//contendio del panel
        JLabel users_tag = new JLabel("Usuarios",0);
        users_tag.setSize(300, 80);
        users_tag.setFont(new Font("Bell MT", Font.BOLD, 24));
        users_tag.setForeground(Color.white);//color a la letra
        users_tag.setLocation(350,20);
        users_tag.setOpaque(true);
        users_tag.setBackground(Color.gray);
        admin_panel.add(users_tag);
        
        
        JLabel title_widget = new JLabel("Total de usuarios",0);
        title_widget.setFont(new Font("Bell MT", Font.BOLD, 24));
        title_widget.setBounds(40,120,300,40);
        title_widget.setForeground(Color.white);
        admin_panel.add(title_widget);
        
        JLabel num_widget = new JLabel("100",0);
        num_widget.setFont(new Font("Bell MT", Font.BOLD, 24));
        num_widget.setBounds(40,160,300,40);
        num_widget.setForeground(Color.white);
        admin_panel.add(num_widget);
        
        JLabel widget = new JLabel("");
        widget.setBounds(40, 120, 300, 100);  
        widget.setOpaque(true);
        widget.setBackground(Color.gray);
        admin_panel.add(widget);
        
        
        //botones
        JButton donwload = new JButton("Exportar");
        donwload.setFont(new Font("Bell MT", Font.BOLD, 15));
        donwload.setBounds(720, 230, 100, 30);  
        admin_panel.add(donwload);
        
        JButton add_user = new JButton("Añadir");
        add_user.setFont(new Font("Bell MT", Font.BOLD, 15));
        add_user.setBounds(840, 230, 100, 30);  
        admin_panel.add(add_user);
        
        ///////////////////tabla imaginaria
        //JLabel tabla = new JLabel("");
        //tabla.setBounds(40, 280, 900, 300);
        //tabla.setOpaque(true);
        //tabla.setBackground(Color.gray);
        //admin_panel.add(tabla);
        
        String tabla_titles [] = {"no. control" , 
        					"nombre" , 
        					"apellidos" , 
        					"semestre" , 
        					"promedio"};
        
        String table_data [][]= {{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,	
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	,
        						{"no. control" , "nombre" , "apellidos" , "semestre" , "promedio"}	 		};
        
        JTable table_users = new JTable(table_data,tabla_titles);
        JScrollPane table_scroll = new JScrollPane(table_users);
        table_scroll.setBounds(40, 280, 900, 300);
        
        admin_panel.add(table_scroll);
    	
    	//para añadir el menu a la ventana 
    	this.setJMenuBar(barra);
    
    	//añadir una tabla
    	
    	this.add(admin_panel);
    	
    }
    
    
}