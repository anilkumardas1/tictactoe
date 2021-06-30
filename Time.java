package com.java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
class Timecon extends JFrame 
{
	
	private static final long serialVersionUID = 1L;
	 JLabel label,label2;
	 Container c;
	 Font f1,f2;
	 
	 //=================================
	 
	 Timer timer;
	 public int second=5;
	 String ddSecond;
     DecimalFormat dFormat=new DecimalFormat("00");
    
	    //=========================================
	 ImageIcon icon=new ImageIcon(getClass().getClassLoader().getResource("tik.jpg"));
	Timecon()
	{
		    setBounds(50,50,1000,600);
	        setResizable(false);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setIconImage(icon.getImage()); // for image add
	        c=getContentPane();
	        c.setLayout(null);
	        c.setBackground(Color.WHITE);
	        
	        label=new JLabel("Marching...........");
		    label.setBounds(400,50,5000,100);
		    label.setForeground(Color.GREEN);
		    c.add(label);
		    f1=new Font("Arial",Font.PLAIN,30);
		    label.setFont(f1);
		    
		    label2=new JLabel("");
	        label2.setBounds(450,200,200,100);
	        label2.setForeground(Color.green);
	        c.add(label2);
	        
	        f2=new Font("Arial",Font.PLAIN,60);
		    label2.setFont(f2);
	        
	     

	      label2.setText("05");
	      second=5;
	     
	      normalTimer();
	      timer.start();
	      
	      setVisible(true);
	}
	//======================================================
	 public void normalTimer() 
	    {
	        timer=new Timer(1000/* time seeting*/, new ActionListener(){
	            public void actionPerformed(ActionEvent e){
                    second--;
	                ddSecond=dFormat.format(second);
	                label2.setText(ddSecond);

	                if(second==0)
	                {
	                	timer.stop();
	                	JOptionPane.showInternalMessageDialog(null, "Lets start game \n are you ready to play this game");
	                	Gamecon obj=new Gamecon();
	                	obj.setVisible(true);
	                	dispose();
	                }
	            }
	        });
	    }
	
	
}
public class Time  {
			public static void main(String[] args)
            {
            	new Timecon();
            	
            }
}
