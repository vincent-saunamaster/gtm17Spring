package com.vincent.TPSpectacle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("monMusicien")
public class Musicien implements Performeur {

	private String morceau;
	@Autowired //byType -> nécessite un primary sur une des implémentations de Instrument
	private Instrument instrument;

	public Musicien() {
		super();
	}

	public void performe() throws PerformanceException {
		System.out.print("joue " + morceau + " : ");
		instrument.jouer();
	}

	// constructeur afin d'utiliser la création d'un bean avec constructeur
	// balise constructor-arg question 7)
	public Musicien(String morceau, Instrument instrument) {
		super();
		this.morceau = morceau;
		this.instrument = instrument;
	}

	public String getMorceau() {
		return morceau;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setMorceau(String morceau) {
		this.morceau = morceau;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	// 20) Cycle de vie : nettoyer un instrument lors de sa destruction
	// en ajoutant l'annotation <context:annotation-config/>
	// dans le xml, cette m�thode est lanc�e � chaque cr�ation de bean musicien
	@PostConstruct
	public void arranger() throws Exception {
		System.out.println("Accorder l'instrument avant utilisation");
	}

	// 19) Cycle de vie : accorder un instrument lors de son initialisation
	@PreDestroy
	public void nettoyer() throws Exception {
		System.out.println("Nettoyage de l'instrument apr�s utilisation");
	}

}
