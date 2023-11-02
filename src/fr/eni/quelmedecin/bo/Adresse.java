package fr.eni.quelmedecin.bo;

public class Adresse {
	private String complementAdresse;
	private int numero;
	private String complementNumero;
	private String rue;
	private int codePostal;
	private String ville;

	public Adresse(String complementAdresse, int numero, String complementNumero, String rue, int codePostal,
			String ville) {
		super();
		this.complementAdresse = complementAdresse;
		this.numero = numero;
		this.complementNumero = complementNumero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public Adresse(int numero, String complementNumero, String rue, int codePostal, String ville) {
		super();
		this.numero = numero;
		this.complementNumero = complementNumero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse " +
				complementAdresse+ " " +
				numero + " " +
				complementNumero+ " " +
				rue + " " +
				codePostal + " " +
				ville ;
	}

	public void afficher() {
//		ZAC du Moulin Neuf
//		2B rue Benjamin Franklin
//		44800 SAINT HERBLAIN
//		------------------------------------------------------------------
//		19 avenue Léo Lagrange
//		79000 NIORT
		if (complementAdresse != null && !complementAdresse.isBlank())
			System.out.println(complementAdresse);
		System.out.println(numero + (complementNumero != null ? complementNumero : "") + " " + rue);
		System.out.println(String.format("%05d", codePostal)   + " " + ville);
	}

}
