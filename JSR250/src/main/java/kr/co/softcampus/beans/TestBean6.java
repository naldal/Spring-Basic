package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {

	@Resource(name = "data1") //data1이라는 이름의 빈을 찾아서 data100에 주입해주게 된다.
	private DataBean1 data100;
	
	@Resource(name = "data2") //data2이라는 이름의 빈을 찾아서  data200에 주입해주게 된다.
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
}
