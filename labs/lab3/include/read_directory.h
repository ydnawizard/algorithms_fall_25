#ifndef READ_DIRECTORY
#define READ_DIRECTORY

#include <stdio.h>
#include <stdlib.h>
#include <stddef.h>
#include <dirent.h>
#include <string.h>

//STRUCT FOR STOING DIRECTORY CONTENTS
typedef struct directory_contents
{
	int file_count;
	int sub_directory_count;
	char** file_names;
	char** sub_directory_names;
}directory_contents;

//OPENS DIRECTORY AND READS FILE NAMES,DIRECTORY NAMES,FILE COUNT, AND SUBDIRECTORY COUNT TO STRUCT
void read_directory_contents(
		directory_contents* directory_contents_pointer,
		char* directory_path);

#endif //READ_DIRECTORY

