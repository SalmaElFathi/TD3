package TD_3;

public class Ex7 {
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
abstract class Employee {
    String nom;
    String prenom;

    Employee() {
    }

    Employee(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom=" + nom +
                ", prenom=" + prenom +
                '}';
    }
    public abstract int gains();
}
    class Patron extends Employee{
    int salaire;
    Patron(){}
    Patron(String nom,String prenom,int salaire){
        super(nom,prenom);
        this.salaire=salaire;
        }
    public int gains(){
        return salaire;
        }
        }
        class TravailleurCommission  extends Employee {
            int salaire;
            int commission;
            int quantité;

            public int gains() {
                return salaire+commission;
            }


            TravailleurCommission() {}
            TravailleurCommission(String nom, String prenom, int salaire, int commission) {
                super(nom,prenom);
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
            public String toString() {
                return "TravailleurCommission{" +
                        "salaire=" + salaire +
                        ", commission=" + commission +
                        ", quantité=" + quantité +
                        '}';
            }
        }
        class TravailleurHoraire extends Employee{
    int retribution;
    int heures;
            TravailleurHoraire(){}
            TravailleurHoraire(String nom, String prenom ,int retribution){
                super(nom,prenom);
                this.retribution=retribution; }

            public int getHeures() {
                return heures;
            }

            public void setHeures(int heures) {
                this.heures = heures;
            }

            @Override
            public String toString() {
                return "TravailleurHoraire{" +
                        "retribution=" + retribution +
                        ", heures=" + heures +
                        '}';
            }

            @Override
            public int gains() {
                return retribution*heures;
            }
        }










