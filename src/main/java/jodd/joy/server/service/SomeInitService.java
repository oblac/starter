package jodd.joy.server.service;

import jodd.joy.JoyInit;
import jodd.petite.meta.PetiteBean;

@PetiteBean
public class SomeInitService implements JoyInit {
	public SomeInitService() {
		System.out.println("SomeService created");
	}

	@Override
	public void onJoy() {
		System.out.println("Started!");
	}
}
