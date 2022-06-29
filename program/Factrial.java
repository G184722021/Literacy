public class Factrial {
    public static void main(Syring[] args) {
        int i,n,kaijo;
        String N;
        N = System.console().readLine(”n! を計算します。　nを入力してください:”);

        n = Integer.parseInt(N);

        kaijo = 1;
        System.out.println(“n階乗の計算:”);

        for (i = 1; i <= n; i = i + 1) {
            kaijo = kaijo * i;
        }
        System.out.println(n +  “! = ” + kaijo);
    }
}