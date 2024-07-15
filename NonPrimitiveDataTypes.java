
public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String str= " good Morning ";
		System.out.println("String is :" +str);
	
		//Another Way of creating String
		
		String str1=new String ("hello");
		System.out.println("Another String is :" +str1);
		
		int arr[];
		
		arr=new int[4];
		arr[0]=3344;
		arr[1]=2;
		arr[2]=3;
		
		//to print the memory address of the array
		System.out.println("array is "+arr);
		System.out.println("array size is "+arr[0]);
		
	}

}
