package array_String;
// Input
// ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
// [[], [1], [2], [2], [], [1], [2], []]
// Output
// [null, true, false, true, 2, true, false, 2]

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class a {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.insert(3);
        boolean param_3 = obj.remove(3);
        boolean param_4 = obj.remove(2);
        int param_5 = obj.getRandom();

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
    }
}
public class RandomizedSet {
    Set<Integer> randomSet ;
    List<Integer> listOfNum ;
    Random random;

    public RandomizedSet() {
        randomSet = new HashSet<>();
        listOfNum = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        // System.out.println(randomSet.add(val));
        if(randomSet.add(val)){
            listOfNum.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(randomSet.remove(val)){
            System.out.println("val "+Integer.valueOf(val));
            listOfNum.remove(Integer.valueOf(val));
            return true;
        }
        // randomSet.remove(val);
        return false;
    }

    public int getRandom() {
        // random = new Random();
        if(listOfNum.isEmpty()) throw new IllegalStateException("Cannot get random element from an empty set");
        int randomIndex = random.nextInt(listOfNum.size());
        int randomElementFromSet = listOfNum.get(randomIndex);
        return randomElementFromSet;
    }

}



/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */