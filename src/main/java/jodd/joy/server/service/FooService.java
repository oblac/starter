package jodd.joy.server.service;

import jodd.petite.meta.PetiteBean;

@PetiteBean
public class FooService {
	public String world() {
		return "world";
	}
}
