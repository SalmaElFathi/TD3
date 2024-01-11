package TD_3;
public class EX6 {
    public static void main(String[] args) {
    Disque d=new Disque(new Point1(1,2),3,"a");
        System.out.println("le perimetre est "+d.getPerimeter());
        System.out.println("l'aire est "+d.getAire());
      Rectangle r=new Rectangle(5,7);
        System.out.println("le perimetre est "+r.getPerimeter());
        System.out.println("l'aire est "+r.getAire());


    }
}
 abstract class Figure {
        String nom;
     public abstract double  getPerimeter();
     public abstract double  getAire();


     @Override
     public String toString() {
         return "Figure{" +
                 "nom=" +nom +
                 '}';
     }
 }
  class Disque extends Figure {
    Point1 centre;
    double rayon;
    Disque(){}
    Disque(Point1 centre,int rayon){
        this.centre=centre;
        this.rayon=rayon;
    }
      Disque(Point1 centre,double rayon,String nom){
          this.centre=centre;
          this.rayon=rayon;
          this.nom=nom;
      }

      public Point1 getCentre() {
          return centre;
      }

      public void setCentre(Point1 centre) {
          this.centre = centre;
      }

      public double getRayon() {
          return rayon;
      }

      public void setRayon(double rayon) {
          this.rayon = rayon;
      }

      public  double  getPerimeter(){
          return 2*3.14*rayon;
      }
      public  double  getAire(){
          return rayon*rayon*3.14;
      }


  }
    class Rectangle extends Figure{
    double longueur;
    double largeur;
    Rectangle(){}
    Rectangle(double longueur ,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }
        Rectangle(double longueur,double largeur,String nom){
            this.longueur=longueur;
            this.largeur=largeur;
            this.nom=nom;
        }

        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            this.largeur = largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            this.longueur = longueur;
        }
        public  double  getPerimeter(){
            return 2*(longueur+largeur);
        }
        public  double  getAire(){
            return longueur*largeur;
        }
    }
class Point1{
    private double x,y;


        public Point1() {
        }

    public Point1(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
















