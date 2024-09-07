package java;

public class Credit {
    private String code_credit;
    private CompteCourant compte_Courant;
    private double montant_Credit;
    private Date versDate;

    public void affiche() {
        System.out.println("code credit :" + code_credit + "compte courant" + compte_Courant.toString()
                + "date de versement :" + versDate.toString());
    }

    public String toString() {
        return (code_credit + "||" + compte_Courant.toString() + "||" + montant_Credit + "||" + versDate.toString());
    }

    public Credit(String code_credit, CompteCourant compte_Courant, double montant_credit, Date versDate) {
        this.code_credit = code_credit;
        this.compte_Courant = compte_Courant;
        this.montant_Credit = montant_credit;
        this.versDate = versDate;
    }

    public Credit() {
        code_credit = "1258";
    }

    public double getMC() {
        return montant_Credit;
    }

    public boolean autoriseCredit() {
        Date dateActuelle = new Date();
        Date dateCreationCompte = compte_Courant.getdateC();
        int periode = dateActuelle.getM() - dateCreationCompte.getM();

        return (periode >= 6);
    }

    public double calculerFraisDossier(Date DA) {
        int AGE = compte_Courant.getTitulaire().calculerAge(DA);

        double frais = 0.0;

        if (AGE < 30 && montant_Credit <= 5 * compte_Courant.getTitulaire().getS()) {
            frais = 0.01 * montant_Credit;
        } else if (AGE >= 30 && AGE <= 50) {
            frais = 0.02 * montant_Credit;
        } else {
            frais = 0.03 * montant_Credit;
        }

        return frais;
    }

    public void versementCredit() {
        if (autoriseCredit() == true) {
            compte_Courant.versement(montant_Credit);
            Operation op4 = new Operation(new DateTime(), "Crédit", montant_Credit, new Agence());
            compte_Courant.ajouterOperation(op4);

        }
    }

}