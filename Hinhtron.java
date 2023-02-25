package BaiTapLab3;

public class Hinhtron {
    private String tenHinh;
    public String getTenHinh() {
        return tenHinh;
    }


    private double bankinh;
    public double getBankinh() {
        return bankinh;
    }
    public void setBankinh(double bk) {
        if(bk < 0)
        {
            System.out.println("Khong hop le");
    }else {
        double PI = 3.14;
        this.bankinh = bk;
        float chuvi=  (float) (bk * PI * 2);
        float dientich = (float) (bk * bk *PI);
        System.out.println("Chu vi hinh tron(bk)= "+chuvi);
        System.out.println("Dien tich hinh tron= "+dientich);
    }
}


    private double duongkinh;
    public double getDuongkinh() {
        return duongkinh;
    }
    public void setDuongkinh(double dk) {
        if(dk < 0)
        {
            System.out.println("Khong hop le");
    }else{
        double PI = 3.14;
        this.duongkinh = dk;
        float chuvi2=  (float) (dk * PI);
        System.out.println("Chu vi hinh tron(dk)= "+chuvi2);
        
    }
}

    public Hinhtron(String tenHinh, double bankinh, double duongkinh) {
        this.tenHinh = tenHinh;
        this.bankinh = bankinh;
        this.duongkinh = duongkinh;
    }
    public Hinhtron() {
    }  
}
