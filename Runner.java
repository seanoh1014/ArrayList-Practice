import java.util.*;

public class Runner {

    public static void main(String[] args) {
        testMakePi();
        testSameFirstLast();
        testSwapEnds();
        testRotateLeft();
        testHas23();
        testDouble45();
        testFix23();
        testLargerList();
        testMaxTriple();
        testMake3();
    }

    public static void testMakePi() {
        System.out.println("\nTesting makePi()... " + Math.PI);
        System.out.println(ArrayListProblems.makePi()); // {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3}
    }

    public static void testSameFirstLast() {
        System.out.println("\nTesting sameFirstLast()...");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 2));
        System.out.println(ArrayListProblems.sameFirstLast(list)); // true
        list = new ArrayList<>(Arrays.asList(9, 8, 5, 9, 8));
        System.out.println(ArrayListProblems.sameFirstLast(list)); // false
    }

    public static void testSwapEnds() {
        System.out.println("\nTesting swapEnds()... ");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2));
        ArrayListProblems.swapEnds(list);
        System.out.println(list); // {3, 2, 1}
    }

    public static void testRotateLeft() {
        System.out.println("\nTesting rotateLeft()... ");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 4, 2));
        ArrayListProblems.rotateLeft(list);
        System.out.println(list); // {4, 2, 6}
    }

    public static void testHas23() {
        System.out.println("\nTesting has23()...");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4));
        System.out.println(ArrayListProblems.has23(list)); // false
        list = new ArrayList<>(Arrays.asList(3, 2, 4));
        System.out.println(ArrayListProblems.has23(list)); // true
    }

    public static void testDouble45() {
        System.out.println("\nTesting double45()...");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 7, 5));
        System.out.println(ArrayListProblems.double45(list)); // false
        list = new ArrayList<>(Arrays.asList(4, 2, 4, 5));
        System.out.println(ArrayListProblems.double45(list)); // true
        list = new ArrayList<>(Arrays.asList(4, 5, 5, 4));
        System.out.println(ArrayListProblems.double45(list)); // false
    }

    public static void testFix23() {
        System.out.println("\nTesting fix23()... ");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 2, 2, 3));
        System.out.println(ArrayListProblems.double45(list)); // {3, 2, 2, 0}
        list = new ArrayList<>(Arrays.asList(2, 3, 3, 2));
        System.out.println(ArrayListProblems.double45(list)); // {2, 0, 3, 2}
        list = new ArrayList<>(Arrays.asList(2, 3, 2, 3));
        System.out.println(ArrayListProblems.double45(list)); // {2, 0, 2, 0}
    }

    public static void testLargerList() {
        System.out.println("\nTesting biggerTwo()... ");
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 5));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 2));
        System.out.println(ArrayListProblems.largerList(listA, listB)); // {1, 5}
    }

    public static void testMaxTriple() {
        System.out.println("\nTesting maxTriple()...");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        System.out.println(ArrayListProblems.maxTriple(list)); // 5
        list = new ArrayList<>(Arrays.asList(1, 8, 7, 4, 9, 6));
        System.out.println(ArrayListProblems.maxTriple(list)); // 7
    }

    public static void testMake3() {
        System.out.println("\nTesting make3()... ");
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(3, 4));
        System.out.println(ArrayListProblems.make3(listA, listB)); // {1, 2, 3}
        listA = new ArrayList<>(Arrays.asList(5));   
        listB = new ArrayList<>(Arrays.asList(7));   
        System.out.println(ArrayListProblems.make3(listA, listB)); // {5, 7}
        listA = new ArrayList<>(Arrays.asList(5, 7, 4, 3));   
        listB = new ArrayList<>(Arrays.asList(2)); 
        System.out.println(ArrayListProblems.make3(listA, listB)); // {5, 7, 4}
    }
}
