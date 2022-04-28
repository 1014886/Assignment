package Assignment1;

 interface Binary
	{
		void BinSearch();
		}

	public class BinarySearch {
		public static void main(String[] args) {

			Binary b =()->{
			int P[]= {10,20,30,40,50,60,70,80};
			int n=40;
			int s=0,e=P.length-1,pos=-1;
			
			while(s<=e)
			{
			int mid=(s+e)/2;
			if(n==P[mid])
			{
				pos = mid;
				break;
				
			}
			else if (n< P[mid]) {
				e=mid-1;
				
			}
			else {
				s=mid+1;
			}
			}
			if(pos==-1)
			{
				System.out.println("Element is not found");
			}
			else
			{
				System.out.println("The Index of element is:" +pos);
			}
			};
			b.BinSearch();
			}
	}


