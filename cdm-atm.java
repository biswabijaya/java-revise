interface cdm{
void deposit(int amount);
}

interface atm{
void withdraw(int amount);
void showBalance();
}

public class Mybank implements cdm,atm{
int accountbalance;

public Mybank(int actbalanace){


this.accountbalance=actbalanace;
System.out.println("Closing Balance:  "+this.accountbalance);

}


public void deposit(int amount){

this.accountbalance+=amount;


System.out.println("Amount deposited is:  "+amount+"  Closing Balance:after deposit  "+this.accountbalance);}
public void withdraw(int amount){
this.accountbalance=accountbalance-amount;
System.out.println("Amount withdrawn is:  "+amount+"  Closing Balance is:  "+this.accountbalance);
}

public void showBalance(){

System.out.println("Closing Balance:  "+this.accountbalance);
}
public static void main(String aa[]){

Mybank m1=new Mybank(10000);
m1.deposit(5000);
m1.withdraw(3000);
m1.showBalance();
cdm c1=new Mybank(20000);
c1.deposit(1000);

m1.showBalance();
}
}
