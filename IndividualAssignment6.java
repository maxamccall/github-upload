public class IndividualAssignment6{
    public static void main(String[] args) {
        int[] list = {0,1,2,3,4};
        int k = 6;
        Average instance = new Average();
        int avg = instance.average(k,list);
        System.out.println(avg);
    }
}