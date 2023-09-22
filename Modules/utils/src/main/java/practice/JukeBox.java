package practice;

import java.util.Objects;

public class JukeBox implements Comparable<JukeBox>{
    String title;
    String genre;
    int year;
    String singer;

    public JukeBox() {
    }

    public JukeBox(String title, String genre, int year, String singer) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public JukeBox setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public JukeBox setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public int getYear() {
        return year;
    }

    public JukeBox setYear(int year) {
        this.year = year;
        return this;
    }

    public String getSinger() {
        return singer;
    }

    public JukeBox setSinger(String singer) {
        this.singer = singer;
        return this;
    }

    public String toString() {
        return this.getTitle() + " " + this.getGenre() + " " + this.getSinger() + " " + this.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JukeBox jukeBox)) return false;
        return getYear() == jukeBox.getYear() && getTitle().equals(jukeBox.getTitle()) && getGenre().equals(jukeBox.getGenre()) && getSinger().equals(jukeBox.getSinger());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getGenre(), getYear(), getSinger());
    }

    @Override
    public int compareTo(JukeBox j){
        return j.getTitle().compareTo(this.getTitle());
    }
}
