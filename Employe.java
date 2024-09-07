package java;

public class Employe extends Personne  {
	private String fonction ;
	private Date date_emb ;
	private String situation;
	private double salaire  ;


public Employe() {
        super();
        fonction = "Non spécifié";
        date_emb = new Date();
        situation = "Contractuelle";
        salaire = 1500;
    }

    public Employe(String nom, String prenom, int CIN, Date dateNaissance,
        String fonction, Date dateEmbauche, String situation, double salaire) {
        super(nom, prenom, CIN, dateNaissance);
        this.date_emb= dateEmbauche;
        this.situation = situation;
        this.salaire = salaire;
        this.fonction =fonction;
    }

	public void affiche() {
	super.affiche();
	System.out.println("Fonction: " + fonction);
	System.out.println("Date d'embauche: " + date_emb.toString());
	System.out.println("Situation: " + situation);
	System.out.println("Salaire: " + salaire);
	}

	public String toString() {
		return (super.toString()+"||"+date_emb.toString()+"||"+salaire);
	}

    public void setS(double salaire) {
    	this.salaire=salaire;
    }
    public double getS() {
    	return salaire;
    }
    public void setEmb(Date D1)
    {
    	date_emb=D1;
    }
    public Date getEmb() {
    	return date_emb;
    }
    public void setSituation(String s){
        situation=s;
    }
    public String getSituation(){
        return situation;
    }

   // Méthode pour calculer l'ancienneté

    public int anciennete(Date dateActuelle) {
    int anciennete = dateActuelle.getA() - date_emb.getA();
    return anciennete;

}

// Méthode pour ajuster le salaire en fonction de l'ancienneté
public void ajusterSalaire(Date dateActuelle, double salaire2) {
    if ( anciennete(dateActuelle)> 5 &&(anciennete(dateActuelle)*12)% 4 == 0)
    {
    salaire = salaire + salaire2;
    }
}

public static void main (String[]args){

}


}
