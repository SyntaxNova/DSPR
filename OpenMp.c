#include <stdio.h>
#include <omp.h>

int main() {

    int arr[100], n;
    int totalSum = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");

    for(int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    #pragma omp parallel
    {
        int localSum = 0;

        int id = omp_get_thread_num();
        int numThreads = omp_get_num_threads();

        int chunk = n / numThreads;

        int start = id * chunk;

        int end;

        if(id == numThreads - 1)
            end = n;
        else
            end = start + chunk;

        for(int i = start; i < end; i++) {
            localSum += arr[i];
        }

        printf("Processor %d calculated local sum = %d\n",
                id, localSum);

        #pragma omp critical
        {
            totalSum += localSum;
        }
    }

    printf("\nFinal Total Sum = %d\n", totalSum);

    return 0;
}
