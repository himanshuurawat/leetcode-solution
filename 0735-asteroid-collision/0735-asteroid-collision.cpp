class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
          vector<int> stack;

        for (int asteroid : asteroids) {
            bool alive = true;

            while (!stack.empty() && asteroid < 0 && stack.back() > 0) {
                if (stack.back() < abs(asteroid)) {
                    stack.pop_back();
                }
                else if (stack.back() == abs(asteroid)) {
                    stack.pop_back();
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.push_back(asteroid);
            }
        }

        return stack;
    }
};