Given an array of integer A with N length, find the maximum depth.

Given `P, Q, R` where `0 <= P < Q < R < N`

Depth can only be calculated when `A[P] > A[Q] < A[R]` and is calculated by getting the minimum `min(A[P] - A[Q], A[R] - A[Q])`

Example `int A[] = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3}`

Index `2, 3, 4` satisfies `A[2] > A[3] < A[4]` and therefore depth is calculated.
Index `2, 3, 5` satisfies `A[2] > A[3] < A[5]` and therefore depth is calculated.
Index `5, 7, 8` satisfies `A[5] > A[7] < A[8]` and therefore depth is calculated.

The solution that is required is to calculate the maximum depth of a non-empty array. Returns -1 if no depths are found.

On the example given `int A[]` would return `4` as maximum depth if calculated.

The solution should run on worst case,  O(N) times.
