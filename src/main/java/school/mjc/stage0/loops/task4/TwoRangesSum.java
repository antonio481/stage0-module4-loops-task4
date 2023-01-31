package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipSum=0;
        int countedSum=0;
        if(numberToSkip<lastInRow){
            skipSum=numberToSkip+lastInRow;
            for (int i=numberToSkip+1;i<=lastInRow;i++){
                countedSum=countedSum+i;
            }
            System.out.println("skipped sum is "+skipSum+"\ncounted sum is "+countedSum+"\n");
        }
        if(numberToSkip<lastInRow){
            System.out.println("number to skip is bugger then the last\n");
        }
        if(numberToSkip==lastInRow){
            for (int i=1;i<=lastInRow;i++){
                skipSum=skipSum+i;
            }
            System.out.println("skipped sum is "+skipSum+"\ncounted sum is 0\n");
        }
        if(lastInRow<0){
            System.out.println("last number in row is negative\n");
        }
    }
}
