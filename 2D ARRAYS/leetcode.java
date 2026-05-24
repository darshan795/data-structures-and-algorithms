import java.util.*;

public class leetcode{
    
    

    public static void print(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static void matrix_multiplication(int arr1[][],int arr2[][]){
            
    }
  
    public static void lc48(int arr[][]){
        print(arr);
        int  n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=temp;

            }
        }
        print(arr);
        transposetransform(arr);
        print(arr);
    }


    public static void transposetransform(int arr[][]){
        int a=arr.length;
        int b=arr.length;
        System.out.println(a+b);
       
          for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                if(j>i){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                                }
            }
        }
         for(int i=0;i<b;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        
    }

    public static void lc867(int arr[][]){
        int arr1[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=arr[j][i];
            }

        }
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.println(arr1[i][j]);
            }

        }
        



    }
      public static void waveprinting(int arr[][]){
        System.out.println("darshan");
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                    
                }else{
                    System.out.print(arr[i][n-j-1]+" ");
                }
            }
        }
        
    }
    public static void lc54(int arr[][]){
        int n=arr.length;
        int m=arr[0].length;
        int minr=0;
        int maxr=n-1;
        int minc=0;
        int maxc=m-1;
        int count=0;
        int no=m*n;
        while(minr<=maxr && minc<=maxc){
            for(int i=minc;i<=maxc && count<no;i++){
                System.out.print(arr[minr][i]);
            }minr++;
            for(int i=minr;i<=maxr && count<no;i++){
                System.out.print(arr[i][maxc]);
            }maxc--;
            for(int i=maxc;i>=minc && count<no;i--){
                System.out.print(arr[maxr][i]);
            }maxr--;
            for(int i=maxr;i>=minr && count<no;i--){
                System.out.print(arr[i][minc]);
            }minc++;
        }
        
             
    }
    public static int[][] lc59(int n){
        int arr[][]=new int[n][n];
        int counter=1;
        int minr=0,minc=0;
        int maxr=n-1,maxc=n-1   ;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //for left to right
                for(int k=minc;k<=maxc && counter<=n*n;k++){
                    arr[minr][k]=counter;
                    counter++;

                }minr++;

                //for down 
                for(int k=minr;k<=maxr && counter<=n*n;k++){
                    arr[k][maxc]=counter;
                    counter++;
                }maxc--;
                //right to left
                for(int k=maxc;k>=minc && counter<=n*n;k--){
                    arr[maxr][k]=counter;
                    counter++;



                }maxr--;
                for(int k=maxr;k>=minr && counter<=n*n;k--){
                    arr[k][minc]=counter;
                    counter++;

                }minc++;

                
            }
        }
        return arr;

    }
    public static ArrayList<Integer> lc119(int n){
        ArrayList<ArrayList<Integer>>list=new ArrayList();
        ArrayList<Integer>list1=new ArrayList();

        for(int i=0;i<=n;i++){
            list.add(new ArrayList());
            for(int j=0;j<i+1;j++){
                list.get(i).add(0);
            
          
            }
        }

        for(int i=0;i<=n;i++){
            for(int j=0;j<i+1;j++){
                if(i==j || j==0){
                    list.get(i).set(j,1);
                }else{
                    list.get(i).set(j,list.get(i-1).get(j)+list.get(i-1).get(j-1));
                }
            }
        }
    System.out.println(list);
        

        
       

        return list.get(n);
    
        
    }
    public static int   lc861(int[][]arr){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            if(arr[i][0]==0){
                for(int j=0;j<m;j++){
                    if(arr[i][j]==0)arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        print(arr);
        System.out.println("printing the second array");
        //let's do the second  part of the  question that is 
        for(int j=0;j<m;j++){
            int noo=0,noz=0;
            for(int i=0;i<n;i++){
                if(arr[i][j]==0)noz++;
                else noo++;
                
            }
            if(noz>noo){
                for(int i=0;i<n;i++){
                    if(arr[i][j]==0)arr[i][j]=1;
                    else arr[i][j]=0;
                }

            }
        }
        print(arr);
        //now the third part that is binary conversion of the decimals in the array
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                double power=Math.pow(2,m-j-1);
                sum+=arr[i][j]*power;


            }
        }

        return sum;
    }
  public static boolean lc240(int[][] arr,int target){
    int n=arr.length;
    int m=arr[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==target){
                return true;
            }
        }
    }
    
    return false;


  }
  public static boolean lc240ii(int[][]arr,int target){
    int n=arr.length;
    int m=arr[0].length;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==target)return true;
            if(arr[i][j]>target)break;


        }

    }
    return false;
  }
  public  static int max(int i,int j){
    if(i<j){
        return i;
    }else{
        return j;
    }
  }
  public static int lc11(int[] arr){
    int n=arr.length;
    int maxArea=0;
    for(int i=0;i<n;i++){
    for(int j=i;j<n;j++){
        int maxh=max(arr[i],arr[j]);
        System.out.println(j-i+1);
        int area=maxh*(j-i);
        if(area>maxArea){
            maxArea=area;
            
        }

        

     

    }
    
}


    return maxArea; 

  }
  public static int lc11II(int[] arr){
    int i=0;
    int j=arr.length-1;
     int maxArea=0;
    while(i<j){
         int maxh=max(arr[i],arr[j]);
        int area=maxh*(j-i);
        if(area>maxArea){
            maxArea=area;
        }
        i++;
    
         
    }

    return maxArea;
  }
    
    public static void main(String[]args){
        System.out.println("hello world.");
        // ArrayList<Integer>list=lc119(0  );
        // System.out.println(list);

        // int[][] arr= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        // print(arr);
        // //to solve this  lc861 question..
        // System.out.println("printing the new array here!!");
        // int result=lc861(arr);
        // System.out.println(result);
     
        int[] arr={1,8,6,2,5,4,8,3,7};
        int result=lc11II(arr);
        System.out.println("this is the result");
        System.out.println(result)  ;
        //this is the container with most water
        


        
    }
}