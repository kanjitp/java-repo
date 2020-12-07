import java.io.PrintWriter;

public class Printwriter {

    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello file!");
        writer.println("More text");
        writer.close();
    }

    
}
