package sec01.exam06;

public interface RemoteControl {
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
