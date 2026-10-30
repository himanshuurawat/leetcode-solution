class Solution {
public:
    string reverseWords(string s) {
         int n = s.size();
        reverse(s.begin(), s.end());

        int i = 0, l = 0, r = 0;

        while (i < n) {
            while (i < n && s[i] == ' ') {
                i++;
            }

            if (i == n) break;

            if (l > 0) s[l++] = ' ';

            r = l;

            while (i < n && s[i] != ' ') {
                s[l++] = s[i++];
            }

            reverse(s.begin() + r, s.begin() + l);
        }

        s.resize(l);
        return s; 
    }
};