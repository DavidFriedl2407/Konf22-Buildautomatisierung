package ÜbungsblattzuKlassenundAuflistungen;

import java.util.Objects;

public class Wasserstand {
    private int id;
    private String gewaesserName;
    private double messWert;
    private double messWertFuerAlamierung;
    private int zeitpunkt;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlamierung, int zeitpunkt) {
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlamierung = messWertFuerAlamierung;
        this.zeitpunkt = zeitpunkt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlamierung() {
        return messWertFuerAlamierung;
    }

    public void setMessWertFuerAlamierung(double messWertFuerAlamierung) {
        this.messWertFuerAlamierung = messWertFuerAlamierung;
    }

    public int getZeitpunkt() {
        return zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        this.zeitpunkt = zeitpunkt;
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlamierung=" + messWertFuerAlamierung +
                ", zeitpunkt=" + zeitpunkt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wasserstand that = (Wasserstand) o;
        return id == that.id && Double.compare(that.messWert, messWert) == 0 && Double.compare(that.messWertFuerAlamierung, messWertFuerAlamierung) == 0 && zeitpunkt == that.zeitpunkt && Objects.equals(gewaesserName, that.gewaesserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gewaesserName, messWert, messWertFuerAlamierung, zeitpunkt);
    }
}
