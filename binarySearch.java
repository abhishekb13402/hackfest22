import java.util.Scanner;

public class binary_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int a[] = new int[]{26,34,47,56,69,75,84,86,99,100,129,145};
        int low = 0;
        int high = a.length;
        System.out.print("Enter the element to be found");
        int se = sc.nextInt();


      while(low <= high){
            int mid = (high + low)/2;
            if(se == a[mid]){
                System.out.println("Element found at " + mid);
                break;
            }
            else if(se < a[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
      
        if(low > high){
            System.out.println("element does not exist");
        }

    }
}
