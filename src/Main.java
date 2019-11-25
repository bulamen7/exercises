import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        int counter = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + counter + " imie");
            String name = sc.nextLine();
            names.add(name);
            String path = "C:\\Users\\Arkadiusz\\IdeaProjects\\untitled3" + File.separator + name + File.separator;

            Files.createDirectory(Paths.get(name));
            File txtFile = new File(path + name + ".txt");
            File docFile = new File(path + name + ".docx");
            File pdfFile = new File(path + name + ".pdf");
            File xlsxFile = new File(path + name + ".xlsx");

            if (!txtFile.createNewFile()) {
                System.err.println("error during creating txt file");
            }
            if (!docFile.createNewFile()) {
                System.err.println("error during creating doc file");
            }
            if (!pdfFile.createNewFile()) {
                System.err.println("error during creating txt file");
            }
            if (!xlsxFile.createNewFile()) {
                System.err.println("error during creating doc file");
            }
            counter++;
        }
        System.out.println(names);
    }

}
