package ticTacToe;

public class MatriceTicTacToe extends MatricePatratica{
    private char ultimaValoare='0';
    private int numarMutari=0;
    public MatriceTicTacToe(){
        super(3);
    }
    public void mutaUrmatorul(IMutarejoc input){
        int rand=input.getRand();
        int coloana=input.getColoana();
        seteazaValoare(rand,coloana);
    }
    public boolean aCastigat(){
        for (int i=0;i<3;i++){
            char[] rand=getRand(i);
            if (suntToateEgaleCuUltimaValoare(rand)){
                return true;
            }
            char[] coloana=getColoana(i);
            if (suntToateEgaleCuUltimaValoare(coloana)){
                return true;
            }
        }
        char[] diagonala = getDiagonalaPrincipala();
        if (suntToateEgaleCuUltimaValoare(diagonala)){
            return true;
        }
        diagonala=getDiagonalaSecundara();
        if (suntToateEgaleCuUltimaValoare(diagonala)){
            return true;
        }
        return false;
    }
    public boolean eGataJocul(){return numarMutari==9||aCastigat();}
    public char getCastigator(){
        if (aCastigat()){
            return ultimaValoare;
        }
        else {
            return '\u0000';
        }
    }
    
    private void seteazaValoare(int randul,int coloana){
        if (randul<matrice.length){
            char[] rand=matrice[randul];
            if (coloana<rand.length){
                if (pozitiaELibera(randul,coloana)){
                    executaMutare(coloana,rand);
                }
                else {
                    System.out.println("Pozitia "+randul+" "+coloana+" este ocupata");
                }
            }
            else {
                System.out.println("Coloana "+coloana+" nu exista");
            }
        }
        else {
            System.out.println("Randul "+randul+" nu exista");
        }
    }
    private void executaMutare(int coloana,char[] rand){
        toggleUltimaValoare();
        rand[coloana]=ultimaValoare;
        numarMutari++;
    }
    private boolean suntToateEgaleCuUltimaValoare(char[] treiLaRand){
        for (int i=0;i<3;i++){
            if (treiLaRand[i]!=ultimaValoare){
                return false;
            }
        }
        return true;
    }
    private void toggleUltimaValoare(){
        if (ultimaValoare=='x'){
            ultimaValoare='0';
        }
        else {
            ultimaValoare='x';
        }
    }
    private boolean pozitiaELibera(int randul,int coloana){
        return matrice[randul][coloana]!='x'&& matrice[randul][coloana]!='0';
    }
    
}
