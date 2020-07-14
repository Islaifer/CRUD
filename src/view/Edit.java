package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class Edit extends JFrame {

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
	public Edit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane textName = new JTextPane();
		textName.setBounds(45, 57, 342, 26);
		contentPane.add(textName);

		JTextPane textFantasyName = new JTextPane();
		textFantasyName.setBounds(489, 57, 471, 26);
		contentPane.add(textFantasyName);

		JLabel lblName = new JLabel("Nome da empresa");
		lblName.setBounds(45, 37, 142, 20);
		contentPane.add(lblName);

		JLabel lblFantasyName = new JLabel("Nome Fantasia");
		lblFantasyName.setBounds(488, 37, 113, 20);
		contentPane.add(lblFantasyName);

		JTextPane textCNPJ = new JTextPane();
		textCNPJ.setBounds(45, 122, 196, 26);
		contentPane.add(textCNPJ);

		JLabel lblCNPJ = new JLabel("CNPJ");
		lblCNPJ.setBounds(45, 102, 69, 20);
		contentPane.add(lblCNPJ);

		JTextPane textCNAE = new JTextPane();
		textCNAE.setBounds(273, 122, 148, 26);
		contentPane.add(textCNAE);

		JLabel lblCNAE = new JLabel("CNAE");
		lblCNAE.setBounds(272, 102, 69, 20);
		contentPane.add(lblCNAE);

		JTextPane textNIRE = new JTextPane();
		textNIRE.setBounds(449, 122, 157, 26);
		contentPane.add(textNIRE);

		JLabel lblNIRE = new JLabel("NIRE");
		lblNIRE.setBounds(449, 102, 69, 20);
		contentPane.add(lblNIRE);

		JTextPane textCCM = new JTextPane();
		textCCM.setBounds(646, 122, 148, 26);
		contentPane.add(textCCM);

		JLabel lblCCM = new JLabel("CCM");
		lblCCM.setBounds(646, 102, 69, 20);
		contentPane.add(lblCCM);

		JLabel lblISS = new JLabel("ISS");
		lblISS.setBounds(45, 167, 138, 20);
		contentPane.add(lblISS);

		JTextPane textISS = new JTextPane();
		textISS.setBounds(45, 187, 138, 26);
		contentPane.add(textISS);

		JTextPane textTFE = new JTextPane();
		textTFE.setBounds(822, 122, 128, 26);
		contentPane.add(textTFE);

		JLabel lblTFE = new JLabel("TFE");
		lblTFE.setBounds(822, 102, 69, 20);
		contentPane.add(lblTFE);

		JLabel lblStaReg = new JLabel("Inscri\u00E7\u00E3o Estadual");
		lblStaReg.setBounds(757, 167, 148, 20);
		contentPane.add(lblStaReg);

		JTextPane textLegNat = new JTextPane();
		textLegNat.setBounds(198, 187, 142, 26);
		contentPane.add(textLegNat);

		JLabel lblLegNat = new JLabel("Natureza Juridica");
		lblLegNat.setBounds(198, 167, 142, 20);
		contentPane.add(lblLegNat);

		JTextPane textTaxReg = new JTextPane();
		textTaxReg.setBounds(354, 187, 176, 26);
		contentPane.add(textTaxReg);

		JLabel lblTaxReg = new JLabel("Regime de tributa\u00E7\u00E3o");
		lblTaxReg.setBounds(354, 164, 176, 20);
		contentPane.add(lblTaxReg);

		JTextPane textRegOff = new JTextPane();
		textRegOff.setBounds(545, 187, 197, 26);
		contentPane.add(textRegOff);

		JLabel lblRegOff = new JLabel("Registro no Cartorio");
		lblRegOff.setBounds(545, 167, 197, 20);
		contentPane.add(lblRegOff);

		JTextPane textStreet = new JTextPane();
		textStreet.setBounds(45, 249, 556, 26);
		contentPane.add(textStreet);

		JTextPane textStaReg = new JTextPane();
		textStaReg.setBounds(757, 187, 193, 26);
		contentPane.add(textStaReg);

		JLabel lblStreet = new JLabel("Rua");
		lblStreet.setBounds(45, 229, 69, 20);
		contentPane.add(lblStreet);

		JTextPane textHNumber = new JTextPane();
		textHNumber.setBounds(619, 249, 89, 26);
		contentPane.add(textHNumber);

		JLabel lblHNumber = new JLabel("Numero ");
		lblHNumber.setBounds(619, 229, 69, 20);
		contentPane.add(lblHNumber);

		JTextPane textPane = new JTextPane();
		textPane.setBounds(746, 249, 120, 26);
		contentPane.add(textPane);

		JLabel lblComp = new JLabel("Complemento");
		lblComp.setBounds(746, 229, 120, 20);
		contentPane.add(lblComp);

		JButton btnSave = new JButton("Salvar");
		btnSave.setBounds(835, 397, 115, 29);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InsaneMain main = new InsaneMain();
				main.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnSave);

		JButton btnAddPat = new JButton("Cadastrar Socio");
		btnAddPat.setBounds(45, 384, 142, 29);
		contentPane.add(btnAddPat);

		JTextPane textCity = new JTextPane();
		textCity.setBounds(45, 311, 220, 26);
		contentPane.add(textCity);

		JLabel lblCity = new JLabel("Cidade");
		lblCity.setBounds(45, 291, 69, 20);
		contentPane.add(lblCity);

		JTextPane textCounty = new JTextPane();
		textCounty.setBounds(297, 311, 276, 26);
		contentPane.add(textCounty);

		JLabel lblCounty = new JLabel("Municipio");
		lblCounty.setBounds(297, 291, 276, 20);
		contentPane.add(lblCounty);

		JTextPane textCEP = new JTextPane();
		textCEP.setBounds(601, 311, 265, 26);
		contentPane.add(textCEP);

		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setBounds(601, 291, 69, 20);
		contentPane.add(lblCEP);
		
		JButton btnRemPat = new JButton("Remover Socio");
		btnRemPat.setBounds(226, 384, 142, 29);
		contentPane.add(btnRemPat);
	}
}
