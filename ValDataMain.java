package section4_oop;
/**
 * 객체지향 프로그래밍 - 클래스와 메소드
 */
public class ValDataMain {
    public static void main(String[] args) {
        ValData valData = new ValData();
        add(valData);
        add(valData);
        add(valData);
        System.out.println("최종 숫자 = " + valData.val);
    }

    static void add(ValData valueData){
        valueData.val++;
        System.out.println("숫자 증가 val = " + valueData.val);
    }
}
