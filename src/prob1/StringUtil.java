package prob1;

public class StringUtil {
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	String arr = "";
    	for(int i=0; i<str.length; i++) {
    		arr += str[i];
    	}
    	return arr;
    }
}

