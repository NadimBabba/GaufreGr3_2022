package modele;

public class Grille {
  int [][]tableau ;
  int nbcolones ;
  int nblignes ;
  int joueurquijoue ;
  
  
  
  
  Grille(int c , int l  ){
	  tableau = new int[c][l];
	  nbcolones = c ;
	  nblignes = l ;
	  joueurquijoue = 1 ;
	  int test = 1 ;
  }
}
