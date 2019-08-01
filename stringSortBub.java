class stringSortBub
{
  public static void main(String[] args)
  {
    String names[]={"amit","anus","amanda","ani","ajit","anil"};
    String temp;

    for(int i=0;i<names.length;i++)
    {
      for(int j=0;j<names.length-i-1;j++)
      {
        if(names[j].compareTo(names[j+1])>0)
        {
          temp=names[j];
          names[j]=names[j+1];
          names[j+1]=temp;
        }
      }
    }

    for(int i=0;i<names.length;i++)
    {
      System.out.printf("%s\n",names[i]);
    }

  }
}
