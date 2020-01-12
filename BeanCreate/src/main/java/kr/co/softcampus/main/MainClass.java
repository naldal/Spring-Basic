package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		//id�� test1�� bean��ü�� �ּҰ��� �޾ƿ´�.
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.println("t1 : "+t1);
		
		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.println("t2 : "+t2);
		
		//id�� test2�� bean��ü�� �ּҰ��� �޾ƿ´�. //lazy-init �������
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.println("t3 : "+t3);
		
		//scope = "prototype" �������
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.println("t4 : "+t4);
		
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.println("t5 : "+t5);
		
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.println("t6 : "+t6);
		
		ctx.close();
	}
}
