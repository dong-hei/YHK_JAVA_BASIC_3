package section4_oop.ex;

public class Account {
    int balance = 100000;

    void deposit(int amount){
        balance += amount;
    }
    
    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;

        } else{
            System.out.println("잔액 부족");
        }
    }
}
