package com.rug.eaisystemmanagement.messageprocessor.structure;

import java.time.temporal.ChronoUnit;

public class MessageExpirationTime {

    private final Integer duration;
    private final ChronoUnit timeUnit;

    public MessageExpirationTime(Integer duration, ChronoUnit timeUnit) {
        this.duration = duration;
        this.timeUnit = timeUnit;
    }

    public static MessageExpirationTime getDefault() {
        return new MessageExpirationTime(15, ChronoUnit.MINUTES);
    }

    public Integer getDuration() {
        return duration;
    }

    public ChronoUnit getTimeUnit() {
        return timeUnit;
    }
}
