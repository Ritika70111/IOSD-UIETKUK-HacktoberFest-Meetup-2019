public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		int low=0;
		int high=arr.length-1;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("want to search");
		int find=scn.nextInt();
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==find) {
				System.out.println(mid);
				return;
			}else if(arr[mid]>find) {
				high=mid-1;
			}else {
				low=mid+1;
			}
	}
		System.out.println("not found");

}
