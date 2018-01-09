public class ArrayFun {
  public static void main(String[] args) {
    int[] arr = {1,7,12,15,18,20,21,22};
    int[] insert = {8,13};
    int[] remove = {18};
    printArr(arr);
    arr = arrInsert(arr,insert);
    printArr(arr);
   // arr = arrRemove(arr,remove);
   // printArr(arr);
  }
  
  public static int[] arrInsert(int[] arr,int[] insert) {
    int[] newArray = new int[arr.length + insert.length];
    for(int k = 0; k < insert.length; k++) {
    for (int index = 0; index < arr.length; index++) {
        newArray[index] = arr[index];
    }

    newArray[newArray.length - (k + 1)] = insert[k];
    
    }
    return sortArray(newArray);
  }
  
  public static int[] arrRemove(int[] arr, int[] remove) {
    int found = 0;
   int[] newArr = new int[arr.length - remove.length];
   for(int i = 0; i < newArr.length; i++) {
     if(find(remove,arr[i]) == -1) {
      newArr[i + found] = arr[i - found]; 
     } else {
     newArr[i] = arr[i + 1];
     found ++;
     }
   }
   return newArr;
  }
  
  public static int find(int[] array, int value) {
    for(int i=0; i<array.length; i++) 
         if(array[i] == value)
             return i;
    return -1;
  }
  
  public static void printArr(int[] arr) {
    for(int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println("");
  }
  
  public static int[] sortArray(int[] nonSortedArray) {
        int[] sortedArray = new int[nonSortedArray.length];
        int temp;
        for (int j = 0; j < nonSortedArray.length - 1; j++) 

        for (int i = 0; i < nonSortedArray.length - 1; i++) {
            if (nonSortedArray[i] > nonSortedArray[i + 1]) {
                temp = nonSortedArray[i];
                nonSortedArray[i] = nonSortedArray[i + 1];
                nonSortedArray[i + 1] = temp;
                sortedArray = nonSortedArray;

            }
        }
        return sortedArray;
        }
        
    
                                  
  
}