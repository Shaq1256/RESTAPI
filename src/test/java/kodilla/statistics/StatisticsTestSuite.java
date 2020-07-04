package kodilla.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void zeroPostsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.postCount());
    }

    @Test
    public void thousandPostsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, advStatistics.postCount());

    }

    @Test
    public void zeroCommentsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.commentsCount());
    }

    @Test
    public void commentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.5, advStatistics.avgCommentPosts(), 0.01);
    }

    @Test
    public void commentsMoreThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);
        AdvStatistics advStatistics = new AdvStatistics();
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(2, advStatistics.avgCommentPosts(), 0.01);
    }

    @Test
    public void zeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> usersList = new LinkedList<>();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, advStatistics.usersNameCount());
    }

    @Test
    public void thousandUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        AdvStatistics advStatistics = new AdvStatistics();
        List<String> usersList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            usersList.add("a" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, advStatistics.usersNameCount());
    }
}
