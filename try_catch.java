package windowsbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class try_catch extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					try_catch frame = new try_catch();
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
	public try_catch() {
		setBounds(100, 100, 651, 389);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter First Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(56, 78, 160, 31);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(270, 85, 148, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(56, 184, 384, 20);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Second Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(56, 131, 160, 31);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(270, 138, 148, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(textField.getText());
				int n1=Integer.parseInt(textField_1.getText());
				try {
					int d=n/n1;
					String z=Integer.toString(d);
					lblNewLabel_1.setText("The Divison between two number is " +z);
				}
				catch(Exception e1) {
					lblNewLabel_1.setText("Cannot be divide by zero");
					
				}
			}
		});
		btnNewButton.setBounds(155, 249, 89, 23);
		getContentPane().add(btnNewButton);
		
		

	}
}
