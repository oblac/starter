package jodd.joy.server.example;

import jodd.joy.JoddJoy;
import jodd.joy.server.Server;

public class Runner {

	public static void main(String[] args) {
		JoddJoy.get();

		Server.create()
				.setPort(8080)
				.start();
	}
}
