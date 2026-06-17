
interface Camera{
	void clickPhoto();
}

interface MediaPlayer{
	void playMusic();
}

class CellPhone{
	void call() {
		System.out.println("Calling...");
	}
}

class MySmartPhone extends CellPhone implements Camera,MediaPlayer{
	
	public void clickPhoto() {
		System.out.println("Clicking Photo...");
	}
	public void playMusic() {
		System.out.println("Playing Music...");
	}
}

public class C31Interfaces2 {

	public static void main(String[] args) {
		// Inheritance in Interfaces

		MySmartPhone sm = new MySmartPhone();
		sm.call();
		sm.clickPhoto();
		sm.playMusic();
	}

}
