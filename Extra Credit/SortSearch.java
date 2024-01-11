
public class SortSearch {
	private int[] inputArr;
	private int numElements;

	public SortSearch() {
		//default constructor
		this(new int[8], 0);
	}

	public SortSearch(int[] newArr, int startingNumElements) {
		//paramaterized constructor
		this.inputArr = newArr;
		this.numElements = startingNumElements;
	}

	private void twiceSize() { 
		//doubles size of inputArr when called
		int [] doubledArr = new int[inputArr.length * 2];
		for (int i = 0; i < numElements; ++i) {
			doubledArr[i] = inputArr[i];
		}
		inputArr = doubledArr;
	}

	public void addElem(int inputInt) {
		//adds element to inputArr; calls twiceSize() if inputArr is full
		if (numElements == inputArr.length) {
			twiceSize();
		}
		inputArr[numElements] = inputInt; 
		numElements++;
	}

	public int getNumElem() {
		//retrieves value of numElements
		return numElements;
	}

	public void insertionSort() {
		//sorts elements in inputArr
		int temp;
		for (int i = 1; i < numElements; ++i) {
			int j = i;
			while (j > 0 && (inputArr[j] < inputArr[j - 1])) {
				temp = inputArr[j];
				inputArr[j] = inputArr[j - 1];
				inputArr[j - 1] = temp;
				--j;
			}
		}
	}

	public void printArr() {
		//prints the contents of inputArr
		for (int i = 0; i < numElements; ++i) {
			System.out.print(inputArr[i]);
			if (i < numElements - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public int binarySearch(int searchTerm, int lowVal, int highVal, int numCalls) { 
		/*					-- recursive binary search function --
		  prints the # of calls to binarySearch() to find a queried element in inputArr
		  returns index as searchTerm if found or -1 if the element is not found */	
		numCalls++;
		int midVal = (highVal + lowVal) / 2;
		if (lowVal > highVal){
			System.out.println("binarySearch() took " + numCalls + " instances to complete the search!");
			return -1;
		}
		if (midVal <= numElements - 1) {
			if (searchTerm == inputArr[midVal]) {
				if (numCalls > 1) {
					System.out.println("binarySearch() took " + numCalls + " instances to complete the search!");
				}
				else {
					System.out.println("binarySearch() took " + numCalls + " instance to complete the search!");
				}
			}

			else if (inputArr[midVal] < searchTerm) {
				return binarySearch(searchTerm, midVal + 1, highVal, numCalls);
			}

			else if (inputArr[midVal] > searchTerm) {
				return binarySearch(searchTerm, lowVal, midVal - 1, numCalls);
			}
			return midVal;
		}
		return -1;
	} 
}