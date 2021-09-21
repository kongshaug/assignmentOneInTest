public class Main {

    public static void main(String[] args) throws Exception {
        Katas katas = new Katas();
        int num = katas.firstFunction(3);
        System.out.println(num);

        int cel = katas.fahrenheitToCelciusConverter(20);
        System.out.println(cel);
    }

}
