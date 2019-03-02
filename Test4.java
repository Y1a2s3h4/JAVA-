class T1 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("JAVA");
        }
    }
}

class T2 extends Thread
{
    public void run()
    {
        try{
        for(int i=0;i<5;i++)
        {
            System.out.println("JAVA");
            Thread.sleep(1000);
        }
    }
      catch (Exception e)
    {

    }}
}


class Test4 
{
    public static void main(String[] args)
    {
        T1 t= new T1();
        T2 t1 = new T2();
        t.start();
        t1.start();
    }
}
