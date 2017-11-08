package Sequence;


public class SequenceTest {
    public static void main (String[] args){
        int j,k,l=0;
        Sequence first = new Sequence();
        Sequence second = new Sequence();
        first.add(1);
        first.add(4);
        first.add(9);
        first.add(16);

        second.add(9);
        second.add(7);
        second.add(4);
        second.add(9);
        second.add(11);
        
        Sequence mergeResult = first.merge(second);
        System.out.println(mergeResult.toString());
        
    }
}
