package java;

public class Personne {
	private String nom;
	private String prenom ;
	private int CIN ;
	private Date date_naissance;
	
	public void affiche () {
		System.out.println("nom :"+nom+"prenom:"+prenom+"CIN:"+CIN+date_naissance.toString());
		}

	public String toString() {
		return(nom+"|"+prenom+"|"+CIN+"|"+date_naissance.toString());
	}
	
	public Personne(String nom , String prenom ,int CIN , Date date_naissance) {
		this.nom=nom;
		this.prenom =prenom;
		this.CIN=CIN ;
		this.date_naissance =date_naissance;
		
	}
	public Personne() {
		nom = "Salem" ;
		prenom =" krid" ;
		CIN =11181381 ;
		date_naissance=new Date(13,05,1982);
		
		
	}
	public void setCIN (int CIN1) {
		CIN=CIN1;

	}
    public int getCIN() {
	return CIN;
}
public void setDATEN(Date Date)
{ date_naissance=Date;}

    public Date getDATEN() {
	return date_naissance ;
}

public int calculerAge(Date dateActuelle)
{
return(dateActuelle.getA() - date_naissance.getA());
}


public static void main (String[]args){}

}

