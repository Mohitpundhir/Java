Class ReverseArray
	{
		int arr[]={1,2,3,4,5,6,7,8};
		
		int temp,start=0;
		int end=arr-1;


		while(start<end)
			{
				temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;

				start++;
				end--;
			}
				
				System.out.println("Array after reverse:")
				
				for(int j=0;j<arr.length;j++)
					{

						System.out.println(arr[j]);
					}

			
	}