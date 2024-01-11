package TD_3;

public class Ex5 {
    public static void main(String[] args) {

    }
}
class Vehicule {
    private int nbpassager;
    Vehicule(int n){
        this.nbpassager=n;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "nbpassager=" + nbpassager +
                '}';
    }
}
class Moto extends Vehicule{
    private int nbRoues=2;
    Moto(int n,int nbr){
        super(n);
        this.nbRoues=nbr;
    }
}
class Avion extends Vehicule {
    private int nbMoteur;
    Avion(int nbp,int nbm){
        super(nbp);
        this.nbMoteur=nbm;
    }
}
class Triporteur extends Moto{
    Triporteur(int n,int nbr)
    {super(n,nbr);}
}