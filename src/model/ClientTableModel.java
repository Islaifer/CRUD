package model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ClientTableModel extends AbstractTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Object> list;
	private String [] columns = {"1", "2", "3"};

	public ClientTableModel(List<Object> list) {
		this.list = list;
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
		return list.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return null;
	}

}
