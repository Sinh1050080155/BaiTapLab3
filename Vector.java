package BaiTapLab3;

public class Vector {
private double x, y, z;


public Vector(double x, double y, double z ){
    this.x = x;
    this.y = y;
    this.z = z; 
}

public double getx(){
    return x;      
}
public double gety(){
    return y; 
}
public double getz(){
    return z; 
}
  

    public Vector cong(Vector v) {
        return new Vector(x + v.getx(), y + v.getx(), z + v.getx());
    }
    public Vector tru(Vector v) {
        return new Vector(x - v.getx(), y - v.getx(), z - v.getx());
    }
    public Vector nhan(double k) {
        return new Vector(k * x, k * y, k * z);
    }
    public double nhanVH(Vector v) {
        return x * v.getx() + y * v.getx() + z * v.getx();
    }
   
   
} 
    
    



