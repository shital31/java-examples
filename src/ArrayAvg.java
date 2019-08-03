public class ArrayAvg {
    public static void main(String args[]){
        double score[] = {10,20,52,65,80};
        int i,sum,avg;
        sum=0;
        for(i=0; i<score.length; i++){
            sum +=score[i];
            System.out.println("total of numbers :"+sum);
        }
        avg = sum/score.length;
        System.out.println("Average of Number :"+avg);
    }
}
