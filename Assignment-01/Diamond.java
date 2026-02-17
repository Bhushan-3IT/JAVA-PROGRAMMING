import java.util.Scanner;
public class Diamond {

    static void method2(int size){
         int mid=(size+1)/2;
         for(int i=1;i<=mid;i++){
             for(int sp=1;sp<=mid-i;sp++){
                 System.out.print(" ");
             }
             System.out.print("X");
             if(i>1){
                 for(int isp=mid-i+2;isp<mid+i-1;isp++){
                     System.out.print(" ");
                 }
                 System.out.print("X");
             }
             System.out.println();
         }
         for(int i=1;i<mid;i++){
             for(int sp=1;sp<=i;sp++){
                 System.out.print(" ");
             }
             System.out.print("X");
             if(i<mid-1){
                 for(int isp=i+2;isp<=size-1-i;isp++) {
                     System.out.print(" ");
                 }
                 System.out.print("X");
             }

             System.out.println();


         }


    }

    static void method1(int size){
        int n = size / 2 + 1;

        for(int i=1;i<=n;i++){
            for(int sp=n-i;sp>=1;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }

            for(int j=2*i-1;j>=1;j--){
                if(j==1 || j==2*i-1){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
      System.out.println();
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter size:");
        int size =input.nextInt();

        method1(size);
        method2(size);

    }

}
