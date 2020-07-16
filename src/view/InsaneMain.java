package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.ClientTableModel;


public class InsaneMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private ClientTableModel dataModel;
	/**
	 * Create the frame.
	 */
	public InsaneMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		table = new JTable();
		table.setBounds(1, 26, 834, 0);
		table.setShowVerticalLines(false);
		table.setRowHeight(32);
		dataModel = new ClientTableModel();
		contentPane.setLayout(null);
		table.setModel(dataModel);
		contentPane.add(table);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(81, 75, 836, 392);
		contentPane.add(scroll);
		
		JButton btnAddEnterprise = new JButton("Adicionar Empresa");
		btnAddEnterprise.setBounds(759, 41, 158, 23);
		btnAddEnterprise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register register = new Register();
				register.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnAddEnterprise);
		
		JComboBox<String> filter = new JComboBox<String>();
		filter.setBounds(81, 42, 171, 20);
		filter.addItem("All");
		contentPane.add(filter);
		
		JButton btnDisplay = new JButton("Exibir Cadastro");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Display display = new Display ();
			display.setVisible(true);
			dispose();
			}
		});
		btnDisplay.setBounds(593, 41, 140, 23);
		contentPane.add(btnDisplay);
		
		JButton btnEdit = new JButton("Editar Cadastro");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit edit = new Edit();
				edit.setVisible(true);
				dispose();
			}
		});
		btnEdit.setBounds(426, 41, 140, 23);
		contentPane.add(btnEdit);
		
		
		
		
		
	}
}
