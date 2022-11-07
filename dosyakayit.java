package surukle;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class suruklemeden{
	 
public static void main(String[] args) {

	JFrame jf=new JFrame();
	JPanel panel=new JPanel();
	jf.setSize(420,420);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true); 
	jf.add(panel);
	
	panel.setLayout(null);
	JLabel label=new JLabel("Nesne girin:");
	label.setBounds(20,20,80,25);
	panel.add(label);
	
	JTextField text=new JTextField();
	text.setBounds(100,20,165,25);
	panel.add(text);
	
	JButton btn=new JButton("Kaydet");
	btn.setBounds(20,80,80,25);
	
	panel.add(btn);
	 jf.setResizable(false);
	jf.setVisible(true);
	
	 btn.addActionListener(new ActionListener(){  
		 public void actionPerformed(ActionEvent e){  
		            String text1=text.getText();
		            try{
		            	FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\Desktop\\java.txt\\");
		        		fw.write(text1);
		                fw.close();
		        		JOptionPane.showMessageDialog(null, "success");
		        	    
		         }  
		            catch(Exception e1){
		            	JOptionPane.showMessageDialog(null, "error");
		            }
		 } });
		
	
	


}
}
