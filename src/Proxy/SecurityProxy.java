package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {
	
	private Object obj;
	
	private SecurityProxy(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}

	public static Object newInstance(Object obj)
	{
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(), new SecurityProxy(obj));
	}
	
	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		Object result;
		
		try
		{
			result=m.invoke(obj, args);
		}
		catch(InvocationTargetException e)
		{
			throw e.getTargetException();
		}
		catch(Exception e){
			throw new RuntimeException("unexpected invocation exception "+e.getMessage());
		}
		
		return result;
	}

}
