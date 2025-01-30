package section4_oop.ex;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {
     Account ac = new Account();
     ac.deposit(10000);
     ac.withdraw(9000);
     ac.withdraw(2000); // 오류 메시지 출력

     System.out.println("잔고 : " + ac.balance);
    }
}
