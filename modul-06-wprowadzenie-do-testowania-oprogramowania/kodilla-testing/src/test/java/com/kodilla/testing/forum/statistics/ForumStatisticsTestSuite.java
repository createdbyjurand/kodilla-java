package com.kodilla.testing.forum.statistics;

import com.createdbyjurand.shared.Generate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;

public class ForumStatisticsTestSuite {

    @Test
    @DisplayName("gdy liczba postów = 0")
    public void testCalculateAdvStatistics_ZeroPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(0);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfPosts());
    }

    @Test
    @DisplayName("gdy liczba postów = 1000")
    public void testCalculateAdvStatistics_ThousandPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(1000);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, forumStatistics.getNumberOfPosts());
    }

    @Test
    @DisplayName("gdy liczba komentarzy = 0")
    public void testCalculateAdvStatistics_ZeroComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        usersNamesList.add("One");
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(100);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfComments());
    }

    @Test
    @DisplayName("gdy liczba komentarzy < liczba postów")
    public void testCalculateAdvStatistics_CommentsLessThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(100);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(forumStatistics.getNumberOfComments() < forumStatistics.getNumberOfPosts());
    }

    @Test
    @DisplayName("gdy liczba komentarzy > liczba postów")
    public void testCalculateAdvStatistics_CommentsMoreThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(10);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertTrue(forumStatistics.getNumberOfComments() > forumStatistics.getNumberOfPosts());
    }

    @Test
    @DisplayName("gdy liczba użytkowników = 0")
    public void testCalculateAdvStatistics_ZeroUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(0);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, forumStatistics.getNumberOfUsers());
    }

    @Test
    @DisplayName("gdy liczba użytkowników = 100")
    public void testCalculateAdvStatistics_HundredUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        Statistics statisticsMock = Mockito.mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        for (int i = 100; i > 0; i--) {
            usersNamesList.add(Generate.id(4, 4));
        }
        BDDMockito.given(statisticsMock.usersNames()).willReturn(usersNamesList);
        BDDMockito.given(statisticsMock.postsCount()).willReturn(0);
        BDDMockito.given(statisticsMock.commentsCount()).willReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, forumStatistics.getNumberOfUsers());
    }
}
