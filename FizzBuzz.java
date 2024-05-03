class FizzBuzz {
    public static void main(String[] args) {
        isThereAnArgument(args);

        char[] argument = args[0].toCharArray();

        isTheArgumentANumber(argument);
        
        int bound = Integer.parseInt(args[0]);

        fizzBuzz(bound);
    }

    private static void isThereAnArgument(String[] args) {
        if (args.length != 1) {
            System.out.println("Enter an integer greater than zero as the argument of this Java program.");
            System.exit(1);
        }
    }

    private static void isTheArgumentANumber(char[] argument) {
        char[] digits = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        if (digitsPointer(digits, argument) >= digits.length) {
            System.out.println("Enter an integer greater than zero as the argument of this Java program.");
            System.exit(1);
        }
    }

    private static int digitsPointer(char[] validDigits, char[] programArgument) {
        int i = 0;

        for (; i < validDigits.length; i++) {
            if (programArgument[0] == validDigits[i]) {
                return i;
            }
        }

        return i;
    }

    private static void fizzBuzz(int upperBound) {
        for (int i = 1; i <= upperBound; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
