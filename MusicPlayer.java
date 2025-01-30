package section4_oop;
/**
 * 객체 지향 프로그래밍 - 객체 지향 프로그래밍
 * 캡슐화 : 뮤직플레이어의 데이터와 기능이 한 곳에 뭉쳐있어 필요한 기능을 메소드를 통해 외부에 제공하는것
 * 유지보수에 유리하고 재사용성이 좋다.
 */

public class MusicPlayer {

    int vol = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volUp() {
        vol++;
        System.out.println("음악 플레이어 볼륨: " + vol);
    }

    void volDown() {
        vol--;
        System.out.println("음악 플레이어 볼륨: " + vol);
    }

    void status() {
        System.out.println("음악 플레이어 상태:");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + vol);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
