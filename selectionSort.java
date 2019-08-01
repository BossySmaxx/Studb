import java.util.Random;

class selecttionSort
{
  public static void main(String[] args)
  {
    int arr[]=new int[100];
    int minVal,temp;
    Random r=new Random();

    for(int i=0;i<arr.length;i++)
    {
      arr[i]=r.nextInt(1000);
    }
//Printing Original ARRAY-------------------------------------------------------
System.out.printf("\nOrigninal ARRAY--------------------------------------------\n");
    for(int i=0;i<arr.length;i++)
    {
      System.out.printf("%d\n",arr[i]);
    }

    //Sorting-------------------------------------------------------------------
    for(int i=0;i<arr.length;i++)
    {
      minVal=i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[minVal])
        {
          minVal=j;
        }
      }
      temp=arr[i];
      arr[i]=arr[minVal];
      arr[minVal]=temp;
    }
//Printing Sorted Array---------------------------------------------------------\n
  System.out.printf("\nSorted ARRAY---------------------------------------------\n");
    for(int i=0;i<arr.length;i++)
    {
      System.out.printf("%d\n",arr[i]);
    }

  }
}
