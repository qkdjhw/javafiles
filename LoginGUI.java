/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author janicemang
 */
package com.mycompany.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    

/**
 *
 * @author janicemang
 */
public class LoginGUI implements ActionListener {
    
    private static JLabel userLabel ;
    private static JTextField userText;
    private static JLabel passwordLabel; 
    private static JPasswordField passwordText;
    private static JButton button ; 
    private static JLabel success; 
    
    
    

	public static void main (String[] args) {
            
                JPanel panel=new JPanel();
		JFrame frame = new JFrame();

		frame.setSize (350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
	
		panel.setLayout(null);
                
		userLabel=new JLabel("user");		
                userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);		
                
                userText = new JTextField(20);
                userText.setBounds(100,20,165,25);
                panel.add(userText);
                
                passwordLabel = new JLabel ("password");
                passwordLabel.setBounds(10,50,80,25);
                panel.add(passwordLabel);
                
                passwordText = new JPasswordField ();
                passwordText.setBounds (100,50,165,25);
                panel.add(passwordText);
                
                button = new JButton ("Login");
                button.setBounds(10,80,80,25);
                button.addActionListener(new LoginGUI());
                panel.add(button);
                
                success= new JLabel ("");
                success.setBounds(10,110,300,25);
                panel.add(success);
                
                frame.setVisible(true);
        }
        
        @Override 
        public void actionPerformed(ActionEvent e){
            String user = userText.getText();
            String password = passwordText.getText();
            System.out.println(user + "" + password);
            
        if(user.equals("Janice")&& password.equals("116016")) {
            success.setText("Login successful!");
            
        }
            

	}

}
