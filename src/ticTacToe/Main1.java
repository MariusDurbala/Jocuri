package ticTacToe;

public class Main1 {
    public static void main(String[] args){
        IMutarejoc input = new InputConsola();
        MatriceTicTacToe m=new MatriceTicTacToe();
        System.out.println(m);
        while (!m.eGataJocul()){
            m.mutaUrmatorul(input);
            System.out.println(m);
        }
        if (m.aCastigat()){
            System.out.println("A castigat: "+m.getCastigator());
        }
        else {
            System.out.println("REMIZA");
        }
    }
}
