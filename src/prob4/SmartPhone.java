package prob4;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("음악")) {
			System.out.println("다운로드해서 음악 재생");
		} else if(function.equals("통화")) {
			System.out.println("통화기능 시작");
		} else if(function.equals("앱")) {
			System.out.println("앱 실행");
		} else {
			// none
		}
	}
	
}
