import java.util.HashMap;
import java.util.Map;

public class TextServer implements FilerServer{

    private Map<String , String> data;

    public TextServer() {
        this.data = new HashMap<>();
    }

    @Override
    public String load(String fileName) throws Exception {
        return this.data.get(fileName);
    }

    @Override
    public void save(String fileName, String textToSave) {
        this.data.put(fileName, textToSave);
    }
    
    
}
