package accomodate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import accomodate.DB_Helper.Controller;
import accomodate.Model.Rooms;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.awt.event.ActionEvent;

public class AddRooms extends JFrame {

	private JPanel contentPane;
	private JLabel lblimage;
	private JFrame frame;
	
	
	private JTextField textPrice;
	private JTextField txtLocation;
	private JTextField textType;
	private final Controller controller;
	String s;
	private JTextField textDescription;

	/**
	 * Launch the application.
	 */
	public void UploadRoom() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRooms frame = new AddRooms(controller);
					frame.setVisible(true);
					CenteredFrame(frame);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public  AddRooms(Controller controller ) 
	{
		this.controller = controller;
		
		initialize();
	}

	/**
	 * Create the frame.
	 * @param controller 
	 */
	public  void initialize() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 300, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//CenteredFrame(contentPane);
		
		JLabel lblNewLabel = new JLabel("UPDATE ROOM DETAILS");
		lblNewLabel.setBounds(202, 11, 388, 50);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(747, 465, 115, 50);
		contentPane.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetAllFields();
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnAdd = new JButton("ADD ROOM");
		btnAdd.setBounds(542, 465, 137, 50);
		contentPane.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				//InputStream is = null;
				Rooms room = new Rooms();
				room.setTextType(textType.getText());
				room.setTextPrice(textPrice.getText());
				room.setTxtLocation(txtLocation.getText());
				room.setTxtDescription(textDescription.getText());
				
				 if (s == null) 
				 {
	                    JOptionPane.showMessageDialog(null, "Image cannot be null");
	                } 
				 else 
				 {
	                 try {
	                	 InputStream  is =  new FileInputStream(new File(s));
	                    	room.setLblimage(is);
	                    }
	                    catch (FileNotFoundException e1) 
	                    {
	                      
	                        e1.printStackTrace();
	                    }
	                    try {
	                    	
						
						  if(controller.AddRoom(room)) 
						  {
								ViewRooms views = new ViewRooms();
								views.ViewRoom();
							    dispose();
						  }
						  else 
						  {
						      JOptionPane.showMessageDialog(null," ..DATA NOT INSERTED SUCCESSFULLY....!!! ");
						  }
						
	                    } 
	               catch (Exception e1)
	                    {
	                        // TODO Auto-generated catch block
	                        e1.printStackTrace();
	                        
	                    }
	                    
	                    }
				
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JButton btnBrowse = new JButton("BROWSE PIC");
		btnBrowse.setBounds(224, 570, 161, 50);
		contentPane.add(btnBrowse);
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
                fileChooser.addChoosableFileFilter(filter);
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    String path = selectedFile.getAbsolutePath();
                    lblimage.setIcon(ResizeImage(path));
                    s = path;
                } 
                else if (result == JFileChooser.CANCEL_OPTION) 
                {
                    System.out.println("No Data");
                }
               
			}
		});
		btnBrowse.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		textType = new JTextField();
		textType.setBounds(542, 145, 318, 42);
		contentPane.add(textType);
		textType.setColumns(10);
		textType.setColumns(10);
		
		textPrice = new JTextField();
		textPrice.setBounds(542, 219, 317, 46);
		contentPane.add(textPrice);
		textPrice.setColumns(10);
		
		txtLocation = new JTextField();
		txtLocation.setBounds(542, 295, 317, 46);
		contentPane.add(txtLocation);
		txtLocation.setColumns(10);
		
		textDescription = new JTextField();
		textDescription.setBounds(542, 368, 320, 50);
		contentPane.add(textDescription);
		textDescription.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ROOM TYPE  : ");
		lblNewLabel_2.setBounds(408, 144, 124, 41);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_4 = new JLabel("PRICE           :");
		lblNewLabel_4.setBounds(408, 220, 97, 41);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_1 = new JLabel("LOCATION   : ");
		lblNewLabel_1.setBounds(408, 299, 104, 34);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JLabel lblNewLabel_3 = new JLabel("DESCRIPTION : ");
		lblNewLabel_3.setBounds(408, 371, 124, 41);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		JPanel RoomPicture = new JPanel();
		RoomPicture.setBounds(10, 115, 376, 444);
		contentPane.add(RoomPicture);
		RoomPicture.setBackground(new Color(240, 230, 140));
		RoomPicture.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		RoomPicture.setLayout(null);
		
		lblimage = new JLabel("");
		lblimage.setBounds(0, 11, 376, 433);
		RoomPicture.add(lblimage);
		
		
	}
	
	 public ImageIcon ResizeImage(String imgPath) {
	        ImageIcon MyImage = new ImageIcon(imgPath);
	        Image img = MyImage.getImage();
	        Image newImage = img.getScaledInstance(lblimage.getWidth(), lblimage.getHeight(), Image.SCALE_SMOOTH);
	        ImageIcon image = new ImageIcon(newImage);
	        return image;
	    }
		private void resetAllFields() {

			this.textType.setText(null);
			this.textPrice.setText(null);
			this.txtLocation.setText(null);
			this.textDescription.setText(null);
			this.lblimage.setText(null);
			
		}
		 public void CenteredFrame(javax.swing.JFrame objFrame){
		        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
		        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
		        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
		        objFrame.setLocation(iCoordX, iCoordY); 
		    } 
}
