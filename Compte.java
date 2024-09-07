package java;

public class Compte {

    private Employe titulaire;
    private String numCompte;
    protected double solde;
    private Agence agence;
    protected Date dateCreation;
    private Operation[] operations; // Declare the array of operations
    private int i; // Track the number of operations

    public void affiche() {
        System.out.println("Titulaire du compte: " + titulaire.toString());
        System.out.println("Numéro de compte: " + numCompte);
        System.out.println("Solde: " + solde);
        System.out.println("Agence: " + agence.toString());
        System.out.println("Date de création: " + dateCreation.toString());
    }

    public String toString() {
        return (titulaire.toString() + "||" + numCompte + "||" + solde + "||" + agence.toString() + "||"
                + dateCreation.toString());
    }

    public Compte() {
        titulaire = new Employe();
        numCompte = "95147";
        solde = 0;
        agence = new Agence(24, "biat", "sfax", new Date(25, 12, 2015));
        dateCreation = new Date(1, 1, 2022);
        operations = new Operation[100]; // Initialiser le tableau des opérations avec une taille fixe (par exemple 100)
        i = 0; // Initialiser l'indice à zéro
    }

    public Compte(Employe titulaire, String numCompte, double solde, Agence agence, Date dateCreation) {

        this.titulaire = titulaire;
        this.numCompte = numCompte;
        this.solde = solde;
        this.agence = agence;
        this.dateCreation = dateCreation;
    }

    public Employe getTitulaire() {
        return titulaire;
    }

    public String getnumcompte() {

        return numCompte;
    }

    public Date getdateC() {
        return dateCreation;
    }

    public void ajouterOperation(Operation operation) {
        operations[i] = operation;
        i++;

    }

    public void versement(double montant1) {
        solde = solde + montant1;
        Operation op1 = new Operation(new DateTime(), "Credit", montant1, new Agence());
        ajouterOperation(op1);

    }

    public void retrait(double montant2) {

        solde = solde - montant2;
        Operation op2 = new Operation(new DateTime(), "Debit", montant2, new Agence());
        ajouterOperation(op2);
    }

    public void frais_bancaire() {
        solde = solde - 15;
        Operation op3 = new Operation(new DateTime(), "Debit", 15, new Agence());
        ajouterOperation(op3);
    }

    /* extrait bancaire */
    public void extraitBancaire() {
        System.out.println("Bank Statement for Account: " + numCompte);
        for (int j = 0; j < i; j++) {
            System.out.println(operations[j].toString());
        }

    }

    public double getSolde() {
        return solde;
    }
}