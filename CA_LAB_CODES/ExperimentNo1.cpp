#include<stdio.h>
#include<time.h>
int main()
{
    time_t   t1,t2;
    int i,low,high,mid,n,key,array[100];
    printf("Enter number of elements");
    scanf("%d",&n);
    printf("Enter %d integers",n);
    time(&t1);
    for(i=0;i<n;i++)
    scanf("%d",&array[i]);
    printf("Enter the value of find");
    scanf("%d",&key);

    for(i=0;i<10000;i++)
    {
    }
    low=0;high=n-1;
    mid=(low+high)/2;
    while(low<=high)
    {
        if(array[mid]<key)
        low=mid+1;
        else if(array[mid]==key)
        {
            printf("%d found at location %d\n",key,mid+1);
            break;
        }
        else
        high=mid+1;
        mid=(low+high)/2;
    }
    if(low>high)
    printf("not found! %d isn't present in the list.n",key);
    time(&t2);
    printf("The difference between the time is %2f\n",difftime(t2 , t1));
    return 0;
}