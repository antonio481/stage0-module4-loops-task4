package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if(numberToGoUntil>toBreakWith){
            for(int i=1;i<=numberToGoUntil-toBreakWith;i++){
                System.out.println(i);
            }
        }
        if(toBreakWith>numberToGoUntil){
            System.out.println("iterating till the end\n");
            for(int i=1;i<=numberToGoUntil;i++){
                System.out.println(i);
            }
        }
    }
}
