package com.conversor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorTemperaturas extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JComboBox comboBoxT;
	private JLabel lblNewLabel_1_1_1;


	public ConversorTemperaturas() {
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
			
			JLabel lblNewLabel = new JLabel("Conversor de Temperaturas");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 784, 118);
			panel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la temperatura que desea convertir");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1.setBounds(233, 151, 324, 21);
		contentPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent et) {
				int keyT = et.getKeyChar();
				boolean numerosT = keyT >= 48 && keyT <= 57;
				
				if(!numerosT) {
					et.consume();
				}
			}
		});
		textField.setBackground(new Color(229, 227, 228));
		textField.setBounds(243, 183, 284, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		String[] opcionesT = {"", "De Celsius (ºC) a Fahrenheit (ºF)", "De Celsius (ºC) a Kelvin (K)", 
				"De Celsius (ºC) a Rankine (°R)", "De Fahrenheit (ºF) a Celsius (ºC)", "De Farenheit (ºF) a Kelvin (K)",
				"De Farenheit (ºC) a Rankine (°R)", "De Kelvin (K) a Celsius (ºC)", "De Kelvin (K) a Farenheit (ºF)",
				"De Kelvin (ºC) a Rankine (°R)", "De Rankine (°R) a Celcius (ºC)", "De Rankine (°R) a Farenheit (ºF)",
				"De Rankine (°R) a Kelvin (K)"};
		
		JLabel lblNewLabel_1_1 = new JLabel("Seleccione el tipo de temperatura a la cual desea convertir");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(181, 234, 411, 21);
		contentPanel.add(lblNewLabel_1_1);
		
		comboBoxT = new JComboBox(opcionesT);
		comboBoxT.setBounds(243, 278, 284, 22);
		contentPanel.add(comboBoxT);
		
		lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(181, 334, 411, 21);
		contentPanel.add(lblNewLabel_1_1_1);
		
		JButton btnNewButtonT = new JButton("Volver al menu principal");
		btnNewButtonT.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButtonT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		btnNewButtonT.setBounds(278, 398, 221, 23);
		contentPanel.add(btnNewButtonT);
		
		
		
		comboBoxT.addActionListener(this);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comboBoxT) {
			String selectedT = comboBoxT.getSelectedItem().toString();
			String textT = textField.getText();
			double t = Double.parseDouble(textT);
			switch (selectedT) {
			case "De Celsius (ºC) a Fahrenheit (ºF)":
				t=t*1.8 + 32;
				lblNewLabel_1_1_1.setText("La temperatura en Farenheit es " + t + "ºF");
				break;
			case "De Celsius (ºC) a Kelvin (K)":
				t=t+273.15;
				lblNewLabel_1_1_1.setText("La temperatura en Kelvin es " + t + "K");
				break;
			case "De Celsius (ºC) a Rankine (°R)":
				t=t* 9/5 + 491.67;
				lblNewLabel_1_1_1.setText("La temperatura en Rankine es " + t + "°R");
				break;
			case "De Fahrenheit (ºF) a Celsius (ºC)":
				t=(t-32)/1.8;
				lblNewLabel_1_1_1.setText("La temperatura en Celcius es " + t + "ºC");
				break;
			case "De Farenheit (ºF) a Kelvin (K)":
				t= (t-32)* 5/9 + 273.15;
				lblNewLabel_1_1_1.setText("La temperatura en Kevin es " + t + "K");
				break;
			case "De Farenheit (ºC) a Rankine (°R)":
				t=t+459.67;
				lblNewLabel_1_1_1.setText("La temperatura en Rankine es " + t + "°R");
				break;
			case "De Kelvin (K) a Celsius (ºC)":
				t=t-273.15;
				lblNewLabel_1_1_1.setText("La temperatura en Celcius es " + t + "ºC");
				break;
			case "De Kelvin (K) a Farenheit (ºF)":
				t=(t - 273.15) * 9/5 +32;
				lblNewLabel_1_1_1.setText("La temperatura en Farenheit es " + t + "ºF");
				break;
			case "De Kelvin (ºC) a Rankine (°R)":
				t=t*1.8;
				lblNewLabel_1_1_1.setText("La temperatura en Rankine es " + t + "°R");
				break;
			case "De Rankine (°R) a Celcius (ºC)":
				t=(t-491.67)*5/9;
				lblNewLabel_1_1_1.setText("La temperatura en Celcius es " + t + "ºC");
				break;
			case "De Rankine (°R) a Farenheit (ºF)":
				t=t-459.67;
				lblNewLabel_1_1_1.setText("La temperatura en Farenheit es " + t + "ºF");
				break;
			case "De Rankine (°R) a Kelvin (K)":
				t=t* 5/9;
				lblNewLabel_1_1_1.setText("La temperatura en Kelvin es " + t + "K");
				break;
			}
		}
	}

		
	}
	

