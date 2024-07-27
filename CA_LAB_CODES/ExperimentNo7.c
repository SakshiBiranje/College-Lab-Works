#include <stdio.h>
#include <stdlib.h>

int optimalMerge(int arr[], int n) {
    int cost = 0; 
    int i, j;

    while (n > 1) {
       
        int smallest1 = 0, smallest2 = 1;
        for (i = 0; i < n; i++) {
            if (arr[i] < arr[smallest1])
                smallest1 = i;
            else if (arr[i] < arr[smallest2])
                smallest2 = i;
        }

        cost += arr[smallest1] + arr[smallest2];
        arr[smallest1] += arr[smallest2];

        for (j = smallest2; j < n - 1; j++)
            arr[j] = arr[j + 1];

        n--;
    }
    return cost;
}

int main() {
    int arr[] = {5,10,20,30,30};
	int n = 5;
    printf("Optimal merge cost is %d\n", optimalMerge(arr, n));

    return 0;
}
