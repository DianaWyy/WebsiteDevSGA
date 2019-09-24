public class CalculateDay{



  public static void main(String[] args){
     int month = Integer.parseInt(args[0]);
     int day = Integer.parseInt(args[1]);
     int year = Integer.parseInt(args[2]);
     int sum1 = 0;

     switch(month){
       case 1:
       case 10:
       {sum1 = 6 + day; break;}

       case 2:
       case 3:
       case 11:
       {sum1 = 2 + day; break;}

       case 4:
       case 7:
       {sum1 = 5 + day; break;}

       case 5:
       {sum1 = day; break;}

       case 6:
       {sum1 = 3 + day; break;}

       case 8:
       {sum1 = 1 + day; break;}

       case 12:
       {sum1 = 4 + day; break;}

       default:
       System.out.println("Invalid Month Number");

     }
     int decade = (year/10)*10;

     switch(decade)
     {
       case 1980: sum1+=3; break;
       case 1990: sum1+=1; break;
       case 2000: sum1+=0; break;
       default: System.out.println("Invalid Decade");
     }
     int finalnumber=year%10;
     sum1+=(year%10);
     int decade_number = (year/10)%10;

     if(decade_number%2==0)
     {
       switch(year%10)
       {
         case 0:
         case 1:
         case 2:
         case 3:
         sum1+=0;
         break;

         case 4:
         case 5:
         case 6:
         sum1+=1;
         break;

         case 7:
         case 8:
         case 9:
         sum1+=2;
         break;
       }
     }
     else
     {
       switch(year%10)
       {
         case 0:
         case 1:
         sum1+=0;
         break;

         case 2:
         case 3:
         case 4:
         case 5:
         sum1+=1;
         break;

         case 6:
         case 7:
         case 8:
         case 9:
         sum1+=2;

       }
     }

     int dayofweek = sum1 % 7;
     boolean  leap_year = false;
     if(decade % 2 ==0 &&(finalnumber==0||finalnumber==4||finalnumber==8)){leap_year=true;}

     if((month==1||month==2)&&leap_year){dayofweek-=1;}
     System.out.println(dayofweek);

  }
}
