package com.wisesoft.th.yyy;

//Create Template.
abstract class Report {
	abstract void createHeader(); //รูปแบบการทำงานเหมือนกัน ด้านในต่างกัน
	abstract void createBody();
	abstract void createFooter();
	void genarateReport() {
		createHeader();
		createBody();
		createFooter();
	}

}

class Report1 extends Report {

	@Override
	void createHeader() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createBody() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void createFooter() {
		// TODO Auto-generated method stub
		
	}
	
}