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
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setShowVerticalLines(false);
		table.setRowHeight(32);
		dataModel = new ClientTableModel();
		table.setModel(dataModel);
		contentPane.add(table);
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBounds(81, 75, 836, 392);
		contentPane.add(scroll);
		
		JButton btnAddEnterprise = new JButton("Adicionar Empresa");
		btnAddEnterprise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddEnterprise.setBounds(759, 41, 158, 23);
		contentPane.add(btnAddEnterprise);
		
		JComboBox<String> filter = new JComboBox<String>();
		filter.setBounds(81, 42, 171, 20);
		filter.addItem("All");
		contentPane.add(filter);
		
		
		
	}
}
