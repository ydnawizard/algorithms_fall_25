/*
.____       _____ __________   ____ 
|    |     /  _  \\______   \ /_   |
|    |    /  /_\  \|    |  _/  |   |
|    |___/    |    \    |   \  |   |
|_______ \____|__  /______  /  |___|
        \/       \/       \/        

Written by: Ellis (Andy) Weglewski

The task: Design and implement an algorithm for finding all permutations of the first n integers. 
Follow the additional tasks (time measurements) and make sure to answer all questions at the end.

Solution: Implemented Heap's algorithm.
Solution Sourced From: https://www.geeksforgeeks.org/dsa/heaps-algorithm-for-generating-permutations/

Usage: Compile and run with an int argument
*/

#include "main.h"

int main(int arg_c,char * arg_v[])
{
	int * integers;
	int n = atoi(arg_v[1]);
	integers = malloc(n * sizeof(int));
	generate_integer_array(&integers,n);
	clock_t run_time = clock();
	permute_all(&integers,n);
	run_time = clock() - run_time;
	printf("%s %f %s\n","The program took",(float)run_time/CLOCKS_PER_SEC,"seconds to run");
}
