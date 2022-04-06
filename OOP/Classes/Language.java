package OOP.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void setRegion(String region) {
        this.regionsSpoken = region;
    }

    public void setSpeakers(int speakers) {
        this.numSpeakers = speakers;
    }

    public void setWordOrder(String order) {
        this.wordOrder = order;
    }

    public void getInfo() {
        String info = String.format("%s is spoken by %d people mainly in %s.\nThe language follows the word order: %s.", this.name, this.numSpeakers, this.regionsSpoken, this.wordOrder);
        System.out.println(info);
    }

    public static void main(String[] args) {
        Language Spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        // Spanish.getInfo();

        Mayan mayan = new Mayan("Ki'che'", 2330000);
        // Mayan.getInfo();

        SinoTibetan Mandarin = new SinoTibetan("Mandarin Chinese", 65684688);
        // Mandarin.getInfo();

        SinoTibetan Burmese = new SinoTibetan("Burmese", 683134453);
        // Burmese.getInfo();

        ArrayList<Language> languages = new ArrayList<>(Arrays.asList(Spanish, mayan, Mandarin, Burmese));
        for (Language language : languages) {
            language.getInfo();
            System.out.println();
        }

        Mandarin.setSpeakers(568855665);
        Mandarin.getInfo();
    }
}
