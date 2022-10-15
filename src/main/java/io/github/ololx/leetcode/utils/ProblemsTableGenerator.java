package io.github.ololx.leetcode.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ProblemsTableGenerator {

    private static final String PROBLEM_NAME_REGEX = "^\\s\\*\\s\\d+";

    private static final String PROBLEM_NAME_DUMP_SYMBOLS = "\\s\\*\\s";

    private static final String GIT_LINK = "https://github.com/ololx/leetcode-solutions/tree/main";

    private static final String LEETCODE_LINK = "https://leetcode.com/problems";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Path projectDirectoryPath = Path.of(System.getProperty("user.dir"));

        List<Path> paths = Files.walk(Path.of(projectDirectoryPath.toString(), "/src/main/java"))
                .filter(file -> {
                    return file.toFile().isFile()
                            && file.getFileName().toString().contains("Solution")
                            && !file.getFileName().toString().contains("ProblemsTableGenerator");
                })
                .sorted((file1, file2) -> {
                    final String file1Name = file1.getParent()
                            .getFileName()
                            .toString()
                            .replaceAll("task", "");
                    final String file2Name = file2.getParent()
                            .getFileName()
                            .toString()
                            .replaceAll("task", "");

                    return Integer.valueOf(file1Name).compareTo(Integer.valueOf(file2Name));
                })
                .collect(Collectors.toList());

        Pattern problemNameLinePattern = Pattern.compile(PROBLEM_NAME_REGEX);
        StringBuilder tableContent = new StringBuilder();
        int orderNumber = 0;

        for (Path path : paths) {
            tableContent.append("    <tr>\n");

            tableContent.append("        <td>");
            tableContent.append(++orderNumber);
            tableContent.append("</td>\n");

            String problemName = Files.readAllLines(path)
                    .stream()
                    .filter(line -> problemNameLinePattern.matcher(line).find())
                    .findAny()
                    .orElse("0. UNKNOWN")
                    .replaceAll(PROBLEM_NAME_DUMP_SYMBOLS, "");
            tableContent.append("        <td>");
            tableContent.append(createLeetcodeHyperLink(LEETCODE_LINK, problemName));
            tableContent.append("</td>\n");

            String taskPackageName = path.getParent()
                    .getFileName()
                    .toString();
            String levelPackageName = path.getParent()
                    .getParent().getFileName()
                    .toString();
            tableContent.append("        <td>");
            tableContent.append(
                    createGithubFileHyperLink(GIT_LINK, projectDirectoryPath.relativize(path))
            );
            tableContent.append("</td>\n");

            tableContent.append("        <td>");
            tableContent.append(levelPackageName.toUpperCase());
            tableContent.append("</td>\n");

            tableContent.append("    </tr>\n");
        }

        File readmePattern = loadReadmePattern(projectDirectoryPath);
        List<String> readmeLines = Files.readAllLines(readmePattern.toPath())
                .stream()
                .map(line -> {
                    if (!line.contains("{problems}")) {
                        return line;
                    }

                    return line.replaceAll("\\{problems\\}", tableContent.toString());
                })
                .collect(Collectors.toList());
        System.out.println(readmeLines);
        Files.write(Path.of(System.getProperty("user.dir"), "/README.md"), readmeLines);
    }

    public static String createGithubFileHyperLink(String linkPrefix, Path filePath) {
        final String fileName = filePath.getFileName().toString();

        return String.format(
                "<a href=\"%s/%s\">%s</a>",
                linkPrefix,
                filePath,
                fileName.replaceAll("\\.java", "")
        );
    }

    public static String createLeetcodeHyperLink(String linkPrefix, String problemName) {
        final String title = problemName.replaceAll("\\d+\\.\\s|'", "");
        final String urlEnd = title.toLowerCase().replaceAll("\\s", "-");
        return String.format(
                "<a href=\"%s/%s\">%s</a>",
                linkPrefix,
                urlEnd,
                title
        );
    }

    public static File loadReadmePattern(Path projectDirectoryPath) {
        File resource = Path.of(projectDirectoryPath.toString(), "/src/main/java/resources/README_PATTERN.md").toFile();

        if (!resource.exists()) {
            throw new IllegalArgumentException("Readme pattern file not found");
        }

        return resource;
    }
}
