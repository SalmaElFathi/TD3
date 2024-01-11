package TD_3;

public class ex1 {
    public static void main(String[] args) {
    point p=new point(4,5);
    System.out.println("les coordonnes sont ("+p.getx()+", "+p.gety()+")");
    pointa p1=new pointa(4,7);
    p1.deplace(1,2);
    p1.affich();
    }
}
class point {
    protected int x,y;
    public  point (int x,int y){
        this.x=x;
        this.y=y; }
    public void deplace(int dx,int dy) {
        x+=dx;
        y+=dy;
    }
    public int getx(){return x;}
    public int gety(){return y;}
}
class pointa extends point {
    public  pointa (int x,int y){
        super(x,y); }
     void affich(){
        System.out.println("les coordonnés sont ("+x+","+y+")");
     }
}