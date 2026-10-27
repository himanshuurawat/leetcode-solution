class Solution:
    def canPlaceFlowers(self, flowerbed: list[int], n: int) -> bool:
        size = len(flowerbed)

        for i in range(size):
            if n == 0:
                return True

            if (flowerbed[i] == 0 and
                (i == 0 or flowerbed[i - 1] == 0) and
                (i == size - 1 or flowerbed[i + 1] == 0)):

                flowerbed[i] = 1
                n -= 1

        return n == 0
  