package ticTacToe;

public class Matrice {
    protected char[][] matrice;
    public Matrice(int randuri,int coloane){
        matrice=new char[randuri][coloane];
        initializareMatrice(randuri,coloane);
    }
    public String toString(){
        String rezultat="";
        for (int rand=0;rand<matrice.length;rand++){
            for (int coloana=0;coloana<matrice[rand].length;coloana++){
                rezultat+=matrice[rand][coloana]+" ";
            }
            rezultat+='\n';
        }
        return rezultat;
    }
    public char[] getRand(int rand){return matrice[rand];}
    public char[] getColoana(int coloana){
        char[] rezultat=new char[matrice[0].length];
        for (int rand=0;rand<matrice.length;rand++){
            rezultat[rand]=matrice[rand][coloana];
        }
        return rezultat;
    }
    private void initializareMatrice(int randuri,int coloane){
        for (int rand=0;rand<randuri;rand++){
            for (int coloana=0;coloana<coloane;coloana++){
                matrice[rand][coloana]='_';
            }
        }
    }
}
