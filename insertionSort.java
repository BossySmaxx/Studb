import java.util.Random;

class insertionSort
{
  public static void main(String[] args)
  {
    int temp,j;
    Random r=new Random();
    int arr[]=new int[10];

    for(int i=0;i<arr.length;i++)
    {
      arr[i]=r.nextInt(1000);
    }

    for(int i=0;i<arr.length;i++)
    {
      temp=arr[i];
      j=i;
      while(j>0 && arr[j-1]>temp)
      {
        arr[j]=arr[j-1];
        j=j-1;
      }
      arr[j]=temp;
    }

    for(int i=0;i<arr.length;i++)
    {
      System.out.printf("%d\n",arr[i]);
    }

  }
}
