class IsSortedArrayV2{
  static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }
    return true;
  }
  public static void main(String args[]) {
    int arr[] = {5,4,3,2,1}, n = 5;
    System.out.println(isSorted(arr, n));
  }
}
