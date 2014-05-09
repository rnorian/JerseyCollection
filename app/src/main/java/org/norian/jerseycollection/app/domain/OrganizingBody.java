package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 *
 * FIFA
 * UEFA
 * Concacaf
 * FA
 * USSF
 */
public class OrganizingBody {
    private String mName;

    public OrganizingBody(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
