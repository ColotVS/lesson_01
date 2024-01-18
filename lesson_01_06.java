public class lesson_01_06 {
    public static void main(String[] args) {
        /*Программа должна вывести на экран числа 12 и 2
        (сначала 12, а затем 2).*/
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}