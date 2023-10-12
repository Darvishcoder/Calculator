package collegetest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.List;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double intI;
	double intII;
	double total;

	
	String action;
    String result;
    private JButton btnSin;

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
		frame.setBounds(100, 100, 637, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 14));
		textField.setBounds(28, 24, 569, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sin = Double.parseDouble(textField.getText());
				 if (sin == 45) {
					 textField.setText("Sin" + "("+ textField.getText()  +")" + "=" + Math.sqrt(2));
                    
                 } else {
			    float Sin =  (float) Math.sin(Math.toRadians(sin));
			  //long SIN  = Math.(Sin);
				textField.setText("Sin" + "("+ textField.getText()  +")" + "=");
				textField.setText (textField.getText()+Sin);
                 }
			}
		});
		btnSin.setFont(new Font("Calibri", Font.BOLD, 18));
		btnSin.setBounds(28, 98, 76, 46);
		frame.getContentPane().add(btnSin);
		
		final JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cos = Double.parseDouble(textField.getText());
				 if (cos == 45) {
					 textField.setText("cos" + "("+ textField.getText()  +")" + "=" + Math.sqrt(2));
                    
                 }
				 else if(cos==90){
					 textField.setText("Cos" + "("+ textField.getText()  +")" + "=" + 0);
				 }
				 else {
				 
				
			    float Cos = (float) Math.cos(Math.toRadians(cos));
		
				textField.setText("Cos" + "("+ textField.getText()  +")" + "=");
				textField.setText (textField.getText()+Cos);
                 }
			}
		});
		btnCos.setRequestFocusEnabled(false);
		btnCos.setFont(new Font("Calibri", Font.BOLD, 18));
		btnCos.setBounds(125, 98, 76, 46);
		frame.getContentPane().add(btnCos);
		
				final JButton btnTan = new JButton("tan");
				btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double angle = Double.parseDouble(textField.getText());
				 if (angle == 90.0) {
					 textField.setText("tan" + "("+ textField.getText()  +")" + "=" + "undefiend");
                    
                 } else if (angle == 30) {
					 textField.setText("tan" + "("+ textField.getText()  +")" + "=" + Math.sqrt(3));
                    
                 }
				 else {
                	 
			   float ta = (float) Math.tan(Math.toRadians(angle));
			  // long tan  = Math.round(ta);
				textField.setText("tan" + "("+ textField.getText()  +")" + "=");
				textField.setText (textField.getText()+ta);
                 }
			 
			}
		});
		btnTan.setFont(new Font("Calibri", Font.BOLD, 18));
		btnTan.setBounds(224, 98, 76, 46);
		frame.getContentPane().add(btnTan);

		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 18));
		btn0.setBounds(28, 326, 173, 46);
		frame.getContentPane().add(btn0);
		
		
		
		final JButton btn1_3 = new JButton("1");
		btn1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn1_3.getText();
				textField.setText(number);
			}
		});
		btn1_3.setFont(new Font("Calibri", Font.BOLD, 18));
		btn1_3.setBounds(28, 269, 76, 46);
		frame.getContentPane().add(btn1_3);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 18));
		btn2.setBounds(125, 269, 76, 46);
		frame.getContentPane().add(btn2);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 18));
		btn3.setBounds(224, 269, 76, 46);
		frame.getContentPane().add(btn3);
		
				final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 18));
		btn4.setBounds(28, 212, 76, 46);
		frame.getContentPane().add(btn4);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setRequestFocusEnabled(false);
		btn5.setFont(new Font("Calibri", Font.BOLD, 18));
		btn5.setBounds(125, 212, 76, 46);
		frame.getContentPane().add(btn5);
		
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 18));
		btn6.setBounds(224, 212, 76, 46);
		frame.getContentPane().add(btn6);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 18));
		btn7.setBounds(28, 155, 76, 46);
		frame.getContentPane().add(btn7);
		
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 18));
		btn8.setBounds(127, 155, 74, 46);
		frame.getContentPane().add(btn8);
			
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 18));
		btn9.setBounds(226, 155, 76, 46);
		frame.getContentPane().add(btn9);
		
		
		JButton btnclear = new JButton("Clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText (null);
				
			}
		});
		btnclear.setFont(new Font("Calibri", Font.BOLD, 18));
		btnclear.setBounds(422, 98, 161, 46);
		frame.getContentPane().add(btnclear);
		

		
		JButton btnBck = new JButton("Backs");
		btnBck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Bck = null;
				if(textField.getText().length ()>0)
				{
				StringBuilder str = new StringBuilder (textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				Bck =str.toString();
				textField.setText (Bck);
			}
			}
		
		});
		btnBck.setFont(new Font("Calibri", Font.BOLD, 18));
		btnBck.setBounds(323, 98, 76, 46);
		frame.getContentPane().add(btnBck);
	
		

		
		final JButton btnsquare = new JButton("x^2");
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x= Double.parseDouble(textField.getText());
				x = x*x;
				textField.setText("The Calculator result for square fn is= ");
				textField.setText(textField.getText()+x);
			}
		});
		btnsquare.setFont(new Font("Calibri", Font.BOLD, 20));
		btnsquare.setBounds(323, 155, 76, 46);
		frame.getContentPane().add(btnsquare);
		
		
		
		final JButton btncube = new JButton("x^3");
		btncube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x= Double.parseDouble(textField.getText());
			x = x*x*x;
			textField.setText("The Calculator result for cube fn is= ");
			textField.setText(textField.getText()+x);
			}
		});
		btncube.setFont(new Font("Calibri", Font.BOLD, 20));
		btncube.setBounds(323, 212, 76, 46);
		frame.getContentPane().add(btncube);
		
		final JButton btnsqrt = new JButton("sqrt");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sqr= Math.sqrt(Double.parseDouble(textField.getText()));
				
				textField.setText("The Calculator result for squareroot =");
				textField.setText(textField.getText()+sqr);
			}
		});
		btnsqrt.setFont(new Font("Calibri", Font.BOLD, 20));
		btnsqrt.setBounds(323, 269, 76, 46);
		frame.getContentPane().add(btnsqrt);
		
		
		
		final JButton btnfact = new JButton("x!");
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double f =Double.parseDouble (textField.getText());
				double fac = 1;
				while(f!= 0)
				{
				fac = fac *f;
				f--;
				}
				textField.setText("The factorial of the opted no. is =");
				textField.setText (textField.getText()+fac);
			}
		});
		btnfact.setFont(new Font("Calibri", Font.BOLD, 20));
		btnfact.setBounds(422, 155, 76, 46);
		frame.getContentPane().add(btnfact);
		
		
		
		final JButton btnlog = new JButton("log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double log= Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("The calculated log value is= ");
				textField.setText(textField.getText()+log);
			
			}
		});
		btnlog.setFont(new Font("Calibri", Font.BOLD, 20));
		btnlog.setBounds(422, 212, 76, 46);
		frame.getContentPane().add(btnlog);
		
		final JButton btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText ("");
				action = "x^y";
				
			}
		});
		btnPow.setFont(new Font("Calibri", Font.BOLD, 20));
		btnPow.setBounds(422, 269, 76, 46);
		frame.getContentPane().add(btnPow);
		
		

		JButton btnadd = new JButton("+");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action ="+";
			}
		});
		btnadd.setFont(new Font("Calibri", Font.BOLD, 26));
		btnadd.setBounds(508, 155, 76, 46);
		frame.getContentPane().add(btnadd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action ="-";
			}
		});
		btnsub.setFont(new Font("Calibri", Font.BOLD, 26));
		btnsub.setBounds(508, 212, 76, 46);
		frame.getContentPane().add(btnsub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action ="*";
			}
		});
		btnMul.setFont(new Font("Calibri", Font.BOLD, 26));
		btnMul.setBounds(507, 269, 76, 46);
		frame.getContentPane().add(btnMul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intI= Double.parseDouble(textField.getText());
				textField.setText("");
				action ="/";
			}
		});
		btndiv.setFont(new Font("Calibri", Font.BOLD, 16));
		btndiv.setBounds(508, 326, 76, 46);
		frame.getContentPane().add(btndiv);
		
		
		final JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number= textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Calibri", Font.BOLD, 26));
		btndot.setBounds(224, 326, 76, 46);
		frame.getContentPane().add(btndot);
		
		
		JButton btnequalto = new JButton("=");
		btnequalto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				intII=Double.parseDouble (textField.getText());
				if(action == "+")
				{
				total=intI + intII;
				result= intI +  "+" + intII +   " =" + total;
				textField.setText(result);
				}
				else if(action == "-")
				{
					total=intI - intII;
					result= intI +  "-" + intII +   " =" + total;
					textField.setText(result);
					
				}
				else if(action == "*")
				{
					total=intI * intII;
					result= intI +  "*" + intII +   " =" + total;
					textField.setText(result);
				}
				else if(action == "/")
				{
					total=intI / intII;
					result= intI +  "/" + intII +   " =" + total;
					textField.setText(result);
				}
				else if(action == "x^y") {
					double n =1;
					int i =0;
					while(i<intII) {
						n = intI* n;
						i++;
					}
					 String answer = intI + " ^ " + intII + " = " + n;
					textField.setText(answer);
				}
			}
		}
		);

		btnequalto.setRequestFocusEnabled(false);
		btnequalto.setFont(new Font("Calibri", Font.BOLD, 20));
		btnequalto.setBounds(325, 326, 173, 46);
		frame.getContentPane().add(btnequalto);
	
		
		
		JRadioButton btnwant = new JRadioButton("Want");
		btnwant.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnwant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnPow.setEnabled(true);
				btnlog.setEnabled(true);
				btncube.setEnabled(true);
				btnsqrt.setEnabled(true);
				btnsquare.setEnabled(true);
				btnfact.setEnabled(true);
			}
		});
		btnwant.setBounds(28, 379, 109, 23);
		frame.getContentPane().add(btnwant);
		
		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnPow.setEnabled(false);
				btnlog.setEnabled(false);
				btncube.setEnabled(false);
				btnsqrt.setEnabled(true);
				btnsquare.setEnabled(false);
				btnfact.setEnabled(false);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClose.setBounds(488, 379, 109, 23);
		frame.getContentPane().add(btnClose);
		
		
		
	}
}