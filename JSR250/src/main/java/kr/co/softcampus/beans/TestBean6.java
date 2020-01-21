package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {

	@Resource(name = "data1") //data1�̶�� �̸��� ���� ã�Ƽ� data100�� �������ְ� �ȴ�.
	private DataBean1 data100;
	
	@Resource(name = "data2") //data2�̶�� �̸��� ���� ã�Ƽ�  data200�� �������ְ� �ȴ�.
	private DataBean2 data200;

	public DataBean1 getData100() {
		return data100;
	}

	public DataBean2 getData200() {
		return data200;
	}
}
