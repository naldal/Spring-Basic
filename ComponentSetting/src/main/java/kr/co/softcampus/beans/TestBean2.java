package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;


//IoC �����̳ʰ� ������� �� �ڵ����� ��ü�� �����ȴ�
//��ü�� �ּҰ��� ������ �� �̸��� ���ؼ� ������ �� �ִ�.
@Component("t3")
public class TestBean2 {

	public TestBean2() {
		// TODO Auto-generated constructor stub
		System.out.println("TestBean2�� ������");
	}
}
