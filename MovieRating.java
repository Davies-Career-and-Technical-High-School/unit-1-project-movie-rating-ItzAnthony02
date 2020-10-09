import java.util.Scanner;

class MovieRating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Write your code here */
        //Movie title
        System.out.println("Please enter a movie title.");
        String Movietitle = scan.nextLine();
        //how to find the runtime
        System.out.println("Please enter the run time of the movie in mintues");
        int runtime = scan.nextInt();
        int runx = runtime/60;
        int runy = runtime% 60;
        //how to find ratings from the movie review website
        System.out.println("Please enter ratings from the movie website. (Please enter 3)");
        int rate1 = scan.nextInt();
        int rate2 = scan.nextInt();
        int rate3 = scan.nextInt();
        int avgrate = (rate1+rate2+rate3)/3;
        //Ratings from focus groups
        System.out.println("Please enter the focus group's rating (enter two doubles)");
        double Fgroup1 = scan.nextDouble();
        double Fgroup2 = scan.nextDouble();
        double Favg = (Fgroup1+Fgroup2)/2;
        //Movie critic rating 
        System.out.println("Please enter 1 movie critic rating.");
        double CRate = scan.nextDouble();
        //Total avg
        double WeightedAvgRate = (double)avgrate*0.2;
        double WeightedFavg = (double)Favg*0.3;
        double WeightedCritic = (double)CRate*0.5;
      


        int TotalAvg = (int)(WeightedAvgRate+WeightedFavg+WeightedCritic);

        System.out.println("Title: " + Movietitle);
        System.out.println("Total run time: " + runx +"h"+runy );
        System.out.println("Average website rating: " + avgrate);
        System.out.println("Average Focus group rating: " + Favg);
        System.out.println("Average movie critic rating: "  + CRate);
        System.out.println("Overall rating: "  + TotalAvg);

    }
}