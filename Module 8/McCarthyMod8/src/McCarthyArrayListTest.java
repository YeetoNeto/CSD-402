import java.util.ArrayList;

public class McCarthyArrayListTest {

    public static Integer max(ArrayList<Integer> arrayList) { //Method that takes an Integer ArrayList and returns max int or 0 if list is empty
        if (arrayList.isEmpty()) {
            return 0;
        }
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }
}
