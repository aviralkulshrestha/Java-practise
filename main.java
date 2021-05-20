import java.util.Scanner;

public class main {
  public static void main(String[] args){
      bankaccount Ak=new bankaccount();
      bankaccount aviral=new bankaccount();
      Ak.setBalance(100);
      Ak.setAccnum(100010101);
      Ak.setName("Aviral");
      Ak.deposit(200);
      int acc=Ak.getAccnum();
      Ak.getName();

  }

}
