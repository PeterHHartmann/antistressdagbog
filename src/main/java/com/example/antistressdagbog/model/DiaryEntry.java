package com.example.antistressdagbog.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "diary_entry")
public class DiaryEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diaryentry")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account")
    private Account account;

    @Column(name = "date")
    private Date date;

    @Column(name = "dayOfWeek")
    private Integer dayOfWeek;

    @Column(name = "morning")
    private Integer morning;

    @Column(name = "afternoon")
    private Integer afternoon;

    @Column(name = "evening")
    private Integer evening;

    @Column(name = "sleep")
    private Integer sleep;

    @Column(name = "note1")
    private String note1;

    @Column(name = "note2")
    private String note2;

    @Column(name = "note3")
    private String note3;

    @Column(name = "noteSleep")
    private String noteSleep;

    public DiaryEntry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getMorning() {
        return morning;
    }

    public void setMorning(Integer morning) {
        this.morning = morning;
    }

    public Integer getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getEvening() {
        return evening;
    }

    public void setEvening(Integer evening) {
        this.evening = evening;
    }

    public Integer getSleep() {
        return sleep;
    }

    public void setSleep(Integer sleep) {
        this.sleep = sleep;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getNoteSleep() {
        return noteSleep;
    }

    public void setNoteSleep(String noteSleep) {
        this.noteSleep = noteSleep;
    }
}