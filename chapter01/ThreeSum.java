public class ThreeSum{

	public static void main(String[] args) {
		int[] numbers = new int[]{30,-40,-20,-10,40,0,10,5};
		//Stopwatch stopwatch = new Stopwatch();
		System.out.println(String.valueOf(countThreeSums(numbers)));
		//double time = stopwatch.elapsedTime();
		//System.out.println("TIME ELAPSED : " + String.valueOf(time));
	}

	public static int countThreeSums(int[] numbers){
		int n = numbers.length;
		int count = 0;

		for (int i=0; i < n; i++) {
			for (int j=i+1; j<n ; j++) {
				for (int k=j+1; k<n ; k++) {
					if(numbers[i] + numbers[j] + numbers[k] == 0){
						count++;
					}
				}
			}
		}
		return count;
	}
}