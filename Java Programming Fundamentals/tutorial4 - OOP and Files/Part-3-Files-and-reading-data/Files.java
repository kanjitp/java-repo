import java.util.*;
import java.nio.file.Paths;

public class Files {
    public static void main(String[] args) {   
        try {
            Scanner sc = new Scanner(Paths.get("plist.xml"));
            while (sc.hasNextLine()) {
                String row = sc.nextLine();
                if(row.contains("<Row>")) {
                    ArrayList<String> elements = new ArrayList<>();
                    String nextRow = sc.nextLine();
                    while (!nextRow.contains("</Row>")) {
                        elements.add(nextRow);
                        nextRow = sc.nextLine();
                    }
                    for (String element : elements) {
                        element = element.replaceAll(" <Cell><Data ss:Type=\"String\">", "");
                        element = element.replaceAll(" <Cell><Data ss:Type=\"Number\">", "");
                        element = element.replaceAll("</Data></Cell>", ""); 
                        System.out.printf(element + " ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
