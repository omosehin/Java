public class Account {
    public String _name;
    private double _balance;

    public Account(String name, double balance) {
        _name = name;
        if (balance > 0.0) {
            _balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount > 0.0) {
            _balance +=depositAmount;
        }
    }

    public double getBalance(){
        return _balance;
    }

    public void setName(String name){
        _name = name;
    }

    public String getName(){
        return _name;
    }

    public String withDrawBalance(double amountToWithdraw){

        if(amountToWithdraw < _balance){
          _balance -= amountToWithdraw;
          return "";
        }
        else{
            return "Withdrawal exceeded account balance.";
        }

    }

}
