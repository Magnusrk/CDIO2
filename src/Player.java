public class Player {
    MoneyBalance balance = new MoneyBalance();
    String name;
    public Player(String name){
        this.name = name;
    }

    public int GetPlayerBalance(){
        return balance.getBalance();
    }

    public String GetPlayerName(){
        return name;
    }
}
