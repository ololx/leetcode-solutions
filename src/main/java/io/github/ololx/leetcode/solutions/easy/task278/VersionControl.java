package io.github.ololx.leetcode.solutions.easy.task278;

/**
 * project leetcode-solutions
 * created 10.02.2022 17:43
 *
 * @author Alexander A. Kropotin
 */
public class VersionControl {

    private final int badVersionNumber;

    public VersionControl(int badVersionNumber) {
        this.badVersionNumber = badVersionNumber;
    }

    boolean isBadVersion(int version) {
        boolean isBadVersion = this.badVersionNumber <= version;
        System.out.printf("call isBadVersion(%s) -> %s\n", version, isBadVersion);

        return isBadVersion;
    }
}
