import java.util.*;

class LargestArray{

public static void main(String[] args){

int array1[] = {1,3,4,5,6,2,8,7,9,8};
System.out.println("The  largest element of the first array is: "+ sort(array1));
int array2[] = {4,5,3,2,7,6,9,8,0};
System.out.println("The largest element of the second array is: "+ sort(array2));
}

static int sort(int[] array){
Arrays.sort(array);
return array[array.length - 1];
}
}