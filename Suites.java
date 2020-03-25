package accomodate;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Suites {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Suite() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suites window = new Suites();
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
	public Suites() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 300, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(20, 11, 764, 64);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUITE ROOM VIEW");
		lblNewLabel.setBounds(167, 11, 332, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(20, 75, 764, 575);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSuite = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/Kitchen.jpg")).getImage();
		lblSuite.setIcon(new ImageIcon(image));
		lblSuite.setBounds(504, 60, 250, 215);
		panel_1.add(lblSuite);
		
		JLabel lblSuite1 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/Suite3.jpg")).getImage();
		lblSuite1.setIcon(new ImageIcon(image1));
		lblSuite1.setBounds(10, 315, 384, 249);
		panel_1.add(lblSuite1);
		
		JLabel lblSuite2 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/Suite1.jpeg")).getImage();
		lblSuite2.setIcon(new ImageIcon(image2));
		lblSuite2.setBounds(10, 0, 493, 311);
		panel_1.add(lblSuite2);
		
		JLabel lblSuite3 = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/Suite.jpg")).getImage();
		lblSuite3.setIcon(new ImageIcon(image3));
		lblSuite3.setBounds(434, 315, 320, 249);
		panel_1.add(lblSuite3);
	}
}
