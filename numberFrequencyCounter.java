import java.util.Scanner;

public class numberFrequencyCounter {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.print("how much numbers you want to enter: ");
        int count = scanner.nextInt();

        int[] nums = new int[count];

       
        
        System.out.printf("Enter %d numbers: \n", count);
        for(int i = 0; i < count; i++){
            nums[i] = scanner.nextInt();
        }

        int mostFrequentNumber = nums[0];
        int highestFrequency = 0;
        int maxNumber = nums[0];
        int minNumber = nums[0];

        for(int i = 0; i < count; i++){
            int frequency = 1;

            boolean alreadyCounted = false;
            for(int j = 0; j < i; j++){
                if(nums[i] == nums[j]){
                    alreadyCounted = true;
                    break;
                }
            }

            if(!alreadyCounted){
                for(int j = i + 1; j < count; j++){
                    if(nums[i] == nums[j]){
                        frequency++;
                    }
                }
                System.out.printf("%d appears %d times\n", nums[i], frequency);

                
                if(frequency > highestFrequency){
                    highestFrequency = frequency;
                    mostFrequentNumber = nums[i];
                }
                
            }
            
            if(nums[i] > maxNumber){
                maxNumber = nums[i];
            }

            
            if(nums[i] < minNumber){
                minNumber = nums[i];
            }
            
        }
        System.out.println("The most frequent number is " + mostFrequentNumber);
        System.out.println("The largest number is " + maxNumber);
        System.out.println("The smallest number is " + minNumber);
    }
}
