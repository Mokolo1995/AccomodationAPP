package accomodate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import accomodate.Home;

import accomodate.DB_Helper.Controller;
import accomodate.Database.CRUDimplementation;
import accomodate.Model.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private  Controller controller;
	private  CRUDimplementation crud ;
	//private static Home home;
	
	/**
	 * Launch the application.
	 */
	public void Loginn() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		
		initialize();
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		this.controller=Controller.getController();
		
		frame.setTitle("Login");
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 300, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		CenteredFrame(frame);
		
		
		JLabel lblNewLabel = new JLabel("Accomodation Online");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(202, 0, 450, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("BACK!!");
		btnNewButton_1.setBounds(10, 591, 145, 59);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Home back = new Home();
				back.setVisible();
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(634, 500, 227, 79);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrationForm Reg = new RegistrationForm(controller);
				Reg.register();
				frame.dispose();
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(240, 230, 140));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_4 = new JLabel("If New User , Click On Register To Create New Account   :");
		lblNewLabel_4.setBounds(41, 497, 583, 60);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(532, 386, 120, 50);
		frame.getContentPane().add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBackground(new Color(240, 230, 140));
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(290, 386, 120, 50);
		frame.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User user =controller.Login(txtUsername.getText(), txtPassword.getText());
				if(user!=null) 
				{
					System.out.println("Logged In Successfully!");
					controller.updateUser(user);
					//Services serve = new Services();
					//serve.Service();
					//frame.dispose();
					//dispose();
					AddRooms add = new AddRooms(controller);
					add.UploadRoom();
					frame.dispose();
					
				}
				else 
				{
					//System.out.println("Authentication Denied!");
					JOptionPane.showMessageDialog(null, "AUTHENTICATION DENIED,PLEASE INPUT CORRECCT USERNAME & PASSWORD");
				}
			}
		});
		btnLogin.setBackground(new Color(240, 230, 140));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		txtUsername = new JTextField();
		txtUsername.setBounds(290, 218, 362, 44);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(290, 312, 362, 44);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Login Credentials Below   :");
		lblNewLabel_3.setBounds(134, 101, 459, 60);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME  * :");
		lblNewLabel_1.setBounds(134, 219, 134, 37);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD  * :");
		lblNewLabel_2.setBounds(134, 314, 134, 34);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	}
	public boolean signUp(User user) {
	
		return this.controller.signUp(user);
	}
	 public void CenteredFrame(javax.swing.JFrame objFrame){
	        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
	        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
	        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
	        objFrame.setLocation(iCoordX, iCoordY); 
	    } 
}
