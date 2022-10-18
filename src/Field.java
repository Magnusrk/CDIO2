public class Field {

    String field;
    int reward;
    int dieCount;

    public void fieldGet() {
        switch (dieCount){
            case 2:
                field = "Tower";
                reward = 250;
                break;
            case 3:
                field = "Crater";
                reward = -100;
                break;
            case 4:
                field = "Palace gates";
                reward = 100;
                break;
            case 5:
                field = "Cold Desert";
                reward = -20;
                break;
            case 6:
                field = "Walled city";
                reward = 180;
                break;
            case 7:
                field = "Monastery";
                reward = 0;
                break;
            case 8:
                field = "Black cave";
                reward = -70;
                break;
            case 9:
                field = "Huts in the mountain";
                reward = 60;
                break;
            case 10:
                field = "The Werewall";
                reward = -80;
                //extra turn
                break;
            case 11:
                field = "The pit";
                reward = -50;
                break;
            case 12:
                field = "Goldmine";
                reward = 650;
                break;
        }
    }

}
