public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 13, 14, 15, 17};
        boolean found = false;
        int sNum = 3;
        int steps = 0, posA = 0, posB = arr.length - 1, div = (posA + posB) / 2;

        while (!found) {
            if (sNum < arr[div]) {
                posB = div;
            } else if (sNum > arr[div]) {
                posA = div;
            } else found = true;

            if ((posB - posA > 1) && (!found)) div = (posA + posB) / 2;
            else if (arr[posB] == sNum) {
                found = true;
                div++;
            } else if (arr[posA] == sNum) {
                found = true;
                div--;
            }

            steps++;
        }
        if (found) System.out.println(sNum + " found!\n" + "Position: " + div + "\n" + "Steps: " + steps);
        else System.out.println("Not found!");
    }
}