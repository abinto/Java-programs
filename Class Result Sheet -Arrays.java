public class ResultSheet {

    public static void main(String[] args) {

        int[] marks = {85, 72, 91, 64, 78, 88};

        int highest = marks[0];
        int lowest = marks[0];

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            sum += marks[i];
        }

        double average = (double) sum / marks.length;

        int aboveAverage = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > average) {
                aboveAverage++;
            }
        }

        System.out.println("Highest Mark = " + highest);
        System.out.println("Lowest Mark = " + lowest);
        System.out.println("Average Mark = " + average);
        System.out.println("Students Above Average = " + aboveAverage);

        // Deliberate error:
        // System.out.println(marks[6]);
    }
}