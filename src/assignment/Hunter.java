package assignment;

public class Hunter {
	private int power;
	
	Hunter(int power){
		this.power = power;
	}
	public static void main(String[] args) {
	    int hunterPower = 100;
	    int monsterHealth = 1000;
	    
	    // Hunter가 Monster을 공격
	    monsterHealth -= hunterPower;
	    
	    System.out.println("Hunter가 Monster을 " + hunterPower + "의 파워로 공격 했습니다.");
	    System.out.println("Monster의 체력이 " + monsterHealth + " 남았습니다.");
	}
	//attack 메소드 작성
}
  

//Hunter가 Monster을 100의 파워로 공격 했습니다.
//Monster의 체력이 900 남았습니다.

//객체의 hp를 줄이는 attack 메소드를 가진 Hunter클래스를 생성하여 다음관 같은 결과를 보이도록 프로그램을 작성

