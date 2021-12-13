package Bai3;

public class Bai3 {
	public static void main(String[] args) {
		String version = System.getProperty("java.version");
		String runtimeVersion = System.getProperty("java.runtime.version");
		String home = System.getProperty("java.home");
		String vendor = System.getProperty("java.vendor");
		String vendorUrl = System.getProperty("java.vendor.url");
		String classPath = System.getProperty("java.class.path");

		System.out.println("Java Version : "+ version);
		System.out.println("Java Runtime Version : "+ runtimeVersion);
		System.out.println("Java Home : "+ home);
		System.out.println("Java Vendor : "+ vendor);
		System.out.println("Java Vendor URL : "+ vendorUrl);
		System.out.println("Java Class Path : "+ classPath);
	}
}
