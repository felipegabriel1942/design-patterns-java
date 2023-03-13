package template_method.with_pattern;

import java.util.Map;

public class GenerateXMLEncrypted extends GenerateFile {

    @Override
    protected String generateContent(Map<String, Object> properties) {
        StringBuilder fileBuilder = new StringBuilder();

        fileBuilder.append("<properties>");

        for (String prop : properties.keySet()) {
            fileBuilder.append("<" + prop + ">" + properties.get(prop) + "</" + prop + ">");
        }

        fileBuilder.append("</properties>");


        return fileBuilder.toString();
    }

    @Override
    protected void processFile() {
        System.out.println("encrypting ...");
    }
}
