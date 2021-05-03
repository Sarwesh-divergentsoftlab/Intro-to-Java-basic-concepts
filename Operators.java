public class Operators {

    public static strictfp void precise()
    {
        System.out.println(92e+101 + 86e+108+" "+10/3);
    }
    public static void main(String[] args)
    {

        float f=360.0f-210.1f;
        System.out.println(f);

        int a,b;

        a=10;b=20;

        //addision
        System.out.println(a+b);

        //subtract
        System.out.println(b-a);

        //divide
        System.out.println(b/a);

        //multiplication
        System.out.println(a*b);

        //strictfp
        precise();

        //unary operator
        int fact=1;
        for(int i=1;i<=10;i++)
        {
           
            fact=fact*i;
        }
        System.out.print(fact);

        //relational
        if(fact==3628800)
        System.out.println("it is factorial of 10 ");
        
        //bitwise
        System.out.println("And operation of 122 & 1440 is "+(122&1440));

        //logical
        if(a<b && (a%10==0 && b%10==0))
        System.out.println("They both are amazing numbers");
        else System.out.println("normal number");

        //misc operator
        System.out.print(a<b?"ture":"false");


    }
    
}
