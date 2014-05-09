package org.norian.jerseycollection.app.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnorian on 5/7/14.
 */
public class Country {
    private String mName;
    private String mAbbreviation;
    private String mFlag;
    private LeagueList mLeagues = new LeagueList();

    public Country(String name, String abbreviation, String flag) {
        mName = name;
        mAbbreviation = abbreviation;
        mFlag = flag;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getFlag() {
        return mFlag;
    }

    public void setFlag(String flag) {
        mFlag = flag;
    }

    public LeagueList getLeagues() {
        return mLeagues;
    }
}
