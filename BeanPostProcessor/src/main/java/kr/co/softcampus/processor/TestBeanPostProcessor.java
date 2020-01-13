package kr.co.softcampus.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{

	//init-method ȣ�� ��
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("before");
		switch(beanName) {
			case "t1" :
				System.out.println("id�� t1�� bean ��ü ����");
				break;
			case "t2" :
				System.out.println("id�� t2�� bean ��ü ����");
				break;
		}
		return bean;
	}
	
	//init-method ȣ�� ��
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}
}
