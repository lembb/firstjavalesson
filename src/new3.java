/**
 * Created by User on 14.03.2017.
 */
public class new3 {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a){
        return a+a;
    }

    public static int mult(int a){
        return a*a;
    }

    public static void main(String[] args) {
        System.out.println(new3.sum(2,5));
        System.out.println(new3.sum(2));
    }
}


