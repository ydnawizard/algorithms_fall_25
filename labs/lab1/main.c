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

*/

#include "main.h"

//The only things stored are an int that keeps track of how many permutations have been made (p)
//and the array of ints that gets permuted (integers)
int main(int arg_c,char * arg_v)
{
	int n;
	int * integers;
	n = 4;
	generate_integer_array(&integers,n);
	permute(&integers,n);
}
