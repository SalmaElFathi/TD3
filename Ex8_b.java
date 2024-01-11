package TD_3;

public class Ex8_b {
    public static void main(String[] args) {

        Patron p=new Patron("ahmad","khalid",8000);
        System.out.println(p.toString());
        System.out.println("le salaire d'un patron est  "+p.gains());
        TravailleurCommission t=new TravailleurCommission("ahmad","khalid",8000,80);
        System.out.println("le salaire d'un travailleur commission est "+t.gains());
        System.out.println(t.toString());
        TravailleurHoraire h=new TravailleurHoraire("ahmad","khalid",20);
        System.out.println("le salaire d'un travailleur horaire est "+h.gains());
        System.out.println(h.toString());

    }
}
     interface Employee1 {
    public String getNom() ;

    public void setNom(String nom) ;
    public String getPrenom();
    public void setPrenom(String prenom) ;

    @Override
    public String toString();}
class Patron1 implements Employee1{
    int salaire;
    String nom;
    String prenom;
    Patron1(){}
    Patron1(String nom,String prenom,int salaire){
        this.nom=nom;
        this.prenom=prenom;
        this.salaire=salaire;
    }
    public int gains(){
        return salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Patron1{" +
                "salaire=" + salaire +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

class TravailleurCommission1 implements Employee1 {
    int salaire;
    int commission;
    int quantité;
    String nom;
    String prenom;

    public int gains() {
        return salaire+commission;
    }


    TravailleurCommission1() {}
    TravailleurCommission1(String nom, String prenom, int salaire, int commission) {
        this.nom=nom;
        this.prenom=prenom;
        this.salaire = salaire;
        this.commission = commission;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "TravailleurCommission1{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantité=" + quantité +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

class TravailleurHoraire1 implements Employee1{
    int retribution;
    int heures;
    String nom;
    String prenom;
    TravailleurHoraire1(){}
    TravailleurHoraire1(String nom, String prenom ,int retribution){
        this.nom=nom;
        this.prenom=prenom;
        this.retribution=retribution; }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getRetribution() {
        return retribution;
    }

    public void setRetribution(int retribution) {
        this.retribution = retribution;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire1{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public int gains() {
        return retribution*heures;
    }
}


