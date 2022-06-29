public class Kasan {
    public static void main(String[] args) {
        int i,wa;

        wa = 0;
        System.out.println(“和の計算　1〜100”);

        for(i = 1; i <= 100; i = i + 1){
            wa = wa + i;
        }
        System.out.println(“1から100の和は” + wa);
    }
}