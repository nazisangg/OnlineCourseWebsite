package webapplication;

import WebApplication.Applications.Service.Model.Course;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

public class test1 {
    @Test
    public void testCourseModel() {
        //mutable
        StringBuffer stringBuffer = new StringBuffer("");
        stringBuffer.append("asf");
        Course course = new Course("JEE fullstack");
        String name = (String) ReflectionTestUtils.getField(course, "name");
        name = "JavaScript";
//Immutable
        String userFriendlyDescription = "Course name is "  + ", description is " ;
        String temp = userFriendlyDescription;
        userFriendlyDescription = "new one";
        Assert.assertEquals(temp, userFriendlyDescription);
    }
}
