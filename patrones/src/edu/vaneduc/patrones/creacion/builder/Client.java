package edu.vaneduc.patrones.creacion.builder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField txtChain;
	private JLabel lblResponse = new JLabel("Response");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblResponse.setBounds(22, 145, 386, 31);
		contentPane.add(lblResponse);
		
		JLabel lblNewLabel = new JLabel("Ingrese vehiculo");
		lblNewLabel.setBounds(34, 49, 89, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnProcess = new JButton("Proccess");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblResponse.setText(process(txtChain.getText()));
			}
		});
		btnProcess.setBounds(34, 83, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(133, 83, 89, 23);
		contentPane.add(btnBack);
		
		txtChain = new JTextField();
		txtChain.setBounds(136, 46, 86, 20);
		contentPane.add(txtChain);
		txtChain.setColumns(10);
		
		
	}
	
	private String process(String type){
		String result="";
		VehicleBuilder builder=null;
		
		if(type.equalsIgnoreCase(VehicleEnum.CAR.toString())){
			builder= new CarBuilder();
				
		}if(type.equalsIgnoreCase(VehicleEnum.SCOTTER.toString())){
			builder= new ScooterBuilder();
				
		}
		if(builder!=null){
			builder.construct(builder);
			result = builder.show();
		}	
		return result;
	}
}
