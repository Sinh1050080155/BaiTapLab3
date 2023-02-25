package BaiTapLab3;

public class Vector {
private double x, y, z;
private double a,b,c;
private double k;


public void Vector1(double x, double y, double z ){
    this.x = x;
    this.y = y;
    this.z = z; 
    this.k = k;
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
public double getk(){
    return k; 
}
public double setx(double x){
    return this.x = x;
}
public double sety(double y){
    return this.y = y;
}
public double setz(double z){
    return this.z = z;
}
public double setk(double k){
    return this.k = k;
}

public void Vector2(double a, double b, double c ){
    this.a = a;
    this.b = b;
    this.c = c; 
}
public double geta(){
    return a; 
}
public double getb(){
    return b; 
}
public double getc(){
    return c; 
}
public double seta(double a){
    return this.a = a;
}
public double setb(double b){
    return this.b = b;
}
public double setc(double c){
    return this.c = c;
}
public double settong(){
    Double tong1 = this.x + this.a;
    Double tong2 = this.y + this.b;
    Double tong3 = this.z + this.c;
    System.out.println("Tong 2 vector: " + "(x+a)= "+tong1 +" (y+b)= "+ tong2 +" (z+c)= "+ tong3);
    return 0;
   
}
public double sethieu(){
    Double hieu1 = this.a - this.x;
    Double hieu2 = this.b - this.y;
    Double hieu3 = this.c - this.z;
    System.out.println("Hieu 2 vector: " + "(a-x)= "+hieu1 +" (b-y)= "+ hieu2 +" (c-z)= "+ hieu3);
    return 0;
   
}
public double setnhanHSvt1(){
    Double nhanhs1 = this.x * this.k;
    Double nhanhs2 = this.y * this.k;
    Double nhanhs3 = this.z * this.k;
    System.out.println("Vector1 nhan voi hang so: " + "(x*k)= "+nhanhs1 +" (y*k)= "+ nhanhs2 +" (z*k)= "+ nhanhs3);
    return 0;
   
}
public double setnhanHSvt2(){
    Double nhanhs1 = this.a * this.k;
    Double nhanhs2 = this.b * this.k;
    Double nhanhs3 = this.c * this.k;
    System.out.println("Vector2 nhan voi hang so: " + "(a*k)= "+nhanhs1 +" (b*k)= "+ nhanhs2 +" (c*k)= "+ nhanhs3);
    return 0;
   
}
public double setnhan2vt(){
    Double nhan2vt1 = this.a * this.x;
    Double nhan2vt2 = this.b * this.y;
    Double nhan2vt3 = this.c * this.z;
    System.out.println("Nhan 2 vector: " + "(a*x)= "+nhan2vt1 +" (b*y)= "+ nhan2vt2 +" (c*z)= "+ nhan2vt3);
    return 0;
   
}
public String toString(){
    return "x = " + x + " y = " + y + " z = " + z + " a = " + a + " b = " + b + " c = " + c;
    
}


} 
    
    



