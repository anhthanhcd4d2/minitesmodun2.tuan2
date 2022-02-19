public class Maintessst {









 public static void main(String[] args) {
     int[] arr = {1, 2, 3, 7, 6, 8, 5, 4};
     int temp = arr[0];

     for (int i = 0; i < arr.length - 1; i++) {
         for (int j =i+1; j < arr.length; j++) {
             if (arr[i] > arr[j]) {
                 temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
         }
     }
     for (int i = 0; i < arr.length; i++) {
            System.out.println(" hiển thị" +arr[i]);
        }
    }

}
//