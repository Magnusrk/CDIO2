public class Field {

    String field;
    String fieldTxt;
    int addCash;
    /*Switch case to choose which field is landed on.
     *It chooses based on the dice throw and outputs the corresponding field.*/
    public void fieldGet(int dieCount) {
        if (dieCount >12) {
            dieCount = (dieCount % 12)+1;
        }
        switch (dieCount){
            case 2:
                field = "Tower";
                addCash = 250;
                // Tekst skal formentlig ligge i en samlet pakke med oversætninger
                // Tager gerne imod indsigelser i tekstindholdet
                fieldTxt = "You find yourself at the tower and come across a chest full of gold."+ Language.GetString("gain") + " " + addCash + Language.GetString("gold");
                break;
            case 3:
                field = "Crater";
                addCash = -100;
                fieldTxt = "You fall into a crater and have to pay someone to rescue you." + Language.GetString("lose") + " " + addCash + Language.GetString("gold");
                break;
            case 4:
                field = "Palace gates";
                addCash = 100;
                fieldTxt = "You meet the queen by the palace gates, she gives you 100 to f*ck off."+ Language.GetString("gain")+ " " + addCash + Language.GetString("gold");
                break;
            case 5:
                field = "Cold Desert";
                addCash = -20;
                fieldTxt = "You find yourself in the cold desert. Someone is selling blankets. It's too cold not to buy." + Language.GetString("lose") + " " + addCash + Language.GetString("gold");
                break;
            case 6:
                field = "Walled city";
                addCash = 180;
                fieldTxt = "You go to the walled city. You're entrant number 1.000.000.000.000 and get a price." + Language.GetString("gain" ) + " " + addCash + Language.GetString("gold");
                break;
            case 7:
                field = "Monastery";
                addCash = 0;
                fieldTxt = "You go to the monastery to pray. Nothing happens.";
                break;
            case 8:
                field = "Black cave";
                addCash = -70;
                fieldTxt = "You find yourself in a black cave. You can't see anything and trips over a rock. Some money falls out of you pocket but you can't find them." + Language.GetString("lose") + " " + addCash + Language.GetString("gold");
                break;
            case 9:
                field = "Huts in the mountain";
                addCash = 60;
                fieldTxt = "You go for a hike and finds some huts in the mountain. You scavenge them for a small amount of cash." + Language.GetString("gain") + " " + addCash + Language.GetString("gold");
                break;
            case 10:
                field = "The Werewall";
                addCash = -80;
                //extra turn (usikker på hvordan jeg implementerer det pt.)
                fieldTxt = "You get lost and by some unfortunate bad luck end up at the Werewall. A werewolf spots you and takes chase. You try to throw whatever is in your pocket at it." + Language.GetString("lose") + " " + addCash + Language.GetString("gold");
                break;
            case 11:
                field = "The pit";
                addCash = -50;
                fieldTxt = "You fall into the pit. Luckily there is a latter to get out. Unluckily you have to pay to use it." + Language.GetString("lose") + " " + addCash + Language.GetString("gold");
                break;
            case 12:
                field = "Goldmine";
                addCash = 650;
                fieldTxt = "You go to the goldmine in hopes of making a quick buck, for some reason it works."+ Language.GetString("gain") + " " + addCash + Language.GetString("gold");
                break;
        }
    }

}
