package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {

	public String nom;
	public String prenom;
	public String numeroDeTelephone;
	public char sexe;
	public long numSecu;
	public LocalDate dateNaissance;
	public String commentaires;

	private Adresse adresse;

	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
		this.adresse = adresse;
	}

	public void afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Sexe : " + (sexe == 'F' ? "Féminin" : "Masculin"));
		System.out.println("Numéro de Sécurité sociale : " + numSecu);
		System.out.println("Date de naissance : " + dateNaissance.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));

		var comm = commentaires;
		if (commentaires == null || commentaires.isBlank())
			comm = "[aucun commentaire]";

		System.out.println("Commentaires : " + this.getCommentaires());
		System.out.println(this.getAdresse().toString());
//		PERRET Inès
//		Téléphone : 0698745123
//		Sexe : Féminin
//		Numéro de Sécurité sociale : 245021067034521
//		Date de naissance : 10 février 1945
//		Commentaires : [aucun commentaire]
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(long numSecu) {
		this.numSecu = numSecu;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getCommentaires() {
		if(commentaires != null){
			return commentaires;
		} else{
			return "";
		}
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Patient{" +
				"nom='" + nom + '\'' +
				", prenom='" + prenom + '\'' +
				", numeroDeTelephone='" + numeroDeTelephone + '\'' +
				", sexe=" + sexe +
				", numSecu=" + numSecu +
				", dateNaissance=" + dateNaissance +
				", commentaires='" + commentaires + '\'' +
				", adresse=" + adresse +
				'}';
	}
}
