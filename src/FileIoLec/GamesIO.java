package FileIoLec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class GamesIO {
    public static void main(String[] args) throws IOException
    {
//        the pathfinder starts from the project directory
        Path path = Paths.get("data","games.txt");
        System.out.println(Files.exists(path));




    }
}
