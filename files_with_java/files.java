import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        addfile();
        System.out.println("------------------------");
        getFileInfo();
        System.out.println("------------------------");
        readFile();
        System.out.println("------------------------");
        wrtieFile();
        readFile();
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\ASametYildirim\\IdeaProjects\\workingWithFiles\\src\\students.txt");
        if(file.exists()){
            System.out.println("File name: "+ file.getName());
            System.out.println("Dosya yolu: "+ file.getAbsolutePath());
      		System.out.println("Can the file be written?: "+ file.canWrite());
            System.out.println("Can the file be read?: "+ file.canRead());
            System.out.println("File size (bytes): "+ file.length());
        }
    }


    public static void addfile(){
        File file = new File("C:\\Users\\ASametYildirim\\IdeaProjects\\workingWithFiles\\src\\students.txt");

        try{
            if(file.createNewFile()){
                System.out.println("Your file has been created");
            }else{
                System.out.println("You can't fool me, the file already exists.");
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\ASametYildirim\\IdeaProjects\\workingWithFiles\\src\\students.txt");
        try{
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void wrtieFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ASametYildirim\\IdeaProjects\\workingWithFiles\\src\\students.txt",true));
            writer.newLine();
            writer.write("ASametYildirim");
            System.out.println("Data added to file");
       writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
