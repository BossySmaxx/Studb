import java.util.Random;

class bubsrt
{
  public static void main(String[] args)
  {
    int temp,flag;
    int arr[]=new int[20000];
    Random r=new Random();

    for(int i =0;i < arr.length;i++)
    {
      arr[i]=r.nextInt(10000);
    }

//System.out.printf("Original Array------------------------------------------->\n");
// for(int i=0;i<arr.length;i++)
// {
//   System.out.printf("%4d\t \t",arr[i]);
// }

    for(int i=0;i<arr.length;i++)
    {
      flag=0;
      for(int j=0;j<arr.length-1-i;j++)
      {
        if(arr[j+1] < arr[j])
        {
          temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          flag=1;
        }
      }
      if(flag==0)
      {
        break;
      }

    }

System.out.printf("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

    // for(int i=0;i<arr.length;i++)
    // {
    //   System.out.printf("%4d\t \t",arr[i]);
    // }
  }
}
