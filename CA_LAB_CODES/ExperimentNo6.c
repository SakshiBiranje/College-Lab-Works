#include<stdio.h>
#define MAX 100
typedef struct {
    int id;
    int deadline;
    int profit;
} Job;

void jobSequencing(Job arr[], int n);

int main() {
    int n, i;
    printf("Enter the number of jobs: ");
    scanf("%d", &n);
    Job arr[MAX];
    printf("Enter the job id, deadline, and profit for each job:\n");
    for(i = 0; i < n; i++) {
        printf("Job %d: ", i+1);
        scanf("%d %d %d", &arr[i].id, &arr[i].deadline, &arr[i].profit);
    }
    jobSequencing(arr, n);
    return 0;
}

void jobSequencing(Job arr[], int n) {
    int i, j;
    int max_deadline = 0;
    for(i = 0; i < n; i++) {
        if(arr[i].deadline > max_deadline) {
            max_deadline = arr[i].deadline;
        }
    }
    int result[max_deadline];
    for(i = 0; i < max_deadline; i++) {
        result[i] = -1;
    }
    int totalProfit = 0;
    for(i = 0; i < n; i++) {
        for(j = arr[i].deadline - 1; j >= 0; j--) {
            if(result[j] == -1) {
                result[j] = arr[i].id;
                totalProfit += arr[i].profit;
                break;
            }
        }
    }
    printf("The sequence of jobs with maximum profit is: ");
    for(i = 0; i < max_deadline; i++) {
        if(result[i] != -1) {
            printf("%d ", result[i]);
        }
    }
    printf("\nTotal profit: %d\n", totalProfit);
}
