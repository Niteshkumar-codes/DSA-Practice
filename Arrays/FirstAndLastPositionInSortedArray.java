class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target);
        ans[1] = findLast(nums, target);
        return ans;
    }

    public int findFirst(int[] a, int target) {
        int s = 0, e = a.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (a[mid] == target) {
                ans = mid;
                e = mid - 1;
            } 
            else if (a[mid] < target) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public int findLast(int[] a, int target) {
        int s = 0, e = a.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (a[mid] == target) {
                ans = mid;
                s = mid + 1;
            } 
            else if (a[mid] < target) {
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
