class Test extends Thread
{
    public void run(){
        System.out.println("This is Thread Class!!!");
    }
    public static  void main(String args[])
    {
        Test t= new Test();
        t.start();
    }
}