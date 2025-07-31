package Generics;

import java.util.List;

public class Hw {

    public <U> U[] changePos(int firstPos, int secondPos, U[] arr) {

        U  temp = arr[firstPos];
        arr[firstPos] = arr[secondPos];
        arr[secondPos] = temp;
        return arr;
    }

}
