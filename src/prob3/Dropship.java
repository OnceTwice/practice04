package prob3;

public class Dropship extends Unit {	
	void move(int x, int y) {
		/* 지정된 위치로 이동 */ 
	}

	void load() {
		/* 선택된 대상을 태운다.*/ 
	}
	
	void unload() {
		/* 선택된 대상을 내린다.*/ 
	}
	
	@Override
	void stop() {
		/* 현재 위치에 정지 */ 
		super.stop();
	}
}
