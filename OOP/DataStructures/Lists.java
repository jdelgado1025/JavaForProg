import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers.get(1));

        LinkedList<String> days = new LinkedList<String>();
        days.add("Tuesday");
        days.add("Sunday");
        days.add(1, "Monday");
        System.out.println(days);
        days.remove("Tuesday");
        System.out.println(days.get(1));
        days.remove();
        System.out.println(days);
    }
}