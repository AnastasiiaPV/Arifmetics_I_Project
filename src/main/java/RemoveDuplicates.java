import java.util.Arrays;

public class RemoveDuplicates {
    //Написать  алгоритм RemoveDuplicates, который принимает на вход массив чисел, и возвращает
    // массив уникальных чисел.
    //

    public static int[] array(int[] array){
        int[] newArray =  new int[]{array[0]};
        boolean isFound = false;
        for (int i = 1; i < array.length; i++) {
            isFound = false;
            for (int j = 0; j < newArray.length; j++) {
                if(array[i] == newArray[j]){
                    isFound=true;
                    break;
                }
            }
            if(!isFound){
                newArray=Arrays.copyOf(newArray,newArray.length+1);
                newArray[newArray.length-1] = array[i];
            }
        }

        System.out.println(Arrays.toString(newArray));
        return newArray;
    }


    public static void main(String[] args) {
        RemoveDuplicates.array(new int[]{3, 4, 2, 6, 4, 3, 3, 3, 2, 2});
    }
}
