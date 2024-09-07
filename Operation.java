package java;

public class Operation {

    private DateTime Timeoperation;
	private  String type;
	private double montant ;
	private Agence agenceOP;



	public Operation(DateTime time, String type2, double montant, Agence agenceOP) {
        Timeoperation=time;
        type=type2;
        this.montant = montant;
        this.agenceOP= agenceOP;
    }

    public String toString()
{
	return ("time :"+Timeoperation + "| type :"+type +" | montant"+montant+" || agence"+agenceOP);
	}
        public  DateTime getTime() {
	return Timeoperation;
	}

	public String getType() {
    return type;
	}

	public double getMontant() {
	return montant;
	}

	public Agence getAgence() {
	return agenceOP;
	}

        public void affiche() {
        }


}
