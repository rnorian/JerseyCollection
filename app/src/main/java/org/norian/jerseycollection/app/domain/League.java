package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 */
public class League {
    // FIFA, UEFA, CONCACAF, USSF
    private OrganizingBody mOrganizingBody;
    // optional - Champions League, World Cup, Euros, etc.
    private Country mCountry;
    private String mName;
    private String mAbbreviation;

    public League(OrganizingBody organizingBody, Country country, String name, String abbreviation) {
        mOrganizingBody = organizingBody;
        mCountry = country;
        mName = name;
        mAbbreviation = abbreviation;
    }

    public OrganizingBody getOrganizingBody() {
        return mOrganizingBody;
    }

    public void setOrganizingBody(OrganizingBody organizingBody) {
        mOrganizingBody = organizingBody;
    }

    public Country getCountry() {
        return mCountry;
    }

    public void setCountry(Country country) {
        mCountry = country;
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
}
