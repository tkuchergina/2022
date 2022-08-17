import java.util.Arrays;

public class News {

    String[] topics;

    public News(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        News feed;
        if (args[0].equals("Human")) {

            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new News(humanTopics);

        } else if(args[0].equals("Robot")) {

            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new News(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new News(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
