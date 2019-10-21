	public static void bubblesort(int[] arr) {
		int jc = 1;
		while (jc <= arr.length - 1) {
			for (int i = 0; i < arr.length - jc; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			jc++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
