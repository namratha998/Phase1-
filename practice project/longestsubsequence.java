
public class longestsubsequence {
	static int max; 

	static int lis(int arr[], int n)
	{
		if (n == 1)
			return 1;

		int res, endpoint = 1;

		for (int i = 1; i < n; i++) {
			res = lis(arr, i);
			if (arr[i - 1] < arr[n - 1] && res + 1 > endpoint)
				endpoint = res + 1;
		}

		if (max < endpoint)
			max = endpoint;

		return endpoint;
	}

	static int lis1(int arr[], int n)
	{
		max = 1;

		lis(arr, n);
       return max;
	}
	public static void main(String args[])
	{
		int arr[] = { 1,3,5,4,7};
		int n = arr.length;
		System.out.println("Length of lis is "
						+ lis(arr, n) + "\n");
		System.out.println();
	}
}

