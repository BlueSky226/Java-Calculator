package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 315, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(12, 31, 273, 38);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		

		
	
	//-----------------Row 0-----------------------------
	
		JButton btnBackSpace = new JButton("←");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBackSpace.setBounds(12, 82, 66, 50);
		frame.getContentPane().add(btnBackSpace);
		
		
		
		JButton btnDell = new JButton("C");
		btnDell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				txtDisplay.setText(null);
			}
		});
		btnDell.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDell.setBounds(80, 82, 66, 50);
		frame.getContentPane().add(btnDell);
		
		
		
		
		JButton btnPre = new JButton("%");
		btnPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPre.setBounds(148, 82, 66, 50);
		frame.getContentPane().add(btnPre);
		
		
		
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPlus.setBounds(216,82, 66, 50);
		frame.getContentPane().add(btnPlus);
		
		
		
		
		
		
		
		//-----------------Row 1-----------------------------
		
		JButton btn7 = new JButton("7");
		btn7.setHorizontalAlignment(SwingConstants.RIGHT);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn7.setBounds(12, 137, 66, 50);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String EnterNumber=txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setBounds(80, 137, 66, 50);
		frame.getContentPane().add(btn8);
		
		
		
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setBounds(148, 137, 66, 50);
		frame.getContentPane().add(btn9);
		
		
		
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(216,137, 66, 50);
		frame.getContentPane().add(btnSub);
		

		
		
	//-----------------Row 2-----------------------------
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn4.setBounds(12, 192, 66, 50);
		frame.getContentPane().add(btn4);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setBounds(80, 192, 66, 50);
		frame.getContentPane().add(btn5);
		
		
		
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setBounds(148, 192, 66, 50);
		frame.getContentPane().add(btn6);
		
		
		
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMult.setBounds(216,192, 66, 50);
		frame.getContentPane().add(btnMult);
		
	
		
		
		
		
	//-----------------Row 3-----------------------------
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn1.setBounds(12, 247, 66, 50);
		frame.getContentPane().add(btn1);
		
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setBounds(80, 247, 66, 50);
		frame.getContentPane().add(btn2);
		
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setBounds(148, 247, 66, 50);
		frame.getContentPane().add(btn3);
		
		
		
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDiv.setBounds(216,247, 66, 50);
		frame.getContentPane().add(btnDiv);
		
		
		
		
		
	//-----------------Row 4-----------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn0.setBounds(12, 302, 66, 50);
		frame.getContentPane().add(btn0);
		
		
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDot.setBounds(80, 302, 66, 50);
		frame.getContentPane().add(btnDot);
		
		
		
		
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPM.setBounds(148, 302, 66, 50);
		frame.getContentPane().add(btnPM);
		
		
		
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEqual.setBounds(216,302, 66, 50);
		frame.getContentPane().add(btnEqual);
		
		
		

	}
}
