package io.github.ololx.leetcode.solutions.hard.task2296;

import io.github.ololx.leetcode.solutions.hard.task2296.Solution;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;

/**
 * project leetcode-solutions
 * created 16.12.2022 21:11
 *
 * @author Alexander A. Kropotin
 */
public class SolutionTest {

    private static final Logger log = Logger.getLogger(SolutionTest.class.getName());

    @Test
    public void removeElement_whenElementsWereRemoved_thenReturnCountOfStayingElements() {
        final var textEditor = new Solution.TextEditor(); // The current text is "|". (The '|' character represents the cursor)

        textEditor.addText("leetcode"); // The current text is "leetcode|".
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.deleteText(4))); // return 4
        // The current text is "leet|".
        // 4 characters were deleted.

        textEditor.addText("practice"); // The current text is "leetpractice|".
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.cursorRight(3))); // return "etpractice"
        // The current text is "leetpractice|".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "etpractice" is the last 10 characters to the left of the cursor.
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.cursorLeft(8))); // return "leet"
        // The current text is "leet|practice".
        // "leet" is the last min(10, 4) = 4 characters to the left of the cursor.
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.deleteText(10))); // return 4
        // The current text is "|practice".
        // Only 4 characters were deleted.
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.cursorLeft(2))); // return ""
        // The current text is "|practice".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "" is the last min(10, 0) = 0 characters to the left of the cursor.
        log.info(textEditor.toString());

        log.info(String.valueOf(textEditor.cursorRight(6))); // return "practi"
        // The current text is "practi|ce".
        // "practi" is the last min(10, 6) = 6 characters to the left of the cursor.

    }
}
