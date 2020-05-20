package jodd.joy.server.action.auth;

import jodd.joy.auth.AuthAction;
import jodd.joy.auth.simtok.SimTok;
import jodd.madvoc.meta.MadvocAction;
import jodd.madvoc.meta.RestAction;
import jodd.madvoc.meta.method.POST;
import jodd.madvoc.result.JsonResult;

@MadvocAction
public class MyAuthAction extends AuthAction<SimTok> {

	@Override
	@POST
	@RestAction("/j_login,<login>")
	public JsonResult login() {
		return super.login();
	}

	@Override
	@RestAction(value = J_LOGOUT_PATH, alias = "logout")
	public JsonResult logout() {
		return super.logout();
	}

}
