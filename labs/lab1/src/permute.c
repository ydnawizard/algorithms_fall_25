//Sorting Functions

//Populates int pointer with first n integers
void generate_integer_array(int ** integers,int n)
{
	(*integers) = malloc(n * sizeof(int));
	for(int i = 0; i < n; i++)
	{
		(*integers)[i] = i + 1;
	}
}

//Returns an int that is the factorial of input int n
int factorial(int n)
{
	int factorial = n;
	for(int i = n - 1; i > 0; i--)
	{
		factorial *= i;
	}
	return factorial;
}

//Permutes int pointer once
void permute(int ** integers,int n)
{
	int p;
	int integers_prev[n];
	for(int i = 0; i < n; i++)
	{
		integers_prev[i] = (*integers)[i];
	}
	for(int i = 0; i < n; i++)
	{
		(*integers)[i] = integers_prev[(i + 1) * 3 % n];
	}
}

void permute_recursively(int ** integers,int n,int p)
{
}
