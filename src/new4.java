import javafx.scene.Parent;

/**
 * Created by User on 14.03.2017.
 */
public class new4 {

    int x;
    int y;

    new4(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        new4 NEW4 = new new4(2,5);

        First1 parent2 = new First1(10);

        System.out.println(NEW4.x);
        System.out.println(NEW4.y);
    }
}
