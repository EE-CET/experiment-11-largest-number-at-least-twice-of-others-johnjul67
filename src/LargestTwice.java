        import java.util.*;

        public class LargestTwice 
        {
                static 	int max(int[] arr,int n)
                {
                        if(n==1)
                                return 0;
                        int m=0;
                        for (int i=0;i<n;i++) 
                        {
                        if(arr[i]>=arr[m])
                                m=i;
                        }
                        return m;
                }
                static boolean largetwice(int[] arr,int n,int m)
                {
                        boolean flag=false;
                        if (n == 1)
                                flag=true;
                        for(int i=0;i<n;i++)
                        {
                                if(i!=m)
                                        if(arr[i]*2<=arr[m])
                                                flag=true;
                                        else
                                                flag=false;
                        }
                        return flag;
                }
                public static void main(String[] args)
                {
                        Scanner sc=new Scanner(System.in);
                        int n=sc.nextInt();
                        int arr[]=new int[n];
                        for(int i=0;i<n;i++)
                                arr[i]=sc.nextInt();
                        int m=max(arr, n);
                        if(largetwice(arr, n, m))
                                System.out.println(m);
                        else
                                System.out.println(-1);
                }
        }
