//This is My more optimized algorithm for Selection sort----------------------------

import java.util.Random;

class stringSortsel
{
  public static void main(String[] args)
  {
    int arr[]=new int[100000],temp;
    Random r=new Random();

    for(int i=0;i<arr.length;i++)
    {
      arr[i]=r.nextInt(1000);
    }

    for(int i=0;i<arr.length;i++)
    {
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }

    // for(int i=0;i<arr.length;i++)
    // {
    //   System.out.printf("%d\n",arr[i]);
    // }

  }
}
