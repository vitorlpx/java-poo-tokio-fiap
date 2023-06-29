package aulasJavaPOO.exercicios.interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.Checkbox;
import java.awt.List;
import java.awt.TextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class TelaWindowBuilder {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaWindowBuilder window = new TelaWindowBuilder();
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
	public TelaWindowBuilder() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 51, 255));
		panel.setBounds(10, 11, 253, 239);
		frame.getContentPane().add(panel);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		panel.add(tglbtnNewToggleButton);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
	}
}
