import java.util.stream.Collectors;
import java.util.stream.IntStream;
 
class Main
{
    
    public static void print(int[] nums, int i, int j)
    {
        System.out.println(IntStream.range(i, j + 1)
                                    .mapToObj(k -> nums[k])
                                    .collect(Collectors.toList()));
    }
 
    
    public static void findSubarrays(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            int sum_so_far = 0;
 
            
            for (int j = i; j < nums.length; j++)
            {
                
                sum_so_far += nums[j];
 
                
                if (sum_so_far == target) {
                    print(nums, i, j);
                }
            }
        }
    }
 
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,7,5};
        int sum = 12;
 
        findSubarrays(nums, sum);
    }
}
