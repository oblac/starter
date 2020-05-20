package jodd.joy.server.action;

import jodd.joy.auth.AuthInterceptor;
import jodd.joy.i18n.I18nInterceptor;
import jodd.madvoc.interceptor.ActionInterceptorStack;
import jodd.madvoc.interceptor.EchoInterceptor;
import jodd.madvoc.interceptor.ServletConfigInterceptor;

public class MyInterceptorStack extends ActionInterceptorStack {

	public MyInterceptorStack() {
		super(
				EchoInterceptor.class,
				AuthInterceptor.class,
				I18nInterceptor.class,
				ServletConfigInterceptor.class
		);
	}
}
