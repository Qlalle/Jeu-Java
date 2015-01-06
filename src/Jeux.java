import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.border.*;
import javax.swing.BorderFactory;



public class Jeux extends Deplacement {

public JPanel borne= new JPanel();
public JPanel borne2= new JPanel();
public JPanel borne3= new JPanel();
public JPanel borne4= new JPanel();
public JPanel borne5= new JPanel();
public JPanel chateau= new JPanel();
public JFrame f= new JFrame();
public JLayeredPane grid= new JLayeredPane();
public JLabel score= new JLabel("score");



public Jeux(){
	f.setTitle("Games of throne");
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	joueurinf.setBounds(0*SQUARE_SIZE, 0*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
	gardien.setBounds(14*SQUARE_SIZE,0*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
	chateau.setBounds(11*SQUARE_SIZE,4*SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
	borne.setBounds(2*SQUARE_SIZE,3*SQUARE_SIZE,SQUARE_SIZE,SQUARE_SIZE);
	borne2.setBounds(2*SQUARE_SIZE,6*SQUARE_SIZE,SQUARE_SIZE,SQUARE_SIZE);
	borne3.setBounds(5*SQUARE_SIZE,0*SQUARE_SIZE,SQUARE_SIZE,SQUARE_SIZE);
	borne4.setBounds(6*SQUARE_SIZE,3*SQUARE_SIZE,SQUARE_SIZE,SQUARE_SIZE);
	borne5.setBounds(8*SQUARE_SIZE,4*SQUARE_SIZE,SQUARE_SIZE,SQUARE_SIZE);
	joueurinf.setBackground(Color.blue);
	gardien.setBackground(Color.red);
	chateau.setBackground(Color.green);
	borne.setBackground(Color.yellow);
	borne2.setBackground(Color.yellow);
	borne3.setBackground(Color.yellow);
	borne4.setBackground(Color.yellow);
	borne5.setBackground(Color.yellow);
	grid.add(joueurinf, new Integer(1));
	grid.add(gardien, new Integer(1));
	grid.add(chateau, new Integer(1));
	grid.add(borne, new Integer(1));
	grid.add(borne2, new Integer(1));
	grid.add(borne3, new Integer(1));
	grid.add(borne4, new Integer(1));
	grid.add(borne5, new Integer(1));
	grid.setLayout(null);
	grid.setPreferredSize(new Dimension(GRID_W * SQUARE_SIZE, GRID_H * SQUARE_SIZE));

	
	for (int i= 0; i < GRID_H; i++){    
	for (int j= 0; j < GRID_W; j++){
		    JPanel c= new JPanel();
	
		    if (	i==0 && j==1 || i==2 && j==1 || i==3 && j==1 || i==4 && j==1 ||
		    		i==5 && j==1 || i==0 && j==3 || i==2 && j==3 || i==3 && j==3 ||
		    		i==4 && j==3 || i==5 && j==3 || i==1 && j==5 || i==2 && j==5 || 
		    		i==4 && j==5 || i==5 && j==5 || i==6 && j==5 || i==0 && j==7 || 
		    		i==1 && j==7 || i==2 && j==7 || i==4 && j==7 || i==6 && j==7 || 
		    		i==1 && j==9 || i==2 && j==9 || i==3 && j==9 || i==5 && j==9 || 
		    		i==6 && j==9 || i==1 && j==11 || i==2 && j==11 || i==3 && j==11||
		    		i==5 && j==11 || i==6 && j==11 || i==1 && j==13 || i==3 && j==13 ||
		    		i==4 && j==13 || i==5 && j==13 || i==6 && j==13){
		    	
				
		    }
		
		    else{
		    	
		    Border Blackline= BorderFactory.createLineBorder(Color.black,3); 
			c.setBounds(SQUARE_SIZE * j, SQUARE_SIZE *i, SQUARE_SIZE, SQUARE_SIZE);
			c.setBackground (Color.white);
		    c.setBorder(Blackline);   
		    }
		    
		    grid.add(c, new Integer(0));
	}
	}
		    f.add(grid,BorderLayout.CENTER);
		    f.add(score,BorderLayout.NORTH);
		    f.pack();
		    f.setVisible(true);
		    f.setFocusable(true);
		    f.addKeyListener(new Callback());		
	
}

public static void main(String[] args) {
	new Jeux();
	new Deplacement();
	

}
}
