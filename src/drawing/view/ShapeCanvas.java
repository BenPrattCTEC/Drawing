package drawing.view;

import drawing.controller.Controller;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

public class ShapeCanvas extends JPanel {
	
	private Controller controller;
	private SpringLayout layout;
	
	public ShapeCanvas(Controller controller) {
		super();
		this.controller = controller;
		
		layout = new SpringLayout();
		
		
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/*
	 * Sets up the scroll pane
	 */
	private void setupScrollPane(){
	}
	
	/**
	 * Sets up the Panel
	 */
	private void setupPanel() {
		this.setBackground(Color.darkGray);
		this.setLayout(layout);
	}
	
	/**
	 * sets up the Layout
	 */
	private void setupLayout() {
		
	}
	
	/**
	 * sets up all of the listeners
	 */
	private void setupListeners() {
		
			
	}
	
	/**
	 * returns a random color
	 * @return a random color
	 */
	private Color randomColor() {
		return (new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
	}

}
