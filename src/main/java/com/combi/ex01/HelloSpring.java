package com.combi.ex01;

public class HelloSpring {

		public static void main(String[] args) {
			
			MessageBeanEn beanA = new MessageBeanEn();
			beanA.sayHello();
			
			System.out.println("");
			
			MessageBeanKr beanB = new MessageBeanKr();
			beanB.sayHello();
			//강한 결합이라고 함. 하나의 레퍼런스로 여러개의 객체를 유연하게  다룰 수 있게 하는 것 : 다형성
		}
		
}
