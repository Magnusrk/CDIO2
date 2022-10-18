public class MoneyBalance {
    public static int startingbalance = 1000;
    public MoneyBalance(){
        this.startingbalance= startingbalance;
    }
    public int getStartingbalance(){
        return startingbalance;
    }
    public void setStartingbalance (int newStartingbalance){
        this.startingbalance =newStartingbalance;
    }

    //Adds money to the players balance. x will be a variable from the field class
    public int addmoney(){
        int newbalance;
        int x=123;
        newbalance= startingbalance+x;
        return newbalance;
    }
}
