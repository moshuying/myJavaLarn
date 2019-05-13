package leetCodeCn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows){
        if(numRows==0)return  new ArrayList<>();
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        lst.add(lst2);
        if(numRows==1){ return lst;}
        generate(lst,2,numRows);
        return lst;
    }
    public void generate(List<List<Integer>> list,int n,int numRow){
        if(n==numRow+1)return;
        List<Integer> arr =new ArrayList<>();
        arr.add(1);
        for(int i=1;i<n-1;i++){
            int num =list.get(n-2).get(i-1)+list.get(n-2).get(i);
            arr.add(num);
        }
        arr.add(1);
        list.add(arr);
        generate(list,++n,numRow);
    }
}
