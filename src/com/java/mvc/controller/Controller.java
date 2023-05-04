package com.java.mvc.controller;

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
		
	}
	
	public void alter (int row) {
		
	}
	
	public void clearEverything() {
		
	}
	
	public void clearTextEntry() {
		
	}
	
	public void deleteSelectedRow() {
		
	}
	
	public void insert() {
		
	}
	
	public void transferDatafRomTableToFields(int row) {
		
	}
}
