package kodilla.statistics;

import java.util.List;

public class AdvStatistics {
    List<String> usersName;
    int noOfComments, noOfPosts;

    public void calculateAdvStatistics(Statistics statistics) {
        usersName = statistics.usersNames();
        noOfComments = statistics.commentsCount();
        noOfPosts = statistics.postsCount();
    }

    public int usersNameCount() {
        return usersName.size();
    }

    public int commentsCount() {
        return noOfComments;
    }

    public int postCount() {
        return noOfPosts;
    }

    public double avgCommentPosts() {
        System.out.println("Average no of comments per post: " + (double)noOfComments / (double)noOfPosts);
        return (double)noOfComments / (double)noOfPosts;
    }

    public double avgUserComments() {
        System.out.println("Average no of comments per user: " + (double)noOfComments / usersNameCount());
        return (double)noOfComments / usersNameCount();
    }

    public double avgUserPosts() {
        System.out.println("Average no of comments per post: " + (double)noOfPosts / usersNameCount());
        return (double)noOfPosts / usersNameCount();
    }
}
