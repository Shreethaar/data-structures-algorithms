#include <stdio.h>
#include <stdlib.h>

int main() {
	int myNumbers[]={25,50,75,100};
	printf("Element of first Index: %d\n",myNumbers[0]);
	myNumbers[0]=33;
	printf("Element of first Index after manipulated: %d\n",myNumbers[0]);
	return 0;
}


