import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stdReg {
	
    String name;
    String roll;
    String regno;
    String hallno;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stdReg window = new stdReg();
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
	public stdReg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblName.setBounds(33, 34, 59, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblRollNo = new JLabel("Roll No.");
		lblRollNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRollNo.setBounds(33, 80, 66, 14);
		frame.getContentPane().add(lblRollNo);
		
		JLabel lblRegNo = new JLabel("Reg No.");
		lblRegNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblRegNo.setBounds(33, 119, 59, 21);
		frame.getContentPane().add(lblRegNo);
		
		JLabel lblHallNo = new JLabel("Hall No.");
		lblHallNo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHallNo.setBounds(33, 169, 59, 14);
		frame.getContentPane().add(lblHallNo);
		
		textField = new JTextField();
		textField.setBounds(165, 32, 143, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 78, 143, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 120, 143, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 167, 143, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(name=textField.getText());
				roll=textField_1.getText();
				regno=textField_2.getText();
				hallno=textField_3.getText();
			    
			
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegister.setBounds(186, 227, 89, 23);
		frame.getContentPane().add(btnRegister);
	}
}
