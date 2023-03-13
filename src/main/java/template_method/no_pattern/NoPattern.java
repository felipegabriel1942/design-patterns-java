package template_method.no_pattern;

import java.util.HashMap;
import java.util.Map;

public class NoPattern {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "juan");
        data.put("age", "25");

        GenerateFile xml = new GenerateFile();
        xml.generateFile("xmlFile", data, FileType.XML);

        System.out.println("======================================================");

        GenerateFile properties = new GenerateFile();
        properties.generateFile("propertiesFile", data, FileType.PROPERTIES);
    }
}
