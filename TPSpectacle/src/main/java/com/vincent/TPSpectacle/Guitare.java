package com.vincent.TPSpectacle;

import org.springframework.stereotype.Component;
//@Component
@Component("maGuitare")
public class Guitare implements Instrument {

	public void jouer() {
		System.out.println("GUIT GUITARE...");
	}

}
