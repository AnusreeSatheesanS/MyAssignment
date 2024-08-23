package week2.day4;

public class Safari extends Browser {
	public void readerMode() {
		System.out.println("Read Mode");
	}
	
	public void fullScreenMode() {
		System.out.println("full screen");
	}


	public static void main(String[] args) {
		Safari sa=new Safari();
		sa.readerMode();
		sa.fullScreenMode();
		sa.openURL();
		sa.closeBrowser();
		sa.navigateBack();
	}

}
