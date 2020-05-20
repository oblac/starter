package jodd.joy.server.action.user;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;

@MadvocAction
public class IndexAction {

	@Action
	public String view() {
		return "ok";
	}
}
