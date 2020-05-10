package jodd.joy.server.example;

import jodd.joy.JoyInit;
import jodd.petite.meta.PetiteBean;

@PetiteBean
public class SomeService implements JoyInit {
	public SomeService() {
		System.out.println("SomeService created");
	}

	@Override
	public void onJoy() {
		System.out.println("Started!");
	}
}
