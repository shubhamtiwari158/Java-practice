    
    import java.util.Scanner;

public class TrappedRainwater {


    public int trap(int[] height) {
        int n=height.length;
        //leftMax calculate
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){//[0,1,0,2,1,0,1,3,2,1,2,1]
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
           
            // System.out.println("left max:"+leftMax[i]);
        } 
        //RightMax calculate
        int RightMax[] = new int[n];
        RightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            RightMax[i] =Math.max(height[i],RightMax[i+1]);
            // System.out.println("right max:"+RightMax[i]);
        }
        //  4,2,0,3,2,5
        //loop
        int trapped =0;
        for(int i=0; i<n; i++){
            //waterlevel calculate
            int WaterLevel=Math.min(leftMax[i],RightMax[i]); 
            // System.out.println("waterlevel:"+WaterLevel);
            //trappedwater calculaterd
            trapped +=Math.max(0, WaterLevel - height[i]);
        }
        return trapped;
    }
    public static void main(String agrs []){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int height[] = new int [n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        TrappedRainwater  sol = new TrappedRainwater ();

        System.out.print("traped water:"+sol.trap(height));

    }
}

