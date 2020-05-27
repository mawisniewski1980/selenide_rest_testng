package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class AppTest
{

    private static final Logger LOG = LoggerFactory.getLogger("STDOUT_LOGGER");

    @Test
    public void shouldAnswerWithTrue()
    {
        assertThat(true).isTrue();
        LOG.info("check logger");

    }
}
