package moodTest;

import org.junit.Assert;
import org.junit.Test;
import program.MoodAnalyzer;

public class MoodAnalyzerTest {
    @Test
    public void result1() {
        MoodAnalyzer mood1 = new MoodAnalyzer(null);
        String result = mood1.analyseMood();
        Assert.assertEquals("NULL", result);
    }

    @Test
    public void result2() {
        MoodAnalyzer mood1 = new MoodAnalyzer("");
        String result = mood1.analyseMood();
        Assert.assertEquals("EMPTY", result);
    }
}
