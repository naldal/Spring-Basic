package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2�� ������");
	}

	
	//������ ȣ�� ���� �ڵ����� ȣ��
	@PostConstruct
	public void init2() {
		System.out.println("TestBean2 �� init �޼���");
	}

	//��ü�� �Ҹ�Ǳ� ���� ȣ��
	@PreDestroy
	public void destroy2() {
		System.out.println("TestBean2�� destroy �޼���");
	}
}
