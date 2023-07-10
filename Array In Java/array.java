import java.util.Arrays;

class array{
    public static void main(String ar[]) {
     int x = 10;
	    int y = x;
		System.out.print("Initially:");
		System.out.println("x ="+x+ ",y ="+y);
		
		  y = 30;
		 System.out.print("After changing y to 30:");
		 System.out.println("x =" +x+ ",y =" +y);
		 
		 int[] c = { 20,21,22,24 };
            int[] d = c;
        System.out.println("Array c:" + Arrays.toString(c));
        System.out.println("Array d:" +  Arrays.toString(d));
}

}