public class Results {
    int physics = 50;
    int chemistry = 120;
    int biology = 100;
    double total;
    double percentage;


    public static void main(String[] args) {
        Results results = new Results();
        results.total = results.biology + results.chemistry + results.physics;
        results.percentage = (results.total * 100) / 450;
        displayResults(results.physics,results.chemistry,results.biology,results.total);
        results.percentage = resultsEvaluation(results.total, results.physics,results.chemistry,results.biology);
    }

    public static void displayResults(int physics, int chemistry, int biology, double total){

        System.out.println(
                "Results\n" +
                "Physics: " + physics
                +"\nChemistry: " + chemistry
                + "\nBiology: " + biology
                + "\nTotal mark: " + total
        );
    }

//    Method 2 - finds and displays the percentage that the person received for the exams overall.
//
//2. Given there is a pass rate of 60% for the overall result, if the person receives under 60%, they get a ‘fail’
//
//    message.

//    When all the exam marks have been added together, we can find the overall percentage that the person has got
//
//    by multiplying their score by 100 and then dividing by 450.
    //Update the results so that even if the person gets higher than 60% overall, if they fail 1 or
    //
    //more of the exams (pass grade of 60% for each exam) they still fail overall.

    public static double resultsEvaluation(double total, int physics, int chemistry, int biology){

        double percentage = (total * 100) /450;
        System.out.printf("Your overall percentage is: %.2f%%%n", percentage);

        if(percentage < 60){
            System.out.println("You failed.");
        }else if(physics < 60 || chemistry < 60 || biology < 60){
            System.out.println("You failed.");
        }else{
            System.out.println("You passed.");
        }
        return percentage;
    }


}
