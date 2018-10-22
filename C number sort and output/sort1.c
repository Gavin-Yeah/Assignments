/*Jiada Ye
This program prompt users to choose the ascending order or descending order to sort the txt file they choose and
 store the sorted txt into a users' appointed file*/
 
#include <stdio.h>
#define maxsize 500

int LoadData(int a[maxsize], char* filename);
void SaveData(int a[maxsize], int length, char* filename);
void sort(int *a, int left, int right);
void ReverseSaveData(int a[maxsize], int length, char* filename);

int main(){
char origname[100],savename[100];
char choice[1];
char *A="A";
char *D="D";
int lastdata;
int data[maxsize];

printf("Please enter your data file name: ");
scanf("%s",&origname);
LoadData(data, origname);
lastdata=LoadData(data,origname);
printf("Please tell me sort order (A-Ascending, D-Descending):");
scanf("%s",choice);
while(!((*choice)==*A||(*choice)==*D)){
printf("Please tell me sort order (A-Ascending, D-Descending):");
scanf("%s",choice);}
printf("\nOk, I will start doing sorting for you...\n");
sort(data,0,lastdata);
printf("I am done.\n");
printf("Your result is saved in the data file:");
scanf("%s",&savename);
if((*choice)==*A){
SaveData(data,lastdata+1,savename);
}
else{
ReverseSaveData(data,lastdata+1,savename);
}

printf("Thank you, Bye!");
return 0;
}

int LoadData(int a[maxsize], char* filename){
/* load a data file into an array 
 return size of the array,  if -1, failed
 maxsize = 100
 if the data file has more than 100 integers, it 
 only read first 100 integers */
int i = 0;
FILE *fp;
fp = fopen (filename,"r");
if(fp != NULL){
	while (fscanf(fp, "%d", &a[i]) != EOF && i < maxsize){
		i++;
	}
	fclose (fp);
	return i; } return -1;/*reading data file failed*/ }
void SaveData(int a[maxsize], int length, char* filename){ 
      int i = 0; 
      FILE* fp;
      fp = fopen (filename,"w");
       if(fp != NULL){
	do {
		fprintf(fp, "%d ", a[i]); 
		i++;
	}while (i < length);
	fclose (fp);
}
}
void sort(int *a, int left, int right){
    if(left >= right){
        return ; 
        } int i = left; int j = right; int key = a[left];
        while(i < j)
    {
        while(i < j && key <= a[j]){
            j--;
        }
        a[i] = a[j];
        while(i < j && key >= a[i]){
            i++;
        }
        a[j] = a[i];
    }
    a[i] = key;
    sort(a, left, i - 1);
    sort(a, i + 1, right);
}
void ReverseSaveData(int a[maxsize], int length, char* filename){
int i = length-1;   
FILE* fp;
fp = fopen (filename,"w");
if(fp != NULL){
	do {
		fprintf(fp, "%d ", a[i]); 
		i--;
	}while (i >= 0);
	fclose (fp);
}
}

