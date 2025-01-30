package section4_oop;

/**
 * 절차지향프로그래밍 시작
 */
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int vol = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 실행!");


        //볼륨 증가
        vol++;
        System.out.println("음악 플레이어 볼륨: " + vol);

        //볼륨 증가
        vol++;
        System.out.println("음악 플레이어 볼륨: " + vol);

        //볼륨 감소
        vol--;
        System.out.println("음악 플레이어 볼륨: " + vol);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태:");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + vol);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
        
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}
