import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by rush on 8/12/16.
 */
public class Kata {
    public static boolean firstLast6(ArrayList<Integer> nums) {
        ArrayList<Integer> copy = new ArrayList<>(nums);

        if ((copy.get(0) == 6) || (copy.get((copy.size() -1)) == 6)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean sameFirstLast(ArrayList<Integer> nums) {
        ArrayList<Integer> copy = new ArrayList<>(nums);
        if (((copy.size()) >= 1) && (copy.get(0) == (copy.get((copy.size() - 1))))) {
            return true;
        } else {
            return false;
        }
    }


   public static ArrayList<Integer> rotateLeft3(ArrayList<Integer> nums){
       ArrayList<Integer> copy = new ArrayList<>(nums);
        int first = copy.get(0);
        copy.remove(0);
        copy.add((copy.size()), first);

        return copy;
    }

    public static ArrayList<Integer> reverse3(ArrayList<Integer> nums) {
        ArrayList<Integer> copy = new ArrayList<>(nums);
        int first = copy.get(0);
        int last = copy.get(2);
        copy.remove(2);
        copy.remove(0);
        copy.add(first);

        copy.add(0, last);

        return copy;
    }

    public static int sumFirstPenultimate(ArrayList<Integer> nums){
        ArrayList<Integer> copy = new ArrayList<>(nums);
        int first = copy.get(0);
        int second = copy.get(1);
        int secondLast = copy.get((copy.size() - 2));

        if ((copy.size() <= 2)){
            return first + second;
        } else {
            return first + secondLast;
        }
    }


    public static HashMap <String, String> mapBully(HashMap<String, String> map){
        HashMap<String, String> copy = new HashMap<>(map);
        if (copy.containsKey("a") && !(copy.containsValue(""))){
            copy.put("b", copy.get("a"));
            copy.replace("a", "");
            return copy;
        } else {
            return copy;
        }
    }

    public static HashMap <String, String> mapShare(HashMap<String, String> map){
        HashMap<String, String> copy = new HashMap<>(map);

        if (copy.containsKey("a") && !(copy.containsValue(""))){
            copy.put("b", copy.get("a"));
            copy.remove("c");
        }
        copy.remove("c");
        return copy;
    }

    public static HashMap <String, String> mapAB(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        if (copy.containsKey("a") && copy.containsKey("b")){
            copy.put("ab", (copy.get("a") + copy.get("b")));
        } return copy;
    }

    public static HashMap <String, String> wordLen(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);

        return copy;
    }
}

