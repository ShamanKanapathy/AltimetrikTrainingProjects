public class Triangle {
    public static void main(String [] args){
        int i;
        int j;

        for(i=0;i<5;i++){
            for(j=0;j<5-i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
