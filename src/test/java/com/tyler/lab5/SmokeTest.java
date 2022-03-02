package com.tyler.lab5;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

/**
 * //@RunWith(SpringRunner.class) required to make autowire work
 * dependency required so jUnit4 is compatible with new SpringBoot
 *      <dependency>
 * 			<groupId>org.junit.vintage</groupId>
 * 			<artifactId>junit-vintage-engine</artifactId>
 * 			<scope>test</scope>
 * 		</dependency>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {

    @Autowired
    private AddressBookController control;

    @Test
    public void contextLoads() throws Exception {
        assertTrue(control == null);
    }

}
