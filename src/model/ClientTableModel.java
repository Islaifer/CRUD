package model;


import javax.swing.table.AbstractTableModel;

import controller.EnterpriseController;

public class ClientTableModel extends AbstractTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EnterpriseController list;
	private String [] columns = {"1", "2", "3"};

	public ClientTableModel(EnterpriseController list) {
		this.list = list;
	}
	
	public ClientTableModel() {
		super();
	}
	
	@Override
	public String getColumnName(int column) {
		return columns[column];
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {
		if(list == null) {
			return 0;
		}else {
			return list.size();
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

}
