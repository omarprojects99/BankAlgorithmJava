package java;

public class Main {
    public static void main(String[] args) {
        int mois23;

        Employe p = new Employe();
        Agence agence = new Agence();
        CompteCourant c1 = new CompteCourant(p, "12854", 0.0, agence, new Date(1, 01, 2022), 0);
        CompteEpargne c2 = new CompteEpargne(p, "95147", 0.0, agence, new Date(1, 01, 2022));

        System.out.println("****2022****");
        for (int mois22 = 1; mois22 <= 12; mois22++) {
            c1.versement(1500);
            c1.retrait(350);
            c2.versement(500);

            if (mois22 % 3 == 0) {
                c1.frais_bancaire();
                c2.frais_bancaire();
                c2.calculerInterets();
            }

            System.out.println("Solde de c1 : " + c1.getSolde() + " Solde de c2 : " + c2.getSolde());
        }

        Credit credit = new Credit("111", c1, 3 * p.getS(), new Date());

        c1.versement(credit.getMC());

        System.out.println("****2023****");
        for (mois23 = 1; mois23 <= 12; mois23++) {

            c1.versement(1500);
            c2.versement(500);
            c1.retrait(400);
            c1.plafondDepassement(400);
            if (mois23 % 2 == 0) {
                c2.retrait(300);
            }
            if (mois23 % 3 == 0) {
                c1.frais_bancaire();
                c2.frais_bancaire();
                c1.FraisTrimestriels();
                c2.calculerInterets();
            }
            System.out.println("Solde de c1 : " + c1.getSolde() + " Solde de c2 : " + c2.getSolde());

        }

        c1.extraitBancaire();
        c2.extraitBancaire();

    }
}