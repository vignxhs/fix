class Solution {
    public int commonFactors(int a, int b) {
        int c,i,j;
        if(b>a)
        {
            c=a;
        }
        else
        {
            c=b;
        }
        int cnt=0;
        for(i=1;i<=c;i++)
        {
            if(a%i==0 && b%i==0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}