/**
 * Created by rush on 8/12/16.
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //
        //This is For FirstLast6
        //
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(6);
        boolean result = Kata.firstLast6(nums);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums, result);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(6);
        nums2.add(2);
        nums2.add(3);
        nums2.add(1);
        boolean result2 = Kata.firstLast6(nums2);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums2, result2);

        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.add(13);
        nums3.add(6);
        nums3.add(1);
        nums3.add(2);
        nums3.add(3);
        boolean result3 = Kata.firstLast6(nums3);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums3, result3);

        ArrayList<Integer> nums4 = new ArrayList<>();
        nums4.add(7);
        nums4.add(2);
        nums4.add(6);
        boolean result4 = Kata.firstLast6(nums4);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums4, result4);

        ArrayList<Integer> nums5 = new ArrayList<>();
        nums5.add(1);
        nums5.add(8);
        nums5.add(6);
        boolean result5 = Kata.firstLast6(nums5);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums5, result5);

        ArrayList<Integer> nums6 = new ArrayList<>();
        nums6.add(1);
        nums6.add(2);
        nums6.add(10);
        boolean result6 = Kata.firstLast6(nums6);

        System.out.printf("Kata.firstLast6(%s) -> %s\n", nums6, result6);

        //
        //This is for Same First LAst
        //
        ArrayList<Integer> same = new ArrayList<>();
        same.add(1);
        same.add(2);
        same.add(3);
        boolean sameResult = Kata.sameFirstLast(same);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same, sameResult);

        ArrayList<Integer> same2 = new ArrayList<>();
        same2.add(1);
        same2.add(2);
        same2.add(3);
        same2.add(1);
        boolean sameResult2 = Kata.sameFirstLast(same2);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same2, sameResult2);

        ArrayList<Integer> same3 = new ArrayList<>();
        same3.add(1);
        same3.add(2);
        same3.add(1);
        boolean sameResult3 = Kata.sameFirstLast(same3);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same3, sameResult3);

        ArrayList<Integer> same4 = new ArrayList<>();
        same4.add(1);
        same4.add(2);
        same4.add(4);
        boolean sameResult4 = Kata.sameFirstLast(same4);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same4, sameResult4);

        ArrayList<Integer> same5 = new ArrayList<>();
        same5.add(44);
        same5.add(2);
        same5.add(44);
        boolean sameResult5 = Kata.sameFirstLast(same5);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same5, sameResult5);

        ArrayList<Integer> same6 = new ArrayList<>();
        same6.add(12);
        same6.add(12);
        same6.add(3);
        boolean sameResult6 = Kata.sameFirstLast(same6);

        System.out.printf("Kata.sameFirstLast(%s) -> %s\n", same6, sameResult6);

        //
        //This is for rotateleft3
        //
        ArrayList<Integer> rotate = new ArrayList<>();
        rotate.add(1);
        rotate.add(2);
        rotate.add(3);
        ArrayList<Integer> rotateResult = Kata.rotateLeft3(rotate);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate, rotateResult);

        ArrayList<Integer> rotate2 = new ArrayList<>();
        rotate2.add(5);
        rotate2.add(11);
        rotate2.add(9);
        ArrayList<Integer> rotateResult2 = Kata.rotateLeft3(rotate2);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate2, rotateResult2);

        ArrayList<Integer> rotate3 = new ArrayList<>();
        rotate3.add(7);
        rotate3.add(0);
        rotate3.add(0);
        ArrayList<Integer> rotateResult3 = Kata.rotateLeft3(rotate3);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate3, rotateResult3);

        ArrayList<Integer> rotate4 = new ArrayList<>();
        rotate4.add(6);
        rotate4.add(2);
        rotate4.add(3);
        ArrayList<Integer> rotateResult4 = Kata.rotateLeft3(rotate4);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate4, rotateResult4);

        ArrayList<Integer> rotate5 = new ArrayList<>();
        rotate5.add(33);
        rotate5.add(2);
        rotate5.add(3);
        ArrayList<Integer> rotateResult5 = Kata.rotateLeft3(rotate5);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate5, rotateResult5);

        ArrayList<Integer> rotate6 = new ArrayList<>();
        rotate6.add(23);
        rotate6.add(2);
        rotate6.add(3);
        ArrayList<Integer> rotateResult6 = Kata.rotateLeft3(rotate6);

        System.out.printf("Kata.rotateLeft3(%s) -> %s\n", rotate6, rotateResult6);

        //
        //
        //Reverse 3
        //
        ArrayList<Integer> reverse = new ArrayList<>();
        reverse.add(23);
        reverse.add(2);
        reverse.add(3);
        //ArrayList<Integer> reverseResult = Kata.reverse3(reverse);

        //System.out.printf("Kata.reverse(%s) -> %s\n", reverse, reverseResult);

        //
        //Sum First Penultimate
        //
        ArrayList<Integer> sum = new ArrayList<>();
        sum.add(1);
        sum.add(2);
        sum.add(3);
        int sumResult = Kata.sumFirstPenultimate(sum);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum, sumResult);

        ArrayList<Integer> sum2 = new ArrayList<>();
        sum2.add(1);
        sum2.add(1);

        int sumResult2 = Kata.sumFirstPenultimate(sum2);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum2, sumResult2);

        ArrayList<Integer> sum3 = new ArrayList<>();
        sum3.add(1);
        sum3.add(1);
        sum3.add(1);
        sum3.add(1);
        int sumResult3 = Kata.sumFirstPenultimate(sum3);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum3, sumResult3);

        ArrayList<Integer> sum4 = new ArrayList<>();
        sum4.add(1);
        sum4.add(2);
        sum4.add(3);
        sum4.add(4);
        int sumResult4 = Kata.sumFirstPenultimate(sum4);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum4, sumResult4);

        ArrayList<Integer> sum5 = new ArrayList<>();
        sum5.add(23);
        sum5.add(2);
        sum5.add(3);
        int sumResult5 = Kata.sumFirstPenultimate(sum5);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum5, sumResult5);

        ArrayList<Integer> sum6 = new ArrayList<>();
        sum6.add(4);
        sum6.add(2);
        sum6.add(3);
        int sumResult6 = Kata.sumFirstPenultimate(sum6);

        System.out.printf("Kata.sumFirstPenultimate(%s) -> %s\n", sum6, sumResult6);


    }
}
