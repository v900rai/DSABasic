package selfpractices;
class proccess1 implements Runnable{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Proccesingg one"+ i);

        }
    }

}
class proccess2 implements Runnable{
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Proccesingg one"+ j);

        }
    }

}

public class Multitttt {
    public static void main(String[] args) {
        proccess1 p1=new proccess1();
        proccess2 p2=new proccess2();
        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
    }

}
