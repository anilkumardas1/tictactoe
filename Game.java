package com.java;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Font;
class Gamecon extends JFrame implements ActionListener
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container c;
    JPanel panel,panel2;
    JTextField enterx1,entery1;
    JLabel tic,playerx,x,playery,y,enterx,entery;
    Font f1,f2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,exit,reset,submit;
    Cursor cor;
    JFrame frame;

    ImageIcon icon=new ImageIcon(getClass().getClassLoader().getResource("tik.jpg"));
    
    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
//thila=====================================
private void gameScore()
{
    x.setText(String.valueOf(xCount));
    y.setText(String.valueOf(oCount));
}

private void choose_a_Player()
{
    if(startGame.equalsIgnoreCase("x"))
    {
        startGame="O";//small
    }
    else
    {
       startGame="X";
    }
}

private void winningGame()
{
    String bt1=b1.getText();
    String bt2=b2.getText();
    String bt3=b3.getText();

    String bt4=b4.getText();
    String bt5=b5.getText();
    String bt6=b6.getText();

    String bt7=b7.getText();
    String bt8=b8.getText();
    String bt9=b9.getText();

 //change name
    if(bt1 ==("X") && bt2 ==("X")  && bt3 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        b1.setBackground(Color.PINK);
        b2.setBackground(Color.PINK);
        b3.setBackground(Color.PINK);
    }


   if(bt1 ==("O") && bt2 ==("O")  && bt3 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.YELLOW);
    }

    if(bt4 ==("X") && bt5 ==("X")  && bt6 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        b4.setBackground(Color.PINK);
        b5.setBackground(Color.PINK);
        b6.setBackground(Color.PINK);
    }

    if(bt4 ==("O") && bt5 ==("O")  && bt6 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b4.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b6.setBackground(Color.YELLOW);
    }


    if(bt7 ==("X") && bt8 ==("X")  && bt9 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player x wins","win the match",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        b7.setBackground(Color.PINK);
        b8.setBackground(Color.PINK);
        b9.setBackground(Color.PINK);
    }


   if(bt7 ==("O") && bt8 ==("O")  && bt9==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b7.setBackground(Color.YELLOW);
        b8.setBackground(Color.YELLOW);
        b9.setBackground(Color.YELLOW);
    }

    if(bt1 ==("X") && bt4 ==("X")  && bt7 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        b1.setBackground(Color.PINK);
        b4.setBackground(Color.PINK);
        b7.setBackground(Color.PINK);
    }


    if(bt1 ==("O") && bt4 ==("O")  && bt7 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b1.setBackground(Color.YELLOW);
        b4.setBackground(Color.YELLOW);
        b7.setBackground(Color.YELLOW);
    }

    if(bt2 ==("X") && bt5 ==("X")  && bt8 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount ++;
        gameScore();
        b2.setBackground(Color.PINK);
        b5.setBackground(Color.PINK);
        b8.setBackground(Color.PINK);
    }


    if(bt2 ==("O") && bt5 ==("O")  && bt8 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b2.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b8.setBackground(Color.YELLOW);
    }

    if(bt3 ==("X") && bt6 ==("X")  && bt9 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount ++;
        gameScore();
        b3.setBackground(Color.PINK);
        b6.setBackground(Color.PINK);
        b9.setBackground(Color.PINK);
    }


   if(bt3 ==("O") && bt6 ==("O")  && bt9 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b3.setBackground(Color.YELLOW);
        b6.setBackground(Color.YELLOW);
        b9.setBackground(Color.YELLOW);
    }

    if(bt1 ==("X") && bt5 ==("X")  && bt9 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount ++;
        gameScore();
        b1.setBackground(Color.PINK);
        b5.setBackground(Color.PINK);
        b9.setBackground(Color.PINK);
    }

   if(bt1 ==("O") && bt5 ==("O")  && bt9 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b1.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b9.setBackground(Color.YELLOW);
    }


    if(bt3 ==("X") && bt5 ==("X")  && bt7 ==("X"))
    {
        JOptionPane.showMessageDialog(this,"Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount ++;
        gameScore();
        b3.setBackground(Color.PINK);
        b5.setBackground(Color.PINK);
        b7.setBackground(Color.PINK);
    }
    if(bt3 ==("O") && bt5 ==("O")  && bt7 ==("O"))
    {
        JOptionPane.showMessageDialog(this,"Player o wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount ++;
        gameScore();
        b3.setBackground(Color.YELLOW);
        b5.setBackground(Color.YELLOW);
        b7.setBackground(Color.YELLOW);
    }
}
   //end
 
   public Gamecon()
    {
        setBounds(50,50,1000,600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(icon.getImage()); // for image add
        
        //logo=new ImageIcon(getClass().getClassLoader().getResource("tik.jpg"));
        
        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        panel=new JPanel();
        panel.setBounds(0,0,999,50);
        panel.setBackground(Color.BLUE);
        tic=new JLabel("TIC   TAC   TOE   GAME");
        //tic.setBounds(0,20,100,20);
        tic.setForeground(Color.WHITE);
        f1=new Font("Arial",Font.ITALIC,25);
        tic.setFont(f1);
        panel.add(tic);
        c.add(panel);

        b1=new JButton();
        b1.setBounds(10,60,150,150);
        c.add(b1);
        b1.addActionListener(this);
        b2=new JButton();
        b2.setBounds(180,60,150,150);
        c.add(b2);
        b2.addActionListener(this);
        b3=new JButton();
        b3.setBounds(350,60,150,150);
        c.add(b3);
        b3.addActionListener(this);

        b4=new JButton();
        b4.setBounds(10,230,150,150);
        c.add(b4);
        b4.addActionListener(this);
        b5=new JButton();
        b5.setBounds(180,230,150,150);
        c.add(b5);
        b5.addActionListener(this);
        b6=new JButton();
        b6.setBounds(350,230,150,150);
        c.add(b6);
        b6.addActionListener(this);

        b7=new JButton();
        b7.setBounds(10,400,150,150);
        c.add(b7);
        b7.addActionListener(this);
        b8=new JButton();
        b8.setBounds(180,400,150,150);
        c.add(b8);
        b8.addActionListener(this);
        b9=new JButton();
        b9.setBounds(350,400,150,150);
        c.add(b9);
        b9.addActionListener(this);

        /*panel2=new JPanel();
        panel2.setBounds(530,60,450,390);
        panel2.setBackground(Color.GRAY);
        c.add(panel2);*/
        enterx=new JLabel("Enter Name for X Player :");
        enterx.setBounds(550,100,250,20);
        f1=new Font("Arial",Font.ITALIC,15);
        enterx.setFont(f1);
        c.add(enterx);

        enterx1=new JTextField();
        enterx1.setBounds(730,100,200,25);
        
        c.add(enterx1);

        entery=new JLabel("Enter Name for O Player :");
        entery.setBounds(550,160,250,20);
        f1=new Font("Arial",Font.ITALIC,15);
        entery.setFont(f1);
        c.add(entery);

        entery1=new JTextField();
        entery1.setBounds(730,160,200,25);
        c.add(entery1);

        submit=new JButton("Submit");
        submit.setBounds(700,230,100,30);
        c.add(submit);
        submit.addActionListener(this);

        cor=new Cursor(Cursor.HAND_CURSOR);
        submit.setCursor(cor);

        playerx=new JLabel("Player x :");
        playerx.setBounds(550,300,100,20);
        f1=new Font("Arial",Font.ITALIC,20);
        playerx.setFont(f1);
        c.add(playerx);

        x=new JLabel("xxxxxxxx");
        x.setBounds(650,300,100,20);
        f1=new Font("Arial",Font.ITALIC,20);
        x.setFont(f1);
        c.add(x);


        playery=new JLabel("Player  O :");
        playery.setBounds(550,350,100,20);
        f1=new Font("Arial",Font.ITALIC,20);
        playery.setFont(f1);
        c.add(playery);

        y=new JLabel("OOOOO");
        y.setBounds(650,350,100,20);
        f1=new Font("Arial",Font.ITALIC,20);
        y.setFont(f1);
        c.add(y);



        reset=new JButton("Reset");
        reset.setBackground(Color.CYAN);
        reset.setBounds(530,490,150,50);
        f1=new Font("Arial",Font.ITALIC,20);
        reset.setFont(f1);
        c.add(reset);
        reset.addActionListener(this);
        exit=new JButton("Exit");
        exit.setBackground(Color.ORANGE);
        exit.setBounds(790,490,150,50);
        f1=new Font("Arial",Font.ITALIC,20);
        exit.setFont(f1);
        c.add(exit);
        exit.setCursor(cor);
        reset.setCursor(cor);
        exit.addActionListener(this);
        setVisible(true);
    }//constructor close
   

public void actionPerformed(ActionEvent e)
   {
       if(e.getSource()==submit)
        {
            if(enterx1.getText().equals("") || entery1.getText().equals(""))
            {
              
                JOptionPane.showMessageDialog (null,"please enter 2 player name");
                return;
            }
            String name=enterx1.getText();
            playerx.setText(name);
            String name2=entery1.getText();
            playery.setText(name2);
            //enterx1.setText("");
        } 
        if(e.getSource()==b1 || e.getSource()==b2 || e.getSource()==b3 || e.getSource()==b4 || e.getSource()==b5 || e.getSource()==b6 || e.getSource()==b7 || e.getSource()==b8 || e.getSource()==b9)
        {
            if(enterx1.getText().equals(""))
            {
                JOptionPane.showMessageDialog (null,"please enter 2 player name");
                return;
            }
        } 
        if(e.getSource()==exit)
        {
            frame=new JFrame("Exit");
            if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","TIC tac Toe" ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
        }
        if(e.getSource()==b1)
        {
            b1.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b1.setFont(f2);
               b1.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b1.setFont(f2);
                b1.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }
        if(e.getSource()==b2)
        {
            b2.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b2.setFont(f2);
               b2.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b1.setFont(f2);
                b2.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b3)
        {
            b3.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b3.setFont(f2);
               b3.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b3.setFont(f2);
                b3.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b4)
        {
            b4.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b4.setFont(f2);
               b4.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b4.setFont(f2);
                b4.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b5)
        {
            b5.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b5.setFont(f2);
               b5.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b5.setFont(f2);
                b5.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b6)
        {
            b6.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b6.setFont(f2);
               b6.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b6.setFont(f2);
                b6.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b7)
        {
            b7.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b7.setFont(f2);
               b7.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b7.setFont(f2);
                b7.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }

        if(e.getSource()==b8)
        {
            b8.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b8.setFont(f2);
               b8.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b8.setFont(f2);
                b8.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }
        if(e.getSource()==b9)
        {
            b9.setText(startGame);
            if(startGame.equalsIgnoreCase("X"))
            {
                f2=new Font("Arial",Font.BOLD,90);
                b9.setFont(f2);
               b9.setForeground(Color.RED);
            }
            else
            {
                f2=new Font("Arial",Font.BOLD,90);
                b9.setFont(f2);
                b9.setForeground(Color.BLUE);
            }
           choose_a_Player();
           winningGame();
        }
        if(e.getSource()==reset)
        {
            b1.setText(null);
            b2.setText(null);
            b3.setText(null);
            
            b4.setText(null);
            b5.setText(null);
            b6.setText(null);


            b7.setText(null);
            b8.setText(null);
            b9.setText(null);
            

            b1.setBackground(Color.LIGHT_GRAY);
            b2.setBackground(Color.LIGHT_GRAY);
            b3.setBackground(Color.LIGHT_GRAY);
            b4.setBackground(Color.LIGHT_GRAY);
            b5.setBackground(Color.LIGHT_GRAY);
            b6.setBackground(Color.LIGHT_GRAY);
            b7.setBackground(Color.LIGHT_GRAY);
            b8.setBackground(Color.LIGHT_GRAY);
            b9.setBackground(Color.LIGHT_GRAY);
        }
    }
}



public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Gamecon();
	}

}
