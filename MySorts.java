import java.util.ArrayList;

public class MySorts {

    public static void main(String [] args){

	System.out.println("================================");
	System.out.println("YOU GO GLEN COCO ... or ... SelectionSort!");
	System.out.println("================================");

	ArrayList YOU = new ArrayList<Integer>();
	YOU.add(7);
	YOU.add(1);
	YOU.add(5);
	YOU.add(12);
	YOU.add(3);
	System.out.println( "ArrayList YOU before sorting:\n" + YOU );
	SelectionSort.selectionSortV(YOU);
	System.out.println( "ArrayList YOU after sorting:\n" + YOU );

	ArrayList GO = SelectionSort.populate( 10, 1, 1000 );
	System.out.println( "ArrayList GO before sorting:\n" + GO );
	SelectionSort.selectionSortV(GO);
	System.out.println( "ArrayList GO after sorting:\n" + GO );

    	ArrayList GLEN = new ArrayList<Integer>();
	GLEN.add(7);
	GLEN.add(1);
	GLEN.add(5);
	GLEN.add(12);
	GLEN.add(3);
	System.out.println( "ArrayList GLEN before sorting:\n" + GLEN );
	ArrayList GLENSorted = SelectionSort.selectionSort( GLEN );
	System.out.println( "sorted version of ArrayList GLEN:\n" 
			    + GLENSorted );
	System.out.println( "ArrayList GLEN after sorting:\n" + GLEN );

      	ArrayList COCO = SelectionSort.populate( 10, 1, 1000 );
	System.out.println( "ArrayList COCO before sorting:\n" + COCO );
	ArrayList COCOSorted = SelectionSort.selectionSort( COCO );
	System.out.println( "sorted version of ArrayList COCO:\n" 
			    + COCOSorted );
	System.out.println( "ArrayList COCO after sorting:\n" + COCO );

	System.out.println("================================");
	System.out.println("John, Paul, Ringo & George ... or ... BogoSort!");
        System.out.println("================================");
	
	ArrayList john = new ArrayList<Integer>();
	john.add(7);
	john.add(1);
	john.add(5);
	john.add(12);
	john.add(3);
	System.out.println( "ArrayList john before sorting:\n" + john );
	BogoSort.bogoSortV(john);
	System.out.println( "ArrayList john after sorting:\n" + john );

	ArrayList paul = BogoSort.populate( 10, 1, 1000 );
	System.out.println( "ArrayList paul before sorting:\n" + paul );
	BogoSort.bogoSortV(paul);
	System.out.println( "ArrayList paul after sorting:\n" + paul );

    	ArrayList george = new ArrayList<Integer>();
	george.add(7);
	george.add(1);
	george.add(5);
	george.add(12);
	george.add(3);
	System.out.println( "ArrayList george before sorting:\n" + george );
	ArrayList georgeSorted = BogoSort.bogoSort( george );
	System.out.println( "sorted version of ArrayList george:\n" 
			    + georgeSorted );
	System.out.println( "ArrayList george after sorting:\n" + george );

      	ArrayList ringo = BogoSort.populate( 10, 1, 1000 );
	System.out.println( "ArrayList ringo before sorting:\n" + ringo );
	ArrayList ringoSorted = BogoSort.bogoSort( ringo );
	System.out.println( "sorted version of ArrayList ringo:\n" 
			    + ringoSorted );
	System.out.println( "ArrayList ringo after sorting:\n" + ringo );

    }//end main

}
