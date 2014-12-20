import java.util.*;

public class Depth
{
    public static int[] A = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
    public static int max= -1;

    public static void main(String[] args)
    {
        Depth.solution(Depth.A);

        System.out.println("Depth is " + Depth.max);
    }

    public static void solution(int[] A)
    {
        int P, Q, R;
        int depth = -1;

        P = 0;
        Q = 1;
        R = 2;

        if (Q >= A.length || P >= A.length) { return; }

        while (R < A.length)
        {
            if (A[P] <= A[Q] && A[Q] <= A[R]) /* sloping upwards or is a plateau */
            {
                P = R;
                Q = R+1;
                R++;
                continue;
            }

            if (A[P] > A[Q] && A[Q] >= A[R]) /* sloping downwards */
            {
                R++;

                if (R >= A.length) break;

                if (A[R] > A[R - 1]) /* you found the crease */
                {
                    Q = R - 1;
                }
            }

            if (A[P] > A[Q] && A[Q] < A[R]) /* there's hope! */
            {
                depth = Math.min(A[P] - A[Q], A[R] - A[Q]);

                if (depth > Depth.max) { Depth.max = depth; }

                R++;

                if (R >= A.length) break;

                if (A[R] < A[R - 1]) /* found the end of crease */
                {
                    P = R - 1;
                    Q = R;
                    R = R + 1;
                }

                continue;
            }
        }
    }
}
