package sec02.exam06;

public class Button {
	OnClicklistener listener;
	

	public void setonClickListener(OnClicklistener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}
	
	static interface OnClicklistener{
		void onClick();	
	}
}
