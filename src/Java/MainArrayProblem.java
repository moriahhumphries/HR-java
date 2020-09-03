package Java;

import java.sql.Array;

import java.util.Arrays;

public class MainArrayProblem {
    public static void main(String[] args) {
        ArrayProblem numbers = new ArrayProblem(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.removeAt(2);
        numbers.print();
    }
}
