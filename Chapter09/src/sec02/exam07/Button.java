package sec02.exam07;

public class Button {
	onClick listener;
	

	public void setonClickListener(onClick listener) {
		this.listener = listener;
	}
    
    void touch() {
    	listener.onClick1();
    }

	static interface onClick{
		void onClick1();
	}
}
