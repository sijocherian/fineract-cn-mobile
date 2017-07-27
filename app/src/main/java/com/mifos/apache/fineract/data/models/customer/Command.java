package com.mifos.apache.fineract.data.models.customer;

import com.google.gson.annotations.SerializedName;

public class Command {

    public enum Action {

        @SerializedName("ACTIVATE")
        ACTIVATE,

        @SerializedName("LOCK")
        LOCK,

        @SerializedName("UNLOCK")
        UNLOCK,

        @SerializedName("CLOSE")
        CLOSE,

        @SerializedName("REOPEN")
        REOPEN
    }

    private Action action;
    private String comment;
    private String createdOn;
    private String createdBy;

    public Command() {
        super();
    }

    public String getAction() {
        return this.action.name();
    }

    public void setAction(final String action) {
        this.action = Action.valueOf(action.toUpperCase());
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(final String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(final String createdBy) {
        this.createdBy = createdBy;
    }
}