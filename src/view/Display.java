package view;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextPane textPhone;

	/**
	 * Launch the application.
	

	/**
	 * Create the frame.
	 */
	public Display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 972, 118);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Raz\u00E3o Social");
		lblName.setBounds(15, 16, 108, 20);
		panel.add(lblName);
		
		JLabel lblFantasyName = new JLabel("Fantasia");
		lblFantasyName.setBounds(282, 16, 69, 20);
		panel.add(lblFantasyName);
		
		JTextPane textFantasyName = new JTextPane();
		textFantasyName.setEditable(false);
		textFantasyName.setBounds(282, 36, 256, 26);
		panel.add(textFantasyName);
		
		JLabel lblPhone = new JLabel("Felefone");
		lblPhone.setBounds(571, 16, 69, 20);
		panel.add(lblPhone);
		
		textPhone = new JTextPane();
		textPhone.setEditable(false);
		textPhone.setBounds(571, 36, 140, 26);
		panel.add(textPhone);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(745, 16, 69, 20);
		panel.add(lblNewLabel);
		
		JTextPane textEmail = new JTextPane();
		textEmail.setEditable(false);
		textEmail.setBounds(745, 36, 212, 26);
		panel.add(textEmail);
		
		JTextPane textName = new JTextPane();
		textName.setEditable(false);
		textName.setBounds(15, 36, 240, 26);
		panel.add(textName);
		
		JLabel lblAddress = new JLabel("Endere\u00E7o");
		lblAddress.setBounds(15, 66, 69, 20);
		panel.add(lblAddress);
		
		JTextPane textAddresss = new JTextPane();
		textAddresss.setEditable(false);
		textAddresss.setBounds(15, 86, 302, 26);
		panel.add(textAddresss);
		
		JLabel lblNeig = new JLabel("Bairro");
		lblNeig.setBounds(341, 66, 69, 20);
		panel.add(lblNeig);
		
		JTextPane textNeig = new JTextPane();
		textNeig.setEditable(false);
		textNeig.setBounds(341, 86, 199, 26);
		panel.add(textNeig);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(571, 66, 69, 20);
		panel.add(lblCEP);
		
		JTextPane textCEP = new JTextPane();
		textCEP.setEditable(false);
		textCEP.setBounds(571, 86, 167, 26);
		panel.add(textCEP);
		
		JTextPane textCity = new JTextPane();
		textCity.setBounds(769, 86, 188, 26);
		panel.add(textCity);
		
		JLabel lblCity = new JLabel("Cidade/UF");
		lblCity.setBounds(769, 66, 125, 20);
		panel.add(lblCity);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 150, 972, 129);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(15, 15, 69, 20);
		panel_1.add(lblCNPJ);
		
		JTextPane textCNPJ = new JTextPane();
		textCNPJ.setEditable(false);
		textCNPJ.setBounds(15, 35, 130, 26);
		panel_1.add(textCNPJ);
		
		JLabel lblCNAE = new JLabel("CNAE");
		lblCNAE.setBounds(160, 15, 69, 20);
		panel_1.add(lblCNAE);
		
		JTextPane textCNAE = new JTextPane();
		textCNAE.setEditable(false);
		textCNAE.setBounds(160, 35, 119, 26);
		panel_1.add(textCNAE);
		
		JLabel lblNIRE = new JLabel("NIRE");
		lblNIRE.setEnabled(false);
		lblNIRE.setBounds(294, 15, 69, 20);
		panel_1.add(lblNIRE);
		
		JTextPane textNIRE = new JTextPane();
		textNIRE.setEditable(false);
		textNIRE.setBounds(294, 35, 119, 26);
		panel_1.add(textNIRE);
		
		JLabel lblCCM = new JLabel("CCM");
		lblCCM.setBounds(428, 15, 69, 20);
		panel_1.add(lblCCM);
		
		JTextPane textCCM = new JTextPane();
		textCCM.setEditable(false);
		textCCM.setBounds(428, 35, 119, 26);
		panel_1.add(textCCM);
		
		JLabel lblTFE = new JLabel("TFE");
		lblTFE.setBounds(815, 67, 69, 20);
		panel_1.add(lblTFE);
		
		JTextPane textTFE = new JTextPane();
		textTFE.setEditable(false);
		textTFE.setBounds(815, 87, 82, 26);
		panel_1.add(textTFE);
		
		JLabel lblLegNat = new JLabel("Natureza Juridica");
		lblLegNat.setBounds(17, 67, 128, 20);
		panel_1.add(lblLegNat);
		
		JTextPane textLegNat = new JTextPane();
		textLegNat.setEditable(false);
		textLegNat.setBounds(15, 87, 130, 26);
		panel_1.add(textLegNat);
		
		JLabel lblStaReg = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblStaReg.setBounds(562, 15, 130, 20);
		panel_1.add(lblStaReg);
		
		JTextPane textStaReg = new JTextPane();
		textStaReg.setEditable(false);
		textStaReg.setBounds(563, 35, 129, 26);
		panel_1.add(textStaReg);
		
		JTextPane textShaCap = new JTextPane();
		textShaCap.setEditable(false);
		textShaCap.setBounds(160, 87, 145, 26);
		panel_1.add(textShaCap);
		
		JLabel lblShaCap = new JLabel("Capital Social");
		lblShaCap.setBounds(160, 67, 100, 20);
		panel_1.add(lblShaCap);
		
		JTextPane textTaxPost = new JTextPane();
		textTaxPost.setEditable(false);
		textTaxPost.setBounds(320, 87, 145, 26);
		panel_1.add(textTaxPost);
		
		JLabel lblTaxPost = new JLabel("Posto Fiscal");
		lblTaxPost.setBounds(320, 67, 130, 20);
		panel_1.add(lblTaxPost);
		
		JTextPane textActSta = new JTextPane();
		textActSta.setEditable(false);
		textActSta.setBounds(805, 35, 139, 26);
		panel_1.add(textActSta);
		
		JLabel lblActSta = new JLabel("Inicio da Atividade");
		lblActSta.setBounds(805, 15, 139, 20);
		panel_1.add(lblActSta);
		
		JTextPane textTaxReg = new JTextPane();
		textTaxReg.setEditable(false);
		textTaxReg.setBounds(480, 87, 151, 26);
		panel_1.add(textTaxReg);
		
		JLabel lblTaxReg = new JLabel("Regime de tributa\u00E7\u00E3o");
		lblTaxReg.setBounds(480, 64, 176, 20);
		panel_1.add(lblTaxReg);
		
		JTextPane textRegOff = new JTextPane();
		textRegOff.setEditable(false);
		textRegOff.setBounds(646, 87, 154, 26);
		panel_1.add(textRegOff);
		
		JLabel lblRegOff = new JLabel("Registro no Cartorio");
		lblRegOff.setBounds(646, 67, 156, 20);
		panel_1.add(lblRegOff);
		
		JTextPane textISS = new JTextPane();
		textISS.setEditable(false);
		textISS.setBounds(707, 35, 82, 26);
		panel_1.add(textISS);
		
		JLabel lblISS = new JLabel("ISS");
		lblISS.setBounds(707, 15, 37, 20);
		panel_1.add(lblISS);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(15, 290, 972, 142);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane textPName = new JTextPane();
		textPName.setEditable(false);
		textPName.setBounds(15, 35, 179, 20);
		panel_2.add(textPName);
		
		JLabel lblPName = new JLabel("Nome do Socio");
		lblPName.setBounds(15, 15, 76, 20);
		panel_2.add(lblPName);
		
		JTextPane textPRG = new JTextPane();
		textPRG.setEditable(false);
		textPRG.setBounds(204, 35, 116, 20);
		panel_2.add(textPRG);
		
		JLabel lblPRG = new JLabel("RG");
		lblPRG.setBounds(204, 18, 46, 14);
		panel_2.add(lblPRG);
		
		JLabel lblPCPF = new JLabel("CPF");
		lblPCPF.setBounds(330, 18, 46, 14);
		panel_2.add(lblPCPF);
		
		JTextPane textPCPF = new JTextPane();
		textPCPF.setBounds(330, 35, 125, 20);
		panel_2.add(textPCPF);
		
		JTextPane textPCNH = new JTextPane();
		textPCNH.setBounds(471, 35, 76, 20);
		panel_2.add(textPCNH);
		
		JLabel lblPCNH = new JLabel("CNH");
		lblPCNH.setBounds(471, 18, 46, 14);
		panel_2.add(lblPCNH);
		
		JLabel lblPPIS = new JLabel("PIS");
		lblPPIS.setBounds(555, 18, 46, 14);
		panel_2.add(lblPPIS);
		
		JTextPane textPPIS = new JTextPane();
		textPPIS.setBounds(557, 35, 95, 20);
		panel_2.add(textPPIS);
		
		JTextPane textPDatBir = new JTextPane();
		textPDatBir.setBounds(662, 35, 95, 20);
		panel_2.add(textPDatBir);
		
		JLabel lblPDatBir = new JLabel("Data de Nascimento");
		lblPDatBir.setBounds(662, 18, 116, 14);
		panel_2.add(lblPDatBir);
		
		JButton btnPrint = new JButton("Imprimir");
		btnPrint.setBounds(15, 444, 89, 23);
		contentPane.add(btnPrint);
		
		JButton btnQuit = new JButton("Sair");
		btnQuit.setBounds(898, 443, 89, 23);
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsaneMain main = new InsaneMain();
				main.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnQuit);
	}
}
