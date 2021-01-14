import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int numPN = 0;
        int numR = 0;
        int numD = 0;
        File santako = new File("src/santako.txt");
        Scanner in = new Scanner(santako);
        Pattern papaNoel = Pattern.compile("\\*<]:-DOo");
        Pattern reno = Pattern.compile(">:o\\)");
        Pattern duende = Pattern.compile("[^\\*]<]:-D");
        while(in.hasNextLine()){
            numD=0;
            numPN=0;
            numR=0;
            String casita = in.nextLine();
            Matcher mNoel = papaNoel.matcher(casita);
            Matcher mReno = reno.matcher(casita);
            Matcher mDuende = duende.matcher(casita);
            while(mNoel.find()) {
            numPN++;
            }

            while(mReno.find()){
                numR++;
            }
            while(mDuende.find()){

                numD++;
            }

            if(numPN>0){
            System.out.print("Papa Noel("+numPN+")");
            }
            if(numR>0) {
                System.out.print("Reno(" + numR + ")");
            }
            if(numD>0) {
                System.out.println("Duende(" + numD + ")");
            }
            System.out.println(" ");
            if(numD==0 && numPN==0 && numR==0){
                System.out.println(" ");
            }
            }


        }




    }

