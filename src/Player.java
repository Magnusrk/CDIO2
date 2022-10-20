public class Player {
    MoneyBalance balance = new MoneyBalance();
    String name;
    int startingBalance = balance.getBalance();
    public Player(String name){
        this.name = name;
    }

    public int GetPlayerBalance(){
        return balance.getBalance();
    }

    public void AddBalance(int add){
        balance.addmoney(add);
    }
    public void reset(){
        balance.reset();
    }

    public String GetPlayerName(){
        return name;
    }
}
