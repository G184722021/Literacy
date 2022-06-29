public class Kasan3 {
    public static void main(String[] args) {
        int i,n,m,wa;
        String N,M;
        M = System.console().readLine(”m〜n までの和を計算します。 mを入力してください:”);
        N = System.console().readLine(”nを入力してください:”);

        m = Integer.parseInt(M);
        n = Integer.parseInt(N);

        wa = 0;
        System.out.println(“和の計算　“ + m + ”〜” + n);

        for(i = m; i <= n; i = i + 1){
            wa = wa + i;
        }
        System.out.println(m + “から“ + n + ” までの和は ” + wa);
    }
}