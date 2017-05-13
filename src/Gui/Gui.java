package Gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.*;
import java.awt.Dimension;

public class Gui {
    public static void main(String[] args) {
		Gui gui= new Gui();
    	gui.contralPanel();
	}  
    public void contralPanel(){
    	JFrame frame = new JFrame("The flight odering system");	
    	frame.setSize(600, 500);
    	JPanel panel = new JPanel();
    	JButton bt1 = new JButton("Manager Login");
    	JButton bt2 = new JButton("Passenger Login");
    	JButton bt3 = new JButton("Passenger Register");
    	JButton bt4 = new JButton("Flight Searching");
    	panel.setLayout(new FlowLayout());
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        panel.add(bt4);
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.setVisible(true);//创建窗口、面板、按钮
        bt4.addActionListener(new bt4Listener());
        bt3.addActionListener(new bt3Listener());
        bt2.addActionListener(new bt2Listener());
        bt1.addActionListener(new bt1Listener());//设置监听器
    }//创建方法，主控制版面
   
    public void RegisterPanel(){
    	JFrame registerFrame = new JFrame("Passenger Register");
    	registerFrame.setSize(600, 500);
    	JLabel lable1 = new JLabel("realName");
    	JLabel lable2 = new JLabel("identityID");
    	JLabel lable3 = new JLabel("password");
    	JButton btOK = new JButton("OK");
    	JTextField field1 = new JTextField();
    	JTextField field2 = new JTextField();
    	JTextField field3 = new JTextField();
    	
    	JPanel registerPanel1 = new JPanel();
    	JPanel registerPanel2 = new JPanel();
    	registerFrame.getContentPane().add(BorderLayout.NORTH,registerPanel1);
    	registerFrame.getContentPane().add(BorderLayout.SOUTH,registerPanel2);
    	registerPanel1.setLayout(new BoxLayout(registerPanel1, BoxLayout.Y_AXIS));
    	registerPanel1.add(lable1);registerPanel1.add(field1);
    	registerPanel1.add(lable2);registerPanel1.add(field2);
    	registerPanel1.add(lable3);registerPanel1.add(field3);
    	registerPanel2.add(btOK);
    	registerFrame.setVisible(true);
    }//创建方法，注册面板的设计
    public void passengerLoginPanel(){
    	JFrame loginFrame = new JFrame("Passenger Login");
    	loginFrame.setSize(600, 500);
    	JPanel loginPanel1 = new JPanel();
    	JPanel loginPanel2 = new JPanel();
    	JLabel lable1 = new JLabel("identityID");
    	JLabel lable2 = new JLabel("password");
    	JTextField field1 = new JTextField();
    	JTextField field2 = new JTextField();
    	JButton btOK = new JButton("OK");
    	loginPanel1.add(lable1);loginPanel1.add(field1);
    	loginPanel1.add(lable2);loginPanel1.add(field2);
     	loginPanel2.add(btOK);
     	loginFrame.getContentPane().add(BorderLayout.NORTH,loginPanel1);
    	loginFrame.getContentPane().add(BorderLayout.SOUTH,loginPanel2);    
    	loginPanel1.setLayout(new BoxLayout(loginPanel1, BoxLayout.Y_AXIS));
    	loginFrame.setVisible(true);
    	btOK.addActionListener(new btOKListener());
    }//创建方法，用户登录面板的设计
    public void managerLoginPanel(){
    	JFrame loginFrame = new JFrame("Manager Login");
    	loginFrame.setSize(600, 500);
    	JPanel loginPanel1 = new JPanel();
    	JPanel loginPanel2 = new JPanel();
    	JLabel lable1 = new JLabel("userName");
    	JLabel lable2 = new JLabel("password");
    	JTextField field1 = new JTextField();
    	JTextField field2 = new JTextField();
    	JButton btOK = new JButton("OK");
    	loginPanel1.add(lable1);loginPanel1.add(field1);
    	loginPanel1.add(lable2);loginPanel1.add(field2);
     	loginPanel2.add(btOK);
     	loginFrame.getContentPane().add(BorderLayout.NORTH,loginPanel1);
    	loginFrame.getContentPane().add(BorderLayout.SOUTH,loginPanel2);    
    	loginPanel1.setLayout(new BoxLayout(loginPanel1, BoxLayout.Y_AXIS));
    	loginFrame.setVisible(true);
    }//创建方法，管理员登陆面板的设计
    public void flightSearch(){
    	JFrame flightSearchingFrame = new JFrame("Flight Searching");
    	flightSearchingFrame.setSize(600, 500);
    	JPanel loginPanel1 = new JPanel();
    	JPanel loginPanel2 = new JPanel();
    	JLabel lable1 = new JLabel("Please enter the city or the flight number");
    	JLabel lable2 = new JLabel("Searching result");
    	JTextField field1 = new JTextField();
    	JTextArea area = new JTextArea(15,20);
    	JButton btOK = new JButton("OK");
    	
    	JScrollPane scroller = new JScrollPane(area);
    	area.setLineWrap(true);    	
    	scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    	scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    	
    	
    	loginPanel1.add(lable1);loginPanel1.add(field1);
    	loginPanel1.add(lable2);loginPanel1.add(scroller);
     	loginPanel2.add(btOK);
     	flightSearchingFrame.getContentPane().add(BorderLayout.NORTH,loginPanel1);
     	flightSearchingFrame.getContentPane().add(BorderLayout.SOUTH,loginPanel2);    
    	loginPanel1.setLayout(new BoxLayout(loginPanel1, BoxLayout.Y_AXIS));
    	flightSearchingFrame.setVisible(true);
    	btOK.addActionListener(new btOKListener());
    }//创建方法，用户登录面板的设计
    public void OKfunction(){
    	String name = new String();
    	
    }
    
    public class bt4Listener implements ActionListener{
	    public void actionPerformed (ActionEvent e) {
	    	flightSearch();
		
	    }
    }//创建内部类，用于事件监听0
    public class bt3Listener implements ActionListener{
	    public void actionPerformed (ActionEvent e) {
		    RegisterPanel();
		
	    }
    }//创建内部类，用于事件监听1
    public class bt2Listener implements ActionListener{
    	public void actionPerformed (ActionEvent e) {
    		passengerLoginPanel();
    		
	    }
    }//创建内部类，用于事件监听2
    public class bt1Listener implements ActionListener{
    	public void actionPerformed (ActionEvent e) {
    		managerLoginPanel();
		
	    }
    	
    }//创建内部类，用于事件监听3
    public class btOKListener implements ActionListener{
	    public void actionPerformed (ActionEvent e) {
	    
		    OKfunction();
		    
		    //registerFrame.setVisible(false);
		    
		   // registerFrame.dispatchEvent(new WindowEvent(frame,WindowEvent.WINDOW_CLOSING) );
	    }
    }//创建内部类，用于事件监听4
}
