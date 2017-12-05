package Ex10_interface;

public class InterChild implements InterMenu3{//다중으로 인터페이스 받기가 가능하다.
														// 상속은 무조건 한개만 가능함.
	@Override
	public String jjajang() {
		// TODO Auto-generated method stub
		return "춘장소스+면";
	}
	@Override
		public String tangsuyuck() {
			// TODO Auto-generated method stub
			return "고기+튀김+양념";
		}
	
	@Override
		public String bokkbab() {
			// TODO Auto-generated method stub
			return null;
		}
}
