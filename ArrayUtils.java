public class ArrayUtils {

    /*
    public static void populate(int upper, int lower, int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    int rand = (int)((Math.random()) * (upper - lower) + lower);
	    arr[i] = rand;
	}
    }

    public static String Stringify(int upper, int lower, int[] arr) {
	String retStr = "{";
	populate(upper, lower, arr);
	for(int i : arr) retStr += i + ",";
        return retStr.substring(0, retStr.length() - 1) + "}";
    }
    */

    public static String Stringify(int upper, int lower, Object[] arr) {
	String retStr = "{";
	for(Object i : arr) retStr += i + ",";
	return retStr.substring(0, retStr.length() - 1) + "}";
    }

    public static int linSearch( Object[] a, Object target ) {
        for(int i = 0; i < a.length; i++) {
	    if( a[i].equals(target) ) return i;
	}
	return -1; //reaches if target not in a
    }

    public static Object[] sliceArray( Object[] a ) {
        Object[] arr = new Object [a.length - 1];
        for (int i = 0; i < arr.length; i++) {
	    arr[i] = a[i + 1];
	}
	return arr;
    }
 
    public static int linSearchR( Object[] a, Object target ) {
	int i = 0;
	if (a.length > 1) i = linSearchR(sliceArray(a), target) + 1;
	if (a[0].equals(target)) i = 1; 
	else {
	    if(i > 0) i++;
	}
	return i - 1;
    }
        
    public static int freq( Object[] x, Object target ) {
	int ctr = 0;
	for( int i = 0; i < x.length; i++ ) {
	    if (x[i].equals(target)) ctr++;
	}
	return ctr;
    }

    public static int freqRec( Object[] x, Object target ) {
	int fr = 0;
	if (x.length > 1) fr = freqRec(sliceArray(x), target);
	if (x[0].equals(target)) fr++;
	return fr;
    }

    public static void main(String[] args) {

        Object[] arrInt = {2, 3, 7, 23, 12, 76, 3, 3, 3, 6, 234, 123, 123, 23};
	Object[] arrStr = {"yolo", "yo", "swag", "yoloswag", "yoswag",
			   "swagyolo", "yoyoyoyo", "yo", "yo", "yo", "swag",
			   "swag", "yolo"};
	
	System.out.println("================");
	
	System.out.println("linSearch(Object[] a, Object target) -- integers");
	System.out.println("linSearch(arrInt, 3): " + linSearch(arrInt, 3)); //1
	System.out.println("linSearch(arrInt, 6): " + linSearch(arrInt, 6)); //9
	System.out.println("linSearch(arrInt, 9): " + linSearch(arrInt, 9)); //-1

	System.out.println("================");

	System.out.println("linSearch(Object[] a, Object target) -- strings");
	System.out.println("linSearch(arrStr, 'yo'): " + linSearch(arrStr, "yo")); //1
	System.out.println("linSearch(arrStr, 'yolo'): " + linSearch(arrStr, "yolo")); //0
	System.out.println("linSearch(arrStr, 'yololo'): " + linSearch(arrStr, "yololo")); //-1

        System.out.println("================");
	
	System.out.println("linSearchR(Object[] a, Object target) -- integers");
	System.out.println("linSearchR(arrInt, 3): " + linSearchR(arrInt, 3)); //1
	System.out.println("linSearchR(arrInt, 6): " + linSearchR(arrInt, 6)); //9
	System.out.println("linSearchR(arrInt, 9): " + linSearchR(arrInt, 9)); //-1

	System.out.println("================");

	System.out.println("linSearchR(Object[] a, Object target) -- strings");
	System.out.println("linSearchR(arrStr, 'yo'): " + linSearchR(arrStr, "yo")); //1
	System.out.println("linSearchR(arrStr, 'yolo'): " + linSearchR(arrStr, "yolo")); //0
	System.out.println("linSearchR(arrStr, 'yololo'): " + linSearchR(arrStr, "yololo")); //-1

	System.out.println("================");

	System.out.println("freq(Object[] a, Object target) -- integers");
	System.out.println("freq(arrInt, 3): " + freq(arrInt, 3)); //4
	System.out.println("freq(arrInt, 6): " + freq(arrInt, 6)); //1
	System.out.println("freq(arrInt, 9): " + freq(arrInt, 9)); //0

	System.out.println("================");

	System.out.println("freq(Object[] a, Object target) -- strings");
	System.out.println("freq(arrStr, 'yo'): " + freq(arrStr, "yo")); //4
	System.out.println("freq(arrStr, 'yolo'): " + freq(arrStr, "yolo")); //2
	System.out.println("freq(arrStr, 'yololo'): " + freq(arrStr, "yololo")); //0

	System.out.println("================");

	System.out.println("freqRec(Object[] a, Object target) -- integers");
	System.out.println("freqRec(arrInt, 3): " + freqRec(arrInt, 3)); //4
	System.out.println("freqRec(arrInt, 6): " + freqRec(arrInt, 6)); //1
	System.out.println("freqRec(arrInt, 9): " + freqRec(arrInt, 9)); //0

	System.out.println("================");

	System.out.println("freqRec(Object[] a, Object target) -- strings");
	System.out.println("freqRec(arrStr, 'yo'): " + freqRec(arrStr, "yo")); //4
	System.out.println("freqRec(arrStr, 'yolo'): " + freqRec(arrStr, "yolo")); //2
	System.out.println("freqRec(arrStr, 'yololo'): " + freqRec(arrStr, "yololo")); //0
	
    }
}
