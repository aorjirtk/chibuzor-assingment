public class EvenAndOddNumbers {

        public int[] checkEvenAndOddNumbers(int[] numbers) {
            int odd = 0;
            int even = 0;
            int[] evenAndOddNumbersCount = new int[2];
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] % 2 != 0) {
                    odd++;
                } else even++;
            }
            evenAndOddNumbersCount[0] = even;
            evenAndOddNumbersCount[1] = odd;
            return evenAndOddNumbersCount;
        }
}
