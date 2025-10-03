package ArrayProblems;

public class RemovingElement {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int val = 2;
		RemovingElement obj = new RemovingElement();
		int newNum = obj.removeElement(nums, val);
		System.out.println(newNum);
	}

	public int removeElement(int[] nums, int val) {
		int j = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}
		}
		

		return j;
	}

}