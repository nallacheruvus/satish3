package aaa;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("The name of the method that is getting executed is :"+arg0.getMethod().getName());
		Object[] args=arg0.getArguments();
		System.out.println("First argument:"+args[0]);
		System.out.println("Second argument:"+args[1]);
		Object ret=arg0.proceed();
		return ret;
	}

}
