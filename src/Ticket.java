import java.util.Random;

public class Ticket {

        private String seqLetters;
        private Integer seqNumbers;
        private String alphaNumeric;

        public Ticket(String seqLetters, Integer seqNumbers, String alphaNumeric) {
                this.seqLetters = seqLetters;
                this.seqNumbers = seqNumbers;
                this.alphaNumeric = alphaNumeric;
        }

        public Ticket() {
                Random random = new Random();
                this.seqLetters = generateRandomLetters();
                // nextInt(0 to 8999) choose integer number | add 1000 ensures a sequence of 4 numbers
                this.seqNumbers = random.nextInt(9000);
                this.alphaNumeric = seqLetters + seqNumbers;
        }

        public String generateRandomLetters() {
                Random random = new Random();
                StringBuilder sb = new StringBuilder();

                int i = 0;

                while (i < 3) {
                // nextInt(0 to 25) choose integer number | table ASCII (A(65) to random number) | char convert number to character from casting
                        char randomChar = (char) (random.nextInt(26) + 'A');
                        sb.append(randomChar);
                        i++;
                }

                return sb.toString();
        }

        @Override
        public String toString() {
                return "Alphanumeric [TICKET] " + alphaNumeric+ "\n\n" +
                        "Letters " + seqLetters +
                        "\nNumbers " + seqNumbers;

        }

}
