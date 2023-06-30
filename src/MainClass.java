import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        int[] weight = new int[5];
        int[] height= new int[5];
        int maxHeight = 0;
        int maxHeightIndex = 0;
        int minHeight = 0;
        int minHeightIndex = 0;
        Scanner sc =  new Scanner(System.in);

        for (int i = 0; i<height.length; i++){
            //System.out.println((i+1)+"번쨰 친구의 를 입력해주세요\t");
            //weight[i] = sc.nextInt();
            System.out.println((i+1)+"번째 친구의 키를 입력해주세요\t");
            height[i] = sc.nextInt();
        }
        for(int i = 0; i<height.length; i++){
            if (maxHeight < height[i]){
                maxHeight = height[i];
                maxHeightIndex = i;
            }
        }
        System.out.println("키가 제일 큰 친구는 " +(maxHeightIndex+1)+"번쨰고 제일큰 키는 " + maxHeight + "cm입니다");

        /*for (int i = 0; i<weight.length; i++){
            System.out.println((i+1)+"번쨰 친구의 몸무게는" + weight[i]);
            System.out.println((i+1)+"번쨰 친구의 몸무게는" + height[i]);
        }*/

    }
}
