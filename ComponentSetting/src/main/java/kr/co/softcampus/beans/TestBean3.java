package kr.co.softcampus.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

//getBean�޼��带 ȣ���� �� ��ü�� �����ȴ�
//Singleton
@Lazy
public class TestBean3 {

	public TestBean3() {
		System.out.println("TestBean3�� ������");
	}
}
