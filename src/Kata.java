import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rush on 8/12/16.
 */
public class Kata {
    public static boolean firstLast6(ArrayList<Integer> nums) {

        if ((nums.get(0) == 6) || (nums.get((nums.size() -1)) == 6)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sameFirstLast(ArrayList<Integer> nums) {
        if (((nums.size()) >= 1) && (nums.get(0) == (nums.get((nums.size() - 1))))) {
            return true;
        } else {
            return false;
        }
    }


   public static ArrayList<Integer> rotateLeft3(ArrayList<Integer> nums){
        int first = nums.get(0);
        nums.remove(0);
        nums.add((nums.size()), first);

        return nums;
    }

    public static ArrayList<Integer> reverse3(ArrayList<Integer> nums) {
        int first = nums.get(0);
        int last = nums.get(2);
        nums.remove(2);
        nums.remove(0);
        nums.add(first);

        nums.add(0, last);

        return nums;
    }

    public static int sumFirstPenultimate(ArrayList<Integer> nums){
        int first = nums.get(0);
        int second = nums.get(1);
        int secondLast = nums.get((nums.size() - 2));

        if ((nums.size() <= 2)){
            return first + second;
        } else {
            return first + secondLast;
        }
    }

    public static HashMap <String, String> mapBully(HashMap<String, String> map){
        if (map.containsKey("a") && map.containsValue(" ")){

        }
    }
}

