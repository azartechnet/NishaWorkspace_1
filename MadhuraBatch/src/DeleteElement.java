import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int deleteIndex=2;
		
		for(int i=deleteIndex;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr=Arrays.copyOf(arr,arr.length-1);
		System.out.println("Array After deletion::"+Arrays.toString(arr));

	}

}
