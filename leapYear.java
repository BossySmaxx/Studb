class leapYear
{
  public static void main(String[] args)
  {
    int year=8000;
    if(year%4==0)
    {
      if(year%100==0)
      {
        if(year%400==0)
        {
          System.out.printf("%d  a leap year\n",year);
        }
        else
        {
          System.out.printf("%d  not leap year\n",year);
        }
      }
      else
      {
        System.out.printf("%d  a leap year\n",year);
      }
    }
    else
    {
      System.out.printf("%d not a leap Year\n",year);
    }
  }
}
