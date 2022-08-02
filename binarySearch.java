public class binarySearch {

	public int Search1(int[] arr, int n, int l, int x) {
		int mid;
		if(l >= n) {
			mid = (n + l)/2;

			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid] > x) {
				return Search1(arr, n, mid - 1, x);
			}else {
				return Search1(arr, mid + 1, l, x);
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		binarySearch b = new binarySearch();
		int[] arr = {5, 10, 8, 17, 14};
		int x = 100;
		int last = arr.length - 1;
		int result = b.Search1(arr, 0, last -1, x);
		{
			if(result == -1) {
				System.out.println("Element Not Found");
			}else {
				System.out.println("Element Found " + result);

			}
		}
	}
}
