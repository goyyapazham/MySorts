/*======================================
  class BogoSort -- implements bubblesort algorithm (vanilla version)
  ======================================*/

/* Nalanda Sharadjaya
   APCS1 pd9
   HW51 -- Dat Bubbly Tho
   2015-12-21
*/

import java.util.ArrayList;

public class BogoSort {

    //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) 
    {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }


    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) 
    {
	int randomIndex;
	//setup for traversal fr right to left
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    public static boolean isSorted( ArrayList<Comparable> data ) {
	for(int i = 0; i < data.size() - 1; i++) {
	    if (data.get(i).compareTo(data.get(i + 1)) == 1)
		return false;
	}
	return true;
    }

    // VOID version of bogoSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bogoSortV( ArrayList<Comparable> data ) {
        while (! isSorted(data) ) {
	    shuffle(data);
	}
    }//end bogoSortV -- O(?)


    // ArrayList-returning bogoSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
    public static ArrayList<Comparable>
	bogoSort( ArrayList<Comparable> input ) {
	ArrayList<Comparable> data = new ArrayList<Comparable>();
	for(int i = 0; i < input.size(); i++) {
	    data.add(input.get(i));
	}
        while (! isSorted(data) ) {
	    shuffle(data);
	}
	return data;
    }//end bogoSort -- O(?)


    public static void main(String [] args){

	ArrayList you = new ArrayList<Integer>();
	you.add(7);
	you.add(1);
	you.add(5);
	you.add(12);
	you.add(3);
	System.out.println( "ArrayList you before sorting:\n" + you );
	bogoSortV(you);
	System.out.println( "ArrayList you after sorting:\n" + you );

	ArrayList go = populate( 10, 1, 1000 );
	System.out.println( "ArrayList go before sorting:\n" + go );
	bogoSortV(go);
	System.out.println( "ArrayList go after sorting:\n" + go );
	/*===============for VOID methods=============
	  ============================================*/

    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	System.out.println( "ArrayList glen before sorting:\n" + glen );
	ArrayList glenSorted = bogoSort( glen );
	System.out.println( "sorted version of ArrayList glen:\n" 
			    + glenSorted );
	System.out.println( "ArrayList glen after sorting:\n" + glen );

      	ArrayList coco = populate( 10, 1, 1000 );
	System.out.println( "ArrayList coco before sorting:\n" + coco );
	ArrayList cocoSorted = bogoSort( coco );
	System.out.println( "sorted version of ArrayList coco:\n" 
			    + cocoSorted );
	System.out.println( "ArrayList coco after sorting:\n" + coco );
	/*==========for AL-returning methods==========
	  ============================================*/

    }//end main

}//end class BogoSort
