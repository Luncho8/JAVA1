package sec02.exam07;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button button = new Button();
		
		button.setonClickListener(new CallListener());
		button.touch();
		
		button.setonClickListener(new MessageListener());
		button.touch();
	}

}
