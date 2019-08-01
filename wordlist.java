class wordlist
{
  public static void main(String[] args)
  {
    char word[]={'i','n','i','e','t','s','h'};
    long count=0;
    int found=0;
    for(int i=0;i<word.length;i++)
    {
      System.out.printf("%c",word[i]);
    }

    System.out.printf("\n");

      for(int i=0;i<word.length;i++)
      {
        for(int j=0;j<word.length;j++)
        {
          for(int k=0;k<word.length;k++)
          {
            for(int l=0;l<word.length;l++)
            {
              for(int m=0;m<word.length;m++)
              {
                for(int n=0;n<word.length;n++)
                {
                  for(int o=0;o<word.length;o++)
                  {
                    System.out.printf("%c%c%c%c%c%c%c\n",word[i],word[j],word[k],word[l],word[m],word[n],word[o]);
                    count++;
                    if(word[i]=='n' && word[j]=='i' && word[k]=='t' && word[l]=='i' && word[m]=='s' && word[n]=='h')
                    {
                      found++;
                    }
                  }
                }
              }
            }
          }
        }
      }

      if(found==1)
      {
        System.out.printf("nitish found\n");
      }
      else
      {
        System.out.printf("nitish not found\n");
      }

      System.out.printf("<---<-------<-----<--->----->------->--->\ntotal Results=%d",count);

  }
}
