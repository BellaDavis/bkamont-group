#include <iostream>


int main()
{
    int a = 0, b = 1;
    int sum_even = 0;
    // While b is less than 4000000
    while (b < 4000000) {
        // if b is even add b to the sum_even
        if (b % 2 == 0) {
            sum_even += b;
        }
        int temp = b;
        b = a + b;
        a = temp;
    }
    std::cout << sum_even << std::endl;

    return 0;
}

// answer should be 4613732
