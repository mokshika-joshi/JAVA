import java.util.Scanner;
public class asgn9 
{
    public static void main(String args[])
    {
        int n, year, week, day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        n = sc.nextInt();
        year = n / 365;
        m = n % 365;
        System.out.println("No. of years: "+year);
        week = n / 7;
        n = n % 7;
        System.out.println("No. of weeks: "+week);
        day = n;
        System.out.println("No. of days: "+day);
    }
}