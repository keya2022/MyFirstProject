public class My_Method1 {
    public void abc()
    {
       System.out.println("Keya");
    }
    public void abc1(int a, int b)
    {
        int c=a-b;
        System.out.println("Keya  = " +c);
    }
    public static void main(String args[])
    {
        My_Method1 ob1 =new My_Method1();
        ob1.abc();
        ob1.abc1(3,5);
        ob1.abc1(7,5);
        ob1.abc1(3,2);
        ob1.abc();
    }
}
