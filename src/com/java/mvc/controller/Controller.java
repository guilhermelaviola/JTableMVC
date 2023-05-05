package com.java.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

import com.java.mvc.view.Screen;

public class Controller {
	private Screen screen;
	private ActionListener actionListener;
	DefaultTableModel model;
	
	public Controller(Screen screen) {
		this.screen = screen;
		model = (DefaultTableModel) screen.getTblExample().getModel();
	}
	
	public void control() {
		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == screen.getBtnAlter()) {
					// Alter table data from text field to grab row
					int row = screen.getTblExample().getSelectedRow();
					alter(row);
				} else if (e.getSource() == screen.getBtnDelete()) {
					// Delete selected row from the table
					int row = screen.getTblExample().getSelectedRow();
					deleteSelectedRow(row);
				} else if (e.getSource() == screen.getBtnInsert()) {
					// Insert row into the table created out of the text field
					insert();
				} else if (e.getSource() == screen.getBtnClear()) {
					// Clearing text fields from the table
					clearTextEntry();
				} else if (e.getSource() == screen.getBtnNewSearch()) {
					// Clearing everything, including the table
					clearEverything();
				} else if (e.getSource() == screen.getBtnSelect()) {
					// Transfering table fields to text fields
					int row = screen.getTblExample().getSelectedRow();
					transferDatafRomTableToFields(row);
				}
			}
		};
		screen.getBtnAlter().addActionListener(actionListener);
		screen.getBtnDelete().addActionListener(actionListener);
		screen.getBtnInsert().addActionListener(actionListener);
		screen.getBtnClear().addActionListener(actionListener);
		screen.getBtnNewSearch().addActionListener(actionListener);
		screen.getBtnSelect().addActionListener(actionListener);
	}
	
	public void alter(int row) {
		String name = screen.getTxtName().getText();
		int code = Integer.parseInt(screen.getTxtCode().getText());
		double price = Double.parseDouble(screen.getTxtPrice().getText());
		model.setValueAt(name, row, 0);
		model.setValueAt(name, row, 1);
		model.setValueAt(price, row, 2);
		model.fireTableRowsUpdated(row, row);
	}
	
	public void clearEverything() {
		clearTextEntry();
		model.setRowCount(0);
	}
	
	public void clearTextEntry() {
		screen.getTxtCode().setText("");;
		screen.getTxtName().setText("");;
		screen.getTxtPrice().setText("");
	}
	
	public void deleteSelectedRow(int row) {
		if (row >= 0) {
			model.removeRow(row);
			screen.getTblExample().setModel(model);
		}
	}
	
	public void insert() {
		String name = screen.getTxtName().getText();
		int code = Integer.parseInt(screen.getTxtCode().getText());
		double price = Double.parseDouble(screen.getTxtPrice().getText());
		model.insertRow(model.getRowCount(), new Object[]{
				code,
				name,
				price
		});
	}
	
	public void transferDatafRomTableToFields(int row) {
		screen.getTxtName().setText(String.valueOf(model.getValueAt(row, 1)));
		screen.getTxtCode().setText(String.valueOf(model.getValueAt(row, 0)));
		screen.getTxtPrice().setText(String.valueOf(model.getValueAt(row, 2)));

	}
}
