class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -(2**31)

        # Handle overflow case
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX

        # Determine the sign of the result
        negative = (dividend < 0) != (divisor < 0)

        # Work with positive values
        dividend = abs(dividend)
        divisor = abs(divisor)

        quotient = 0

        # Subtract the largest doubled divisor each time
        while dividend >= divisor:
            value = divisor
            multiple = 1

            while dividend >= (value << 1):
                value <<= 1
                multiple <<= 1

            dividend -= value
            quotient += multiple

        return -quotient if negative else quotient

        