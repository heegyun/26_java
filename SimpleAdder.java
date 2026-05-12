package day10;
interface AddInterface {
	int add(int x, int y); // x와 y의 합 리턴
	int add(int n); // 1에서 n까지의 합 리턴. n은 0보다 큰 수로 가정 
}

public class SimpleAdder implements AddInterface {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int add(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++)
			sum += i;
		return sum;
	}
	
	public static void main(String[] args) {
		SimpleAdder adder = new SimpleAdder();
		System.out.println(adder.add(3,10));
		System.out.println(adder.add(20));
	}

}
