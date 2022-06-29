public class Kasan2 {
    public static void main(String[] args) {
        int i,n,wa;
        String N;
        N = System.console().readLine(”1~n までの和を計算します。 nを入力してください:”);

        n = Integer.parseInt(N);

        wa = 0;
        System.out.println(“和の計算　1〜” + n);

        for(i = 1; i <= n; i = i + 1){
            wa = wa + i;
        }
        System.out.println(“1から“ + n + ”の和は” + wa);
    }
}