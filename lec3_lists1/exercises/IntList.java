package lec3_lists1.exercises;

public class IntList {
    int first;
    IntList rest;

    //recursive int list
    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return rest.size() + 1;
    }

    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;

        while (p != null) {
            totalSize = totalSize + 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        } else {
            return rest.get(i - 1);
        }


    }

    @Override
    public String toString() {
        if (rest == null) {
            return first + "";
        }
        return first + " -> " + rest.toString();
    }


    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);

        // write get and uncomment
        System.out.println(L.get(0)); // → 5
        System.out.println(L.get(1)); // → 10
        System.out.println(L.get(2)); // → 15

    }
}
