package com.java.mvc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Screen extends JFrame {

	public Screen() {
		
	}
	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		pnlPanel = new JPanel();
		JLabel1 = new JLabel();
		txtCode = new JTextField();
		JLabel2 = new JLabel();
		txtName = new JTextField();
		JLabel3 = new JLabel();
		txtPrice = new JTextField();
		btnInsert = new JButton();
		btnSelect = new JButton();
		btnAlter = new JButton();
		btnClear = new JButton();
		jScrollPane1 = new JScrollPane();
		tblExample = new JTable();
		btnDelete = new JButton();
		btnNewSearch = new JButton();
	}
	
		Class[] types = new Class [] {
				Integer.class, String.class, Double.class
		};
	
	public Class getColumnsClass(int columnIndex) {
		return types [columnIndex];
	}



	// Getters
	public JButton getBtnAlter() {
		return btnAlter;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JButton getBtnInsert() {
		return btnInsert;
	}

	public JButton getBtnClear() {
		return btnClear;
	}

	public JButton getBtnNewSearch() {
		return btnNewSearch;
	}

	public JButton getBtnSelect() {
		return btnSelect;
	}

	public JLabel getJLabel1() {
		return JLabel1;
	}

	public JLabel getJLabel2() {
		return JLabel2;
	}

	public JLabel getJLabel3() {
		return JLabel3;
	}

	public JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public JPanel getPnlPanel() {
		return pnlPanel;
	}

	public JTable getTblExample() {
		return tblExample;
	}

	public JTextField getTxtCode() {
		return txtCode;
	}

	public JTextField getTxtName() {
		return txtName;
	}

	public JTextField getTxtPrice() {
		return txtPrice;
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton btnAlter;
	private JButton btnDelete;
	private JButton btnInsert;
	private JButton btnClear;
	private JButton btnNewSearch;
	private JButton btnSelect;
	private JLabel JLabel1;
	private JLabel JLabel2;
	private JLabel JLabel3;
	private JScrollPane jScrollPane1;
	private JPanel pnlPanel;
	private JTable tblExample;
	private JTextField txtCode;
	private JTextField txtName;
	private JTextField txtPrice;
	// End of variables declaration//GEN-END:variables
}