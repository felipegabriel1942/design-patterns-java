package template_method.no_pattern;

import java.util.Map;

public class GenerateFile {

    public void generateFile(String fileName, Map<String, Object> properties, FileType fileType) {
        System.out.println("Generating " + fileName + "...");

        StringBuilder fileBuilder = new StringBuilder();

        if (fileType.equals(FileType.XML)) {

            fileBuilder.append("<properties>");

            for (String prop : properties.keySet()) {
                fileBuilder.append("<" + prop + ">" + properties.get(prop) + "</" + prop + ">");
            }

            fileBuilder.append("</properties>");

        }

        if (fileType.equals(FileType.PROPERTIES)) {
            for (String prop : properties.keySet()) {
                fileBuilder.append(prop + "=" + properties.get(prop) + "\n");
            }
        }

        System.out.println(fileBuilder);

        if (fileType.equals(FileType.XML)) {
            System.out.println("encrypting ...");
        }

        if (fileType.equals(FileType.PROPERTIES)) {
            System.out.println("Compacting ...");
        }

        System.out.println(fileName + " generated!");

    }
}
