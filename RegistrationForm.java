package accomodate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import accomodate.DB_Helper.Controller;
import accomodate.Database.CRUDimplementation;
import accomodate.Model.User;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationForm extends javax.swing.JFrame {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtSurName;
	private JTextField txtIdNo;
	private JTextField txtPhone;
	private JTextField txtUsername;
	private JTextField txtPasword;
	private final Controller controller;
	// private final UserInteracation listener;
	Login log;

	/**
	 * Launch the application.
	 */

	public void register() {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm(controller);
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
	public RegistrationForm(Controller controller) {
		this.controller = controller;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.getParent();
		frame.setLocationRelativeTo(frame);
		frame.setTitle("RegisterForm");
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 300, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		CenteredFrame(frame);

		JLabel lblNewLabel = new JLabel("Create Account Below");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(122, 11, 556, 57);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBounds(529, 529, 124, 51);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				resetAllFields();
			}
		});
		btnNewButton_1.setBackground(new Color(238, 232, 170));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));

		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBounds(252, 529, 135, 51);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (SignUpValid()) {
					User user = new User();
					user.setTxtFirstName(txtFirstName.getText());
					user.setTxtSurName(txtSurName.getText());
					user.setTxtIdNo(txtIdNo.getText());
					user.setTxtPhone(txtPhone.getText());
					user.setTxtUsername(txtUsername.getText());
					user.setTxtPasword(txtPasword.getText());

					Login login = new Login();
					login.Loginn();
					frame.dispose();

					if (controller.signUp(user)) {
						// dispose();
					} else {
						JOptionPane.showMessageDialog(null, "SORRY, YOU HAVE ALREADY REGISTERED",
								"PLEASE VERIFY IF YOUR CREDENTIALS ARE CORRECT", JOptionPane.WARNING_MESSAGE);
					}
				}

				else {
					JOptionPane.showMessageDialog(null, "USERNAME & PASSWORD ARE MANDATORY",
							"PLEASE VERIFY IF YOUR CREDENTIALS ARE CORRECT", JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));

		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.setBounds(20, 599, 124, 51);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Login login1 = new Login();
				login1.Loginn();
				frame.dispose();

			}
		});
		btnNewButton_2.setBackground(new Color(240, 128, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		JLabel lblNewLabel_6 = new JLabel("PASSWORD  :");
		lblNewLabel_6.setBounds(65, 461, 144, 42);
		frame.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		txtPasword = new JTextField();
		txtPasword.setBounds(252, 465, 401, 43);
		frame.getContentPane().add(txtPasword);
		txtPasword.setColumns(10);

		txtUsername = new JTextField();
		txtUsername.setBounds(251, 392, 401, 42);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("USERNAME   :");
		lblNewLabel_5.setBounds(65, 386, 144, 46);
		frame.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		txtPhone = new JTextField();
		txtPhone.setBounds(252, 326, 401, 42);
		frame.getContentPane().add(txtPhone);
		txtPhone.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("PHONE NO     :");
		lblNewLabel_4.setBounds(56, 325, 153, 36);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		txtIdNo = new JTextField();
		txtIdNo.setBounds(252, 254, 401, 42);
		frame.getContentPane().add(txtIdNo);
		txtIdNo.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("IDENTITY NO  :");
		lblNewLabel_3.setBounds(46, 252, 164, 39);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		txtSurName = new JTextField();
		txtSurName.setBounds(251, 181, 402, 42);
		frame.getContentPane().add(txtSurName);
		txtSurName.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("SURNAME     : ");
		lblNewLabel_2.setBounds(65, 184, 153, 28);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));

		txtFirstName = new JTextField();
		txtFirstName.setBounds(252, 119, 402, 36);
		frame.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("FIRST NAME  :");
		lblNewLabel_1.setBounds(65, 119, 159, 28);
		frame.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	}

	private void resetAllFields() {

		this.txtFirstName.setText(null);
		this.txtSurName.setText(null);
		this.txtIdNo.setText(null);
		this.txtPhone.setText(null);
		this.txtUsername.setText(null);
		this.txtPasword.setText(null);
	}

	private boolean SignUpValid() {

		return !this.txtUsername.getText().isEmpty();
	}
	 public void CenteredFrame(javax.swing.JFrame objFrame){
	        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
	        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
	        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
	        objFrame.setLocation(iCoordX, iCoordY); 
	    } 

}
