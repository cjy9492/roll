package cai;

import javax.swing.*;

import java.awt.Button;
import java.awt.Label;
import java.awt.event.*;  
 
public class roll_main extends JFrame implements ActionListener {  
 
    
    JButton a,b,c;
    JPanel p1;
    Label label;
    int x=50;
    int min=0;
    int max=100;
    public roll_main() {  
    	 super("猜数字小工具     by Chen"); 
    	setSize(350, 100);   
    	p1 = new JPanel();    
    	label=new Label(x+""); 
    	a = new JButton("大");  
    	b = new JButton("小");  
    	c = new JButton("重置");
    	a.addActionListener(this);
    	b.addActionListener(this);
    	c.addActionListener(this); 	
    	p1.add(label);	
    	p1.add(a); 
    	p1.add(b); 
    	p1.add(c);
    	setContentPane(p1); 
    
    	
    }  
    public void actionPerformed(ActionEvent e){   
    	if(e.getSource()==a){   
    		
    		String str = label.getText();
    		
    		min=Integer.parseInt(str);
    		int x2=(Integer.parseInt(str)+max)/2;
    		label.setText(x2+"");
    
    		
    	      }
    	if(e.getSource()==b){   
    		
    		String str = label.getText();
    		max=Integer.parseInt(str);
        		int x2=(Integer.parseInt(str)+min)/2;
         		label.setText(x2+"");	
    		
    		
    		
    	      }
	if(e.getSource()==c){   
		label.setText("50");
		min=0;
		max=100;
    		
    		
    		
    		
    	      }
    }
    public static void main(String[] args) {  
        roll_main tf = new roll_main();  
        tf.show();  
    }  

    }