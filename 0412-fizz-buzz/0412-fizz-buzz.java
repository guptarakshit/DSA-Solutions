class Solution {
    public List<String> fizzBuzz(int n) {

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            int num = i + 1;

            if (num % 15 == 0) {
                answer[i] = "FizzBuzz";
            }
            else if (num % 3 == 0) {
                answer[i] = "Fizz";
            }
            else if (num % 5 == 0) {
                answer[i] = "Buzz";
            }
            else {
                answer[i] = String.valueOf(num);
            }
        }

        return Arrays.asList(answer);
        
    }
}