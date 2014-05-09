package org.norian.jerseycollection.app.domain;

/**
 * Created by rnorian on 5/7/14.
 */
public enum JerseyType {
    Home("Home"), Away("Away"), ThirdKit("Third Kit");


    private String mDescription;

    JerseyType(String description) {
        mDescription = description;
    }

    public String getDescription() {
        return mDescription;
    }
}
