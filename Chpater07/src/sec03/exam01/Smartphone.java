package sec03.exam01;

public class Smartphone extends Phone{
	public Smartphone(String owner) {
		super(owner);
	}
	
	public void instanceSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
