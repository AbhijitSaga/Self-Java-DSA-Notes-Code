package recursionFunction;

public class DiceRollWithTargetSumCombination {

    public static void main(String[] args) {
        int target=4;
        diceRole("",target);
    }

    private static void diceRole(String p, int target) {
        if(target==0){
           System.out.println(p);
           return;
        }
        for(int i=1;i<=6 && i<=target;i++){
          diceRole(p+i,target-i);
        }
    }
}
