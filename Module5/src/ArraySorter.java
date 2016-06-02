import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by a.lyahovich on 02.06.2016.
 * Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел
 * (int[]).
 Выбрать один из алгоритмов сортировки массивов и реализовать его
 */
public class ArraySorter {

    public int getMinNumber (int[] randomArray){
        Arrays.sort(randomArray);
        return randomArray[0];
    }
    public int getMaxNumber (int[] randomArray){

        for (int i=0; i<randomArray.length-1;i++){
            for (int j=i+1; j<randomArray.length;j++){
                if (randomArray[i]>randomArray[j]){
                    int temp = randomArray[i];
                    randomArray[i]= randomArray[j];
                    randomArray[j]=temp;
                }
            }
        }

        return randomArray[randomArray.length-1];
    }


}
