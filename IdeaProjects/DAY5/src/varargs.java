public class varargs {

    void addProducts(float f,int i,String ... p1){
        for(String product:p1){
            System.out.println(product);
        }

    }
    public static void main(String[] args) {
        varargs v=new varargs();
        v.addProducts(3.5f,343,"sjhd","sijrif","5ijijfi");

    }
}
