import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        File santako = new File("src/santako.txt");
        Scanner in = new Scanner(santako);
        int index = 0;
        String Noel= "*<]:-DOo";
        String reno=">:o)";
        String duende="<]:-D";

        int pn=0;
        int r = 0;
        int d =0;


        while(in.hasNextLine()){
        String linea= in.nextLine();
        String linea2;
        pn=0;
        r=0;
        d=0;



        if(linea.contains(Noel)){
            pn++;
            index = linea.indexOf(Noel);
            linea2 = linea.substring(index);
            while(index != -1){
                linea2 = linea2.substring(index);
                if (linea2.contains(Noel)){
                    pn++;
                    index = linea2.indexOf(Noel)+1;
                }
                else{
                    break;
                }
            }

        }
            if(linea.contains(reno)){
                r++;
                index = linea.indexOf(reno);
                linea2 = linea.substring(index);
                while(index != -1){
                    linea2 = linea2.substring(index);
                    if (linea2.contains(reno)){
                        r++;
                        index = linea2.indexOf(reno)+1;
                    }
                    else{
                        break;
                    }
                }

            }
            if(linea.contains(duende)){
                d++;
                index = linea.indexOf(duende);
                linea2 = linea.substring(index);
                while(index != -1){
                    linea2 = linea2.substring(index);
                    if (linea2.contains(duende)){
                        d++;
                        index = linea2.indexOf(duende)+1;

                    }
                    else{
                        break;
                    }

                }
                d=d-pn;
            }




        index =0;

            if(pn>0){
                System.out.print("Papa Noel("+pn+")");
            }
            if(r>0){
                System.out.print("Reno("+r+")");
            }
            if (d>0){

                System.out.println("Duende("+d+")");
            }
            System.out.println(" ");
            if(d==0 && pn==0 && r==0){
                System.out.println(" ");
            }

    }
}
}
