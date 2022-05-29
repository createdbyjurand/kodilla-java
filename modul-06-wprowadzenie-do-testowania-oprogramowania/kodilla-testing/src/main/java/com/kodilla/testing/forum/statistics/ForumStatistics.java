package com.kodilla.testing.forum.statistics;

import static com.createdbyjurand.shared.display.Display.display;

public class ForumStatistics {

    private int averageNumberOfCommentsPerPost;
    private int averageNumberOfCommentsPerUser;
    private int averageNumberOfPostsPerUser;
    private int numberOfComments;
    private int numberOfPosts;
    private int numberOfUsers;

    public int getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public int getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public int getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        averageNumberOfCommentsPerPost =
            statistics.postsCount() == 0 ? 0 : statistics.commentsCount() / statistics.postsCount();
        averageNumberOfCommentsPerUser =
            statistics.usersNames().size() == 0 ? 0 : statistics.commentsCount() / statistics.usersNames().size();
        averageNumberOfPostsPerUser =
            statistics.usersNames().size() == 0 ? 0 : statistics.postsCount() / statistics.usersNames().size();
        numberOfComments = statistics.commentsCount();
        numberOfPosts = statistics.postsCount();
        numberOfUsers = statistics.usersNames().size();
    }

    public void showStatistics() {
        display(averageNumberOfCommentsPerPost);
        display(averageNumberOfCommentsPerUser);
        display(averageNumberOfPostsPerUser);
        display(numberOfComments);
        display(numberOfPosts);
        display(numberOfUsers);
    }
}
