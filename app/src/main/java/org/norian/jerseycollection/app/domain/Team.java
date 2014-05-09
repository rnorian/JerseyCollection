package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 */
public class Team {
    private String mName;
    private String mAbbreviation;
    private String mNickname;
    private String mCity;

    public Team(String name) {
        this(name, null, null);
    }

    public Team(String name, String abbreviation) {
        this(name, abbreviation, null);
    }

    public Team(String name, String abbreviation, String nickname) {
        mName = name;
        mAbbreviation = abbreviation;
        mNickname = nickname;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAbbreviation() {
        return mAbbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        mAbbreviation = abbreviation;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        mNickname = nickname;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }
}
