package CalcPack;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;




public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation = "";
	String answer;
	
	
	
	

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
		frame.setBounds(100, 100, 374, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 49, 342, 78);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
					
				}
				
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnbackspace.setBounds(10, 135, 85, 67);
		btnbackspace.setBackground(new Color(128, 128, 128));
		btnbackspace.setForeground(Color.WHITE);
		
		frame.getContentPane().add(btnbackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 199, 85, 67);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 265, 85, 67);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 330, 85, 67);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 394, 85, 67);
		frame.getContentPane().add(btn0);
		
		JButton btnclear = new JButton("AC");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				 
		        first = 0;             
		        second = 0;
		        result = 0;
		        operation = "";
			}
		});
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnclear.setBounds(95, 135, 85, 67);
		btnclear.setBackground(new Color(128, 128, 128));
		btnclear.setForeground(Color.WHITE);
		frame.getContentPane().add(btnclear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(95, 199, 85, 67);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(95, 265, 85, 67);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(95, 330, 85, 67);
		frame.getContentPane().add(btn2);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndecimal.getText();
				textField.setText(number);
			}
		});
		btndecimal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndecimal.setBounds(95, 394, 85, 67);
		frame.getContentPane().add(btndecimal);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn00.setBounds(181, 135, 85, 67);
		btn00.setBackground(new Color(128, 128, 128));
		btn00.setForeground(Color.WHITE);
		frame.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(181, 199, 85, 67);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(181, 265, 85, 67);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
			
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(181, 330, 85, 67);
		frame.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String text = textField.getText();
		        if (!text.isEmpty()) {
		            second = Double.parseDouble(text);
		            if (operation.equals("+")) {
		                result = first + second;
		            } else if (operation.equals("-")) {
		                result = first - second;
		            } else if (operation.equals("*")) {
		                result = first * second;
		            } else if (operation.equals("/")) {
		                result = first / second;
		            } else if (operation.equals("%")) {
		                result = first % second;
		            } else {
		                
		                result = second; 
		                }

		            answer = String.format("%.2f", result);
		            textField.setText(answer);

		            operation = "";
		        }
		    }
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnequal.setBounds(181, 394, 85, 67);
		frame.getContentPane().add(btnequal);
		
		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnadd.setBounds(267, 135, 85, 67);
		btnadd.setBackground(new Color(128, 128, 128));
		btnadd.setForeground(Color.WHITE);
		frame.getContentPane().add(btnadd);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
			
			
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBounds(267, 199, 85, 67);
		btnminus.setBackground(new Color(128, 128, 128));
		btnminus.setForeground(Color.WHITE);
		frame.getContentPane().add(btnminus);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnmultiply.setBounds(267, 265, 85, 67);
		btnmultiply.setBackground(new Color(128, 128, 128));
		btnmultiply.setForeground(Color.WHITE);
		frame.getContentPane().add(btnmultiply);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btndivide.setBounds(267, 330, 85, 67);
		btndivide.setBackground(new Color(128, 128, 128));
		btndivide.setForeground(Color.WHITE);
		frame.getContentPane().add(btndivide);
		
		JButton btnpercent = new JButton("%");
		btnpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnpercent.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnpercent.setBounds(267, 394, 85, 67);
		btnpercent.setBackground(new Color(128, 128, 128));
		btnpercent.setForeground(Color.WHITE);
		frame.getContentPane().add(btnpercent);
		LineBorder buttonBorder = new LineBorder(Color.WHITE,2);
		btnbackspace.setBorder(buttonBorder);
		
		
		btn7.setBorder(buttonBorder);
		btn4.setBorder(buttonBorder);
		btn1.setBorder(buttonBorder);
		btn0.setBorder(buttonBorder);
		btnclear.setBorder(buttonBorder);
		btn8.setBorder(buttonBorder);
		btn5.setBorder(buttonBorder);
		btn2.setBorder(buttonBorder);
		btndecimal.setBorder(buttonBorder);
		btn00.setBorder(buttonBorder);
		btn9.setBorder(buttonBorder);
		btn6.setBorder(buttonBorder);
		btn3.setBorder(buttonBorder);
		btnequal.setBorder(buttonBorder);
		btnadd.setBorder(buttonBorder);
		btnminus.setBorder(buttonBorder);
		btnmultiply.setBorder(buttonBorder);
		btndivide.setBorder(buttonBorder);
		btnpercent.setBorder(buttonBorder);
		
		
		
		
		JLabel lblNewLabel = new JLabel("STANDARD");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel.setBounds(18, 10, 334, 25);
		frame.getContentPane().add(lblNewLabel);
		frame.setResizable(false); 
		frame.setExtendedState(JFrame.NORMAL);
	}
}
