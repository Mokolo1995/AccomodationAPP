package accomodate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class Home   extends javax.swing.JDialog{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public void setVisible() {
	Home window1 = new Home();
	window1.frame.setVisible(true);

}
	/**
	 * Create the application.
	 */
	public Home() {
		super();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("HomePage");
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 300, 850, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		CenteredFrame(frame);
		
		JLabel lblNewLabel = new JLabel("ACCOMODATION FACILITIES");
		lblNewLabel.setBounds(85, 11, 739, 80);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		
		JLabel lblNewLabel_2 = new JLabel("CLICK ON  \"PROCEED\" TO LOGIN INTO THE SYSTEM     :");
		lblNewLabel_2.setBounds(33, 130, 729, 80);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		
		JButton btnNewButton = new JButton("PROCEED...");
		btnNewButton.setBounds(10, 407, 306, 93);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.Loginn();
				frame.dispose();
				
			}
		});
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
	}
	 public void CenteredFrame(javax.swing.JFrame objFrame){
	        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
	        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
	        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
	        objFrame.setLocation(iCoordX, iCoordY); 
	    } 
}
