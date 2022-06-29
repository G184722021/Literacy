public class Handan {
    public static void main(String[] args) {
        int ransu;

        ransu = (int)(Math.random() * 100);

        System.out.println(“乱数の値:” + ransu);

        if((ransu % 2) == 0){
            System.out.println(“偶数です。”);
        }
        else {
            System.out.println(“奇数です。”);
        }
    }
}