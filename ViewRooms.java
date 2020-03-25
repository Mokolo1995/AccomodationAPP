package accomodate;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import accomodate.DB_Helper.Controller;
import accomodate.Database.CRUDimplementation;
import accomodate.Model.Rooms;
import net.proteanit.sql.DbUtils;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class ViewRooms extends JFrame {

	private JPanel contentPane;
	private JTable table;
	//private final Controller controller;

	
	public void ViewRoom() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRooms frame = new ViewRooms();
					frame.setVisible(true);
					CenteredFrame(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	
	public ViewRooms() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 300, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 138, 850, 316);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 11, 850, 107);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ROOM_VIEWS");
		lblNewLabel.setBounds(262, 11, 592, 85);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		Rooms room = new Rooms();
		
		getRooms();
		
		
	}

	public boolean getRooms() {
	
		CRUDimplementation icrud = new CRUDimplementation();
		  
		  
		  try {
			  icrud.openConnection();
			  String query3 = "SELECT * FROM `rooms`";
		      PreparedStatement preStatement =icrud.getConnection().prepareStatement(query3);
		      ResultSet resultSet =preStatement.executeQuery();
		  
		  if(resultSet.next()) {
		  
		  Rooms room = new Rooms();
		  room.setTextType(resultSet.getString("RoomType"));
		  room.setTextPrice(resultSet.getString("Price"));
		  room.setTxtLocation(resultSet.getString("Location"));
		  room.setTxtDescription(resultSet.getString("Description"));
		  room.setLblimage(resultSet.getBinaryStream("Picture"));
		  
		  table.setModel(DbUtils.resultSetToTableModel(resultSet));
		  
		  
		  }
		  preStatement.close();
		  resultSet.close();
		  
		  
		  return true;
		  } 
		  catch(SQLException ex) 
		  { 
				return false;
			  }
	
	}
	public static void CenteredFrame(javax.swing.JFrame objFrame){
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
    } 
}
