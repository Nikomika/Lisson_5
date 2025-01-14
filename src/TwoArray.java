public class TwoArray {
    public static void getMyTwoDimensionalArray(String[][] myTwoDimensionalArray) {
        for (int o = 0; o < 4; o++) {
            for (int f = 0; f < 4; f++) {
                System.out.print(" " + myTwoDimensionalArray[o][f] + " ");
            }
            System.out.println();
        }
    }

}
