package com.xztie.compareversions;

/*
 * The CompareVersions class compares 2 version strings and
 * (1) return 1 if version1 > version2
 * (2) return -1 If version1 < version2
 * (3) otherwise, return 0
 *
 * Note that it assumes the input version string is valid, i.e.,
 * (1) it is non-empty
 * (2) it contains only digits and the 'dot' character
 * (3) it is an valid version string, i.e., "1." is not a valid version string
 *
 */
public class CompareVersions {
    private static final String SPLIT_REGEX = "\\.";
    private static final int LESS_THAN_RET = -1;
    private static final int GREATER_THAN_RET = 1;
    private static final int EQUAL_RET = 0;

    /**
     * this function assumes version1 and version2 are valid version strings.
     *
     * If this assumption is not held, we need to write additional function to
     * validate version1 and version2 first.
     *
     * @param version1, version string like 0.1.1
     * @param version2, version string like 1.2.10
     * @return 1 if version1 > version2, -1 if version1 < version2, 0 otherwise.
     */
    public static int compareTwoVersions(String version1, String version2) {

        String[] version1Splits = version1.split(SPLIT_REGEX);
        String[] version2Splits = version2.split(SPLIT_REGEX);

        int index = 0;
        while(index < version1Splits.length && index < version2Splits.length) {
            int v1 = Integer.parseInt(version1Splits[index]);
            int v2 = Integer.parseInt(version2Splits[index]);
            if (v1 < v2) {
                return LESS_THAN_RET;
            } else if (v1 > v2) {
                return GREATER_THAN_RET;
            }
            index ++;
        }
        if (index < version1Splits.length) {
            return GREATER_THAN_RET;
        } else if (index < version2Splits.length) {
            return LESS_THAN_RET;
        } else {
            return EQUAL_RET;
        }
    }
}
