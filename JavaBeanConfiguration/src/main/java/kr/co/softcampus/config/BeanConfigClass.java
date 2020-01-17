package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

@Configuration //beans.xml의 역할을 함
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() { //메서드의 이름이 bean의 이름이 된다
		TestBean1 t1 = new TestBean1();
		return t1;
	} //xml로딩시 java1을 호출해서 t1의 주솟값을 받고 메소드의 이름으로 해당 빈 객체를 등록하게 됨, 싱글톤을 생성하기 때문에 두번 다시 생성되지 않음
	
	
	@Bean(name = "java600")  //이름을 정해주면 이 메소드가 정해주는 이름이 객체로 등록되는 것이 아니라 name에 정해주는 이름이 객체호출시 이용된다
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		return t1;
	}
	
	@Bean
	@Lazy //getBean 이용시 객체 생성
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		return t3;
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
	
	@Bean
	@Primary
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		return t4;
	}
	
}
