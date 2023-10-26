public class Computer {
    public static void main(String[] args) {{

            Runnable d=new Desktop();
            Thread t1=new Thread(d);
            t1.start();

            Runnable r=new Ipad();
            Thread t2=new Thread(r);
            t2.start();
        }
    }
}
