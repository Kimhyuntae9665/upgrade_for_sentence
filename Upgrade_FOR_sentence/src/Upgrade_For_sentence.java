
public class Upgrade_For_sentence {

	public static void main(String[] args) {
		
		int[] number = {1,2,3,100};
		
		for(int num:number) { //향상된 FOR문 
			System.out.println(num);
		}
		
		System.out.println(number); //int 는 배열 이름 넣으면 메모리 주소가 나와
		
		System.out.println(number.length);
		
		char[] str = {'h','e','l','l','o'};
		System.out.println(str); //char 배열은 이름 넣으면 문자열이 한 번에 나와
		System.out.println(str.length);
	}

}
