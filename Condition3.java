public class Condition3 {
    public static void main(String args[])
    {
        int i= 6;
        if(i==3)
        {
                System.out.println("good");

        }
        else if(i<=5){
            System.out.println("verygood");
        }
        else if(i<5){
            System.out.println("very");
        } else if(i>5 || i<7){
            System.out.println("verygood");
        } else if(i<7){
            System.out.println("veryverygood");
        }
        else{
            System.out.println("bad");

        }
    }
}
