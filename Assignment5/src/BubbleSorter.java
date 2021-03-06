/**
 * Daniel Hug
 * Data Structures 
 * Assignment 5
 * Sorting
 * The IntBubbleSrorter class provides a public static
 * method for performing a bubble sort on an integer array.
 *
 */
class BubbleSorter {
	
	/**
	 * The Node class stores a list element
	 * and a reference to the next node.
	 */
	private class Node{
		String value;
		Node next;
		Node prev;
		
		/**
		 * Constructor
		 * @param val The element to be stored in the node.
		 * @param n The reference to the successor nod.
		 * @param p The reference to the predecessor node.
		 */
		Node(String val, Node n, Node p){
			value = val;
			next = n;
			prev = p;
		}
			
		/**
		 * Constructor
		 * @param val The element stored in the node.
		 */
		Node(String val){
			this(val, null, null);
			}
		
	}
	private Node first; //Head of the List
	private Node last; //Last element on the list.
	
	 /**
	  * The bubbleSort method uses the bubble sort 
	  * algorithm to sort an integer array.
	  * @param array The array to sort.
	  */
	 public static void bubbleSort(int [] array){
	  int lastPos; //position of the last element to compare
	  int index; //Index of an element to compare.
	  int templist; //Used to swap elements
	  /*
	   * The outer loop positions lastPos at the last element
	   * to compare during each pass through the array. Initially
	   * lastPos is the index of the last element in the array.
	   * During each iteration, it is decreased by one.
	   */
	  for(lastPos = array.length - 1; lastPos >= 0; lastPos--){
	   /*
	    * The inner loop steps through the array, comparing
	    * each element with its neighbor. All of the elements
	    * from index 0 through lastPos are involved in the 
	    * comparison. If two elements are out of order, they
	    * are swapped
	    * 
	    */
	   
	   for(index = 0; index <= lastPos - 1; index++){
	    
	    //Compare an element with its neighbor.
	    if(array[index] > array[index + 1]){
	     templist = array[index];
	     array[index] = array[index + 1];
	     array[index + 1] = templist;
	    }
	   }
	  }
	  
	 }

	public static void main(String[] args) {
		int values[] = new int[6] ;
		//for loop that fills the array values with 6 random numbers.
		for(int i = 0; i < values.length; i++){
			values[i] = (int)(Math.random() * 10);
		}
		   System.out.println("Original Values:  ");
		   for(int element: values){
		    System.out.print(element + " ");
		   }
		   
		   bubbleSort(values);//Calls the bubbleSort method.
		   
		   System.out.println();
		   System.out.println("Sorted Values:  ");
		   for(int element: values){
		    System.out.print(element + " ");
		   }

	}

}
