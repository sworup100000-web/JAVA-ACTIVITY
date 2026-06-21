import java.io.File;
import java.util.Scanner;

public class FileInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        File f = new File(name);

        if(f.exists()) {
            System.out.println("File Exists");
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());

            if(f.isFile())
                System.out.println("Type: File");
            else
                System.out.println("Type: Directory");

            System.out.println("Length: "
                    + f.length() + " bytes");
        }
        else {
            System.out.println("File does not exist");
        }
    }
}
