Jeu-Java
========

public class tapis {
public final static int X_MAX= 66;
public final static int Y_MAX= 66;


public static void main(String[]args){
StdDraw.setXscale(-X_MAX, X_MAX);
    StdDraw.setYscale(-Y_MAX, Y_MAX);
    StdDraw.clear(StdDraw.GRAY);
    Sier(66, 66, 0, 0, 0);
}


public static void Sier(int ligne, int colonne, int centre_ligne, int centre_colonne, int compteur){
StdDraw.setPenColor(StdDraw.BLACK);
StdDraw.filledSquare(centre_ligne,centre_colonne, ligne/3);
if(compteur!=2){
for (int h=0; h<3; ++h){
for(int g=1; g<4; ++g){
Sier(ligne/3, colonne/3, ((centre_ligne-(2*ligne)/3)+(2*h*ligne)/3), ((centre_colonne+(4*colonne)/3)-(2*g*colonne)/3), compteur+1 );
} 
}
}
}

}
