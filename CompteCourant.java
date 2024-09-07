package java;

public class CompteCourant extends Compte {
	private double decouvertAutorise;

	public CompteCourant(Employe titulaire, String numCompte, double solde, Agence agence, Date dateCreation,
			double decouvertAutorise) {
		super(titulaire, numCompte, solde, agence, dateCreation);
		this.decouvertAutorise = decouvertAutorise;
	}

	public CompteCourant() {
		super();
		decouvertAutorise = 500;
	}

	public void plafondDepassement(double montant) {

		if (montant > solde + decouvertAutorise) {
			System.out.println("Opération impossible ");
		} else {
			solde -= montant;

			if (solde < 0) {

				double montantDepassement = Math.abs(solde - decouvertAutorise);
				double frais = montantDepassement * 0.02;
				solde -= frais;
				System.out.println("Frais de dépassement : " + frais);
			}

		}
	}

	public void FraisTrimestriels() {

		solde = solde - 20;
	}
}