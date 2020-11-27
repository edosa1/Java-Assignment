/*	Student Name: Edosa Osarenotor

 * 	Student Number: C17338803
 * 	Search engine
 * 
 * */


package searchengine;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;




public class GUI extends JFrame implements ActionListener  {

	/**
	 * 
	 */
	public static final long serialVersionUID = 1L;
	public JFrame frame;
	public Files f1 = new Files(); //used to take variables from Files class
	public JPanel panel1;
	public JButton b1,b2;
	public JLabel label;
	public JTextField t1,t2;
	public String guessedString;
	public JCheckBox box1, box2, box3, box4;
	public int counter = 0;
	public int i;
	public JTextArea jt;
	
	//array to store results, where they can be sorted
	 ArrayList<Integer> counterlist = new ArrayList<Integer>();

	public void gui() {
	
		
		 //setting up frame
		frame = new JFrame("Search Engine");
		frame.setVisible(true);
		frame.setSize(440,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//adding panels, checkbox and labels
		t1 = new JTextField("",25);
		panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		add(panel1);
		 box1 = new JCheckBox("Text 1");
		 box2 = new JCheckBox("Text 2");
		 box3 = new JCheckBox("Text 3");
		 box4 = new JCheckBox("Text 4");
		 label = new JLabel("Type in a word, to see if its in a text file");
		 label.setForeground(Color.orange);
		 //file boxes
		 panel1.add(box1);
		 panel1.add(box2);
		 panel1.add(box3);
		 panel1.add(box4);
		 
		 panel1.add(label);
		 panel1.add(t1);
		 b1 = new JButton("Search");
		
		 //adding actions to buttons
		b1.addActionListener(this);
		box1.addActionListener(this);
		box2.addActionListener(this);
		box3.addActionListener(this);
		box4.addActionListener(this);
		
		//adding more to panel
		frame.add(panel1);
		panel1.add(b1);
		jt = new JTextArea(25, 30);
		panel1.add(jt);

		jt.setVisible(false);//when GUI is first opened not be displayed
		
	
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
			if(e.getSource()==b1) //Searches
			{
			guessedString = t1.getText(); //places guess in 
			
			
			
			if(box1.isSelected()) //file 1
			{
				while (f1.Scanner1.hasNext())
				{
					 String line1 = f1.Scanner1.nextLine();
					 
						if (line1.contains(guessedString))
						{
							counter++;
						}
	
				}
				if(counter == 0)
				{
					jt.append("\n" +guessedString+" is not in file 1");

				}
				
				else {
					jt.append("\n"+guessedString+ " is in file 1, and is seen " +counter +" time(s)");
	
				}
				counterlist.add(counter);
				

				 counter = 0;
			}
		
			
			if(box2.isSelected()) //file 2
			{
			while (f1.Scanner2.hasNext())
				{
					 String line2 = f1.Scanner2.nextLine();
					 
						if (line2.contains(guessedString))
						{
							counter++;
						}
	
				}

				if(counter == 0)
				{
					jt.append("\n"+ guessedString+" is not in file 2");

				}
		
				
			else {
				jt.append("\n"+guessedString+ " is in file 2, and is seen " +counter +" time(s)");
				}
				counterlist.add(counter);
				 
				counter = 0;
			}
			
			
				if(box3.isSelected()) //file 3
				{
				while (f1.Scanner3.hasNext())
					{
						 String line3 = f1.Scanner3.nextLine();
						 
							if (line3.contains(guessedString))
							{
								counter++;
							}
		
					}

					if(counter == 0)
					{
						jt.append("\n"+guessedString+" is not in file 3");

					}
					else {
						jt.append("\n"+ guessedString+ " is in file 3, and is seen " +counter +" time(s)");


						
					}
					counterlist.add(counter);
					
					counter = 0;
				}
				
					if(box4.isSelected()) //file 4
					{
					while (f1.Scanner4.hasNext())
					{
						 String line4 = f1.Scanner4.nextLine();
						 
							if (line4.contains(guessedString))
							{
								counter++;
							}
							
					}

					if(counter == 0)
					{
						jt.append("\n"+ guessedString +" is not in file 4");

					}
					else {
						jt.append("\n"+ guessedString+ " is in file 4, and is seen " +counter +" time(s)");
						
					}
					counterlist.add(counter);
					  
					counter = 0;
	
					}
					 jt.setVisible(true);
					 Collections.sort(counterlist, Collections.reverseOrder());
					 if(counterlist.isEmpty())
					 {
						 JOptionPane.showMessageDialog(null, "No file Selected");;//checks if file is selected
						 
					 }
					 else
						 jt.append("\n"+counterlist.toString()+" displays strongest to weakest matches");

					
			
			}
	

	}
	

			
	
		public GUI()
		{
			gui();
		}
	
	
	}

