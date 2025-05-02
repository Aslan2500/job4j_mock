package ru.checkdev.notification.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class NotifyTest {

    private Notify notify;

    @BeforeEach
    public void setUp() {
        var map = new HashMap<String, String>();
        map.put("key", "value");

        notify = new Notify();
        notify.setEmail("email");
        notify.setTemplate("temp");
        notify.setKeys(map);
    }

    @Test
    void testGetEmail() {
        assertThat(notify.getEmail(), is("email"));
    }

    @Test
    void testGetTemaplate() {
        assertThat(notify.getTemplate(), is("temp"));
    }
}
