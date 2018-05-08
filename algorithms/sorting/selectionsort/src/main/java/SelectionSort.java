/**
 * Created by ashwani on 6/9/2016.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 1, 13, 14};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {

                    arr[i]=arr[j];
                    arr[j]=min;
                    min=arr[i];
                }


            }
        }

        System.out.println("Printing Sorted Array");
        for (Integer arrElement : arr) {
            System.out.print(" " + arrElement);
        }

    }
}
