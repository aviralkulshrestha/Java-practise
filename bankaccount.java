public class bankaccount {
    private int accnum;
    private double balance=0;
    private String name;
    private String email;
    private int phnum;
    private double amt;
    private double wd;
    public void setAccnum(int accnum){
            this.accnum=accnum;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void setPhnum(int phnum){
        this.phnum=phnum;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getAccnum(){
        return this.accnum;
    }
    public double getBalance(){
        return balance;
    }
    public int getPhnum(){
        return phnum;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void deposit(double amt){
        this.balance=balance+amt;
        System.out.println("The current balance is "+ this.balance);
    }
    public void withdraw(double wd){
        if(wd>balance)
        {
            System.out.println("Insufficient Balance");}
        else
        {   this.balance=balance-wd;
            System.out.println("The current balance is "+ this.balance);}
    }

}
