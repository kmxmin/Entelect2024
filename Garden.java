// 13 April 2024    - sad

import java.util.*;
import java.math.*;
import java.io.*;

public class Garden{
    public static void main(String[] args){
        int int_random;
        int size =148;
        String output = "{\n\"Herbs\": [\n";
        String [] herbs = {"Basil","Rosemary","Mint","Lavender","Cilantro","Ginseng","Angelica","Patchouli","Valerian","Rue"};
        Random rand = new Random();



        for (int i= 1; i < size; ++i){
            int_random = rand.nextInt(11); // 0 means don't plant - don't write into the file

            if (int_random!=10){
                if (i<size){
                    output = output+" ["+i+", \""+herbs[int_random]+"\"],\n";
                }
                else{
                    output = output+" ["+i+", \""+herbs[int_random]+"\"]\n";
                }
            }
        }

        output = output +"],\n \"Sprinklers\": [\n ";
        output = output +"[7,13,20],\n [9,15,22],\n [11,17,24],\n [45,52,58],\n [47,53,60],\n [49,55,62],\n [51,57,64],\n [85,91,98],\n [87,93,100],\n [89,95,102],\n [130,137,143],\n [132,139,145],\n [134, 141, 147]\n";       
        output = output +" ]\n}";

        Garden.writeResult(output,"/Users/CrispyBacon/Library/CloudStorage/OneDrive-UniversityofCapeTown/Extras/Entelect Challenge/Upload 2.txt");
        
    }


public static void writeResult(String result,String fileName){
    try{
        FileWriter out = new FileWriter(fileName+true);
        out.write(result);
        out.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}