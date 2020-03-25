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

public class Cottage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void Cotttages() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cottage window = new Cottage();
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
	public Cottage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 300, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 82, 764, 568);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCottage = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/Cottage2.jpg")).getImage();
		lblCottage.setIcon(new ImageIcon(image));
		lblCottage.setBounds(15, 11, 739, 546);
		panel.add(lblCottage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 0, 764, 80);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COTTAGE VIEW");
		lblNewLabel.setBounds(192, 11, 453, 37);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		
		
	}
}
