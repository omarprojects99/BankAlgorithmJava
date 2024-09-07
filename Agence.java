package java;

public class Agence {
        protected int code;
        protected String nom ;
        protected String adresse;
        private Date date_de_lancement;
        public Agence () {
            code=24;
            nom="BIAT";
            adresse="Sfax";
            date_de_lancement= new Date (25,12,2015);
        }
        public Agence ( int code , String  nom ,String adresse ,Date date_de_lancement ) {
            this.code=code;
            this.nom=nom;
            this.adresse=adresse;
            this.date_de_lancement=date_de_lancement ;
    }
        public void affiche() {
            System.out.println(code+"||"+nom+"||"+adresse+"||"+date_de_lancement.toString());
        }

        public String toString() {
            return (code+" / " +nom+" / "+adresse+" / "+date_de_lancement.toString());
        }

}
