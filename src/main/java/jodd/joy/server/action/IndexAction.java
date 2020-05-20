package jodd.joy.server.action;

import jodd.joy.server.service.FooService;
import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.MadvocAction;
import jodd.petite.meta.PetiteInject;

@MadvocAction
public class IndexAction {

	@PetiteInject
	FooService fooService;

	@Action
	public void view() {
		System.out.println("Hello!");
		System.out.println(fooService.world());
	}

}
