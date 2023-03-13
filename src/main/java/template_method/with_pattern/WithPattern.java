package template_method.with_pattern;

import java.util.HashMap;
import java.util.Map;

public class WithPattern {

    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "juan");
        data.put("age", "25");

        GenerateFile xml = new GenerateXMLEncrypted();
        xml.generateFile("xmlFile", data);

        System.out.println("======================================================");

        GenerateFile properties = new GeneratePropertiesCompacted();
        properties.generateFile("propertiesFile", data);
    }
}
