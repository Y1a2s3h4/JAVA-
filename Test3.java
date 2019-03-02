class Test1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("JAVA");
        }
    }
}

class Test extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.print("JAVA");
        }
    }
}

class Test3
{
    public static void main(String[] args)
    {
        Test1 t1 = new Test1();
        Test t= new Test();
        t1.start();
        t.start();
    }
}

