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

void permute(int ** integers,int n)
{
	int pivot;
	int n_factorial;
	//
	n_factorial = factorial(n);
	for(int i = 0; i < n_factorial; i++)
	{
		for(int i = 0; i < n; i++)
		{
			printf("%d",(*integers)[i]);
		}
		pivot = (*integers)[(i % (n - 1))];
		(*integers)[(i % (n - 1))] = (*integers)[n-1];
		(*integers)[n - 1] = pivot;
		printf("\n");
	}

}
