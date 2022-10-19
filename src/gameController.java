import java.util.Arrays;
import java.util.Scanner;

class gameController {

    private String language;
    MoneyBalance p1balance = new MoneyBalance();
    MoneyBalance p2balance = new MoneyBalance();
    Field field = new Field();
    die Dice = new die();

    private final int MAXCASH = 3000;
    private boolean winnerFound = false;
    public gameController(){

    }
    public void play(){
        setLang();
        playRound(true, 1);
    }
    private void setLang(){
        Language.SetLanguage("preLangPick");
        System.out.println(Language.GetString("press"));
        System.out.println(Language.GetString("english"));
        System.out.println(Language.GetString("danish"));
        System.out.println(Language.GetString("japanese"));
        System.out.println(Language.GetString("thai"));
        Scanner scan = new Scanner(System.in);
        String lang = scan.next();
        switch (lang){
            case "a":
                Language.SetLanguage("en");
                language = Language.GetString("getEng");
                System.out.println(Language.GetString("languageSetText"));
                break;
            case "b":
                Language.SetLanguage("da");
                language = Language.GetString("getDan");
                System.out.println(Language.GetString("languageSetText"));
                break;
            case "c":
                Language.SetLanguage("jp");
                language = Language.GetString("getJap");
                System.out.println(Language.GetString("languageSetText"));
                break;
            case "d":
                Language.SetLanguage("th");
                language = Language.GetString("getThai");
                System.out.println(Language.GetString("languageSetText"));
                break;
            default:
                System.out.println(Language.GetString("tryAgain"));
                System.out.println();
                setLang();
        }
    }
    private void playRound(boolean p1Turn, int Player){
        Scanner input = new Scanner(System.in);
        System.out.println("Spiller " + Player + " kast");
        input.nextLine();
        //throw dice
        int[] dieResults = die.throwDice();

        //Move player
        field.fieldGet(dieResults[0]+dieResults[1]);
        int roll = dieResults[0]+dieResults[1];
        System.out.println("You rolled " + roll);
        System.out.println(field.fieldTxt);

        if (p1Turn) {
            p1balance.addmoney(field.addCash);
            System.out.println(p1balance.getBalance());
        } else {
            p2balance.addmoney(field.addCash);
            System.out.println(p2balance.getBalance());
        }

        //Update cash balance and check win conditions
        checkWinner();
        //play round for the appropriate player
        if (p1Turn && !winnerFound){
            playRound(false, 2);
        } else if (!winnerFound){
            playRound(true, 1);
        }


    }
    private void checkWinner(){
        if (p1balance.getBalance() >= MAXCASH){
            System.out.println("p1 won");
            winnerFound = true;
        }
        if (p2balance.getBalance() >= MAXCASH){
            System.out.println("p2 won");
            winnerFound = true;
        }
    }

    public void resetGame(){
        play();
    }


    // Setters and getters
    public String getLang() {
        return language;
    }

}
