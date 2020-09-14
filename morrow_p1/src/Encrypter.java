import java.util.Scanner;

// Encrypter class
public class Encrypter {
    // Actual encrypt function
    public static String encrypt(String nums){
        // Inputting current integer string using for loop
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++){
            char cur_char = nums.charAt(i);
            arr[i] = Character.getNumericValue(cur_char);
        }
        // Change values of given integers
        for (int j = 0; j < 4; j++){
            int temp = arr[j];
            temp += 7;
            temp = temp % 10;
            arr[j] = temp;
        }
        // Swap string integers as specified
        // First swap index 1 and 3
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        // Then swap 2 and 4
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        int newVal = 0;
        for (int k = 0; k < 4; k++)
            newVal = newVal * 10 + arr[k];
        String output = Integer.toString(newVal);
        // In case first integer is 0
        if(arr[0] == 0)
            output = "0" + output;
        return output;
    }


    // Asks user for integer string and returns
    // encrypted value
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 4 digit integer to be encrypted:");
        String nums = sc.nextLine();
        // Call encrypt function
        String encryptNum = encrypt(nums);
        System.out.println(encryptNum);
    }
}
