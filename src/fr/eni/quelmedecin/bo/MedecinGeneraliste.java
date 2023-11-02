package fr.eni.quelmedecin.bo;


import java.security.cert.CRLReason;
import java.util.ArrayList;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String numTel;
	private static int tarif=25;

	private Adresse adresse;
	private ArrayList<Creneau> cr = new ArrayList<>();

	public MedecinGeneraliste(String nom, String prenom, String numTel, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.cr = new ArrayList<Creneau>();
	}

	public void afficher() {
//		TABLE Djémila
//		Téléphone : 03-04-05-06-07
//		Tarif : 25€
		System.out.println(nom.toUpperCase()+" "+prenom);
		System.out.println("Téléphone : "+numTel);
		System.out.println("Tarif : "+ tarif+"€");
		System.out.println( "Adresse : " + this.getAdresse().toString());
		for (int i = 0; i < cr.size(); i++) {
			System.out.println(cr.get(i).toString());
		}
	}

	public void ajouterCreneau(Creneau creaneau){
		cr.add(creaneau);
	}

	public void setNumeroDeTelephone(String numTel) {
		this.numTel = numTel;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	public String getNom() {
		return nom;
	}

	public String getNumeroDeTelephone() {
		return numTel;
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

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public static int getTarif() {
		return tarif;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return nom +" "+ prenom ;
	}
}
