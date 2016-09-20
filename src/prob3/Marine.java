package prob3;

public class Marine extends Unit {
	void move(int x, int y) { 
		/* 지정된 위치로 이동 */ 
	}

	void stimPack() { 
		/* 스팀팩을 사용한다.*/
	}
	
	@Override
	void stop() {
		/* 현재 위치에 정지 */ 
		super.stop();
	}
}
