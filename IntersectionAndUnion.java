public class IntersectionAndUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 5};

        int[] intersectionResult = intersection(arr1, arr2);
        System.out.print("Intersected Array: ");
        printArray(intersectionResult);

        int[] unionResult = union(arr1, arr2);
        System.out.print("Union Array: ");
        printArray(unionResult);
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        int minSize = Math.min(arr1.length, arr2.length);
        int[] temp = new int[minSize];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    temp[index++] = arr1[i];
                    break;
                }
            }
        }

        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }
        return result;
    }

    public static int[] union(int[] arr1, int[] arr2) {
        int maxSize = arr1.length + arr2.length;
        int[] temp = new int[maxSize];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            temp[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                temp[index++] = arr2[i];
            }
        }

        int[] result = new int[index];
        for (int k = 0; k < index; k++) {
            result[k] = temp[k];
        }
        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
