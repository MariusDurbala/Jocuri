package ticTacToe;

public class JocPredefinit implements IMutarejoc {
    private int index=0;
    private int[] mutari=new int[]
            {
                   0,0,
                   0,1,
                   1,1,
                   0,2,
                   2,2,
            };

    @Override
    public int getRand() {
        return mutari[index++];
    }

    @Override
    public int getColoana() {
        return mutari[index++];
    }
}
