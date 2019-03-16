package hangman;

public class CuvantSecret {
    private static int POZITIA_LUI_A_IN_TABELUL_ASCII=65;
    private String cuvant;
    private boolean[] litereIntroduse=new boolean[28];
    public CuvantSecret(String cuvant){
        this.cuvant=cuvant.toUpperCase();
    }
    public boolean incearcaLitera(char litera){
        litera=Character.toUpperCase(litera);
        litereIntroduse[litera-POZITIA_LUI_A_IN_TABELUL_ASCII]=true;
        if (literaNuExistaInCuvant(litera)){
            return false;
        }
        else {
            return true;
        }
    }
    public String getCuvantAscuns(){
        String rezultat="";
        for (int i=0;i<cuvant.length();i++){
            char litera=cuvant.charAt(i);
            if (literaEsteDescoperita(litera)){
                rezultat+=litera;
            }
            else {
                rezultat+='_';
            }
            rezultat+=' ';
        }
        return rezultat;
    }
    public boolean maiSuntLitereDeDescoperit(){
        for (int i=0;i<cuvant.length();i++){
            char litera=cuvant.charAt(i);
            if (literaNuAFostIntrodusa(litera)){
                return true;
            }
        }
        return false;
    }
    private boolean literaNuAFostIntrodusa(char litera){
        return !litereIntroduse[litera-POZITIA_LUI_A_IN_TABELUL_ASCII];
    }
    private boolean literaEsteDescoperita(char litera){
        return litereIntroduse[litera-POZITIA_LUI_A_IN_TABELUL_ASCII];
    }
    private boolean literaNuExistaInCuvant(char litera){
        return cuvant.indexOf(litera)<0;
    }
}
