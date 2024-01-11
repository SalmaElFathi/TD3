package TD_3;

public class Ex3 {
    public static void main(String[] args) {
        Points p=new Points(4,5);
        centre p1=new centre('a',2,3);

        p.affCoord();
        p1.affnom();
        p1.affich();

    }}
class Points {
    protected int x, y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void affCoord() {
        System.out.println("les coordonnés sont (" + x + "," + y + ")");
    }

    public void affich() {
        System.out.println("les coordonnés sont (" + x + "," + y + ")");
    }
}

  class centre extends Points   {
    char nom;
    centre(char nom,int x,int y){
        super (x,y);
        this.nom=nom;
      }
      public void affnom() {
          System.out.println("le nom est "+nom);
      }
      public void affich() {
          System.out.println(nom+" (" + x + "," + y + ")");
      }

  }






