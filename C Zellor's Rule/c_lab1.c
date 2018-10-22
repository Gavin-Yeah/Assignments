/*
Ye Jiada 0952777 
this program is used to find the day of week according to the specific date
the algorithm is Zeller's Rule
*/
#include <stdio.h>
int main(){
int day,month,year,m,y,c,d,k,f,F;  //declaire variables used in program
printf("Enter day:");
scanf("%d",&day);  //promot user to input day on month
printf("Enter month:");
scanf("%d",&month);//promot user to input month
printf("Enter year:");
scanf("%d",&year);  // promot user to input year
if(month>2){ //the March to December is 1,2,3,4,5,6...10
m=month-2;
y=year;}
else if(month==1||month==2){  //Jan is 11, Feb is 12 ,but the year should subtract 1
m=month+10;
y=year-1;}
c=y/100;
d=y-c*100;
k=day;
f=k+((13*m-1)/5)+d+(d/4)+(c/4)-2*c;  //Zeller's Rule
F=f%7;
if(F<0){
F+=7;}
switch(month){    //Display the month
case 1: printf("January ");break;
case 2: printf("February ");break;
case 3: printf("March ");break;
case 4: printf("April ");break;
case 5: printf("May ");break;
case 6: printf("June ");break;
case 7: printf("July ");break;
case 8: printf("August ");break;
case 9: printf("September ");break;
case 10: printf("October ");break;
case 11: printf("November ");break;
case 12: printf("Decemver ");break;
}
printf("%d, %d is a ",day,year); // display the day and year 
switch(F){// display the day of week
case 0: printf("Sunday");break;
case 1: printf("Monday");break;
case 2: printf("Tuesday");break;
case 3: printf("Wednesday");break;
case 4: printf("Thursday");break;
case 5: printf("Friday");break;
case 6: printf("Saturday");break;
}
printf(".");
return 0;
}