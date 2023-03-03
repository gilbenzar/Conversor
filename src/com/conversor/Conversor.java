package com.conversor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;


	public Conversor() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 198, 200));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(new Color(70, 149, 151));
		panel.setBounds(0, 0, 227, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Conversor de monedas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorMonedas cm = new ConversorMonedas();
				cm.setVisible(true);
			}});
		
		btnNewButton.setBackground(new Color(229, 227, 228));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(0, 297, 227, 46);
		panel.add(btnNewButton);
		
		JButton btnConversorDeTemperaturas = new JButton("Conversor de temperaturas");
		btnConversorDeTemperaturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorTemperaturas ct = new ConversorTemperaturas();
				ct.setVisible(true);
				
			}
		});
		btnConversorDeTemperaturas.setBackground(new Color(229, 227, 228));
		btnConversorDeTemperaturas.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 14));
		btnConversorDeTemperaturas.setBounds(0, 357, 227, 46);
		panel.add(btnConversorDeTemperaturas);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(40, 64, 147, 146);
		ImageIcon ico = new ImageIcon (getClass().getResource ("refresh.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_1.getWidth(),lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH));
		lblNewLabel_1.setIcon(img);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(91, 161, 153));
		panel_1.setBounds(224, 36, 560, 148);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Conversor");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 46));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 11, 560, 126);
		panel_1.add(lblNewLabel);
		
		JTextArea txtrBienvenidosAlConversor = new JTextArea();
		txtrBienvenidosAlConversor.setForeground(new Color(0, 0, 0));
		txtrBienvenidosAlConversor.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		txtrBienvenidosAlConversor.setBackground(new Color(187, 198, 200));
		txtrBienvenidosAlConversor.setEditable(false);
		txtrBienvenidosAlConversor.setWrapStyleWord(true);
		txtrBienvenidosAlConversor.setLineWrap(true);
		txtrBienvenidosAlConversor.setText("Bienvenidos al conversor de monedas y de temperaturas\r\n\r\nPara seleccionar cual desea utilizar, escoja el correspondiente en el menu de la izquierda");
		txtrBienvenidosAlConversor.setBounds(234, 195, 540, 255);
		contentPane.add(txtrBienvenidosAlConversor);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
