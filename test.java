import java.util.ArrayList;

public class test{
	public static void main(String[] args){
		double endTime;

	ArrayList<Integer> a = new ArrayList<>();
	int[] b = new int[(int)Math.pow(10,5)];
	double startTestTime = System.nanoTime();

	for (int i = 0; i < (int)Math.pow(10,5); ++i){
		a.add(i);
	}
	endTime = System.nanoTime();

	System.out.println(endTime - startTestTime);

	startTestTime = System.nanoTime();
	for (int i = 0; i < (int)Math.pow(10,5); ++i){
		a.add(i);
	}
	endTime = System.nanoTime();

	
	System.out.println(endTime - startTestTime);

	}
}