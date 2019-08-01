import java.util.Scanner;

class studb
{
  static int count=0;
  public static void main(String[] args)
  {
    menu();
  }


      public static void menu()
     {
       String choice="C";
       Student stu[]=new Student[20];
       Scanner ch=new Scanner(System.in);
       while(choice!="0")
       {
           System.out.printf("     _\n");
           System.out.printf("STUDB_:----------------------------------\n");
           System.out.printf(" ____________________________________________________________\n");
           System.out.printf("|1.Add New Records                                           |\n");
           System.out.printf("|2.Show All Records                                          |\n");
           System.out.printf("|3.Delete Records                                            |\n");
           System.out.printf("|4.Sort Records by Roll-No                                   |\n");
           System.out.printf("|5.Sort Records by Name                                      |\n ");
           System.out.printf("|6.Sort Records by Average                                   |\n");
           System.out.printf("|0.Exit                                                      |\n");
           System.out.printf("|7.Sort Records by Total Marks                               |\n");
           System.out.printf("``````````````````````````````````````````````````````````````\n");
           System.out.printf("root>-$__");

       choice=ch.next();
             switch(choice)
             {
               case "1":addRecords(stu);
               break;
               case "2":showAllRec(stu);
               break;
               case "3":System.out.printf("Deleting Records\n");
               break;
               case "4":sortByRollno(stu);
               break;
               case "5":System.out.printf("Sorting records by Name\n");
               break;
               case "6":System.out.printf("Sorting records by Average\n");
               break;
               case "7":System.out.printf("Sorting records by Total Marks\n");
               break;
               case "0":System.out.printf("Exiting...\n");
               System.exit(0);
               break;
               default : System.out.printf("Invalid option Choosen Try Again...\n");
               break;
             }
      }
   }
//Adding Records Function-------------------------------------------------------
            public static void addRecords(Student stu[])
            {
              Scanner ch=new Scanner(System.in);
              int ans=-1;
              System.out.printf("Enter the Following Details\n");
              for(int i=count;i<20;i++)
              {
                stu[i]=new Student();
                stu[i].getDetails();
                stu[i].generateResult();
                System.out.printf("Do you want to add more Results press '1' for YES and '0' for NO\n");
                ans=ch.nextInt();
                if(ans==1)
                {
                  count++;
                }
                else
                {
                  count++;
                  break;
                }
              }
              // return stu;
            }

            public static void showAllRec(Student stu[])
            {
              System.out.printf("|Roll-No|Name      |English|Maths|Physics|Chemistry|Biology|Total|Average|\n");
              for(int i=0;i<count;i++)
              {
                stu[i].showResult();
              }
            }

            public static void sortByRollno(Student stu[])
            {
              Student temp=new Student();
              for(int i=0;i<stu.length;i++)
              {
                for(int j=0;j<stu.length-1-i;j++)
                {
                  if(stu[i].rollno>stu[j+1].rollno)
                  {
                    temp=stu[i];
                    stu[i]=stu[j];
                    stu[j]=temp;
                  }
                }
              }
            }
}

//Student Class-----------------------------------------------------------------
class Student
{
  Scanner input=new Scanner(System.in);
  int rollno,eng,maths,phy,chem,bio,total;
  float avg;
  String name;

  void getDetails()
  {
    System.out.printf("Enter the Name of the Student : ");
    name=input.next();
    System.out.printf("Enter the Roll-No of the Student : ");
    rollno=input.nextInt();
    System.out.printf("Enter the marks of English : ");
    eng=input.nextInt();
    System.out.printf("Enter the marks of Maths : ");
    maths=input.nextInt();
    System.out.printf("Enter the marks of Physics : ");
    phy=input.nextInt();
    System.out.printf("Enter the marks of Chemistry : ");
    chem=input.nextInt();
    System.out.printf("Enter the marks of Biology : ");
    bio=input.nextInt();
  }

  void generateResult()
  {
    total=eng+maths+phy+bio+chem;
    avg=(float)total/5;
  }

  void showResult()
  {
    System.out.printf("|%-7d|%-10s|%-7d|%-5d|%-7d|%-9d|%-7d|%-5d|%-7.1f|\n",rollno,name,eng,maths,phy,chem,bio,total,avg);
  }

}
