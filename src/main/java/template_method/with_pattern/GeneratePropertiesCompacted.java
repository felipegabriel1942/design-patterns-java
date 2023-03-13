package template_method.with_pattern;

import java.util.Map;

public class GeneratePropertiesCompacted extends GenerateFile {
    @Override
    protected String generateContent(Map<String, Object> properties) {
        StringBuilder fileBuilder = new StringBuilder();

        for (String prop : properties.keySet()) {
            fileBuilder.append(prop + "=" + properties.get(prop) + "\n");
        }

        return fileBuilder.toString();
    }

    @Override
    protected void processFile() {
        System.out.println("Compacting ...");
    }
}
