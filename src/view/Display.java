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
	private JPanel panelPatners;

	/**
	 * Launch the application.
	

	/**
	 * Create the frame.
	 */
	public Display() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelData = new JPanel();
		panelData.setBounds(15, 0, 1086, 118);
		contentPane.add(panelData);
		panelData.setLayout(null);
		
		JLabel lblName = new JLabel("Raz\u00E3o Social");
		lblName.setBounds(15, 16, 108, 20);
		panelData.add(lblName);
		
		JLabel lblFantasyName = new JLabel("Fantasia");
		lblFantasyName.setBounds(315, 16, 69, 20);
		panelData.add(lblFantasyName);
		
		JTextPane textFantasyName = new JTextPane();
		textFantasyName.setEditable(false);
		textFantasyName.setBounds(314, 36, 256, 26);
		panelData.add(textFantasyName);
		
		JLabel lblPhone = new JLabel("Telefone");
		lblPhone.setBounds(620, 16, 69, 20);
		panelData.add(lblPhone);
		
		textPhone = new JTextPane();
		textPhone.setEditable(false);
		textPhone.setBounds(622, 36, 140, 26);
		panelData.add(textPhone);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(823, 16, 69, 20);
		panelData.add(lblNewLabel);
		
		JTextPane textEmail = new JTextPane();
		textEmail.setEditable(false);
		textEmail.setBounds(823, 36, 212, 26);
		panelData.add(textEmail);
		
		JTextPane textName = new JTextPane();
		textName.setEditable(false);
		textName.setBounds(15, 36, 240, 26);
		panelData.add(textName);
		
		JLabel lblAddress = new JLabel("Endere\u00E7o");
		lblAddress.setBounds(15, 66, 69, 20);
		panelData.add(lblAddress);
		
		JTextPane textAddresss = new JTextPane();
		textAddresss.setEditable(false);
		textAddresss.setBounds(15, 86, 302, 26);
		panelData.add(textAddresss);
		
		JLabel lblNeig = new JLabel("Bairro");
		lblNeig.setBounds(393, 66, 69, 20);
		panelData.add(lblNeig);
		
		JTextPane textNeig = new JTextPane();
		textNeig.setEditable(false);
		textNeig.setBounds(393, 86, 199, 26);
		panelData.add(textNeig);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(647, 66, 69, 20);
		panelData.add(lblCEP);
		
		JTextPane textCEP = new JTextPane();
		textCEP.setEditable(false);
		textCEP.setBounds(647, 86, 167, 26);
		panelData.add(textCEP);
		
		JTextPane textCity = new JTextPane();
		textCity.setBounds(847, 86, 188, 26);
		panelData.add(textCity);
		
		JLabel lblCity = new JLabel("Cidade/UF");
		lblCity.setBounds(847, 66, 125, 20);
		panelData.add(lblCity);
		
		JPanel panelLegaci = new JPanel();
		panelLegaci.setBounds(15, 134, 1086, 129);
		contentPane.add(panelLegaci);
		panelLegaci.setLayout(null);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(15, 15, 69, 20);
		panelLegaci.add(lblCNPJ);
		
		JTextPane textCNPJ = new JTextPane();
		textCNPJ.setEditable(false);
		textCNPJ.setBounds(15, 35, 130, 26);
		panelLegaci.add(textCNPJ);
		
		JLabel lblCNAE = new JLabel("CNAE");
		lblCNAE.setBounds(171, 15, 69, 20);
		panelLegaci.add(lblCNAE);
		
		JTextPane textCNAE = new JTextPane();
		textCNAE.setEditable(false);
		textCNAE.setBounds(170, 35, 119, 26);
		panelLegaci.add(textCNAE);
		
		JLabel lblNIRE = new JLabel("NIRE");
		lblNIRE.setBounds(320, 15, 69, 20);
		panelLegaci.add(lblNIRE);
		
		JTextPane textNIRE = new JTextPane();
		textNIRE.setEditable(false);
		textNIRE.setBounds(320, 35, 119, 26);
		panelLegaci.add(textNIRE);
		
		JLabel lblCCM = new JLabel("CCM");
		lblCCM.setBounds(459, 15, 69, 20);
		panelLegaci.add(lblCCM);
		
		JTextPane textCCM = new JTextPane();
		textCCM.setEditable(false);
		textCCM.setBounds(459, 35, 119, 26);
		panelLegaci.add(textCCM);
		
		JLabel lblTFE = new JLabel("TFE");
		lblTFE.setBounds(889, 67, 69, 20);
		panelLegaci.add(lblTFE);
		
		JTextPane textTFE = new JTextPane();
		textTFE.setEditable(false);
		textTFE.setBounds(890, 87, 139, 26);
		panelLegaci.add(textTFE);
		
		JLabel lblLegNat = new JLabel("Natureza Juridica");
		lblLegNat.setBounds(17, 67, 128, 20);
		panelLegaci.add(lblLegNat);
		
		JTextPane textLegNat = new JTextPane();
		textLegNat.setEditable(false);
		textLegNat.setBounds(15, 87, 130, 26);
		panelLegaci.add(textLegNat);
		
		JLabel lblStaReg = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblStaReg.setBounds(600, 15, 130, 20);
		panelLegaci.add(lblStaReg);
		
		JTextPane textStaReg = new JTextPane();
		textStaReg.setEditable(false);
		textStaReg.setBounds(601, 35, 129, 26);
		panelLegaci.add(textStaReg);
		
		JTextPane textShaCap = new JTextPane();
		textShaCap.setEditable(false);
		textShaCap.setBounds(170, 87, 145, 26);
		panelLegaci.add(textShaCap);
		
		JLabel lblShaCap = new JLabel("Capital Social");
		lblShaCap.setBounds(167, 67, 100, 20);
		panelLegaci.add(lblShaCap);
		
		JTextPane textTaxPost = new JTextPane();
		textTaxPost.setEditable(false);
		textTaxPost.setBounds(342, 87, 145, 26);
		panelLegaci.add(textTaxPost);
		
		JLabel lblTaxPost = new JLabel("Posto Fiscal");
		lblTaxPost.setBounds(342, 67, 130, 20);
		panelLegaci.add(lblTaxPost);
		
		JTextPane textActSta = new JTextPane();
		textActSta.setEditable(false);
		textActSta.setBounds(890, 35, 139, 26);
		panelLegaci.add(textActSta);
		
		JLabel lblActSta = new JLabel("Inicio da Atividade");
		lblActSta.setBounds(890, 15, 139, 20);
		panelLegaci.add(lblActSta);
		
		JTextPane textTaxReg = new JTextPane();
		textTaxReg.setEditable(false);
		textTaxReg.setBounds(514, 87, 151, 26);
		panelLegaci.add(textTaxReg);
		
		JLabel lblTaxReg = new JLabel("Regime de tributa\u00E7\u00E3o");
		lblTaxReg.setBounds(514, 67, 176, 20);
		panelLegaci.add(lblTaxReg);
		
		JTextPane textRegOff = new JTextPane();
		textRegOff.setEditable(false);
		textRegOff.setBounds(689, 87, 154, 26);
		panelLegaci.add(textRegOff);
		
		JLabel lblRegOff = new JLabel("Registro no Cartorio");
		lblRegOff.setBounds(689, 67, 156, 20);
		panelLegaci.add(lblRegOff);
		
		JTextPane textISS = new JTextPane();
		textISS.setEditable(false);
		textISS.setBounds(759, 35, 82, 26);
		panelLegaci.add(textISS);
		
		JLabel lblISS = new JLabel("ISS");
		lblISS.setBounds(763, 15, 37, 20);
		panelLegaci.add(lblISS);
		
		panelPatners = new JPanel();
		panelPatners.setBounds(15, 274, 1086, 142);
		contentPane.add(panelPatners);
		panelPatners.setLayout(null);
		
		JTextPane textPName = new JTextPane();
		textPName.setEditable(false);
		textPName.setBounds(10, 20, 179, 20);
		panelPatners.add(textPName);
		
		JLabel lblPName = new JLabel("Nome do Socio");
		lblPName.setBounds(10, 0, 142, 20);
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
		textPCNH.setBounds(466, 20, 97, 20);
		panelPatners.add(textPCNH);
		
		JLabel lblPCNH = new JLabel("CNH");
		lblPCNH.setBounds(466, 3, 46, 14);
		panelPatners.add(lblPCNH);
		
		JLabel lblPPIS = new JLabel("PIS");
		lblPPIS.setBounds(573, 3, 46, 14);
		panelPatners.add(lblPPIS);
		
		JTextPane textPPIS = new JTextPane();
		textPPIS.setEditable(false);
		textPPIS.setBounds(573, 20, 95, 20);
		panelPatners.add(textPPIS);
		
		JTextPane textPDatBir = new JTextPane();
		textPDatBir.setEditable(false);
		textPDatBir.setBounds(865, 110, 95, 20);
		panelPatners.add(textPDatBir);
		
		JLabel lblPDatBir = new JLabel("Data de Nascimento");
		lblPDatBir.setBounds(864, 98, 116, 14);
		panelPatners.add(lblPDatBir);
		
		JLabel lblPVotReg = new JLabel("Titulo de Eleitor");
		lblPVotReg.setBounds(792, 3, 104, 14);
		panelPatners.add(lblPVotReg);
		
		JTextPane textPVotReg = new JTextPane();
		textPVotReg.setEditable(false);
		textPVotReg.setBounds(792, 20, 153, 20);
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
		textPCity.setBounds(743, 61, 188, 26);
		panelPatners.add(textPCity);
		
		JLabel lblPCity = new JLabel("Cidade/UF");
		lblPCity.setBounds(743, 41, 125, 20);
		panelPatners.add(lblPCity);
		
		JTextPane textPPosition = new JTextPane();
		textPPosition.setEditable(false);
		textPPosition.setBounds(955, 20, 77, 20);
		panelPatners.add(textPPosition);
		
		JLabel lblPPosition = new JLabel("Posi\u00E7\u00E3o ");
		lblPPosition.setBounds(955, 3, 77, 14);
		panelPatners.add(lblPPosition);
		
		JTextPane textPDatIssRG = new JTextPane();
		textPDatIssRG.setEditable(false);
		textPDatIssRG.setBounds(941, 61, 125, 26);
		panelPatners.add(textPDatIssRG);
		
		JLabel lblPDatIssRG = new JLabel("Data de emiss\u00E3o do RG");
		lblPDatIssRG.setBounds(941, 44, 135, 14);
		panelPatners.add(lblPDatIssRG);
		
		JLabel lblPEmitOrgRG = new JLabel("Org\u00E3o emissor Rg");
		lblPEmitOrgRG.setBounds(10, 90, 142, 14);
		panelPatners.add(lblPEmitOrgRG);
		
		JTextPane textPEmitOrgRG = new JTextPane();
		textPEmitOrgRG.setEditable(false);
		textPEmitOrgRG.setBounds(10, 110, 139, 20);
		panelPatners.add(textPEmitOrgRG);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(392, 110, 223, 20);
		panelPatners.add(textPane);
		
		JLabel lblPMotName = new JLabel("Nome da M\u00E3e");
		lblPMotName.setBounds(392, 90, 77, 14);
		panelPatners.add(lblPMotName);
		
		JTextPane textPDadName = new JTextPane();
		textPDadName.setBounds(625, 110, 230, 20);
		panelPatners.add(textPDadName);
		
		JLabel lblPDadName = new JLabel("Nome do Pai");
		lblPDadName.setBounds(625, 90, 97, 14);
		panelPatners.add(lblPDadName);
		
		JLabel lblPNatural = new JLabel("Naturalidade");
		lblPNatural.setBounds(277, 90, 76, 14);
		panelPatners.add(lblPNatural);
		
		JTextPane textPNatural = new JTextPane();
		textPNatural.setEditable(false);
		textPNatural.setBounds(277, 110, 105, 20);
		panelPatners.add(textPNatural);
		
		JLabel lblPMarSta = new JLabel("Estado Civil");
		lblPMarSta.setBounds(681, 3, 83, 14);
		panelPatners.add(lblPMarSta);
		
		JTextPane textPMarSta = new JTextPane();
		textPMarSta.setBounds(678, 20, 86, 20);
		panelPatners.add(textPMarSta);
		
		JTextPane textPParticipation = new JTextPane();
		textPParticipation.setBounds(159, 110, 96, 20);
		panelPatners.add(textPParticipation);
		
		JLabel lblPParticipation = new JLabel("Participa\u00E7\u00E3o");
		lblPParticipation.setBounds(159, 90, 76, 14);
		panelPatners.add(lblPParticipation);
		
		JButton btnPrint = new JButton("Imprimir");
		btnPrint.setBounds(15, 427, 133, 23);
		contentPane.add(btnPrint);
		
		JButton btnQuit = new JButton("Sair");
		btnQuit.setBounds(898, 427, 89, 23);
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
