package Assignment1;

public class DuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,2,1,5,4,3,2,6,5,9};
		
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
			count++;
			System.out.println("duplicate no: "+arr[j]+"count: "+count);
					
				}
				
			}
			
		}

	}

}




