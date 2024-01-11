package TD_3;

public class Ex4 {
    public static void main(String[] args) {
        Batiment b=new Batiment("settat quartier salam");
        Maison m=new Maison("settat quartier salam",4);
        System.out.println(m.toString());
        System.out.println(b.toString());

    }
}
class Batiment{
    private String adresse;
    Batiment(){}
    Batiment(String adresse){
        this.adresse=adresse;
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
    class Maison extends Batiment{
    int nbchmbre;
    Maison(){}
    Maison(String adresse,int nbchmbre){
        super(adresse);
        this.nbchmbre=nbchmbre; }

        public int getNbchmbre() {
            return nbchmbre;
        }

        public void setNbchmbre(int nbchmbre) {
            this.nbchmbre = nbchmbre;
        }

        @Override
        public String toString() {
            return "Maison{" +
                    "nbchmbre=" + nbchmbre +
                    '}';
        }
    }
    class Immeuble extends Batiment {
    int nbappartement;
    Immeuble(){}
    Immeuble(int nbappartement,String adresse){
        super(adresse);
        this.nbappartement=nbappartement;
    }

        public int getNbappartement() {
            return nbappartement;
        }

        public void setNbappartement(int nbappartement) {
            this.nbappartement = nbappartement;
        }

        @Override
        public String toString() {
            return "Immeuble{" +
                    "nbappartement=" + nbappartement +
                    '}';
        }
    }