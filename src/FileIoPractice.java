import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIoPractice {

    public static String readFile(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get("/Users/jacob.k.valeriano/IdeaProjects/codeup-java-exercises/fileIo/people.txt")));
        return data;
    }

    public static void main(String[] args) throws Exception
    {
        ArrayList<String> breakoutRoom = new ArrayList<String>();
        breakoutRoom.add("Javier");
        breakoutRoom.add("Jacob");
        breakoutRoom.add("Colin");
        breakoutRoom.add("William");
        breakoutRoom.add("Jeanette");

        System.out.println(breakoutRoom);



        int i=0;
        String filename="people.txt";
        Path pathToFile = Paths.get(filename);
        System.out.println(pathToFile.toAbsolutePath());
        String data = readFile("/Users/jacob.k.valeriano/IdeaProjects/codeup-java-exercises/fileIo/people.txt");
        System.out.println(data + "works at Codeup");
    }


//        Path txtPath = Paths.get("codeup-java-exercises", "fileIo", "people.txt");
//
//        System.out.println(txtPath);
//        System.out.println(txtPath.toAbsolutePath());
////
//
//        Path p = Paths.get("/Users/jacob.k.valeriano/IdeaProjects/codeup-java-exercises/codeup-java-exercises/fileIo/people.txt");
//        List<String> lines = new ArrayList<>();

}