package ticTacToe;

public class MatricePatratica extends Matrice {

    public MatricePatratica(int dimensiune) {
        super(dimensiune,dimensiune);
    }
    public char[] getDiagonalaPrincipala() {
        char[] rezultat = new char[matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            rezultat[i] = matrice[i][i];
        }
        return rezultat;
    }
    public char[] getDiagonalaSecundara(){
        char[] rezultat = new char[matrice.length];
        for (int i=0;i<matrice.length;i++){
            rezultat[i]=matrice[matrice.length-1-i][i];
        }
        return rezultat;
    }
}
