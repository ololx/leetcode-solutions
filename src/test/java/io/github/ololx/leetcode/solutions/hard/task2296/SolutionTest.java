package io.github.ololx.leetcode.solutions.hard.task2296;

import io.github.ololx.leetcode.solutions.hard.task2296.Solution;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.logging.Logger;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
        // The current text is "|". (The '|' character represents the cursor)
        final var textEditor = new Solution.TextEditor();

        // The current text is "leetcode|".
        textEditor.addText("leetcode");
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "leetcode|");

        // return 4
        assertEquals(textEditor.deleteText(4), 4);

        // The current text is "leet|".
        // 4 characters were deleted.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "leet|");

        // The current text is "leetpractice|".
        textEditor.addText("practice");
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "leetpractice|");

        // return "etpractice"
        assertEquals(textEditor.cursorRight(3), "etpractice");

        // The current text is "leetpractice|".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "etpractice" is the last 10 characters to the left of the cursor.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "leetpractice|");

        // return "leet"
        assertEquals(textEditor.cursorLeft(8), "leet");

        // The current text is "leet|practice".
        // "leet" is the last min(10, 4) = 4 characters to the left of the cursor.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "leet|practice");

        // return 4
        assertEquals(textEditor.deleteText(10), 4);

        // The current text is "|practice".
        // Only 4 characters were deleted.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "|practice");

        // return ""
        assertTrue(textEditor.cursorLeft(2).isEmpty());

        // The current text is "|practice".
        // The cursor cannot be moved beyond the actual text and thus did not move.
        // "" is the last min(10, 0) = 0 characters to the left of the cursor.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "|practice");

        // return "practi"
        assertEquals(textEditor.cursorRight(6), "practi");

        // The current text is "practi|ce".
        // "practi" is the last min(10, 6) = 6 characters to the left of the cursor.
        log.info(textEditor.toString());
        assertEquals(textEditor.toString(), "practi|ce");
    }
}
