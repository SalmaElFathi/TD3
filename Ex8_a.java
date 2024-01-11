package TD_3;
public class Ex8_a {
    public static void main(String[] args) {
        Disque1 d=new Disque1(new Point1(1,2),3,"a");
        System.out.println("le perimetre est "+d.getPerimeter());
        System.out.println("l'aire est "+d.getAire());
        Rectangle1 r=new Rectangle1(5,7);
        System.out.println("le perimetre est "+r.getPerimeter());
        System.out.println("l'aire est "+r.getAire());


    }
}
 interface Figure1 {
      //char nom ;par défaut final alors on doit l'initialiser si on le met ici

      double getPerimeter();

      double getAire();

      String toString();
 }
     class Disque1 implements Figure1 {
         Point1 centre;
         double rayon;
         String nom;

         Disque1() {}

         Disque1(Point1 centre, int rayon) {
             this.centre = centre;
             this.rayon = rayon;
         }

         Disque1(Point1 centre, double rayon, String nom) {
             this.centre = centre;
             this.rayon = rayon;
             this.nom = nom;
         }

         public String getNom() {
             return nom;
         }

         public void setNom(String nom) {
             this.nom = nom;
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

         public double getPerimeter() {
             return 2 * 3.14 * rayon;
         }

         public double getAire() {
             return rayon * rayon * 3.14;
         }

         @Override
         public String toString() {
             return "Disque1{" +
                     "centre=" + this.getCentre() +
                     ", rayon=" + this.getRayon() +
                     ", nom=" + this.getNom() +
                     '}';
         }
     }

     class Rectangle1 implements Figure1 {
         double longueur;
         double largeur;
         String nom;

         Rectangle1() {}

         Rectangle1(double longueur, double largeur) {
             this.longueur = longueur;
             this.largeur = largeur;
         }

         Rectangle1(double longueur, double largeur, String nom) {
             this.longueur = longueur;
             this.largeur = largeur;
             this.nom= nom;
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

         public double getPerimeter() {
             return 2 * (longueur + largeur);
         }

         public double getAire() {
             return longueur * largeur;
         }
     }

     class Point2 {
         private double x, y;
         public Point2() {
         }

         public Point2(double x, double y) {
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
