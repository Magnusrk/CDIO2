import java.util.Scanner;

class gameController {

    private String language;
    public gameController(){

    }
    public void play(){
        setLang();
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
            default:
                System.out.println(Language.GetString("tryAgain"));
                System.out.println();
                setLang();
        }
    }
    private void callPlayer(int player){

    }

    public void resetGame(){

    }


    // Setters and getters
    public String getLang() {
        return language;
    }

}
