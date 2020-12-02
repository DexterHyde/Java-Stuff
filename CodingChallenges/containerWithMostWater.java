package CodingChallenges;

public class containerWithMostWater {

    public static void main(String[] args) {
        int[] axis = new int[]{1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(axis));
    }

    static int maxArea(int[] axis){
        int max = 0;
        int start = 0, end = axis.length -1;

        while(start < end){
            max = Math.max(max, Math.min(axis[start], axis[end]) * (end - start));

            if(axis[start] > axis[end]){
                end--;
            }

            else{
                start++;
            }
        }

        return max;
    }
    
}
