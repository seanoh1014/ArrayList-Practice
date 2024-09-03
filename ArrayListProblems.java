import java.util.*;

public class ArrayListProblems {

    /**
     * Return a list of integers containing all the digits 
     * the digits from Math.PI.
     *
     * makePi() → [3, 1, 4, 1, 5, 9, etc...]
     */
    public static ArrayList<Integer> makePi() {
        // make an arraylist to store all digits of pi
        ArrayList<Integer> arr = new ArrayList<>();
        // convert pi to string
        String pi = Double.toString(Math.PI);
        pi = pi.replace(".", "");

        // put digits in the form of string to arr
        for (int i=0; i<pi.length(); i++) {
            arr.add(Integer.parseInt(pi.substring(i, i+1)));
        }

        // print the result
        System.out.println(arr);
        return arr;
    }

    /**
     * Given a list of integers, return true if the list is size 1 
     * or more, and the first and last elements are equal.
     *
     * sameFirstLast([1, 2, 3]) → false 
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     */
    public static boolean sameFirstLast(ArrayList<Integer> list) {
        if (list.size() >= 1 && list.get(0) == list.get(list.size()-1)) {
            return true;
        }
        return false;
    }

    /**
     * Swap the first and last elements in the given 
     * ArrayList. The list size will be at least 1. 
     *
     * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1] 
     * swapEnds([1, 2, 3]) → [3, 2, 1]
     * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
     */
    public static void swapEnds(ArrayList<Integer> list) {
        int listSize = list.size();

        int temp = list.get(0);
        list.set(0, list.get(listSize-1));
        list.set(listSize-1, temp);
    }

    /**
     * Rotate the given list of integers to the left by 
     * one place. for example, {1, 2, 3} yields {2, 3, 1}.
     * The list size will be at least 1. 
     *
     * rotateLeft([1, 2, 3]) → [2, 3, 1] 
     * rotateLeft([5, 11, 9]) → [11, 9, 5]
     * rotateLeft([7, 0, 0]) → [0, 0, 7]
     */
    public static void rotateLeft(ArrayList<Integer> list) {
        int temp = list.get(0);

        for (int i=1; i<list.size(); i++) {
            list.set(i-1, list.get(i));
        }

        list.set(list.size()-1, temp);
    }

    /**
     * Given a list of integers, return true if the list 
     * contains a 2 or a 3 but not both 2 and 3.
     *
     * has23([2, 5]) → true 
     * has23([4, 3]) → true 
     * has23([1, 7]) → false 
     * has23([2, 3]) → false
     */
    public static boolean has23(ArrayList<Integer> list) {
        if (list.contains(2) && list.contains(3)) {
            return false;
        }
        else if (list.contains(2) || list.contains(3)) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Return true if the given list of integers contains 
     * at least 2 fours or 2 fives but returns false 
     * if the list contains 2 fours AND 2 fives.
     *
     * double45([4, 4, 2, 4]) → true 
     * double45([5, 1, 5, 4]) → true 
     * double45([4, 5, 5, 4]) → false
     */
    public static boolean double45(ArrayList<Integer> list) {
        int countFour = 0, countFive = 0;

        for (int i=0; i<list.size(); i++) {
            if (list.get(i) == 4) {
                countFour++;
            }
        }

        for (int i=0; i<list.size()-countFour; i++) {
            if (list.get(i) == 5) {
                countFive++;
            }
        }

        if (countFour >= 2 || countFive >= 2) {
            return true;
        }
        else if (countFour == 2 && countFive == 2) {
            return false;
        }

        return false;
    }

    /**
     * In the given list of integers if there is a 2 in the list
     * immediately followed by a 3, set the 3 value to 0. 
     *
     * fix23([1, 2, 3]) → [1, 2, 0] 
     * fix23([2, 3, 3]) → [2, 0, 3] 
     * fix23([3, 2, 1]) → [3, 2, 1]
     */
    public static void fix23(ArrayList<Integer> list) {
        for (int i=0; i<list.size(); i++) {
            if (i != list.size()-1 && list.get(i) == 2 && list.get(i+1) == 3) {
                list.set(i+1, 0); 
            }
        }
        
    }

    /**
     * Consider the sum of the values in the two given lists of 
     * integers called a and b. Return the list which has the 
     * largest sum. In event of a tie, return list a. 
     * Do NOT create a new list!
     *
     * biggerTwo([1, 2], [3, 4]) → [3, 4] 
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 4], [3, 2]) → [1, 4]
     */
    public static ArrayList<Integer> largerList(ArrayList<Integer> a, ArrayList<Integer> b) {
        int sumFirst = a.get(0) + a.get(1);
        int sumSecond = b.get(0) + b.get(1);

        if (sumFirst >= sumSecond) {
            return a;
        }
        return b;
    }

    /**
     * In the given list of integers compare the first, middle 
     * and last value. Return the largest of the three. The 
     * list size will be a least 1. If there are two values in
     * the middle then return of the sum of the two if the sum
     * is larger than the first and last values.
     *
     * maxTriple([5, 2, 3]) → 5 
     * maxTriple([5, 7, 6, 8, 3]) → 6
     * maxTriple([1, 5, 6, 9]) → 11
     */
    public static int maxTriple(ArrayList<Integer> list) {
        if (list.size() % 2 == 0) {
            return list.get(list.size()/2) + list.get(list.size()/2-1);
        }

        int first = list.get(0);
        int middle = list.get(list.size()/2);
        int last = list.get(list.size()-1);

        int[] arr = new int[3];
        arr[0] = first;
        arr[1] = middle;
        arr[2] = last;

        int largest = first;

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    /**
     * Given two lists of integers, a and b, return a new list of 
     * size 3 containing elements from list a followed by list b. 
     * The given lists may be any size. If there are not 3 elements
     * between the two lists then return all the elements that do 
     * exist.
     *
     * make2([4, 5], [1, 2, 3]) → [4, 5, 1] 
     * make2([4], [1, 2, 3]) → [4, 1, 2]
     * make2([], [1, 2]) → [1, 2, 3]
     */
    public static ArrayList<Integer> make3(ArrayList<Integer> a, ArrayList<Integer> b) {
        int allListLength = a.size() + b.size();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=0; i<a.size(); i++) {
            arr.add(a.get(i));
        }

        for (int i=0; i<b.size(); i++) {
            arr.add(b.get(i));
        }

        ArrayList<Integer> newArr = new ArrayList<>();

        if (arr.size() < 3) {
            return arr;
        }

        for (int i=0; i<3; i++) {
            newArr.add(arr.get(i));
        }
        return newArr;
    }

}
