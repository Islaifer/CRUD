package view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PRegister extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnQuit;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public PRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPatners = new JPanel();
		panelPatners.setLayout(null);
		panelPatners.setBounds(10, 24, 972, 142);
		contentPane.add(panelPatners);
		
		JTextPane textPName = new JTextPane();
		textPName.setEditable(false);
		textPName.setBounds(10, 20, 179, 20);
		panelPatners.add(textPName);
		
		JLabel lblPName = new JLabel("Nome do Socio");
		lblPName.setBounds(10, 0, 76, 20);
		panelPatners.add(lblPName);
		
		JTextPane textPRG = new JTextPane();
		textPRG.setEditable(false);
		textPRG.setBounds(199, 20, 116, 20);
		panelPatners.add(textPRG);
		
		JLabel lblPRG = new JLabel("RG");
		lblPRG.setBounds(199, 3, 46, 14);
		panelPatners.add(lblPRG);
		
		JLabel lblPCPF = new JLabel("CPF");
		lblPCPF.setBounds(325, 3, 46, 14);
		panelPatners.add(lblPCPF);
		
		JTextPane textPCPF = new JTextPane();
		textPCPF.setEditable(false);
		textPCPF.setBounds(325, 20, 125, 20);
		panelPatners.add(textPCPF);
		
		JTextPane textPCNH = new JTextPane();
		textPCNH.setEditable(false);
		textPCNH.setBounds(466, 20, 76, 20);
		panelPatners.add(textPCNH);
		
		JLabel lblPCNH = new JLabel("CNH");
		lblPCNH.setBounds(466, 3, 46, 14);
		panelPatners.add(lblPCNH);
		
		JLabel lblPPIS = new JLabel("PIS");
		lblPPIS.setBounds(550, 3, 46, 14);
		panelPatners.add(lblPPIS);
		
		JTextPane textPPIS = new JTextPane();
		textPPIS.setEditable(false);
		textPPIS.setBounds(552, 20, 95, 20);
		panelPatners.add(textPPIS);
		
		JTextPane textPDatBir = new JTextPane();
		textPDatBir.setEditable(false);
		textPDatBir.setBounds(657, 20, 95, 20);
		panelPatners.add(textPDatBir);
		
		JLabel lblPDatBir = new JLabel("Data de Nascimento");
		lblPDatBir.setBounds(657, 3, 116, 14);
		panelPatners.add(lblPDatBir);
		
		JLabel lblPVotReg = new JLabel("Titulo de Eleitor");
		lblPVotReg.setBounds(763, 3, 76, 14);
		panelPatners.add(lblPVotReg);
		
		JTextPane textPVotReg = new JTextPane();
		textPVotReg.setEditable(false);
		textPVotReg.setBounds(762, 20, 102, 20);
		panelPatners.add(textPVotReg);
		
		JLabel lblPAddress = new JLabel("Endere\u00E7o");
		lblPAddress.setBounds(10, 41, 69, 20);
		panelPatners.add(lblPAddress);
		
		JTextPane textPAddress = new JTextPane();
		textPAddress.setEditable(false);
		textPAddress.setBounds(10, 61, 302, 26);
		panelPatners.add(textPAddress);
		
		JLabel lblPNeig = new JLabel("Bairro");
		lblPNeig.setBounds(336, 41, 69, 20);
		panelPatners.add(lblPNeig);
		
		JTextPane textPNeig = new JTextPane();
		textPNeig.setEditable(false);
		textPNeig.setBounds(336, 61, 199, 26);
		panelPatners.add(textPNeig);
		
		JLabel lblPCEP = new JLabel("CEP");
		lblPCEP.setBounds(566, 41, 69, 20);
		panelPatners.add(lblPCEP);
		
		JTextPane textPCEP = new JTextPane();
		textPCEP.setEditable(false);
		textPCEP.setBounds(566, 61, 167, 26);
		panelPatners.add(textPCEP);
		
		JTextPane textPCity = new JTextPane();
		textPCity.setBounds(763, 61, 188, 26);
		panelPatners.add(textPCity);
		
		JLabel lblPCity = new JLabel("Cidade/UF");
		lblPCity.setBounds(769, 41, 125, 20);
		panelPatners.add(lblPCity);
		
		JTextPane textPPosition = new JTextPane();
		textPPosition.setEditable(false);
		textPPosition.setBounds(874, 20, 77, 20);
		panelPatners.add(textPPosition);
		
		JLabel lblPPosition = new JLabel("Posi\u00E7\u00E3o ");
		lblPPosition.setBounds(874, 3, 46, 14);
		panelPatners.add(lblPPosition);
		
		JTextPane textPDatIssRG = new JTextPane();
		textPDatIssRG.setEditable(false);
		textPDatIssRG.setBounds(10, 110, 58, 20);
		panelPatners.add(textPDatIssRG);
		
		JLabel lblPDatIssRG = new JLabel("Data do RG");
		lblPDatIssRG.setBounds(10, 90, 58, 14);
		panelPatners.add(lblPDatIssRG);
		
		JLabel lblPEmitOrgRG = new JLabel("Emissor Rg");
		lblPEmitOrgRG.setBounds(78, 90, 58, 14);
		panelPatners.add(lblPEmitOrgRG);
		
		JTextPane textPEmitOrgRG = new JTextPane();
		textPEmitOrgRG.setEditable(false);
		textPEmitOrgRG.setBounds(78, 110, 55, 20);
		panelPatners.add(textPEmitOrgRG);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(478, 110, 223, 20);
		panelPatners.add(textPane);
		
		JLabel lblPMotName = new JLabel("Nome da M\u00E3e");
		lblPMotName.setBounds(478, 90, 77, 14);
		panelPatners.add(lblPMotName);
		
		JTextPane textPDadName = new JTextPane();
		textPDadName.setBounds(721, 110, 230, 20);
		panelPatners.add(textPDadName);
		
		JLabel lblPDadName = new JLabel("Nome do Pai");
		lblPDadName.setBounds(721, 90, 60, 14);
		panelPatners.add(lblPDadName);
		
		JLabel lblPNatural = new JLabel("Naturalidade");
		lblPNatural.setBounds(346, 90, 76, 14);
		panelPatners.add(lblPNatural);
		
		JTextPane textPNatural = new JTextPane();
		textPNatural.setEditable(false);
		textPNatural.setBounds(345, 110, 105, 20);
		panelPatners.add(textPNatural);
		
		JLabel lblPMarSta = new JLabel("Estado Civil");
		lblPMarSta.setBounds(146, 90, 69, 14);
		panelPatners.add(lblPMarSta);
		
		JTextPane textPMarSta = new JTextPane();
		textPMarSta.setBounds(143, 110, 86, 20);
		panelPatners.add(textPMarSta);
		
		JTextPane textPParticipation = new JTextPane();
		textPParticipation.setBounds(239, 110, 96, 20);
		panelPatners.add(textPParticipation);
		
		JLabel lblPParticipation = new JLabel("Participa\u00E7\u00E3o");
		lblPParticipation.setBounds(239, 90, 76, 14);
		panelPatners.add(lblPParticipation);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register register = new Register();
				register.setVisible(true);
				dispose();
			}
		});
		btnSave.setBounds(327, 321, 89, 23);
		contentPane.add(btnSave);
		
		btnQuit = new JButton("Sair");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register ();
				register.setVisible(true);
				dispose();
			}
		});
		btnQuit.setBounds(191, 321, 89, 23);
		contentPane.add(btnQuit);
	}
}
