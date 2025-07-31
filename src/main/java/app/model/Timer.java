package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    //Фиксация времени при создании бина
    private final Long creationTime = System.currentTimeMillis();

    public Long getTime() {
        return creationTime;
    } //Время будет одно и тоже
}