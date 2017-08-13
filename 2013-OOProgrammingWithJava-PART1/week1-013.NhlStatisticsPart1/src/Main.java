
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        //Top 10 sorted by goals;
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Top 25 sorted by penalties;
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Sidney Crosby statistics
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //statistics of Philadelphia Flyers
        NHLStatistics.teamStatistics("PHI");
        
        //statistics of Anaheim Ducks
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
