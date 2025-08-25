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

//My original attempt 
/*
void permute_old(int ** integers,int n)
{
	int pivot;
	int increment;
	int n_factorial;
	int * original_integers;
	original_integers = malloc(n * sizeof(int));
	memcpy(original_integers,(*integers),n*sizeof(int));
	//
	n_factorial = factorial(n);
	increment = 1;
	for(int i = 0; i < n_factorial; i++)
	{
		if(i % (n_factorial/n) == 0 && i >= n - 1)
		{
			memcpy((*integers),original_integers,n*sizeof(int));
			for(int k = 0; k < increment; k ++)
			{
				pivot = (*integers)[0];
				for(int j = 1; j < n; j ++)
				{
					(*integers)[j - 1] = (*integers)[j];
				}
				(*integers)[n - 1] = pivot;
			}
			increment += 1;
			
		}
		else
		{
			pivot = (*integers)[(n - 1)];
			(*integers)[(n - 1)] = (*integers)[(n-1) - ((i % (n - 2)) + 1)];
			(*integers)[(n-1) - ((i % (n - 2)) + 1)] = pivot;
		}
		for(int i = 0; i < n; i++)
		{
			printf("%d",(*integers)[i]);
		}
		printf("\n");
	}
}
*/

//Heaps algorithm implementation
void permute(int ** integers,int cycle,int n)
{
	int pivot;
	if (cycle == 1)
	{
		for(int i = 0; i < n; i++)
		{
			printf("%d",(*integers)[i]);
		}
		printf("\n");
		return;
	}
	for(int i = 0; i < cycle; i++)
	{
		permute(&(*integers),cycle - 1,n);
		if(cycle % 2 == 1)
		{
			pivot = (*integers)[0];
			(*integers)[0] = (*integers)[cycle-1];
			(*integers)[cycle-1] = pivot;
		}
		else
		{
			pivot = (*integers)[cycle-1];
			(*integers)[cycle - 1] = (*integers)[i];
			(*integers)[i] = pivot;
		}

	}
}

//Main 
void permute_all(int ** integers,int n)
{
	int cycle = n;
	permute(integers,cycle,n);
}
