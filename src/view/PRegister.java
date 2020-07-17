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
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(898, 408, 89, 23);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register register = new Register();
				register.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnSave);
		
		btnQuit = new JButton("Sair");
		btnQuit.setBounds(26, 408, 89, 23);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register ();
				register.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnQuit);
		
		JTextPane textPName = new JTextPane();
		textPName.setBounds(26, 50, 263, 20);
		contentPane.add(textPName);
		textPName.setEditable(false);
		
		JLabel lblPName = new JLabel("Nome do Socio");
		lblPName.setBounds(26, 30, 134, 20);
		contentPane.add(lblPName);
		
		JTextPane textPRG = new JTextPane();
		textPRG.setBounds(65, 107, 116, 20);
		contentPane.add(textPRG);
		textPRG.setEditable(false);
		
		JLabel lblPRG = new JLabel("RG");
		lblPRG.setBounds(65, 90, 46, 14);
		contentPane.add(lblPRG);
		
		JLabel lblPCPF = new JLabel("CPF");
		lblPCPF.setBounds(191, 90, 46, 14);
		contentPane.add(lblPCPF);
		
		JTextPane textPCPF = new JTextPane();
		textPCPF.setBounds(191, 107, 125, 20);
		contentPane.add(textPCPF);
		textPCPF.setEditable(false);
		
		JTextPane textPCNH = new JTextPane();
		textPCNH.setBounds(370, 107, 76, 20);
		contentPane.add(textPCNH);
		textPCNH.setEditable(false);
		
		JLabel lblPCNH = new JLabel("CNH");
		lblPCNH.setBounds(370, 90, 46, 14);
		contentPane.add(lblPCNH);
		
		JLabel lblPPIS = new JLabel("PIS");
		lblPPIS.setBounds(454, 90, 46, 14);
		contentPane.add(lblPPIS);
		
		JTextPane textPPIS = new JTextPane();
		textPPIS.setBounds(456, 107, 95, 20);
		contentPane.add(textPPIS);
		textPPIS.setEditable(false);
		
		JTextPane textPDatBir = new JTextPane();
		textPDatBir.setBounds(604, 107, 151, 20);
		contentPane.add(textPDatBir);
		textPDatBir.setEditable(false);
		
		JLabel lblPDatBir = new JLabel("Data de Nascimento");
		lblPDatBir.setBounds(604, 90, 151, 14);
		contentPane.add(lblPDatBir);
		
		JLabel lblPVotReg = new JLabel("Titulo de Eleitor");
		lblPVotReg.setBounds(807, 90, 136, 14);
		contentPane.add(lblPVotReg);
		
		JTextPane textPVotReg = new JTextPane();
		textPVotReg.setBounds(806, 107, 137, 20);
		contentPane.add(textPVotReg);
		textPVotReg.setEditable(false);
		
		JLabel lblPAddress = new JLabel("Endere\u00E7o");
		lblPAddress.setBounds(26, 143, 69, 20);
		contentPane.add(lblPAddress);
		
		JTextPane textPAddress = new JTextPane();
		textPAddress.setBounds(26, 163, 302, 26);
		contentPane.add(textPAddress);
		textPAddress.setEditable(false);
		
		JLabel lblPNeig = new JLabel("Bairro");
		lblPNeig.setBounds(352, 143, 69, 20);
		contentPane.add(lblPNeig);
		
		JTextPane textPNeig = new JTextPane();
		textPNeig.setBounds(352, 163, 199, 26);
		contentPane.add(textPNeig);
		textPNeig.setEditable(false);
		
		JLabel lblPCEP = new JLabel("CEP");
		lblPCEP.setBounds(582, 143, 69, 20);
		contentPane.add(lblPCEP);
		
		JTextPane textPCEP = new JTextPane();
		textPCEP.setBounds(582, 163, 167, 26);
		contentPane.add(textPCEP);
		textPCEP.setEditable(false);
		
		JTextPane textPCity = new JTextPane();
		textPCity.setBounds(779, 163, 188, 26);
		contentPane.add(textPCity);
		
		JLabel lblPCity = new JLabel("Cidade/UF");
		lblPCity.setBounds(785, 143, 125, 20);
		contentPane.add(lblPCity);
		
		JTextPane textPPosition = new JTextPane();
		textPPosition.setBounds(849, 344, 94, 20);
		contentPane.add(textPPosition);
		textPPosition.setEditable(false);
		
		JLabel lblPPosition = new JLabel("Posi\u00E7\u00E3o ");
		lblPPosition.setBounds(849, 327, 94, 14);
		contentPane.add(lblPPosition);
		
		JTextPane textPDatIssRG = new JTextPane();
		textPDatIssRG.setBounds(65, 344, 95, 20);
		contentPane.add(textPDatIssRG);
		textPDatIssRG.setEditable(false);
		
		JLabel lblPDatIssRG = new JLabel("Data do RG");
		lblPDatIssRG.setBounds(65, 324, 95, 14);
		contentPane.add(lblPDatIssRG);
		
		JLabel lblPEmitOrgRG = new JLabel("Emissor Rg");
		lblPEmitOrgRG.setBounds(212, 324, 100, 14);
		contentPane.add(lblPEmitOrgRG);
		
		JTextPane textPEmitOrgRG = new JTextPane();
		textPEmitOrgRG.setBounds(212, 344, 100, 20);
		contentPane.add(textPEmitOrgRG);
		textPEmitOrgRG.setEditable(false);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(551, 253, 302, 20);
		contentPane.add(textPane);
		textPane.setEditable(false);
		
		JLabel lblPMotName = new JLabel("Nome da M\u00E3e");
		lblPMotName.setBounds(551, 233, 102, 14);
		contentPane.add(lblPMotName);
		
		JTextPane textPDadName = new JTextPane();
		textPDadName.setBounds(65, 253, 263, 20);
		contentPane.add(textPDadName);
		
		JLabel lblPDadName = new JLabel("Nome do Pai");
		lblPDadName.setBounds(65, 233, 95, 14);
		contentPane.add(lblPDadName);
		
		JLabel lblPNatural = new JLabel("Naturalidade");
		lblPNatural.setBounds(703, 324, 114, 14);
		contentPane.add(lblPNatural);
		
		JTextPane textPNatural = new JTextPane();
		textPNatural.setBounds(702, 344, 115, 20);
		contentPane.add(textPNatural);
		textPNatural.setEditable(false);
		
		JLabel lblPMarSta = new JLabel("Estado Civil");
		lblPMarSta.setBounds(360, 324, 117, 14);
		contentPane.add(lblPMarSta);
		
		JTextPane textPMarSta = new JTextPane();
		textPMarSta.setBounds(357, 344, 120, 20);
		contentPane.add(textPMarSta);
		
		JTextPane textPParticipation = new JTextPane();
		textPParticipation.setBounds(533, 344, 118, 20);
		contentPane.add(textPParticipation);
		
		JLabel lblPParticipation = new JLabel("Participa\u00E7\u00E3o");
		lblPParticipation.setBounds(533, 324, 118, 14);
		contentPane.add(lblPParticipation);
	}
}
