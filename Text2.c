
#include <stdio.h>

 int main(){
 	
char name[123], lastname[123];
int age;

	printf("Enter your first name: \n");
	scanf("%s", &name);
	printf("Enter your last name: \n");
	scanf("%s", &lastname);
	printf("Enter your age: \n");
	scanf("%d", &age);
	printf("your name is: %s %s \n" ,name ,lastname);
	printf("your age is: %d \n", age);

	
	if(age>=18){
	 printf("You can vote. \n");
	}	  
	 else{
	 printf("you are still young to vote. \n");
	}
	
		
	return 0;
	
 }

