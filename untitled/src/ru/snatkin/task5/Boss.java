package ru.snatkin.task5;

public class Boss {

    Person[] artist = new Person[8];
    public Boss(Person[] artist) {
        this.artist = artist;
    } public Boss(){
    }

    public Person[] getArtist() {
        return artist;
    }

    public void setArtist(Person[] artist) {
        this.artist = artist;
    }
}

