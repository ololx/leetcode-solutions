package io.github.ololx.leetcode.solutions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ProblemsTableGenerator {

    private static final String PROBLEM_NAME_REGEX = "^\\s\\*\\s\\d+";

    private static final String PROBLEM_NAME_DUMP_SYMBOLS = "\\s\\*\\s";

    private static final String LINK_PREFIX = "https://github.com/ololx/leetcode-solutions/tree/main/src/main/java/io/github/ololx/leetcode/solutions";

    public static void main(String[] args) throws IOException {
        List<Path> paths = Files.walk(Path.of(System.getProperty("user.dir") + "/src/main/java"))
                .filter(file -> file.toFile().isFile())
                .filter(file -> file.getParent().getFileName().toString().contains("task"))
                .filter(file -> !file.getFileName().toString().contains("ProblemsTableGenerator"))
                .collect(Collectors.toList());

        Pattern problemNameLinePattern = Pattern.compile(PROBLEM_NAME_REGEX);
        HyperLinkBuilder hyperLinkBuilder = new HyperLinkBuilder(LINK_PREFIX);
        StringBuilder tableContent = new StringBuilder();
        for (Path path : paths) {
            tableContent.append("    <tr>\n");

            String taskPackageName = path.getParent().getFileName().toString();
            tableContent.append("        <td>");
            tableContent.append(taskPackageName.substring(4, taskPackageName.length()));
            tableContent.append("</td>\n");

            String problemName = Files.readAllLines(path)
                    .stream()
                    .filter(line -> problemNameLinePattern.matcher(line).find())
                    .findAny()
                    .orElse("0. UNKNOWN")
                    .replaceAll(PROBLEM_NAME_DUMP_SYMBOLS, "");
            tableContent.append("        <td>");
            tableContent.append(problemName);
            tableContent.append("</td>\n");

            String levelPackageName = path.getParent().getParent().getFileName().toString();
            tableContent.append("        <td>");
            tableContent.append(
                    hyperLinkBuilder.build(
                            levelPackageName,
                            taskPackageName,
                            path.getFileName().toString()
                    )
            );
            tableContent.append("</td>\n");

            tableContent.append("        <td>");
            tableContent.append(levelPackageName);
            tableContent.append("</td>\n");

            tableContent.append("    </tr>\n");
        }

        System.out.println(tableContent.toString());
    }

    private static final class HyperLinkBuilder {

        private final String linkPrefix;

        HyperLinkBuilder(String linkPrefix) {
            this.linkPrefix = Objects.requireNonNull(linkPrefix);
        }

        public String build(String levelPackageName, String taskPackageName, String fileName) {
            return String.format(
                    "<a href=\"%s/%s/%s/%s\">%s</a>",
                    this.linkPrefix,
                    levelPackageName,
                    taskPackageName,
                    fileName,
                    fileName.substring(0, fileName.length() - 5)
            );
        }
    }
}
