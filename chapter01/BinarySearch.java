public class BinarySearch{

	public static void main(String[] args) {
		int[] numbers = new int[]{11,13,14,20,23,27,31,42,51,55,67,72};
		System.out.println("INDEX IS : " + String.valueOf(binarySearch(numbers,27)));
	}

	public static int binarySearch(int[] numbers, int key){
		int low = 0, high = numbers.length -1;
		while(low <= high){
			int mid = low + (high - low) / 2;
			if(key < numbers[mid]) high = mid - 1;
			else if(key > numbers[mid]) low = mid + 1;
			else return mid;
		}
		return -1;
	}
}