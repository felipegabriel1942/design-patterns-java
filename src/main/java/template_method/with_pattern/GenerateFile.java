package template_method.with_pattern;

import java.util.Map;

public abstract class GenerateFile {

    public final void generateFile(String fileName, Map<String, Object> properties) {
        System.out.println("Generating " + fileName + "...");
        String fileContent = generateContent(properties);
        System.out.println(fileContent);
        processFile();
        System.out.println(fileName + " generated!");
    }

    protected abstract String generateContent(Map<String, Object> properties);

    protected void processFile() {
        System.out.println("file don't have pos-processing...");
    }


}
