public class AdjacencyMatrix{
	public static void main(String args[]){
		int arr[][] ={ 
		{0,1,1,0,1},
		{0,0,0,1,0},
		{0,0,0,1,1},
		{0,0,0,0,0},
		{0,0,0,0,0}};
		int n=5, m=5;
		int zeros=0;
		int sink_count=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(arr[i][j] == 0){
					zeros++;
				}
				if(zeros==n){
					sink_count++;
				}
			}
		}
		System.out.println("sink counts:"+sink_count);
	}
}
		

		