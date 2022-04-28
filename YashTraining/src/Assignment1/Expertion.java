package Assignment1;

 interface Array1 {
	void MaxArray();
}

public class Expertion {
	public static void main(String s[]) {
		Array1 d = () -> {
			

			int a[] = { 1, 2, 3, 4, 8, 6, 9 ,10 ,11 };
			int ele = 0;
			int max=a[0];
			for (int i = 0; i < a.length-1; i++) 
			{
				
					if (a[i] > max)
					{
						max=a[i];
					

				}
			}
			
			System.out.print("The maximum no is:" + a[a.length - 1]);
		};
		d.MaxArray();
	}

}


