class gameController {
    public gameController(){

    }
    public void play(){

    }
    public void setLang(String lang){
        switch (lang){
            case "den" -> Language.SetLanguage("da");
            case "eng" -> Language.SetLanguage("en");
            case "jap" -> Language.SetLanguage("jp");
        }
        System.out.println(Language.GetString("languageSetText"));
    }
    public void callPlayer(int player){

    }

    public void resetGame(){

    }
}
