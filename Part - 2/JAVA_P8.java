
public class JAVA_P8 {
    public static void main(String[] args) {
    
    int[] array1 = {1, 2, 9};
    int[] array2 = {1, 9, 9};
    int[] array3 = {1, 9, 9, 3, 9,9};
    
    System.out.println(arrayCount9(array1));
    System.out.println(arrayCount9(array2));
    System.out.println(arrayCount9(array3));
    }
    
    public static int arrayCount9(int[] nums) {
    int count = 0;
    // for (int num : nums) {
    for(int i=0;i<nums.length;i++){
    if (nums[i] == 9) {
    count++;
    }
    }
    return count;
    }
    }
    