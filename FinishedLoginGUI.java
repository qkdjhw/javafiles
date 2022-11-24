package com.mycompany.logingui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    

/**
 *
 * @author janicemang
 */
public class FinishedLoginGUI implements ActionListener {
    
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
            
               if(user.equals("qkdjhw") && password.equals("116016"))
       {
           success.setText("Login Success");
                JFrame frame = new JFrame();
                JLabel label = new JLabel(user+ " " + "welcome");
                label.setBounds(0,0,150,50);
             
  
                frame.add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);
           
       }
       else
       {
           success.setText("Login Failure");
           JFrame frame = new JFrame();
                JLabel label = new JLabel(user+ " " + "login unsuccessful,try again");
                label.setBounds(0,0,250,50);

                frame.add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(420,420);
                frame.setLayout(null);
                frame.setVisible(true);
       }
            
        }
            }





