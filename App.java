package day10;

import java.util.Scanner;

abstract class Player {
	protected String shape [] = {"가위", "바위", "보"};
	private String name;
	public Player(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	abstract public String turn(); // 선수가 자신의 차례일 때 가위, 바위, 보 중 하나 리턴 
}

class MachinePlayer extends Player {
	public MachinePlayer(String name) {
		super(name);
	}
	public String turn() { // 기계는 가위, 바위, 보 중 랜덤하게 한 개 리턴
		return shape[(int)(Math.random()*3)];
	}
}

class HumanPlayer extends Player {
	private Scanner scanner = new Scanner(System.in);
	public HumanPlayer(String name) {
		super(name);
	}
	public String turn() { // 사람은 사용자로부터 입력받아 가위, 바위, 보 중 한 개 리턴
		while(true) {
			System.out.print(getName() + "님, 뭘 내시겠습니까?");
			String gbb = scanner.next();
			for(int i=0; i<shape.length; i++) {
				if(shape[i].equals(gbb))
					return gbb; // 사용자가 가위, 바위, 보 중 입력하였다면 입력받은 것 리언
			}			
			// 사용자가 가위, 바위, 보가 아닌 것을 입력한 경우 다시 while 문으로 반복
		}
	}
}


public class App {

	public static void main(String[] args) {
		Player machine = new MachinePlayer("터미네이터");
		Player human = new HumanPlayer("황기태");
		String m = machine.turn(); // 
		String h = human.turn();
		System.out.println(machine.getName() + ":" + m + ", " +  human.getName() + ":" + h);
		if(h.equals(m)) // 같으면 기계 승리
			System.out.println(machine.getName() + " 승리!");
		else // 다르면 사람 승리
			System.out.println(human.getName() + " 승리!");
	}

}
