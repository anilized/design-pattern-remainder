package singleton;

public class Test {
	
	public static void main(String[] args) {
		DateUtil date = DateUtil.getInstance();
		DateUtil date2 = DateUtil.getInstance();
		
		System.out.println(date);
		System.out.println(date2);
		/*
		 * singleton.DateUtil@11028347
		 * singleton.DateUtil@11028347
		 */
		
		// Returns the same memloc because we can only create one instance
	}

}
