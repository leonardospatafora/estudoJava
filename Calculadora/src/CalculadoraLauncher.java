import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import CalculadoraDAO.DbConnect;

public class CalculadoraLauncher {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraLauncher window = new CalculadoraLauncher();
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
	public CalculadoraLauncher() {
		initialize();
	}
	
	double valor1;
	double valor2;
	String sinal;

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 12, 280, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_1.setBounds(22, 228, 47, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		btnNewButton.setBounds(22, 182, 47, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_2.setBounds(22, 135, 47, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("7");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton_3.setBounds(22, 88, 47, 25);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("6");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_4.setBounds(95, 88, 47, 25);
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_5.setBounds(95, 135, 47, 25);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		btnNewButton_6.setBounds(95, 182, 47, 25);
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(",");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ",");
			}
		});
		btnNewButton_7.setBounds(95, 228, 47, 25);
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_8.setBounds(168, 88, 47, 25);
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_9.setBounds(168, 135, 47, 25);
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_10.setBounds(168, 182, 47, 25);
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("%");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "%");
			}
		});
		btnNewButton_11.setBounds(168, 228, 47, 25);
		frame.getContentPane().add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "divisao";
			}
		});
		btnNewButton_12.setBounds(239, 88, 47, 25);
		frame.getContentPane().add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("x");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "multi";
			}
		});
		btnNewButton_13.setBounds(239, 135, 47, 25);
		frame.getContentPane().add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("-");
		
		btnNewButton_14.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				valor1 = Double.parseDouble(textField.getText());
				textField.setText("");
				sinal = "subtrai";
			}
		});
		btnNewButton_14.setBounds(239, 182, 47, 25);
		frame.getContentPane().add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("+");
		
		btnNewButton_15.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try { 
					valor1 = Double.parseDouble(textField.getText());
					textField.setText("");
					sinal = "soma";
				}catch (NumberFormatException ex) {
					System.out.println("Isso daí não é um número boçal");
				}
			}
		});
		btnNewButton_15.setBounds(239, 228, 47, 25);
		frame.getContentPane().add(btnNewButton_15);

		btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				DecimalFormat df = new DecimalFormat("0.00");
				valor2 = Double.parseDouble(textField.getText());
				String tipo = null;
				double res = 0;
				
				if (sinal.equals("soma")) {
					textField.setText(String.valueOf(df.format(valor1 + valor2)));
					tipo = "+";
					res = valor1 + valor2;
				} else if (sinal.equals("subtrai")) {
					textField.setText(String.valueOf(df.format(valor1 - valor2)));
					tipo = "-";
					res = valor1 - valor2;
				} else if (sinal.equals("divisao")) {
					textField.setText(String.valueOf(df.format(valor1 / valor2)));
					tipo = "/";
					res = valor1 / valor2;
				} else if (sinal.equals("multi")) {
					textField.setText(String.valueOf(df.format(valor1 * valor2)));
					tipo = "*";
					res = valor1 * valor2;
				}
				
				try (Connection conn = (Connection) DbConnect.getConexaoMySQL()){
					PreparedStatement stmt = (PreparedStatement) conn.prepareStatement
							("INSERT INTO dados_calc (ope,dat,val) VALUES ('" + tipo + "',"
									+ "'" + getDateTime() + "','" + res +"');");
					stmt.execute();
				} catch (SQLException e1) {
					System.out.println("Deu ruimmm!");
				}
			}

		});
		btnNewButton_16.setBounds(298, 228, 108, 25);
		frame.getContentPane().add(btnNewButton_16);

		btnNewButton_17 = new JButton("C");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_17.setBounds(298, 182, 108, 25);
		frame.getContentPane().add(btnNewButton_17);
	}
	
	private static String getDateTime() {
		Date data = new Date();
		SimpleDateFormat formatador = new SimpleDateFormat("yyyy/MM/dd");
		return formatador.format(data);
	}
	
	
}
