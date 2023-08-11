public class App3 {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1, 5};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print("Array yang sudah diurutkan: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
