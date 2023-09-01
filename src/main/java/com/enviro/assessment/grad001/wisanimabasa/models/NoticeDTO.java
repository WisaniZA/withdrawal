package com.enviro.assessment.grad001.wisanimabasa.models;

import java.util.Date;

public record NoticeDTO(String title, Date date) {
    public NoticeDTO(String title, Date date) {
        this.title = title;
        this.date = date;
    }
        public String title() {
        return this.title;
        }
        public Date date() {
        return this.date;
        }
}
