package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C://Users//user//IdeaProjects//iocalculator//input.txt"))
        {
            BufferedReader reader = new BufferedReader(fr);
            var lnr = new LineNumberReader(reader);
            int count = 0;
            while (lnr.readLine() != null) {
                if (lnr.readLine() == "") continue;
                count++;
            }
            String[] strarr = new String[count];
            // читаем построчно
            String line = reader.readLine();
            int num = 0;
            while (line != null) {
                if(!line.equals("")) {strarr[num]=line; num++;}
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            for(int i = 0; i<count; i++){

                System.out.println(strarr[i]);
            }
            try(FileOutputStream fos=new FileOutputStream("C://Users//user//IdeaProjects//iocalculator//output.txt");
                PrintStream printStream = new PrintStream(fos))
            {
                for (int i = 0; i < count; i++)
                {
                    printStream.println(strarr[i]+ " = " + Calculator.resolve(strarr[i]));
                    System.out.println("Запись в файл произведена");
                }
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
    class Calculator{
    static String resolve(String str){

        String[] arr = str.split(" ");
        boolean flag = false;
        try  {
            if(str.length()<5) throw new Exception("Error! Not number");
            char[] fstnum = arr[0].toCharArray();
            for (int i = 0; i < fstnum.length; i++) {
                if (!Character.isDigit(fstnum[i])) {
                    {flag = true; break;}
                }
            }
            if(flag) throw new Exception("Error! Not number");
            char[] lastnum = arr[2].toCharArray();
            for (int i = 0; i < lastnum.length; i++) {
                if (!Character.isDigit(lastnum[i])) {
                    {flag = true; break;}
                }
            }
            if(flag) throw new Exception("Error! Not number");
            if(!arr[1].equals("+")&&!arr[1].equals("-")&&!arr[1].equals("*")&&!arr[1].equals("/")) throw new Exception("Operation Error!");
            if(arr[2].equals("0")&&arr[1].equals("/")) throw new Exception("Error! Division by zero");
        }
        catch (Exception e){
            return e.getMessage();
        }
        if(arr[1].equals("+")) return String.valueOf((double)Integer.parseInt(arr[0])+Integer.parseInt(arr[2]));
        else if(arr[1].equals("-")) return String.valueOf((double)Integer.parseInt(arr[0])-Integer.parseInt(arr[2]));
        else if(arr[1].equals("*")) return String.valueOf((double)Integer.parseInt(arr[0])*Integer.parseInt(arr[2]));
        else return String.valueOf((double)Integer.parseInt(arr[0])/Integer.parseInt(arr[2]));


    }
    }

