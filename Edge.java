package week2.day4;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Take Photo");
	}
	
	public void clearCookies() {
		System.out.println("Clear cookies");
	}


	public static void main(String[] args) {
		Edge ed=new Edge();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		ed.takeSnap();

	}

}
