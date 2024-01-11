package TD_3;

public class ex2 {
    public static void main(String[] args) {


    Point p=new Point(4,5);
    pointnom p1=new pointnom('a',7,2);
    p.deplace(1,2);
    p.affCoord();
    p1.setNom('b');
    p1.affichcoordnom();

}}
class Point{
    protected int x,y;
    public  Point (int x,int y){
        this.x=x;
        this.y=y; }
    public void deplace(int dx,int dy) {
        x+=dx;
        y+=dy;
    }
    public void affCoord(){
        System.out.println("les coordonnés sont ("+x+","+y+")");
    }}
class pointnom extends Point {
         char nom;
    public pointnom (char nom,int x,int y){
        super(x,y);
        this.nom=nom;
    }
    public void setpointNom(pointnom p){
        p.nom=nom;
        p.x=x;
        p.y=y;

    }
    public void setNom(char nom){
        this.nom=nom;
    }
    void affichcoordnom(){
        System.out.println("le nom est "+nom);
    }
}
