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
		setBounds(100, 100, 1127, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(976, 408, 89, 23);
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
		textPName.setBounds(26, 107, 252, 20);
		contentPane.add(textPName);
		
		JLabel lblPName = new JLabel("Nome do Socio");
		lblPName.setBounds(26, 76, 134, 20);
		contentPane.add(lblPName);
		
		JTextPane textPRG = new JTextPane();
		textPRG.setBounds(288, 107, 150, 20);
		contentPane.add(textPRG);
		
		JLabel lblPRG = new JLabel("RG");
		lblPRG.setBounds(288, 90, 46, 14);
		contentPane.add(lblPRG);
		
		JLabel lblPCPF = new JLabel("CPF");
		lblPCPF.setBounds(448, 90, 46, 14);
		contentPane.add(lblPCPF);
		
		JTextPane textPCPF = new JTextPane();
		textPCPF.setBounds(448, 107, 151, 20);
		contentPane.add(textPCPF);
		
		JTextPane textPCNH = new JTextPane();
		textPCNH.setBounds(629, 107, 134, 20);
		contentPane.add(textPCNH);
		
		JLabel lblPCNH = new JLabel("CNH");
		lblPCNH.setBounds(629, 90, 46, 14);
		contentPane.add(lblPCNH);
		
		JLabel lblPPIS = new JLabel("PIS");
		lblPPIS.setBounds(797, 90, 46, 14);
		contentPane.add(lblPPIS);
		
		JTextPane textPPIS = new JTextPane();
		textPPIS.setBounds(797, 107, 95, 20);
		contentPane.add(textPPIS);
		
		JTextPane textPDatBir = new JTextPane();
		textPDatBir.setBounds(914, 107, 151, 20);
		contentPane.add(textPDatBir);
		
		JLabel lblPDatBir = new JLabel("Data de Nascimento");
		lblPDatBir.setBounds(914, 90, 151, 14);
		contentPane.add(lblPDatBir);
		
		JLabel lblPVotReg = new JLabel("Titulo de Eleitor");
		lblPVotReg.setBounds(863, 233, 136, 14);
		contentPane.add(lblPVotReg);
		
		JTextPane textPVotReg = new JTextPane();
		textPVotReg.setBounds(862, 253, 203, 20);
		contentPane.add(textPVotReg);
		
		JLabel lblPAddress = new JLabel("Endere\u00E7o");
		lblPAddress.setBounds(26, 143, 69, 20);
		contentPane.add(lblPAddress);
		
		JTextPane textPAddress = new JTextPane();
		textPAddress.setBounds(26, 163, 333, 26);
		contentPane.add(textPAddress);
		
		JLabel lblPNeig = new JLabel("Bairro");
		lblPNeig.setBounds(400, 143, 69, 20);
		contentPane.add(lblPNeig);
		
		JTextPane textPNeig = new JTextPane();
		textPNeig.setBounds(400, 163, 216, 26);
		contentPane.add(textPNeig);
		
		JLabel lblPCEP = new JLabel("CEP");
		lblPCEP.setBounds(650, 143, 69, 20);
		contentPane.add(lblPCEP);
		
		JTextPane textPCEP = new JTextPane();
		textPCEP.setBounds(650, 163, 167, 26);
		contentPane.add(textPCEP);
		
		JTextPane textPCity = new JTextPane();
		textPCity.setBounds(849, 163, 216, 26);
		contentPane.add(textPCity);
		
		JLabel lblPCity = new JLabel("Cidade/UF");
		lblPCity.setBounds(849, 143, 125, 20);
		contentPane.add(lblPCity);
		
		JTextPane textPPosition = new JTextPane();
		textPPosition.setBounds(971, 344, 94, 20);
		contentPane.add(textPPosition);
		
		JLabel lblPPosition = new JLabel("Posi\u00E7\u00E3o ");
		lblPPosition.setBounds(971, 327, 94, 14);
		contentPane.add(lblPPosition);
		
		JTextPane textPDatIssRG = new JTextPane();
		textPDatIssRG.setBounds(26, 344, 95, 20);
		contentPane.add(textPDatIssRG);
		
		JLabel lblPDatIssRG = new JLabel("Data do RG");
		lblPDatIssRG.setBounds(26, 327, 95, 14);
		contentPane.add(lblPDatIssRG);
		
		JLabel lblPEmitOrgRG = new JLabel("Emissor Rg");
		lblPEmitOrgRG.setBounds(212, 324, 100, 14);
		contentPane.add(lblPEmitOrgRG);
		
		JTextPane textPEmitOrgRG = new JTextPane();
		textPEmitOrgRG.setBounds(212, 344, 100, 20);
		contentPane.add(textPEmitOrgRG);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(468, 253, 302, 20);
		contentPane.add(textPane);
		
		JLabel lblPMotName = new JLabel("Nome da M\u00E3e");
		lblPMotName.setBounds(469, 233, 102, 14);
		contentPane.add(lblPMotName);
		
		JTextPane textPDadName = new JTextPane();
		textPDadName.setBounds(26, 253, 333, 20);
		contentPane.add(textPDadName);
		
		JLabel lblPDadName = new JLabel("Nome do Pai");
		lblPDadName.setBounds(26, 233, 95, 14);
		contentPane.add(lblPDadName);
		
		JLabel lblPNatural = new JLabel("Naturalidade");
		lblPNatural.setBounds(723, 327, 114, 14);
		contentPane.add(lblPNatural);
		
		JTextPane textPNatural = new JTextPane();
		textPNatural.setBounds(723, 344, 190, 20);
		contentPane.add(textPNatural);
		
		JLabel lblPMarSta = new JLabel("Estado Civil");
		lblPMarSta.setBounds(360, 324, 117, 14);
		contentPane.add(lblPMarSta);
		
		JTextPane textPMarSta = new JTextPane();
		textPMarSta.setBounds(357, 344, 120, 20);
		contentPane.add(textPMarSta);
		
		JTextPane textPParticipation = new JTextPane();
		textPParticipation.setBounds(533, 344, 150, 20);
		contentPane.add(textPParticipation);
		
		JLabel lblPParticipation = new JLabel("Participa\u00E7\u00E3o");
		lblPParticipation.setBounds(533, 324, 118, 14);
		contentPane.add(lblPParticipation);
	}
}
