import javax.lang.model.util.ElementScanner14;

class Ractangle{
   private double length ;
    private  double width;

    public Ractangle(){
        length =1;
        width = 1; 
    }
    public Ractangle(double l, double b){
        setlength(l);
        setwidth(b);
    }
    public  Ractangle(double s){
        length = width = s;
    }

    public double getlength(){
        return length;
    }

    public double getwidth(){
        return width;
    }

    public void setlength(double l){
        if(l >= 0)
        length = l;
        else
        length = 0;
    }

    public void setwidth(double l){
        if(l >= 0)
        width = l;
        else
        width = 0;
    }

    public double area(){
        return length * width;
    }

    public double perimeter(){
        return 2*(length + width);
    }

    public boolean isSquare() {
        if(length == width)
        return true;
        else 
        return false;
    }

}

public class ConstructorGetSet {
    public static void main(String[] args) {
        Ractangle r = new Ractangle();
        r.setlength(5);
        r.setwidth(5);
        System.out.println("area is: "+ r.area());
        System.out.println("perimeter is : "+ r.perimeter());
        System.out.println("check for squre is : "+ r.isSquare());
        System.out.println("length is: "+ r.getlength());
        System.out.println("width is: "+ r.getwidth());
        


    }
}
