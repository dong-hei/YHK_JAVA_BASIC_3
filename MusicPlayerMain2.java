package section4_oop;

/**
 * 절차지향 프로그래밍 - 메소드 추출
 * 메소드 추출로 코드의 가독성이 좋아지고 모듈화가 됐다
 * (모듈화 - 필요한 블럭을 가져다 꼽을수 있는 레고를 생각하면 된다.)
 * 절차 지향의 한계 - 데이터와 기능이 묶여야 유지보수가 편한데 데이터와 기능이 분리되어있음
 */
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);

        //볼륨 증가
        volUp(data);

        //볼륨 증가
        volUp(data);

        //볼륨 감소
        volDown(data);

        //음악 플레이어 상태
        status(data);
        
        //음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volUp(MusicPlayerData data){
        data.vol++;
        System.out.println("음악 플레이어 볼륨: " + data.vol);
    }

    static void volDown(MusicPlayerData data){
        data.vol--;
        System.out.println("음악 플레이어 볼륨: " + data.vol);
    }

    static void status(MusicPlayerData data){
        System.out.println("음악 플레이어 상태:");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.vol);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
