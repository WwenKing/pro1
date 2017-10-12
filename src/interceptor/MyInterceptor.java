package interceptor;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void init() {
		// TODO Auto-generated method stub

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS\n").format(new Date()));
		arg0.invoke();
		System.out.print(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS\n").format(new Date()));
		return null;
	}

}
