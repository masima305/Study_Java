package Ex2_overload;

public class Bread {
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	public void makeBread(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+n+"개의 빵을 만들었습니다.");
	}
	public void makeBread(String s ,int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(s+"빵을 만들었습니다.");
		}
		System.out.println("요청하신 "+n+"개의"+s+" 빵을 만들었습니다.");
	}
	
	
}
