package kr.co.softcampus.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {

	public TestBean5() {
		// TODO Auto-generated constructor stub
		System.out.println("TestBean5�� ������");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init �޼��尡 ȣ��Ǿ����ϴ�");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy �޼��尡 ȣ��Ǿ����ϴ�.");
	}
}
