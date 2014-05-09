package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 */
public class Jersey {
    private String mTeamName;
    private JerseyType mJerseyType;
    private int mYear;
    private String mLeague;
    private String mCountry;

    public String getTeamName() {
        return mTeamName;
    }

    public void setTeamName(String teamName) {
        mTeamName = teamName;
    }

    public JerseyType getJerseyType() {
        return mJerseyType;
    }

    public void setJerseyType(JerseyType jerseyType) {
        mJerseyType = jerseyType;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }

    public String getLeague() {
        return mLeague;
    }

    public void setLeague(String league) {
        mLeague = league;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }
}
