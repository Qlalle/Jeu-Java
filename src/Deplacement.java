import javax.swing.BorderFactory;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Gestion du clavier pour diriger les personnages.
 * @param e KeyEvent
 */

public class Deplacement {

static final public int SQUARE_SIZE= 40;
static final public int GRID_W= 15;
static final public int GRID_H= 7;
public JPanel joueurinf= new JPanel();
public JPanel gardien= new JPanel();
public JPanel chateau= new JPanel();
private JFrame f= new JFrame();
public JLayeredPane grid= new JLayeredPane();

	
class Callback extends KeyAdapter {
	
    public boolean isPossible (int i,int j){
        
    	if (	j==0*SQUARE_SIZE && i==1*SQUARE_SIZE || j==2*SQUARE_SIZE && i==1*SQUARE_SIZE || j==3*SQUARE_SIZE && i==1*SQUARE_SIZE || j==4*SQUARE_SIZE && i==1*SQUARE_SIZE ||
	            j==5*SQUARE_SIZE && i==1*SQUARE_SIZE || j==0*SQUARE_SIZE && i==3*SQUARE_SIZE || j==2*SQUARE_SIZE && i==3*SQUARE_SIZE || j==3*SQUARE_SIZE && i==3*SQUARE_SIZE ||
	            j==4*SQUARE_SIZE && i==3*SQUARE_SIZE || j==5*SQUARE_SIZE && i==3*SQUARE_SIZE || j==1*SQUARE_SIZE && i==5*SQUARE_SIZE || j==2*SQUARE_SIZE && i==5*SQUARE_SIZE || 
	            j==4*SQUARE_SIZE && i==5*SQUARE_SIZE || j==5*SQUARE_SIZE && i==5*SQUARE_SIZE || j==6*SQUARE_SIZE && i==5*SQUARE_SIZE || j==0*SQUARE_SIZE && i==7*SQUARE_SIZE || 
	            j==1*SQUARE_SIZE && i==7*SQUARE_SIZE || j==2*SQUARE_SIZE && i==7*SQUARE_SIZE || j==4*SQUARE_SIZE && i==7*SQUARE_SIZE || j==6*SQUARE_SIZE && i==7*SQUARE_SIZE || 
	            j==1*SQUARE_SIZE && i==9*SQUARE_SIZE || j==2*SQUARE_SIZE && i==9*SQUARE_SIZE || j==3*SQUARE_SIZE && i==9*SQUARE_SIZE || j==5*SQUARE_SIZE && i==9*SQUARE_SIZE || 
	            j==6*SQUARE_SIZE && i==9*SQUARE_SIZE || j==1*SQUARE_SIZE && i==11*SQUARE_SIZE || j==2*SQUARE_SIZE && i==11*SQUARE_SIZE || j==3*SQUARE_SIZE && i==11*SQUARE_SIZE||
	            j==5*SQUARE_SIZE && i==11*SQUARE_SIZE || j==6*SQUARE_SIZE && i==11*SQUARE_SIZE || j==1*SQUARE_SIZE && i==13*SQUARE_SIZE || j==3*SQUARE_SIZE && i==13*SQUARE_SIZE ||
	            j==4*SQUARE_SIZE && i==13*SQUARE_SIZE || j==5*SQUARE_SIZE && i==13*SQUARE_SIZE || j==6*SQUARE_SIZE && i==13*SQUARE_SIZE){

        return false;
        }
        return true;
    }
	
    
    public void keyPressed(KeyEvent event) {		 
		event.getKeyCode();

		int xPos= joueurinf.getX(), yPos= joueurinf.getY();
		int x1Pos=gardien.getX(), y1Pos= gardien.getY();


		switch(event.getKeyCode()) {
		case 40: {
			if (isPossible (x1Pos,y1Pos+SQUARE_SIZE)){
				y1Pos+= SQUARE_SIZE;
			}
			break;
		}
		case 83:{
			if (isPossible (xPos,yPos+SQUARE_SIZE)){
				yPos+=SQUARE_SIZE;
			}
			break;
		}
		case 38: {
			if (isPossible (x1Pos,y1Pos-SQUARE_SIZE)){
				y1Pos-= SQUARE_SIZE;
			}
			break;
		}
		case 90:{
			if (isPossible (xPos,yPos-SQUARE_SIZE)){
				yPos-=SQUARE_SIZE;
			}
			break;
		}
		case 37: {
			if (isPossible (x1Pos-SQUARE_SIZE,y1Pos)){
				x1Pos-= SQUARE_SIZE;
			}
			break;
		}
		case 81 :{
			if (isPossible (xPos-SQUARE_SIZE,yPos)){
				xPos-= SQUARE_SIZE;
			}
			break;
		}
		case 39: {
			if (isPossible (x1Pos+SQUARE_SIZE,y1Pos)){
				x1Pos+= SQUARE_SIZE;
			}
			break;
		}
		case 68 :{
			if (isPossible (xPos+SQUARE_SIZE,yPos)){
				xPos+= SQUARE_SIZE;
			}
			break;
		}
		}

		xPos= Math.max(0, Math.min(SQUARE_SIZE * (GRID_W-1), xPos)) ;
		yPos= Math.max(0, Math.min(SQUARE_SIZE * (GRID_H-1), yPos)) ;
		x1Pos= Math.max(0, Math.min(SQUARE_SIZE * (GRID_W-1), x1Pos)) ;
		y1Pos= Math.max(0, Math.min(SQUARE_SIZE * (GRID_H-1), y1Pos)) ;
		joueurinf.setLocation(xPos, yPos);
		gardien.setLocation(x1Pos, y1Pos);
		f.repaint();
		
	}
}
}