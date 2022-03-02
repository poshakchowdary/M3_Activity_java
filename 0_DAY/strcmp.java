import java.util.*;
 class strcmp
 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String c1=s.nextLine();
        String c2=s.nextLine();
        s.close();
       String[] namearr1 = c1.split(" ");
       String[] namearr2 = c2.split(" ");
       String name1=namearr1[1];
       String name2=namearr2[1];
       if(name1.equals(name2))
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}

