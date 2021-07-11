package test;

public class name {

	public static void main(String[] args) {
		
		String str = "";
		int cnt[] = new int[10];
		
		for(int i=1; i<=1000; i++) {
			str += Integer.toString(i);
		}

		for(int i=0; i<str.length(); i++) {
			cnt[ Character.getNumericValue(str.charAt(i))]++;
		}
		
		for (int i=0; i<10; i++) {
			System.out.println(i + ": " + cnt[i]);
		}
	}

}
