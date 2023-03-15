import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
          ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3,
                4, 5, 6, 7, 8, 9, 10));

                System.out.println("Все элементы списка: " + list);

                list.removeIf(n -> n % 2 != 0);
            
        System.out.println("Все четные элементы списка" + list);
        HomeWork3();
    }

    private static void HomeWork3(){
        ArrayList<String> list = new ArrayList<>(List.of("string", "6", "hi", "s", "5", "10", "-12", "my_value", "1546", "-361573", "dog", "cat"));
        ArrayList<String> list_new = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            boolean isNum = true;
            isNum = (list.get(i)).matches("-?\\d+");
            if (!isNum ) {

                list_new.add(list.get(i));
            }
        }
        System.out.println(list_new);
    }
}
