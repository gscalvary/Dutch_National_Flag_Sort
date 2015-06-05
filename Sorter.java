public class Sorter<T extends Comparable<T>> {

    public void DNFSort(T[] array, T pivot) {

        /* An improvement upon my initial implementation which uses O(1) space rather than the O(n) space of my
        implementation.
         */

        int less = 0, same = 0, more = array.length - 1;

        while(same <= more) {
            int result = array[same].compareTo(pivot);
            if(result == 0) {
                same++;
            } else if(result < 0) {
                T temp = array[same];
                array[same++] = array[less];
                array[less++] = temp;
            } else {
                T temp = array[more];
                array[more--] = array[same];
                array[same] = temp;
            }
        }

        /* My initial implementation which worked well but took O(n) space.

        ArrayList<T> left = new ArrayList<T>();
        ArrayList<T> same = new ArrayList<T>();
        ArrayList<T> right = new ArrayList<T>();

        for(T item : array) {
            int result = item.compareTo(pivot);
            if(result == 0) {
                same.add(item);
            } else if(result < 0) {
                left.add(item);
            } else right.add(item);
        }

        for(int i = 0; i < left.size(); i++) {
            array[i] = left.get(i);
        }

        for(int i = left.size(), j = 0; i < left.size() + same.size(); i++, j++) {
            array[i] = same.get(j);
        }

        for(int i = left.size() + same.size(), j = 0; i < left.size() + same.size() + right.size(); i++, j++) {
            array[i] = right.get(j);
        }
        */
    }
}
