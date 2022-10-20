import java.util.Objects;
import java.util.Scanner;

class gameController {
    private String language;

    //Players
    Player player1 = new Player();
    Player player2 = new Player();

    Field field = new Field();

    private final int MAXCASH = 3000; // How much cash i needed to win the game.
    private boolean winnerFound = false;
    public gameController(){

    }
    public void play(){
        setLang();
        playRound(true, 1);
    }
    private void setLang(){
        //This function lets the user pick the language of the game.
        // By pressing a specific letter on the keyboard.
        Language.SetLanguage("preLangPick");
        System.out.println(Language.GetString("press"));
        System.out.println(Language.GetString("english"));
        System.out.println(Language.GetString("danish"));
        System.out.println(Language.GetString("japanese"));
        System.out.println(Language.GetString("thai"));
        Scanner scan = new Scanner(System.in);
        String lang = scan.next();
        switch (lang) {
            case "a" -> {
                Language.SetLanguage("en");
                language = Language.GetString("getEng");
                System.out.println(Language.GetString("languageSetText"));
            }
            case "b" -> {
                Language.SetLanguage("da");
                language = Language.GetString("getDan");
                System.out.println(Language.GetString("languageSetText"));
            }
            case "c" -> {
                Language.SetLanguage("jp");
                language = Language.GetString("getJap");
                System.out.println(Language.GetString("languageSetText"));
            }
            case "d" -> {
                Language.SetLanguage("th");
                language = Language.GetString("getThai");
                System.out.println(Language.GetString("languageSetText"));
            }
            default -> {
                System.out.println(Language.GetString("tryAgain"));
                System.out.println();
                setLang();
            }
        }
    }
    private void playRound(boolean p1Turn, int Player){
       //This function plays one round for one of the players.

        //Prompts the player to roll the dice.
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println(Language.GetString("player") + " " + Player + " " + Language.GetString("roll"));
        input.nextLine();

        //throw dice
        int[] dieResults = die.throwDice();

        //Move player
        field.fieldGet(dieResults[0]+dieResults[1]);
        int roll = dieResults[0]+dieResults[1];
        System.out.println(Language.GetString("rolled") + " " + roll);
        System.out.println(field.fieldTxt);

        //Adds money into the players account.
        if (p1Turn) {
            player1.AddBalance(field.addCash);
            System.out.println(Language.GetString("yBalance") + " " + player1.GetPlayerBalance());
        } else {
            player2.AddBalance(field.addCash);
            System.out.println(Language.GetString("yBalance") + " " + player2.GetPlayerBalance());
        }

        checkWinner();
        //Gives the player an extra turn if they land on the werewall
        if (Objects.equals(field.field, "The Werewall")){
            extraTurn(p1Turn);
        }

        //Rotates the player.
        if (p1Turn && !winnerFound){
            playRound(false, 2);
        }
        if (!p1Turn && !winnerFound){
            playRound(true, 1);
        }


    }
    private void checkWinner(){
        //This functions checks if the players balance is higher than the win amount.
        if (player1.GetPlayerBalance() >= MAXCASH){
            System.out.println(Language.GetString("p1Won"));
            winnerFound = true;
            resetGame();
        }
        if (player2.GetPlayerBalance() >= MAXCASH){
            System.out.println(Language.GetString("p2Won"));
            winnerFound = true;
            resetGame();
        }

    }
    private void extraTurn(boolean p1Turn){
        //This funtion gives the player an extra turn
        if (p1Turn && !winnerFound){
            System.out.println(Language.GetString("exTurn"));
            playRound(true, 1);
        }
        if (!p1Turn && !winnerFound){
            System.out.println(Language.GetString("exTurn"));
            playRound(false, 2);
        }
    }

    public void resetGame(){
        //This function reset the game
        player1.reset();
        player2.reset();
        winnerFound = false;
        System.out.println();
        play();
    }


    // Setters and getters
    public String getLang() {
        return language;
    }

}
