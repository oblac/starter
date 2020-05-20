package jodd.joy.server;

import jodd.joy.JoddJoy;
import jodd.joy.server.action.IndexAction;
import jodd.madvoc.component.RootPackages;

public class Runner {

	public static void main(String[] args) {
		JoddJoy.get()
		.withWebApp(webApp -> {
			webApp.withRegisteredComponent(RootPackages.class, rootPackages -> {
				// define the root package
				rootPackages.addRootPackageOf(IndexAction.class);
			});
		});

		Server.create()
				.setPort(8080)
				.start();
	}
}
