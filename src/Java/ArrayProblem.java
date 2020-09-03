package Java;

public class ArrayProblem {
    private int[] items;
    private int count;

    public ArrayProblem(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // if full, resize
        if (items.length == count) {
            // create new array
            int[] newItems = new int[count * 2];
            // copy all existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            // set items to new array
            items = newItems;
        }
        // if array is full, resize
        // add new item to end
        items[count++] = item;
    }

    public void removeAt(int index) {
        // validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        // shift items to left and fill hole
        for (int i = index; i < count; i++)
            items[i] = items[i + 1];
        count--;

    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}


