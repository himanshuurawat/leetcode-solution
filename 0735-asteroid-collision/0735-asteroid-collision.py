class Solution:
    def asteroidCollision(self, asteroids: list[int]) -> list[int]:
        stack = []

        for asteroid in asteroids:
            alive = True

            while stack and asteroid < 0 and stack[-1] > 0:
                if stack[-1] < abs(asteroid):
                    stack.pop()
                elif stack[-1] == abs(asteroid):
                    stack.pop()
                    alive = False
                    break
                else:
                    alive = False
                    break

            if alive:
                stack.append(asteroid)
        return stack