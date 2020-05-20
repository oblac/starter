package jodd.joy.server.action.auth;

import jodd.joy.auth.AuthInterceptor;
import jodd.joy.auth.UserAuth;
import jodd.joy.auth.simtok.SimTok;
import jodd.joy.auth.simtok.SimTokCoder;
import jodd.petite.meta.PetiteBean;

@PetiteBean
public class MyUserAuth implements UserAuth<SimTok> {

	public MyUserAuth() {
		AuthInterceptor.userAuth = this;
	}

	@Override
	public SimTok login(final String principal, final String credentials) {
		if (!credentials.equals(principal + "!")) {
			return null;
		}
		return SimTok.create().setName(principal).setUid("1");
	}

	@Override
	public SimTok validateToken(final String token) {
		final SimTok simTok = new SimTokCoder().decode(token);
		if (simTok == null) {
			return null;
		}
		if (simTok.expired()) {
			return null;
		}
		return simTok;
	}

	@Override
	public SimTok rotateToken(final SimTok authToken) {
		return SimTok.from(authToken);
	}

	@Override
	public String tokenValue(final SimTok authToken) {
		return new SimTokCoder().encode(authToken);
	}
}