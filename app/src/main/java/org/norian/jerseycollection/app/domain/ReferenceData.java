package org.norian.jerseycollection.app.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rnorian on 5/7/14.
 */
public class ReferenceData {
    private static ReferenceData sReferenceData;

    public static final ReferenceData get() {
        if (sReferenceData == null) {
            sReferenceData = new ReferenceData();
        }
        return sReferenceData;
    }

    private List<OrganizingBody> mOrganizingBodyList;
    private CountryList mCountryList;
    private LeagueList mLeagueList;
    private TeamList mTeamList;
    private CompetitionList mCompetitionList;


    private ReferenceData() {
        mOrganizingBodyList = new ArrayList<OrganizingBody>();
        mCountryList = new CountryList();
        mLeagueList = new LeagueList();
        mTeamList = new TeamList();
        mCompetitionList = new CompetitionList();

        mOrganizingBodyList.add(new OrganizingBody("FIFA"));
        OrganizingBody ussf = new OrganizingBody("USSF");
        mOrganizingBodyList.add(ussf);

        Country unitedStates = new Country("United States", "USA", "");
        mCountryList.add(unitedStates);

        League mls = new League(ussf, unitedStates, "Major League Soccer", "MLS");
        unitedStates.getLeagues().add(mls);
        unitedStates.getLeagues().add(new League(ussf, unitedStates, "North American Soccer League", "NASL"));
        unitedStates.getLeagues().add(new League(ussf, unitedStates, "United Soccer Leagues Professional Division", "USL Pro"));
        unitedStates.getLeagues().add(new League(ussf, unitedStates, "United Soccer Leagues Premier Development League", "USL PDL"));
        mLeagueList.addAll(unitedStates.getLeagues());

        Competition mls2014RegularSeason = new Competition(ussf, mls, "Regular Season", 2014);
        mCompetitionList.add(mls2014RegularSeason);

        Team galaxy = new Team("Los Angeles Galaxy", "LA Galaxy", "Galaxy");
        Team sounders = new Team("Seattle Sounders FC", "Sounders");
        mls2014RegularSeason.getTeams().add(galaxy);
        mls2014RegularSeason.getTeams().add(sounders);
    }

    public CountryList getCountryList() {
        return mCountryList;
    }

    public LeagueList getLeagueList() {
        return mLeagueList;
    }

    public List<OrganizingBody> getOrganizingBodyList() {
        return mOrganizingBodyList;
    }

    public TeamList getTeamList() {
        return mTeamList;
    }

    public CompetitionList getCompetitionList() {
        return mCompetitionList;
    }
}
