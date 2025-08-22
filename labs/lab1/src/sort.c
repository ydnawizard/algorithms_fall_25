//Sorting Functions


//Populates int pointer with first n integers
void generate_integer_array(int ** integers,int n)
{
	(*integers) = malloc(n * sizeof(int));
	for(int i = 0; i < n; i++)
	{
		(*integers)[i] = i;
	}
}

void permute(int ** integers,int n,int p)
