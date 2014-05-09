package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 *
 * Body         League              Year        Name
 * ------------|-------------------|-----------|----------------
 * USSF         MLS                 2014        Regular Season
 * USSF         MLS                 2014        Post Season
 * USSF         MLS                 2014        All-Star Game
 * Concacaf     Champions League    2014
 * USSF                             2014        US Open Cup
 * FIFA                             2014        World Cup
 * FA                               2014        FA Cup
 */
public class Competition {
    private OrganizingBody mOrganizingBody;
    private League mLeague;
    private String mName;
    private int mYear;
    private TeamList mTeams = new TeamList();

    public Competition(OrganizingBody organizingBody, League league, String name, int year) {
        mOrganizingBody = organizingBody;
        mLeague = league;
        mName = name;
        mYear = year;
    }

    public OrganizingBody getOrganizingBody() {
        return mOrganizingBody;
    }

    public void setOrganizingBody(OrganizingBody organizingBody) {
        mOrganizingBody = organizingBody;
    }

    public League getLeague() {
        return mLeague;
    }

    public void setLeague(League league) {
        mLeague = league;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getYear() {
        return mYear;
    }

    public void setYear(int year) {
        mYear = year;
    }

    public String getDescription() {
        StringBuilder descr = new StringBuilder(256);
        if (mLeague != null) {
            descr.append(mLeague.getAbbreviation());
        } else {
            descr.append(mOrganizingBody.getName());
        }

        descr.append(" ");
        descr.append(mYear);

        if (mName != null) {
            descr.append(mName);
        }

        return descr.toString();
    }

    public TeamList getTeams() {
        return mTeams;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}
