package tests;

import config.TestConfig;
import org.junit.Test;
import pages.Home;

public class WebsiteTest extends TestConfig {

    @Test
    public void userShouldPassQuizWithOneMistakeIn4thQuestionAndThenCountManyIntegrals() {
        new Home()
                .openQuizPage()
                .openQuiz1Page()
                .openQuizResultsPageWithGoodAnswer1b()
                .openQuiz2PageAfterGoodAnswer1b()
                .openQuizResultsPageWithGoodAnswer2a()
                .openQuiz3PageAfterGoodAnswer2a()
                .openQuizResultsPageWithGoodAnswer3b()
                .openQuiz4PageAfterGoodAnswer3b()
                .openQuizResultsPageWithBadAnswer4a()
                .openQuiz4PageAfterBadAnswer4a()
                .openQuizResultsPageWithGoodAnswer4c()
                .openQuizPageAfterGoodAnswer4c();

        new Home()
                .openJavaProjectsPage()
                .openIntegralPage()
                .fillIntegralData();
    }
}