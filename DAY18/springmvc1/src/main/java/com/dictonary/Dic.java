package com.dictonary;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//@Entity
//@Table(name="Dic1")
public class Dic {
	//@Id
	//@Column(name="word")
private String word;
	
	//@Column(name="meaning")
private String meaning;
	
	public Dic() {
		//super();
	}


	public String getWord() {
		return word;
	}


	public void setWord(String word) {
		this.word = word;
	}


	public String getMeaning() {
		return meaning;
	}


	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}


	


public Dic(String word, String meaning) {
	super();
	this.word = word;
	this.meaning = meaning;
}


@Override
public String toString() {
	return "Dic [word=" + word + ", meaning=" + meaning + "]";
}


}
