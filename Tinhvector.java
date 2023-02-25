package BaiTapLab3;

public class Tinhvector {
   
    public static void main(String[] args){
        Vector t = new Vector(3,9,6);
        Vector v = new Vector(3,9,6);
        v.getx();
        v.gety();
        v.getz();
        
        double x;
        double y;
        double z;
        x = v.getx();
        y = v.gety();
        z = v.getz();
        System.out.printf( "Tong 1 Vector= " + (x+ v.getx()) +", "+ (y + v.getx()) +", " + (z + v.getx()));
       
    

    }
    
}
