package ticTacToe;

public class JocPredefinit2 implements IMutarejoc{
    private int index=0;
    private int[] mutari=new int[]
            {
                    0,0,
                    0,1,
                    0,2,
                    1,2,
                    1,0,
                    2,0,
                    1,1,
                    2,2,
                    2,1
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
