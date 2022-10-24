public class Field {

    String field;
    String fieldTxt;
    int addCash;
    /*Switch case to choose which field is landed on.
     It chooses based on the dice throw and outputs the corresponding field.*/
    public void fieldGet(int dieCount) {
        if (dieCount >12) {
            dieCount = (dieCount % 12)+1;
        }
        switch (dieCount){
            case 2:
                field = "Tower";
                addCash = 250; //addCash sets a value for the points(gold) acquired or lost when landing on the field, this is used in the MoneyBalance-Class.
                fieldTxt = Language.GetString("tower") + " " + Language.GetString("gain") + " " + Math.abs(addCash) + Language.GetString("gold");
                /*fieldTxt is used to find the correct line of text to show.*/
                break;
            case 3:
                field = "Crater";
                addCash = -100;
                fieldTxt = Language.GetString("crater")+ " " + Language.GetString("lose") + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 4:
                field = "Palace gates";
                addCash = 100;
                fieldTxt = Language.GetString("palace")+ " " + Language.GetString("gain")+ " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 5:
                field = "Cold Desert";
                addCash = -20;
                fieldTxt = Language.GetString("desert")+ " " + Language.GetString("lose") + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 6:
                field = "Walled city";
                addCash = 180;
                fieldTxt = Language.GetString("city") + " " + Language.GetString("gain" ) + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 7:
                field = "Monastery";
                addCash = 0;
                fieldTxt = Language.GetString("monastery");
                break;
            case 8:
                field = "Black cave";
                addCash = -70;
                fieldTxt = Language.GetString("cave") + " " + Language.GetString("lose") + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 9:
                field = "Huts in the mountain";
                addCash = 60;
                fieldTxt = Language.GetString("huts") + " " + Language.GetString("gain") + " " + Math.abs(addCash)+ Language.GetString("gold");
                break;
            case 10:
                field = "The Werewall";
                addCash = -80;
                fieldTxt =  Language.GetString("werewall") + " " + Language.GetString("lose") + " " + Math.abs(addCash)+ Language.GetString("gold");
                break;
            case 11:
                field = "The pit";
                addCash = -50;
                fieldTxt = Language.GetString("pit") + " " + Language.GetString("lose") + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
            case 12:
                field = "Goldmine";
                addCash = 650;
                fieldTxt = Language.GetString("goldmine")+ " " + Language.GetString("gain") + " " + Math.abs(addCash) + Language.GetString("gold");
                break;
        }
    }

}
