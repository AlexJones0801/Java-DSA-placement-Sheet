package Arrays;
// Q6. Find Union and Intersection of two arrays

public class Q6_UnionIntersecof2Arr {

    // Function to find Union of the two arrays
    static void Union(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int k = 0;

        // Add elements from arr1
        for (int i = 0; i < arr1.length; i++) {

            // Check if already added
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (temp[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[k++] = arr1[i];
            }
        }

        // Add elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            // Check if already added
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (temp[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[k++] = arr2[i];
            }
        }

        // Printing Union Array
        System.out.println("Union:");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }

    // Function to find INTERSECTION of the two arrays
    static void Intersection(int[] arr1, int[] arr2) {
        int[] interSec = new int[Math.min(arr1.length, arr2.length)];
        int m = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // Check if already added
                    boolean found = false;
                    for (int l = 0; l < m; l++) {
                        if (interSec[l] == arr1[i]) {
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        interSec[m++] = arr1[i];
                    }
                    break;
                }
            }
        }

        // Printing Intersection Array
        System.out.println("Intersection:");
        for (int i = 0; i < m; i++) {
            System.out.print(interSec[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 4, 5, 6, 7 }, arr2 = { 2, 3, 4, 8, 6 };

        Union(arr1, arr2);
        Intersection(arr1, arr2);
    }
}
