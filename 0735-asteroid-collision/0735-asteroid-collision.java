class Solution {
    public int[] asteroidCollision(int[] asteroids) {
         ArrayList<Integer> stack = new ArrayList<>();

        for (int asteroid : asteroids) {
            boolean alive = true;

            while (!stack.isEmpty() && asteroid < 0 && stack.get(stack.size() - 1) > 0) {
                int top = stack.get(stack.size() - 1);

                if (top < Math.abs(asteroid)) {
                    stack.remove(stack.size() - 1);
                }
                else if (top == Math.abs(asteroid)) {
                    stack.remove(stack.size() - 1);
                    alive = false;
                    break;
                }
                else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.add(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;  
    }
}