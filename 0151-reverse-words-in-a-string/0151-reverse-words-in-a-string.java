class Solution {
    public String reverseWords(String s) {
              char[] arr = s.toCharArray();
        int n = arr.length;

        reverse(arr, 0, n - 1);

        int i = 0, l = 0;

        while (i < n) {
            while (i < n && arr[i] == ' ') {
                i++;
            }

            if (i == n) break;

            if (l > 0) arr[l++] = ' ';

            int r = l;

            while (i < n && arr[i] != ' ') {
                arr[l++] = arr[i++];
            }

            reverse(arr, r, l - 1);
        }

        return new String(arr, 0, l);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }  
    }
}