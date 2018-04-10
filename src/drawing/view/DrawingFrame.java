package drawing.view;

import java.awt.*;
import javax.swing.JFrame;

import drawing.controller.Controller;
import drawing.view.DrawingPanel;

public class DrawingFrame extends JFrame {
	private Controller controller;
	private DrawingPanel panel;
	
	public DrawingFrame(Controller controller){
		super();
		
		this.controller = controller;
		this.panel = new DrawingPanel(controller);
		
		setupFrame();
		
	}
	
	/**
	 * Initializes JFrame
	 */
	private void setupFrame(){
		
		this.setContentPane(panel);
		this.setTitle("Drawing");
		this.setSize(900, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	/**
	 * gets the instance of ChatbotController
	 * @return instance of ChatbotController
	 */
	public Controller getBaseController(){
		return getAppController();
	}
	
	/**
	 * gets the instance of ChatbotController
	 * @return instance of ChatbotController
	 */
	public Controller getAppController(){
		return controller;
	}
	
	public DrawingPanel getContentPane(){
		return panel;
	}
	
}
