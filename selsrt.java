import java.util.Random;

class selsrt
{
  public static void main(String[] args)
  {
    Random r=new Random();
    int arr[]=new int[100000];
    int temp=0,tempI;

    for(int i=0;i<arr.length;i++)
    {
      arr[i]=r.nextInt(1000);
    }

//--------------------------------------------------------------------

    for(int i=0;i<arr.length;i++)
    {
      tempI=i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[tempI])
        {
          tempI=j;
        }
      }
      temp=arr[i];
      arr[i]=arr[tempI];
      arr[tempI]=temp;
    }

    // for(int i : arr)
    // {
    //   System.out.printf("%d\t\t",i);
    // }
  }
}
