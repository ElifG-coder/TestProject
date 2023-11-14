package com.practice;

public interface WebDriver {
	
void openBrowser();
void closeBrowser();
void maximizeWindow();
void findElement();
void takePicture();
static void takeSelfie() {
	System.out.println("I can take selfie");
}
default void takePanoramaPic() {
	System.out.println("I can take panaromic pictures");
}

}
class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("We can open Chrome");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("We can close Chrome");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize Chrome window");
		
	}

	@Override
	public void findElement() {
		System.out.println("We can find element in Chrome");
		
	}

	@Override
	public void takePicture() {
		System.out.println("In crome we can take pictures");
		
	}
	
}
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("We can open FireFox ");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("We can close FireFox ");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("We can maximize FireFox window");
		
	}

	@Override
	public void findElement() {
		System.out.println("We can find elements in FireFox ");
		
	}

	@Override
	public void takePicture() {
		System.out.println("In firefox we can take picturesW");
		
	}
	
}


