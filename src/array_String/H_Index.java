package array_String;

public class H_Index {

	public static void main(String[] args) {

		int [] citations = {1,3,1};
		int n = citations.length, tot=0;
		int [] arr = new int[n+1];
		for(int i=0; i<n; i++) {
			if (citations[i]>=n) arr[n]++;
			else arr[citations[i]]++;
		}
		for (int i=n; i>=0; i--) {
			tot += arr[i];
			if (tot>=i) System.out.println(i);
		}
		
	}

}
