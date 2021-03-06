/**
 * Created by rush on 8/12/16.
 */
import java.util.ArrayList;
import java.util.HashMap;

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
        reverse.add(1);
        reverse.add(2);
        reverse.add(3);
        ArrayList<Integer> reverseResult = Kata.reverse3(reverse);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse, reverseResult);

        ArrayList<Integer> reverse2 = new ArrayList<>();
        reverse2.add(5);
        reverse2.add(11);
        reverse2.add(9);
        ArrayList<Integer> reverseResult2 = Kata.reverse3(reverse2);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse2, reverseResult2);

        ArrayList<Integer> reverse3 = new ArrayList<>();
        reverse3.add(7);
        reverse3.add(0);
        reverse3.add(0);
        ArrayList<Integer> reverseResult3 = Kata.reverse3(reverse3);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse3, reverseResult3);

        ArrayList<Integer> reverse4 = new ArrayList<>();
        reverse4.add(23);
        reverse4.add(2);
        reverse4.add(3);
        ArrayList<Integer> reverseResult4 = Kata.reverse3(reverse4);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse4, reverseResult4);

        ArrayList<Integer> reverse5 = new ArrayList<>();
        reverse5.add(23);
        reverse5.add(2);
        reverse5.add(33);
        ArrayList<Integer> reverseResult5 = Kata.reverse3(reverse5);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse5, reverseResult5);

        ArrayList<Integer> reverse6 = new ArrayList<>();
        reverse6.add(23);
        reverse6.add(23);
        reverse6.add(53);
        ArrayList<Integer> reverseResult6 = Kata.reverse3(reverse6);

        System.out.printf("Kata.reverse3(%s) -> %s\n", reverse6, reverseResult6);


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

        //
        //Map Bully
        //
        HashMap<String, String> data = new HashMap<>();
        data.put("b", "dirt");
        data.put("a", "candy");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data,  Kata.mapBully(data));

        HashMap<String, String> data2 = new HashMap<>();
        data2.put("a", "candy");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data2,  Kata.mapBully(data2));

        HashMap<String, String> data3 = new HashMap<>();
        data3.put("b", "carrot");
        data3.put("c", "meh");
        data3.put("a", "candy");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data3,  Kata.mapBully(data3));

        HashMap<String, String> data4 = new HashMap<>();
        data4.put("b", "");
        data4.put("a", "candy");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data4,  Kata.mapBully(data4));

        HashMap<String, String> data5 = new HashMap<>();
        data5.put("b", "dirt");
        data5.put("a", "");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data5,  Kata.mapBully(data5));

        HashMap<String, String> data6 = new HashMap<>();
        data6.put("b", "dirt");
        data6.put("a", "randy");


        System.out.printf("Kata.mapBully(%s) -> %s\n", data6,  Kata.mapBully(data6));

        //
        //Map Share
        //

        HashMap<String, String> share = new HashMap<>();
        share.put("b", "bbb");
        share.put("c", "ccc");
        share.put("a", "aaa");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share,  Kata.mapShare(share));

        HashMap<String, String> share2 = new HashMap<>();
        share2.put("b", "xyz");
        share2.put("c", "ccc");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share2,  Kata.mapShare(share2));

        HashMap<String, String> share3 = new HashMap<>();
        share3.put("d", "grr");
        share3.put("c", "meh");
        share3.put("a", "aaa");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share3,  Kata.mapShare(share3));

        HashMap<String, String> share4 = new HashMap<>();
        share4.put("d", "hi");
        share4.put("c", "meh");
        share4.put("a", "aaa");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share4,  Kata.mapShare(share4));

        HashMap<String, String> share5 = new HashMap<>();
        share5.put("d", "hi");
        share5.put("c", "haha");
        share5.put("a", "dude");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share5,  Kata.mapShare(share5));

        HashMap<String, String> share6 = new HashMap<>();
        share6.put("bb", "dkd");
        share6.put("c", "waat");
        share6.put("a", "aaa");


        System.out.printf("Kata.mapShare(%s) -> %s\n", share6,  Kata.mapShare(share6));

        //
        //Map AB
        //
        HashMap<String, String> mapAB = new HashMap<>();
        mapAB.put("b", "There");
        mapAB.put("a", "Hi");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB,  Kata.mapAB(mapAB));

        HashMap<String, String> mapAB2 = new HashMap<>();
        mapAB2.put("a", "Hi");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB2,  Kata.mapAB(mapAB2));

        HashMap<String, String> mapAB3 = new HashMap<>();
        mapAB3.put("b", "There");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB3,  Kata.mapAB(mapAB3));

        HashMap<String, String> mapAB4 = new HashMap<>();
        mapAB4.put("b", "dude");
        mapAB4.put("a", "Hi");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB4,  Kata.mapAB(mapAB4));

        HashMap<String, String> mapAB5 = new HashMap<>();
        mapAB5.put("a", "HWoahi");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB5,  Kata.mapAB(mapAB5));

        HashMap<String, String> mapAB6 = new HashMap<>();
        mapAB6.put("b", "bear");
        mapAB6.put("a", "tassles");


        System.out.printf("Kata.mapAB(%s) -> %s\n", mapAB6,  Kata.mapAB(mapAB6));

        //
        //Word Length
        //
        ArrayList<String> word = new ArrayList<>();
        word.add("a");
        word.add("bb");
        word.add("a");
        word.add("bb");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word,  Kata.wordLen(word));

        ArrayList<String> word2 = new ArrayList<>();
        word2.add("this");
        word2.add("and");
        word2.add("that");
        word2.add("and");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word2,  Kata.wordLen(word2));

        ArrayList<String> word3 = new ArrayList<>();
        word3.add("code");
        word3.add("code");
        word3.add("code");
        word3.add("bug");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word3,  Kata.wordLen(word3));

        ArrayList<String> word4 = new ArrayList<>();
        word4.add("lkjsd");
        word4.add("this");
        word4.add("dude");
        word4.add("car");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word4,  Kata.wordLen(word4));

        ArrayList<String> word5 = new ArrayList<>();
        word5.add("ballin");
        word5.add("this is s");
        word5.add("ldld");
        word5.add("bab");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word5,  Kata.wordLen(word5));

        ArrayList<String> word6 = new ArrayList<>();
        word6.add("a");
        word6.add("window");
        word6.add("bubba");
        word6.add("thisiskd");

        System.out.printf("Kata.wordLen(%s) -> %s\n", word6,  Kata.wordLen(word6));

        //
        //Index Words
        //
        ArrayList<String> index = new ArrayList<>();
        index.add("aardvark");
        index.add("apple");
        index.add("zamboni");
        index.add("phone");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index,  Kata.indexWords(index));

        //
        ArrayList<String> index2 = new ArrayList<>();
        index2.add("elephant");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index2,  Kata.indexWords(index2));

        //
        ArrayList<String> index3 = new ArrayList<>();


        System.out.printf("Kata.indexWords(%s) -> %s\n", index3,  Kata.indexWords(index3));

        //
        ArrayList<String> index4 = new ArrayList<>();
        index4.add("");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index4,  Kata.indexWords(index4));

        //
        ArrayList<String> index5 = new ArrayList<>();
        index5.add("a");
        index5.add("window");
        index5.add("bubba");
        index5.add("bbubba");
        index5.add("thisiskd");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index5,  Kata.indexWords(index5));

        //
        ArrayList<String> index6 = new ArrayList<>();
        index6.add("ba");
        index6.add("bindow");
        index6.add("bubba");
        index6.add("bbubba");
        index6.add("");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index6,  Kata.indexWords(index6));

        //
        ArrayList<String> index7 = new ArrayList<>();
        index7.add("a");
        index7.add("dingle");
        index7.add("baah");
        index7.add("bbubba");
        index7.add("woah");


        System.out.printf("Kata.indexWords(%s) -> %s\n", index7,  Kata.indexWords(index7));
    }
}
