package kr.co.softcampus.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//getBean �޼��带 ȣ���� ������ ���ο� ��ü�� ������ ��ȯ�Ѵ�.
@Scope("prototype")
public class TestBean4 {

	public TestBean4() {
		System.out.println("TestBean4�� ������");
	}
}
