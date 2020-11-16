package com.adaming.entities;

import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("epargne")
public class CompteEpargne extends Compte {

	private double taux;

	public CompteEpargne() {
		super();
	}
	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}	
}
