package com.luzm.stratage;

public class Test {

	public static void main(String[] args) {
		TestCity tc = new Shandong();
		tc.setTestPaper(new TestPaperA());
		tc.setTestPaper(new TestPaperC());
		tc.printTestContent();
		
	}
}
