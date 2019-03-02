class Test2 implements Runnable
{
    public void run(){
        System.out.println("This is Thread Class but Runnable!!!");
    }
    public static  void main(String args[])
    {
        Test2 t2= new Test2();
        Thread t= new Thread(t2);
        t.start();
    }
}