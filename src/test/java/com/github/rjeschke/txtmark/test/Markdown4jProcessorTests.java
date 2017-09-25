package com.github.rjeschke.txtmark.test;

import org.junit.Test;
import org.markdown4j.Markdown4jProcessor;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by jamin on 2017/9/25.
 */
public class Markdown4jProcessorTests {

    @Test
    public void test() throws IOException {
        URL mdUrl = Markdown4jProcessorTests.class.getResource("/test.md");
        Markdown4jProcessor processor = new Markdown4jProcessor();
        String html = processor.process(new File(mdUrl.getFile()));
        System.out.println(html);
    }
}
