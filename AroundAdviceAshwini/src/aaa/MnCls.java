package aaa;

import org.springframework.aop.framework.ProxyFactory;

public class MnCls {

	public static void main(String[] args) {
		ProxyFactory fact=new ProxyFactory();
		fact.addAdvice(new LoggingAspect());
		fact.setTarget(new Math());
		Math myMath=(Math)fact.getProxy();
		//System.out.println(myMath.add(10, 20));
		System.out.println(myMath.mul(10, 20));
	}

}
