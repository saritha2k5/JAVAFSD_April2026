package Day6;

public class TC_GC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();

        System.out.println("Total Memory: " + r.totalMemory());
        System.out.println("Free Memory: " + r.freeMemory());

        for (int i = 0; i < 10000; i++) {
            new TC_GC();
        }

        System.gc();

        System.out.println("After GC Free Memory: " + r.freeMemory());
	}

}
