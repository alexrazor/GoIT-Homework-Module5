/**
 * Created by a.lyahovich on 02.06.2016.
 */
public class Tester {
    public static void main(String[] args) {
        int[] array ={5,3,4,0,-2,143,15};
        ArraySorter as = new ArraySorter();
        System.out.println(as.getMinNumber(array));
        System.out.println(as.getMaxNumber(array));

    }
}
