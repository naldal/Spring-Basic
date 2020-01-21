package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean4 {

	@Autowired
	@Qualifier("data1") //�� �̸����� ��ϵǾ� �ִ� ��ü(DataBean1, DataBean2)�� �ּҰ��� ������ �ͼ� DataBean1 data1 �� �����ض� (�̸����� �����ϴ�)
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
