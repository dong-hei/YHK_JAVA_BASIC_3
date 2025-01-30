package section4_oop;
/**
 * 객체지향 프로그래밍 - 클래스와 메소드
 */
public class ValObjMain {
    public static void main(String[] args) {
        ValData valData = new ValData();
        valData.add();
        valData.add();
        valData.add();
        System.out.println("최종 숫자 = " + valData.val);
    }


}
