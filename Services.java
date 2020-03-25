package accomodate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Services {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Service() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Services window = new Services();
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
	public Services() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//frame.setVisible(true);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setTitle("TYPES OF ACCOMODATIONS");
		frame.setBounds(100, 300, 900, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(371, 181, 503, 155);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DETAILS :  1 BEDROOM , KITCHEN , BATHROOM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(20, 11, 364, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Location : GAUTENG");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 60, 292, 39);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("PRICES : R3000 - R4000");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(20, 110, 238, 34);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(371, 347, 503, 148);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("DETAILS  : 1 BEDROOM , KITCHEN , BATHROOM , SITTING ROOM");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(20, 11, 420, 36);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("LOCATION  :  GAUTENG  ( JOHANNESBURG , PRETORIA )");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(20, 63, 420, 36);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("PRICES : R400-R5000");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_8.setBounds(20, 101, 186, 36);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(371, 506, 503, 144);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("DETAILS : 1 BEDROOM , BATHROOM");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(10, 11, 284, 43);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("LOCATION  : GAUTENG ( JOHANNESBURG , PRETORIA )");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(10, 54, 367, 36);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("PRICES : R1500 - R2500");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(10, 108, 204, 25);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1 = new JLabel("CLICK TO VIEW THE ACCOMODATION OF YOUR CHOICE BELOW");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(39, 95, 514, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("COTTAGES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cottage cottage = new Cottage();
				cottage.Cotttages();
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(39, 208, 232, 95);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACHELOR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bachelors bachelor = new Bachelors();
				bachelor.Bachelor();
				
			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setForeground(SystemColor.desktop);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(39, 376, 232, 95);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SUITES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Suites suit = new Suites();
				suit.Suite();
				
			}
		});
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setForeground(SystemColor.desktop);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(39, 535, 232, 104);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("DESCRIPTION :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(477, 143, 190, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TYPE OF PLACE :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_3.setBounds(39, 143, 179, 54);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(10, 11, 864, 76);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTypeOfAcommodations = new JLabel("TYPE OF ACOMMODATIONS PROVIDED");
		lblTypeOfAcommodations.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblTypeOfAcommodations.setBounds(84, 11, 678, 40);
		panel_3.add(lblTypeOfAcommodations);
	}
}
