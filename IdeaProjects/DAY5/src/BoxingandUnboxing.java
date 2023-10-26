public class BoxingandUnboxing {
    public static void main(String[] args) {


        int a = 45;
        Integer i = Integer.valueOf(a);//Wrapper Class\
        int value = i.intValue();
        System.out.println(value);

        float r = 5.54f;

        Float f = Float.valueOf(r);//boxing

        float val = f.floatValue();//unboxing


        double c = 5.678;

        Double d = c;//Autoboxing

        double valueE = d;//AutoUnboxing


        boolean e = true;

        Boolean bn = Boolean.valueOf(e);

        boolean bal = bn.booleanValue();

        int s=56;
        Integer asd=s;
        int dgp=s;
        System.out.println(dgp);


    }


}
