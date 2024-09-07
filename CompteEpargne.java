package java;

public class CompteEpargne extends Compte {

    private double tauxB = 0.06;

    public CompteEpargne(Employe titulaire, String numCompte, double solde, Agence agence, Date dateCreation) {

        super(titulaire, numCompte, solde, agence, dateCreation);

        this.tauxB = 0.06; // Taux d'intérêt trimestriel de 6%
    }

    public CompteEpargne() {

        super();
        this.tauxB = 0.06; // Taux d'intérêt trimestriel de 6%
    }

    public void calculerInterets() {

        double interets = solde * tauxB;
        solde += interets;

    }

}
