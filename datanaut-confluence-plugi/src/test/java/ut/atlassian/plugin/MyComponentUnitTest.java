package ut.atlassian.plugin;

import org.junit.Test;
import atlassian.plugin.api.MyPluginComponent;
import atlassian.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}