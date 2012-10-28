package guessNumber;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: STU
 * Date: 12-10-28
 * Time: 下午4:19
 * To change this template use File | Settings | File Templates.
 */
public class RandomNumberStringGenerator {
    private int count;
    public RandomNumberStringGenerator(){
        this.count=4;
    }
    private String[] seeds={"0","1","2","3","4","5","6","7","8","9"};
    public RandomNumberStringGenerator(int count){
        this.count=count;
    }
    int len=10;
    public String generate(){
        StringBuilder returnsb=new StringBuilder();
        Random rand=new Random();
        for(int i=0;i<count;i++){
            int index=rand.nextInt(len);
            returnsb.append(seeds[index]);
            swap(seeds,index,len-1);
            len--;
        }
        return returnsb.toString();
    }

    private void swap(String[] seeds, int index, int end) {
        String temp=null;
        temp=seeds[index];
        seeds[index]=seeds[end];
        seeds[end]=temp;
      }
    public static void main(String[] args){
        RandomNumberStringGenerator a=new RandomNumberStringGenerator(4);
        String str=a.generate();
        System.out.println(str);
    }


}
