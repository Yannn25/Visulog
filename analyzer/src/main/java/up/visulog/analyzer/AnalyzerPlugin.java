package up.visulog.analyzer;

public interface AnalyzerPlugin {
    interface Result {
        String getResultAsString();
        String getResultAsDataPoints();
        String getChartName();
    }

    /**
     * run this analyzer plugin
     *
     *
     */
    void run();

    /**
     *
     * @return the result of this analysis. Runs the analysis first if not already done.
     */
    Result getResult();
}
