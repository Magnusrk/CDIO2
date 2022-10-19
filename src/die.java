public class die {
    private static final int DIESIDE = 12;

    public die (){

    }

    public static int[] throwDice(){
        int die1 = (int) ((Math.random() * (DIESIDE)) + 1);
        int die2 = (int) ((Math.random() * (DIESIDE)) + 1);
        return new int[]{die1, die2};
    }

    public static int getDIESIDE() {
        return DIESIDE;
    }
}
