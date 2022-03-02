import java.util.*;
 class Upper
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        sc.close();
       String[] nameArray = str1.split(" ");
       String name=nameArray[0];
       String lastName = str1.substring(str1.indexOf(" ") + 1).toUpperCase();
        String s=name.substring(0, 1).toUpperCase();
        String str2=s+name.substring(1);
      String str3=str2+" "+lastName;
        System.out.println(str3);
    }
}