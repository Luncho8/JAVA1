package sec04.exam04;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		//controller.setService(new Service()); 강제 형변환해야함
		//controller.setService.login();
		controller.setService(new MemberService());
		controller.service.login();
		controller.setService(new AService());
		controller.service.login();
	}

}
