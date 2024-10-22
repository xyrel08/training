public class BinarySearch {


    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;



           if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);



                return binarySearch(arr, mid + 1, r, x);

        }


        return -1;
    }

    // main function
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();

        int arr[] = { 3,5,7,8,10 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }
}

