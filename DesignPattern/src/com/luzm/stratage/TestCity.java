package com.luzm.stratage;

public abstract class TestCity {
	private TestPaper testPaper;

	public TestPaper getTestPaper() {
		return testPaper;
	}

	public void setTestPaper(TestPaper testPaper) {
		this.testPaper = testPaper;
	}
	
	public void printTestContent(){
		if(testPaper == null) {
			System.out.println("NULL - ERR");
			return ;
		}
		System.out.println(testPaper.getTestContent());
	}
}
