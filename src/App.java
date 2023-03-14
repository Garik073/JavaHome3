import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
          ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3,
                4, 5, 6, 7, 8, 9));

                System.out.println("Все элементы массива: " + list);

        for (int i = 0; i < list.size(); i++) {
            
            list.remove(i);
        }
        System.out.println(list);
    }
}
