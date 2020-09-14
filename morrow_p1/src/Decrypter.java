import java.util.Scanner;

// Decrypter class
public class Decrypter {
    // Decrypt function
    public static String decrypt(String nums){
        // Inputting integer string given to array
        int[] arr= new int[4];
        for (int i = 0; i < 4; i++){
            char cur_char = nums.charAt(i);
            arr[i] =Character.getNumericValue(cur_char);
        }
        // Swapping values as specified
        // Same code as enrypter because values
        // return to original index if run again
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;
        // Decrypting values using switch cases and for loop
        for (int j = 0; j < 4; j++){
            int digit = arr[j];
            switch (digit) {
                case 0 -> arr[j] = 3;
                case 1 -> arr[j] = 4;
                case 2 -> arr[j] = 5;
                case 3 -> arr[j] = 6;
                case 4 -> arr[j] = 7;
                case 5 -> arr[j] = 8;
                case 6 -> arr[j] = 9;
                case 7 -> arr[j] = 0;
                case 8 -> arr[j] = 1;
                case 9 -> arr[j] = 2;
            }
        }
        int newVal = 0;
        for(int k = 0; k < 4; k++)
            newVal = newVal * 10 +arr[k];
        String output = Integer.toString(newVal);
        // In case starts with 0
        if(arr[0] == 0)
            output = "0" + output;
        return output;
    }
    // Asks for integer string, returns given
    // string decrypted
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter 4 digit integer to be decrypted:");
        String nums = sc.nextLine();
        // Calls decrypt function
        String decryptNum = decrypt(nums);
        System.out.println(decryptNum);
    }
}
