public class sixthirty
{
    public static void main(String[] args)
    {
        
        int[][] check = new int [8][8];
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                if((i+j)%2==0)
                {
                    check[i][j]=1;
                }
                else
                {
                    check[i][j]=0;
                }
            }
        }
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                if(i==0)
                {
                    check[i][j]=0;
                }
                else if(i==7)
                {
                    check[i][j]=0;
                }
            }
        }
        for(int i = 0; i<8; i++)
        {
            for(int j = 0; j<8; j++)
            {
                System.out.print(check[i][j]);
            }
        }
    }
}
    


                