import java.util.ArrayList;
import java.util.List;

public class Counter {
    public static void main(String[] args) {
        addList();
    }
    public static void addList() {
        boolean isEven = false;
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 20);
            if (number % 2 == 0) {
                list.add(111);
                isEven = true;
            } else {
                list.add(number);
            }
        }
        if (isEven) {
            addList();
            counter++;
        } else {
            System.out.println("found "+counter+"  "  +list);
        }
    }
}
