package Math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle
{
    public static void main(String[] args)
    {
        int numRows=5;
        System.out.println(generate(numRows));
    }
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> list=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    list.add(1);
                }
                else
                {
                    list.add((ans.get(--i).get(j) + ans.get(i).get(--j)));
                    i++;j++;
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
