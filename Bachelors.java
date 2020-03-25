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
import java.awt.SystemColor;

public class Bachelors {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Bachelor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bachelors window = new Bachelors();
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
	public Bachelors() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 300, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 75, 764, 575);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBachelor1 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/Bachelor1.jpg")).getImage();
		lblBachelor1.setIcon(new ImageIcon(image));
		lblBachelor1.setBounds(0, 11, 414, 300);
		panel.add(lblBachelor1);
		
		JLabel lblBachelor2 = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/Bachelor4.jpg")).getImage();
		lblBachelor2.setIcon(new ImageIcon(image1));
		lblBachelor2.setBounds(411, 11, 343, 306);
		panel.add(lblBachelor2);
		
		JLabel lblBAchelor3 = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("/Cottage3.jpg")).getImage();
		lblBAchelor3.setIcon(new ImageIcon(image2));
		lblBAchelor3.setBounds(10, 317, 404, 247);
		panel.add(lblBAchelor3);
		
		JLabel lblCottage = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("/Cottage.jpg")).getImage();
		lblCottage.setIcon(new ImageIcon(image3));
		lblCottage.setBounds(428, 317, 326, 247);
		panel.add(lblCottage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 11, 764, 64);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BACHELOR ROOM VIEW");
		lblNewLabel.setBounds(158, 11, 484, 37);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
	}

}
