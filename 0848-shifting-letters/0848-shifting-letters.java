class Solution {
    public String shiftingLetters(String s, int[] shifts) {

        StringBuilder result = new StringBuilder(s);

        int totalShift = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            totalShift = (totalShift + shifts[i]) % 26;

            char c = s.charAt(i);

            char shifted = (char) ((c - 'a' + totalShift) % 26 + 'a');

            result.setCharAt(i, shifted);
        }

        return result.toString();
    }
}