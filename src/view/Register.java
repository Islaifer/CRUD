package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Register extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1127, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textName = new JTextPane();
		textName.setBounds(45, 57, 436, 26);
		contentPane.add(textName);
		
		JTextPane textFantasyName = new JTextPane();
		textFantasyName.setBounds(549, 57, 521, 26);
		contentPane.add(textFantasyName);
		
		JLabel lblName = new JLabel("Nome da empresa");
		lblName.setBounds(45, 37, 142, 20);
		contentPane.add(lblName);
		
		JLabel lblFantasyName = new JLabel("Nome Fantasia");
		lblFantasyName.setBounds(549, 37, 113, 20);
		contentPane.add(lblFantasyName);
		
		JTextPane textCNPJ = new JTextPane();
		textCNPJ.setBounds(45, 122, 196, 26);
		contentPane.add(textCNPJ);
		
		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(45, 102, 69, 20);
		contentPane.add(lblCNPJ);
		
		JTextPane textCNAE = new JTextPane();
		textCNAE.setBounds(273, 122, 176, 26);
		contentPane.add(textCNAE);
		
		JLabel lblCNAE = new JLabel("CNAE");
		lblCNAE.setBounds(272, 102, 69, 20);
		contentPane.add(lblCNAE);
		
		JTextPane textNIRE = new JTextPane();
		textNIRE.setBounds(475, 122, 157, 26);
		contentPane.add(textNIRE);
		
		JLabel lblNIRE = new JLabel("NIRE");
		lblNIRE.setBounds(475, 102, 69, 20);
		contentPane.add(lblNIRE);
		
		JTextPane textCCM = new JTextPane();
		textCCM.setBounds(671, 122, 195, 26);
		contentPane.add(textCCM);
		
		JLabel lblCCM = new JLabel("CCM");
		lblCCM.setBounds(671, 102, 69, 20);
		contentPane.add(lblCCM);
		
		JLabel lblISS = new JLabel("ISS");
		lblISS.setBounds(45, 167, 138, 20);
		contentPane.add(lblISS);
		
		JTextPane textISS = new JTextPane();
		textISS.setBounds(45, 187, 138, 26);
		contentPane.add(textISS);
		
		JTextPane textTFE = new JTextPane();
		textTFE.setBounds(894, 122, 176, 26);
		contentPane.add(textTFE);
		
		JLabel lblTFE = new JLabel("TFE");
		lblTFE.setBounds(894, 102, 69, 20);
		contentPane.add(lblTFE);
		
		JLabel lblStaReg = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblStaReg.setBounds(805, 167, 148, 20);
		contentPane.add(lblStaReg);
		
		JTextPane textLegNat = new JTextPane();
		textLegNat.setBounds(198, 187, 142, 26);
		contentPane.add(textLegNat);
		
		JLabel lblLegNat = new JLabel("Natureza Juridica");
		lblLegNat.setBounds(198, 167, 142, 20);
		contentPane.add(lblLegNat);
		
		JTextPane textTaxReg = new JTextPane();
		textTaxReg.setBounds(364, 187, 176, 26);
		contentPane.add(textTaxReg);
		
		JLabel lblTaxReg = new JLabel("Regime de tributa\u00E7\u00E3o");
		lblTaxReg.setBounds(364, 167, 176, 20);
		contentPane.add(lblTaxReg);
		
		JTextPane textRegOff = new JTextPane();
		textRegOff.setBounds(570, 187, 197, 26);
		contentPane.add(textRegOff);
		
		JLabel lblRegOff = new JLabel("Registro no Cartorio");
		lblRegOff.setBounds(570, 167, 197, 20);
		contentPane.add(lblRegOff);
		
		JTextPane textStreet = new JTextPane();
		textStreet.setBounds(45, 249, 556, 26);
		contentPane.add(textStreet);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(805, 187, 265, 26);
		contentPane.add(textPane_1);
		
		JLabel lblStreet = new JLabel("Rua");
		lblStreet.setBounds(45, 229, 69, 20);
		contentPane.add(lblStreet);
		
		JTextPane textHNumber = new JTextPane();
		textHNumber.setBounds(619, 249, 89, 26);
		contentPane.add(textHNumber);
		
		JLabel lblHNumber = new JLabel("Numero ");
		lblHNumber.setBounds(619, 229, 69, 20);
		contentPane.add(lblHNumber);
		
		JTextPane textComp = new JTextPane();
		textComp.setBounds(913, 249, 157, 26);
		contentPane.add(textComp);
		
		JLabel lblComp = new JLabel("Complemento");
		lblComp.setBounds(914, 224, 120, 20);
		contentPane.add(lblComp);
		
		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(955, 398, 115, 29);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsaneMain main = new InsaneMain();
				main.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnSave);
		
		JButton btnAddPat = new JButton("Cadastrar Socio");
		btnAddPat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PRegister pregister = new PRegister();
				pregister.setVisible(true);
				dispose();
			}
		});
		btnAddPat.setBounds(45, 384, 142, 29);
		contentPane.add(btnAddPat);
		
		JTextPane textCity = new JTextPane();
		textCity.setBounds(45, 311, 207, 26);
		contentPane.add(textCity);
		
		JLabel lblCity = new JLabel("Cidade");
		lblCity.setBounds(45, 291, 69, 20);
		contentPane.add(lblCity);
		
		JTextPane textCounty = new JTextPane();
		textCounty.setBounds(286, 311, 277, 26);
		contentPane.add(textCounty);
		
		JLabel lblCounty = new JLabel("Municipio");
		lblCounty.setBounds(286, 291, 196, 20);
		contentPane.add(lblCounty);
		
		JTextPane textCEP = new JTextPane();
		textCEP.setBounds(610, 311, 157, 26);
		contentPane.add(textCEP);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(610, 286, 69, 20);
		contentPane.add(lblCEP);
		
		JTextPane textNeigh = new JTextPane();
		textNeigh.setBounds(718, 249, 185, 26);
		contentPane.add(textNeigh);
		
		JLabel lblNeigh = new JLabel("Bairro");
		lblNeigh.setBounds(718, 232, 46, 14);
		contentPane.add(lblNeigh);
		
		JTextPane textTel = new JTextPane();
		textTel.setBounds(805, 311, 265, 26);
		contentPane.add(textTel);
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setBounds(805, 294, 61, 14);
		contentPane.add(lblTel);
	}
}
