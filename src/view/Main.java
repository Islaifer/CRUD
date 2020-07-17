package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 1127, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		JLabel lblWelcome = new JLabel("Bem-Vindo ^-^");
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 32));
		lblWelcome.setBounds(461, 151, 211, 86);
		contentPane.add(lblWelcome);
		
		JButton btnEnter = new JButton("Entrar");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsaneMain main = new InsaneMain();
				main.setVisible(true);
				dispose();
			}
		});
		btnEnter.setBounds(487, 248, 148, 31);
		contentPane.add(btnEnter);
		
		JButton btnExit = new JButton("Sair");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(487, 354, 148, 31);
		contentPane.add(btnExit);
		
		JButton btnCredits = new JButton("Cr\u00E9ditos");
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Creditos:\n"
						+ "Adryen Simoes de Oliveira"
						+ " - Desenvolvedor\n"
						+ "Mateus Massami Ribeiro - Desenvolvedor e engenheiro de software");
			}
		});
		btnCredits.setBounds(487, 301, 148, 31);
		contentPane.add(btnCredits);
	}
}
