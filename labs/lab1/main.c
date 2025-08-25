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

The program only stores one int pointer which is being constantly run back through the algorithm

Usage: Compile and run with an int argument
*/

#include "main.h"

int main(int arg_c,char * arg_v[])
{
	int * integers;
	int n = atoi(arg_v[1]);
	int n_factorial = factorial(n);
	integers = malloc(n * sizeof(int));
	generate_integer_array(&integers,n);
	clock_t run_time = clock();
	permute_all(&integers,n);
	run_time = clock() - run_time;
	printf("%s %f %s\n","The program took",(float)run_time/CLOCKS_PER_SEC,"seconds to run");
	printf("Questions:\n");
	printf("%s %d %s\n","1.) The number of lines is", n_factorial ,"(n! or n factorial)");
	printf("2.) My program takes about .06 seconds to computer 8! permutations, .6 seconds to compute 9! permutations, and 6 seconds to compute 10! permutations. This seems to indicate a relationship of * 10 for each increment.Because of this, i am going to guess that 15 would take 6*(10^5) seconds and 20 would take 6*(10^10) seconds.\n");
}
