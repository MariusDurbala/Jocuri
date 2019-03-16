package hangman;
import java.util.Scanner;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args){
        HangmanGame game = new HangmanGame();
        Scanner sc = new Scanner(System.in);
        out.println("Un cuvant pentru player:");
        game.incepeJocNou(sc.next());
        while (!game.eGataJocul()){
            out.println("Mai aveti"+game.getVieti()+"vieti.");
            out.println("Urmatoarea litera: ");
            game.incearcaLitera(sc.next().charAt(0));
            out.println(game.getCuvant());
        }
        if (game.getVieti()>0){
            out.println("AI CASTIGAT!!!");
        }
        else {
            out.println("AI PIERDUT!!!");
        }
    }
}
