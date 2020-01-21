package kr.co.softcampus.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;
import kr.co.softcampus.beans.TestBean5;
import kr.co.softcampus.beans.TestBean6;
import kr.co.softcampus.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		
		System.out.println("==========================================================================");
		
		TestBean2 obj2 = ctx.getBean("obj2", TestBean2.class);
		
		System.out.println("==========================================================================");
		
		TestBean3 obj3 = ctx.getBean("obj3", TestBean3.class);
		System.out.println("obj3.data1 : "+obj3.getData1());
		System.out.println("obj3.data2 : "+obj3.getData2());
		
		System.out.println("==========================================================================");
		
		TestBean4 obj4 = ctx.getBean("obj4", TestBean4.class);
		System.out.println("obj4.data1"+obj4.getData1());
		System.out.println("obj4.data2"+obj4.getData2());
		
		System.out.println("==========================================================================");
		
		TestBean5 obj5 = ctx.getBean("obj5", TestBean5.class);
		System.out.println("obj5.data1"+obj5.getData1());
		System.out.println("obj5.data2"+obj5.getData2());
		
		System.out.println("==========================================================================");
		
		TestBean6 obj6 = ctx.getBean("obj6", TestBean6.class);
		System.out.println("obj6.data1"+obj6.getData100());
		System.out.println("obj6.data1"+obj6.getData200());
		
		ctx.close();
	}
}
