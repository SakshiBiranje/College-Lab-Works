// java exp1- 22UAI011

import java.util.Scanner;

 public class Experiment1
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the date(dd/mm/yyyy): ");
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        
        int month_days[] ={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0 && year%100!=0) || (year%400==0)){
            month_days[2]=29;
        }
        if((month<1)||(month>12)){
            System.out.println("Invalid date : Month must be in between 1 to 12");
            return;
        }
        if((date<1)||(date>month_days[month])){
            System.out.println("Invalid date :Month days should be according to month ");
            return;
        }
        int passed_days = date;
        for(int i=1;i<month;i++){
            passed_days +=month_days[i];
            
        }
        int total_days = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400+passed_days;
        int t_odddays = total_days % 7 ;
        System.out.println("the odd days are " +t_odddays);
        switch(t_odddays)
        {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
        }
        
        sc.close();
    }
}