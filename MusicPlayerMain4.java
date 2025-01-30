package section4_oop;
/**
 * 객체 지향 프로그래밍 - 객체 지향 프로그래밍
 */
public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer p = new MusicPlayer();

        //음악 플레이어 켜기
        p.on();

        //볼륨 증가
        p.volUp();

        //볼륨 증가
        p.volUp();

        //볼륨 감소
        p.volDown();

        //음악 플레이어 상태
        p.status();

        //음악 플레이어 끄기
        p.off();
    }
}
