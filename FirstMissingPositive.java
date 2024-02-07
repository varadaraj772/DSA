import java.util.*;

class FirstMissingPositive {

  public static int firstMissingPositive(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    for (int i = 1; i < Integer.MAX_VALUE; i++) {
      if (!set.contains(i)) {
        return i;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int nums[] = { 3, 4, 8 };
    firstMissingPositive(nums);
  }
}
