package kr.co.softcampus.beans;

import org.springframework.stereotype.Component;

//IoC �����̳� ��ü�� ������ �� ��ü�� �����ȴ�.
//Ÿ���� ���� ��ϵ� Bean ��ü�� ������ �� �ִ�.
//Singleton
@Component
public class TestBean1 {

	public TestBean1() {
		System.out.println("TestBean1�� ������");
	}
	
}
