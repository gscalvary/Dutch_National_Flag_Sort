public class MainDutchNationalFlagSort {

    public static void main(String[] args) {

        Sorter<Integer> sorter = new Sorter<Integer>();
        Integer[] input = new Integer[]{4, 5, 1, 7, 3, 9, 5, 2, 0, 5};

        System.out.println("Pivot is 5.");
        System.out.print("Input before sort: ");
        print(input);
        sorter.DNFSort(input, 5);
        System.out.print("Input after sort: ");
        print(input);
    }

    private static void print(Integer[] array) {

        for(Integer i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
