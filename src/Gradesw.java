class Grades {

    int[] grades = {2, 3, 1, 6, 5, 4};

    Grades () {


    }

    void calculateMean () {

        int sum = 0;

        for ( int i = 0; i < grades.length; i++) {

            sum += grades[i];

        }

        int mean = sum / grades.length;

        System.out.println( "The average grade is " + mean);

    }





    void bestGrade () {

        int min = grades[0];

        for ( int i = 0; i < grades.length; i++) {

            if (grades[i] < min ) {

                min = grades[i];

            }
        }
        System.out.println( "The best grade is " + min );


        int max = grades[0];

        for ( int i = 0; i < grades.length; i++) {

            if (grades[i] > max ) {

                max = grades[i];

            }
        }
        System.out.println( "The worst grade is " + max );
    }




    void passedExam () {

        int passed = 0;

        for ( int i = 0; i < grades.length; i++) {

            if ( grades[i] <= 4 ) {

                passed += 1;

            } else if ( grades[i]  > 4 ) {

                passed += 0;
            }
        }
        System.out.println(passed);
    }
}


public class Gradesw {
    public static void main (String[] args) {

        Grades gr = new Grades();
        gr.calculateMean();
        gr.bestGrade();
        gr.passedExam();
    }
}