import java.util.Arrays;
import java.util.Scanner;

class gameController {

    private String language;
    MoneyBalance p1balance = new MoneyBalance();
    MoneyBalance p2balance = new MoneyBalance();
    die Dice = new die();

    private final int MAXCASH = 3000;
    private boolean winnerFound = false;
    public gameController(){

    }
    public void play(){
        setLang();
        playRound(true);
    }
    private void setLang(){
        Language.SetLanguage("preLangPick");
        System.out.println(Language.GetString("press"));
        System.out.println(Language.GetString("english"));
        System.out.println(Language.GetString("danish"));
        System.out.println(Language.GetString("japanese"));
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
    private void playRound(boolean p1Turn){
        p1balance.addmoney(100);
        System.out.println(p1balance.getBalance());
        //trow dice
        int[] dieResults = die.throwDice();
        System.out.println(dieResults[0]+dieResults[1]);
        //Move player
        //Update cash balance and check win conditions
        checkWinner();
        //play round for the appropriate player
        if (p1Turn && !winnerFound){
            playRound(false);
        } else if (!winnerFound){
            playRound(true);
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
