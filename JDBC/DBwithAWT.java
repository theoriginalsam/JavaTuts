package com.data.jdbc;

import java.applet.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Event;

import java.util.*;




public class DB extends Applet {
	TextField t1 ;
	TextField t2;
	Label l1 ,l2 , l3;
	
		
		public void init() {
		// TODO Auto-generated method stub
		 l1 = new Label("Name");
		
		 t1 = new TextField("Enter your name  ");
		
		 l2 = new Label("Address");
		
		 t2 = new TextField("Enter your age  ");
		 
		
		Button b1 = new Button("ADD");
		
		
		 l3 = new Label();
		
	setLayout(null);
	l1.setBounds(20,20,100,20);
	l2.setBounds(20,100,100,20);
	t1.setBounds(150,20,100,20);
	t2.setBounds(150,100,100,20);

	b1.setBounds(100,200,150,20);
	l3.setBounds(120,250,150,20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		
		add(l3);
		
		
		add(b1);
	
		t1.addMouseListener(new MyClassForClicktoUser());

		t2.addMouseListener(new MyClassForClicktoPass());
		b1.addActionListener(new MyClass());
		
		
		}
		
		public class MyClass implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				
				
				
               String s1 = t1.getText();
				
				String s2 = t2.getText();	
				
				
		
				
				Connection con=null;
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GCES","samir1","samir");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
//				
			
				PreparedStatement stmt = null;
		
					try {
						stmt = con.prepareStatement("insert into nameandage values(?,?)");
					} catch (SQLException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
		
			try {
				stmt.setString(1,s1);//1 specifies the first parameter in the query  
				stmt.setString(2,s2);  
				  
				int i=stmt.executeUpdate();  
				System.out.println(i+" records inserted");  
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					System.out.println(e2.getMessage());
				}  
				
		
				try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				l3.setText("Records inserted");
				
				
				
			}
			
			

			
			
		}
		
		public class MyClassForClicktoUser implements MouseListener {
		

			@Override
			public void mouseClicked(MouseEvent e) {
				
				t1.setText("");
				
			
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		




		}
		public class MyClassForClicktoPass implements MouseListener {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				
				t2.setText("");
				
			
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		

       


		}


	

}
