package org.keyin.spacesystem;

import java.time.LocalDateTime;

public class Report {

    private int id;
    private int user_id;
    private int mission_id;
    private String report_text;
    private LocalDateTime submitted_at = LocalDateTime.now();

    public Report(int id, int user_id, int mission_id, String report_text, LocalDateTime submitted_at) {
        this.id = id;
        this.user_id = user_id;
        this.mission_id = mission_id;
        this.report_text = report_text;
        this.submitted_at = submitted_at;
    }

    public Report(int user_id, int mission_id, String report_text, LocalDateTime submitted_at) {
        this.user_id = user_id;
        this.mission_id = mission_id;
        this.report_text = report_text;
        this.submitted_at = submitted_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getMission_id() {
        return mission_id;
    }

    public void setMission_id(int mission_id) {
        this.mission_id = mission_id;
    }

    public String getReport_text() {
        return report_text;
    }

    public void setReport_text(String report_text) {
        this.report_text = report_text;
    }

    public LocalDateTime getSubmitted_at() {
        return submitted_at;
    }

    public void setSubmitted_at(LocalDateTime submitted_at) {
        this.submitted_at = submitted_at;
    }
}
