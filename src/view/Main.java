package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnter = new JButton("Entrar");
		btnEnter.setBounds(304, 253, 148, 31);
		contentPane.add(btnEnter);
		
		JLabel lblWelcome = new JLabel("Bem-Vindo ^-^");
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 32));
		lblWelcome.setBounds(279, 131, 211, 86);
		contentPane.add(lblWelcome);
		
		JButton btnExit = new JButton("Sair");
		btnExit.setBounds(304, 364, 148, 31);
		contentPane.add(btnExit);
		
		JButton btnCredits = new JButton("Cr\u00E9ditos");
		btnCredits.setBounds(304, 308, 148, 31);
		contentPane.add(btnCredits);
	}
}
