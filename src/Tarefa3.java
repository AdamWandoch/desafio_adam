package src;

public class Tarefa3 {
    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};

        findIndexes(numbers, 22);
    }

    private static void findIndexes(int[] inputArray, int sum) {
//        iterate through the given array using NESTED FOR LOOP
        for (int index1 = 0; index1 < inputArray.length; index1++) {
            for (int index2 = index1 + 1; index2 < inputArray.length; index2++) {
//        compare all possible pairs of elements checking if their sum returns correct value
                if (inputArray[index1] + inputArray[index2] == sum) {
//        print out found indexes to the screen if found
                    System.out.println("Found indexes: " + index1 + " and " + index2);
                    return;
                }
            }
        }
//        print “not found” message if not found a matching pair
        System.out.println("No solution found.");
    }
}
