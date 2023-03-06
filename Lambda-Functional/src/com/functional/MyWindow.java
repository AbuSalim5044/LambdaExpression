package com.functional;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	
	public static void main(String[] args) {
		
		//window :object jFrame
		JFrame frame=new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		
		//create a button add jFrame
		JButton button=new JButton("Click me !!");
		frame.add(button);
		
		button.addActionListener(e -> {
			System.out.println("Butto n Click");
			JOptionPane.showMessageDialog(null, "Hey , Button click");
		});
		  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
