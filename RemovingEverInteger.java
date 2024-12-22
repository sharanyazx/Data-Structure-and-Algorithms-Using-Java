public class RemoveEven {
    public static void printArray(int[] arr) {  //This method is used to print the contents of an array arr to the console.
      int n = arr.length;
      for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static int[] removeEven(int[] arr) {   // This method count odd values and print odd values in an array
      int oddCount = 0;
      for (int i = 0; i < arr.length; i++) {   //count odd
         if (arr[i] % 2 != 0) {
            oddCount++;
         }
      }
      int[] result = new int[oddCount];
      int idx = 0;
      for (int i = 0; i < arr.length; i++) {   // insert odd value in an array
         if (arr[i] % 2 != 0) {
            result[idx] = arr[i];
            idx++;
         }
      }
      return result;
   }

   public static void main(String[] args) {      // calling function
      int[] arr = { 3, 2, 4, 7, 10, 6, 5 }; // 3, 7, 5
      printArray(arr);
      int[] result = removeEven(arr);
      printArray(result);
   }
}
