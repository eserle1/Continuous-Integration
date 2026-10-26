package mmu.quotes;

import org.yaml.snakeyaml.Yaml;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class YamlQuoteReader implements QuoteReader {
    private String filePath;

    public YamlQuoteReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Map<String, Object>> readQuotes() throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = new FileInputStream(filePath)) {
            return yaml.load(inputStream);
        }
    }
}
