import java.util.Arrays;

/**
 * Created by User on 21.02.2017.
 */
public class First1 {

    static int x;
    static int y;
    int[] digits = new int[10];
    int[] arrDigits = { 1, 2, 6, 5, 7, 9};

    public void ma5in(String[] args) {
        digits[0] = 5;
        digits[1] = digits[0]+6;
        digits[2] = arrDigits[5]*9;
    }


/*    public static void main(String[] args) {
            First1 first = new First1();
            first.digits[3] = first.arrDigits[4];
            first.digits[4] = first.arrDigits[5];
        System.out.println(Arrays.toString(first.digits));


    }*/

    public static void main(String[] args) {
        First1 dig = new First1();

        for(int i=0; i < 10; i++) {
            dig.digits[i] = i;
        }
        System.out.println(Arrays.toString(dig.digits));
    }
}

