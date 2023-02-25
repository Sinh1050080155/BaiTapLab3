package BaiTapLab3;



public class Hinh {
    public static void main(String[] args){
       
        
        Hinhtron ht = new Hinhtron();
        ht.setBankinh(4);
        ht.setDuongkinh(8);
        System.out.println(ht.getDuongkinh());
        System.out.println(ht.getBankinh());
        System.out.println();
        Hinhvuong hv = new Hinhvuong();
       hv.setCanh(  4);  
       System.out.println(hv.getCanh());
    }
}
