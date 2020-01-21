package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean4 {

	@Autowired
	@Qualifier("data1") //이 이름으로 등록되어 있는 객체(DataBean1, DataBean2)의 주소값을 가지고 와서 DataBean1 data1 에 주입해라 (이름과는 무관하다)
	private DataBean1 data1;
	
	@Autowired
	@Qualifier("data2")
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}
	
	
}
