package week2.day4;

public class Chrome extends Browser {
	
	public void openInCognito() {
		System.out.println("Incognito");
	}
	
	public void clearCache() {
		System.out.println("Clear Cache");
	}

	public static void main(String[] args) {
	Chrome ch=new Chrome();
	ch.openInCognito();
	ch.clearCache();
	ch.openURL();
	ch.closeBrowser();
	ch.navigateBack();
	}

}
