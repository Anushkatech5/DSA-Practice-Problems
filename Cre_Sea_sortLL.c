//Linked List
#include<stdio.h>
#include<stdlib.h>
void create(int total_elm);
void displayLL();
void init();
void search(int value);
void sort();
struct node{
	int data;
	struct node *next;
};
typedef struct node NODE;
NODE *start;

int main(){
	
		int choice, T_elm, posn, value;
	do{
	printf("\n    MENU    \n");
	printf("\nselect options :\n1. Initialisation \n2. create \n3. search \n4. sort \n5.Display  \n6. Size Check \n7.DeleteF \n8.Exit");
	printf("Enter your choice\n");
	scanf("%d", &choice);
	switch(choice)
		{
		case 1:
			init();
			break;
		case 2:
			printf("Enter the total no of elements\n");
			scanf("%d", &T_elm);
			create(T_elm);
		  	break;
		case 3:
			printf("Enter the no to search\n");
			scanf("%d", &value);
			search(value);
		  	break;
		case 4:
			sort();
			break;
		case 5:
			displayLL();
			break;
		
		
	}}while(choice != 8);
}
	
void init()
{
	NODE *start = NULL;
}
	
void create(int total_elm){
	int i, value;
	NODE *temp, *current;
	for (i = 0; i< total_elm; i++){
		printf("Enter the value to insert\n");
		scanf("%d", &value);
		temp = (NODE*)malloc(sizeof(NODE));
		temp -> data = value;
		temp -> next = NULL;
		if (start == NULL)
			start = temp;
		else
			for (current = start; current ->next != NULL; current = current -> next);
				current -> next = temp;
				
	}}

void search(int value){
	NODE *current;
	
	for (current = start; current != NULL; current = current -> next)
		if (current -> data == value){
			printf("Element found\n");
			return; 
			}
	printf("Element not found\n");
		
}

void sort(){
	NODE *currenti, *currentj;
	int temp;
	for(currenti = start; currenti != NULL; currenti = currenti -> next){
		for((currentj =  currenti -> next) ; currentj != NULL; currentj = currentj -> next)
			if ((currenti ->data) > (currentj ->data)){
				temp = currentj -> data;
				currentj -> data = currenti -> data;
				currenti -> data = temp;
			}
	}
}

void displayLL(){
	NODE *current;
	for(current = start; current !=  NULL ; current = current -> next )
		printf("%d -> ", current -> data);
	printf("NULL");
}