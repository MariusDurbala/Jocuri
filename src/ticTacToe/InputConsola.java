package ticTacToe;
import java.util.Scanner;
public class InputConsola implements IMutarejoc{
    private static Scanner s=new Scanner(System.in);
    public int getRand(){
        System.out.println("randul: ");
        return s.nextInt();
    }
    public int getColoana() {
        System.out.println("coloana: ");
        return s.nextInt();
    }
}
