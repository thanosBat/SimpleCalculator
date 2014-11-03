import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator extends JFrame {
	private JTextField display;
	double counter=0, first ; int decimalClick =0 , plusClick=0, minusClick=0, multiplyClick=0, divideClick=0,  zeroClick=0;
	String save;
	
	public Calculator() {
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(450, 250);
		getContentPane().setLayout(null);
		
		
		
		display = new JTextField();
		display.setBounds(40, 29, 257, 30);
		getContentPane().add(display);
		display.setColumns(10);
		
		display.setText("");
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				save = display.getText();
				display.setText(save+"7");
				
			}
		});
		btn7.setBounds(40, 70, 45, 37);
		getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				save = display.getText();
				display.setText(save+"8");
			}
		});
		btn8.setBounds(110, 70, 45, 37);
		getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				save = display.getText();
				display.setText(save+"9");
			}
		});
		btn9.setBounds(180, 70, 45, 37);
		getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				first = Double.valueOf(display.getText());
				display.setText("");
				display.setFocusable(true);
				plusClick +=1;
				decimalClick = 0;
			}
		});
		btnPlus.setBounds(252, 70, 45, 37);
		getContentPane().add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				save = display.getText();
				display.setText(save+"4");
			}
		});
		btn4.setBounds(40, 126, 45, 37);
		getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				save = display.getText();
				display.setText(save+"1");
			}
		});
		btn1.setBounds(40, 177, 45, 37);
		getContentPane().add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(display.getText().isEmpty() ) 				
					display.setText("");
							
				else{ display.setText(display.getText()+btn0.getText());}
					
			}
		});
		btn0.setBounds(40, 225, 45, 37);
		getContentPane().add(btn0);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save = display.getText();
				display.setText(save+"5");
			}
		});
		btn5.setBounds(110, 126, 45, 37);
		getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save = display.getText();
				display.setText(save+"2");
			}
		});
		btn2.setBounds(110, 177, 45, 37);
		getContentPane().add(btn2);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(decimalClick==0){
					display.setText(display.getText()+btnDot.getText());
					decimalClick=1;
				}
			}
		});
		btnDot.setBounds(110, 225, 45, 37);
		getContentPane().add(btnDot);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save = display.getText();
				display.setText(save+"6");
			}
		});
		btn6.setBounds(180, 126, 45, 37);
		getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save = display.getText();
				display.setText(save+"3");
			}
		});
		btn3.setBounds(180, 177, 45, 37);
		getContentPane().add(btn3);
		
		JButton btnSign = new JButton("+/-");
		btnSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double toggle;
				toggle = (Double.valueOf(display.getText()))*-1;
				display.setText(String.valueOf(toggle));
			}
		});
		btnSign.setBounds(180, 225, 62, 37);
		getContentPane().add(btnSign);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(display.getText());
				display.setText("");
				display.setFocusable(true);
				minusClick +=1;
				decimalClick = 0;
			}
		});
		btnMinus.setBounds(252, 126, 45, 37);
		getContentPane().add(btnMinus);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(display.getText());
				display.setText("");
				display.setFocusable(true);
				multiplyClick +=1;
				decimalClick = 0;
			}
		});
		btnMult.setBounds(252, 177, 45, 37);
		getContentPane().add(btnMult);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.valueOf(display.getText());
				display.setText("");
				display.setFocusable(true);
				divideClick +=1;
				decimalClick = 0;
			}
		});
		btnDivide.setBounds(252, 225, 45, 37);
		getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double secondNum = Double.valueOf(display.getText());
				if(plusClick > 0){
					String result = String.valueOf(first + secondNum);
					display.setText(result);
					plusClick=0;
				}
				else{display.setText(display.getText());}
				
				if(minusClick > 0){
					String result = String.valueOf(first - secondNum);
					display.setText(result);
					minusClick=0;
				}
				else{display.setText(display.getText());}
				
				if(multiplyClick > 0){
					String result = String.valueOf(first * secondNum);
					display.setText(result);
					multiplyClick=0;
				}
				else{display.setText(display.getText());}
				
				if(divideClick > 0){
					String result = String.valueOf(first / secondNum);
					display.setText(result);
					divideClick=0;
				}
				else{display.setText(display.getText());}
				
								
			}
		});
		btnEqual.setBounds(40, 273, 257, 23);
		getContentPane().add(btnEqual);
		
		setSize(350, 345);
		setVisible(true);
	}
	
	public static void main(String arg[]){
		new Calculator();
	}
}
