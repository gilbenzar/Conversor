package com.conversor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorMonedas extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIngreseElMonto;
	private JComboBox comboBox;
	private JLabel lblNewLabel_1_1;

	public ConversorMonedas() {
		setBounds(100, 100, 800, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(187, 198, 200));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		this.setLocationRelativeTo(null);
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(91, 161, 153));
			panel.setBounds(0, 11, 784, 118);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Conversor de Monedas");
				lblNewLabel.setForeground(new Color(255, 255, 255));
				lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(0, 0, 784, 118);
				panel.add(lblNewLabel);
			}
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Ingrese el monto que desea convertir");
			lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(260, 164, 264, 28);
			contentPanel.add(lblNewLabel_1);
		}
		
		txtIngreseElMonto = new JTextField();
		txtIngreseElMonto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int key = e.getKeyChar();
				boolean numeros = key >= 48 && key <= 57;
				
				if(!numeros) {
					e.consume();
				}
			}
		});
		txtIngreseElMonto.setBackground(new Color(229, 227, 228));
		txtIngreseElMonto.setBounds(260, 188, 264, 28);
		contentPanel.add(txtIngreseElMonto);
		txtIngreseElMonto.setColumns(10);
		
		String[] opciones = {"","Pesos (DOP) a Dolares (USD)", "Pesos (DOP) a Euros (EUR)","Pesos (DOP) a Libras Esterlinas (GBP)",
				"Pesos (DOP) a Yen Japonés (JPY)", "Pesos (DOP) a Won sul-coreano (KRW)", "Dolares (USD) a Pesos (DOP)",
				"Euros (EUR) a Pesos (DOP)", "Libras Esterlinas (GBP) a Pesos (DOP)","Yen Japonés (JPY) a Pesos (DOP)", 
				"Won sul-coreano (KRW) a Pesos (DOP)" };
		
		comboBox = new JComboBox(opciones);
		comboBox.setBackground(new Color(229, 227, 228));
		comboBox.setBounds(260, 264, 264, 22);
		contentPanel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione el tipo de divisa a la cual desea convertir");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1.setBounds(211, 236, 363, 28);
		contentPanel.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(150, 311, 500, 28);
		contentPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Volver al menu principal");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(297, 393, 204, 23);
		contentPanel.add(btnNewButton);
		
		comboBox.addActionListener(this);
	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBox) {
			String selected = comboBox.getSelectedItem().toString();
			String text = txtIngreseElMonto.getText();
			double x = Double.parseDouble(text);
			switch(selected) {	

			case "Pesos (DOP) a Dolares (USD)":
				x=x*0.017922922;
				String s = Double.toString(x);
				int resultado = s.indexOf(".");
				String salida = s.substring(0, resultado +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida + " Dolares (USD)");
				
				break;
				
			case "Pesos (DOP) a Euros (EUR)":
				x=x*0.016900377;
				String s1 = Double.toString(x);
				int resultado1 = s1.indexOf(".");
				String salida1 = s1.substring(0, resultado1 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida1 + " Euros (EUR)");
				break;
			
			case "Pesos (DOP) a Libras Esterlinas (GBP)":
				x=x*0.014855071;
				String s2 = Double.toString(x);
				int resultado2 = s2.indexOf(".");
				String salida2 = s2.substring(0, resultado2 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida2 + " Libras Esterlinas (GBP)");
				break;
			
			case "Pesos (DOP) a Yen Japonés (JPY)":
				x=x*2.4412076;
				String s3 = Double.toString(x);
				int resultado3 = s3.indexOf(".");
				String salida3 = s3.substring(0, resultado3 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida3 + " Yen Japonés (JPY)");
				break;
				
			case "Pesos (DOP) a Won sul-coreano (KRW)":
				x=x*23.636516;
				String s4 = Double.toString(x);
				int resultado4 = s4.indexOf(".");
				String salida4 = s4.substring(0, resultado4 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida4 + " Won sul-coreano (KRW)");
				break;
				
			case "Dolares (USD) a Pesos (DOP)":
				x=x*55.718322;
				String s5 = Double.toString(x);
				int resultado5 = s5.indexOf(".");
				String salida5 = s5.substring(0, resultado5 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida5 + " Pesos (DOP)");
				
				break;
				
			case "Euros (EUR) a Pesos (DOP)":
				x=x*59.189197;
				String s6 = Double.toString(x);
				int resultado6 = s6.indexOf(".");
				String salida6 = s6.substring(0, resultado6 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida6 + " Pesos (DOP)");
				break;
				
			case "Libras Esterlinas (GBP) a Pesos (DOP)":
				x=x*67.32212;
				String s7 = Double.toString(x);
				int resultado7 = s7.indexOf(".");
				String salida7 = s7.substring(0, resultado7 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida7 + " Pesos (DOP)");
				break;
				
			case "Yen Japonés (JPY) a Pesos (DOP)":
				x=x*0.40968226;
				String s8 = Double.toString(x);
				int resultado8 = s8.indexOf(".");
				String salida8 = s8.substring(0, resultado8 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida8 + " Pesos (DOP)");
				break;
				
			case "Won sul-coreano (KRW) a Pesos (DOP)":
				x=x*0.042306434;
				String s9 = Double.toString(x);
				int resultado9 = s9.indexOf(".");
				String salida9 = s9.substring(0, resultado9 +3);
				lblNewLabel_1_1.setText("La cantidad es $ " + salida9 + " Pesos (DOP)");
				break;
			}
	}
		
	}


}
