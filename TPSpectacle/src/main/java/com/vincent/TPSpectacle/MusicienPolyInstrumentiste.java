package com.vincent.TPSpectacle;

import java.util.Collection;

public class MusicienPolyInstrumentiste implements Performeur {

	public MusicienPolyInstrumentiste() {
		super();
	}
	
	public void performe() throws PerformanceException {
		for(Instrument instrument : instruments) {
		instrument.jouer();
		}
	}
	
	private Collection<Instrument> instruments;
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
		}
}
