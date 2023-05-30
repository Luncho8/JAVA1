package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		super(model, color);
		this.channel = channel;
	}
	//super():부모클래스 생성자 호출
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 Dmb 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널" + channel + "번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 멈춥니다.");
	}
}
