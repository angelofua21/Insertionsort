import java.util.*;
import java.io.File;

public class InsertionSort extends SortingAlgorithm {

	public InsertionSort( int[] arrInput, int n)
	{
		super( arrInput, n );
	}
	@Override
	public void sort(){
		for(int i = 1; i < n; ++i){
			int key = arr[i];
			int j = i - 1;

			while (j >=0 && arr[j] > key){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
}

