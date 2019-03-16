package hangman;

public class HangmanGame {
    private int vieti;
    private CuvantSecret cuvantSecret;
    public void incepeJocNou(String cuvant){
        cuvantSecret=new CuvantSecret(cuvant);
        vieti=5;
    }
    public void incearcaLitera(char litera){
        if (!cuvantSecret.incearcaLitera(litera)){
            vieti--;
        }
    }
    public int getVieti(){
        return vieti;
    }
    public boolean maiAmVieti(){
        return vieti>0;
    }
    public boolean eGataJocul(){
        return !maiAmVieti()||!cuvantSecret.maiSuntLitereDeDescoperit();
    }
    public String getCuvant(){
        return cuvantSecret.getCuvantAscuns();
    }
}
