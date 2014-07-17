package se.emilsjolander.flipviewLib;


public class OverFlipperFactory {
	
	static OverFlipper create(se.emilsjolander.flipviewLib.FlipView v, se.emilsjolander.flipviewLib.OverFlipMode mode) {
		switch(mode) {
		case GLOW:
			return new se.emilsjolander.flipviewLib.GlowOverFlipper(v);
		case RUBBER_BAND:
			return new RubberBandOverFlipper();
		}
		return null;
	}

}
