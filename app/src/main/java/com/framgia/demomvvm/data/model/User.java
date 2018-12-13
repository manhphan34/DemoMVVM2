package com.framgia.demomvvm.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Parcelable {
    @SerializedName("login")
    @Expose
    private String mName;
    @SerializedName("id")
    @Expose
    private int mId;
    @SerializedName("node_id")
    @Expose
    private String mNodeId;
    @SerializedName("avatar_url")
    @Expose
    private String mAvatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private String mGravatarId;
    @SerializedName("url")
    @Expose
    private String mUrl;
    @SerializedName("html_url")
    @Expose
    private String mHtmlUrl;
    @SerializedName("followers_url")
    @Expose
    private String mFollowersUrl;
    @SerializedName("following_url")
    @Expose
    private String mFollowingUrl;
    @SerializedName("gists_url")
    @Expose
    private String mGistsUrl;
    @SerializedName("starred_url")
    @Expose
    private String mStarredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private String mSubscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private String mOrganizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private String mReposUrl;
    @SerializedName("events_url")
    @Expose
    private String mEventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private String mReceivedEventsUrl;
    @SerializedName("type")
    @Expose
    private String mType;
    @SerializedName("site_admin")
    @Expose
    private Boolean mSiteAdmin;

    public User(String name, int id, String nodeId, String avatarUrl, String gravatarId, String url, String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl, String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl, String receivedEventsUrl, String type, Boolean siteAdmin) {
        mName = name;
        mId = id;
        mNodeId = nodeId;
        mAvatarUrl = avatarUrl;
        mGravatarId = gravatarId;
        mUrl = url;
        mHtmlUrl = htmlUrl;
        mFollowersUrl = followersUrl;
        mFollowingUrl = followingUrl;
        mGistsUrl = gistsUrl;
        mStarredUrl = starredUrl;
        mSubscriptionsUrl = subscriptionsUrl;
        mOrganizationsUrl = organizationsUrl;
        mReposUrl = reposUrl;
        mEventsUrl = eventsUrl;
        mReceivedEventsUrl = receivedEventsUrl;
        mType = type;
        mSiteAdmin = siteAdmin;
    }

    public User(String login) {

    }

    protected User(Parcel in) {
        mName = in.readString();
        mId = in.readInt();
        mNodeId = in.readString();
        mAvatarUrl = in.readString();
        mGravatarId = in.readString();
        mUrl = in.readString();
        mHtmlUrl = in.readString();
        mFollowersUrl = in.readString();
        mFollowingUrl = in.readString();
        mGistsUrl = in.readString();
        mStarredUrl = in.readString();
        mSubscriptionsUrl = in.readString();
        mOrganizationsUrl = in.readString();
        mReposUrl = in.readString();
        mEventsUrl = in.readString();
        mReceivedEventsUrl = in.readString();
        mType = in.readString();
        byte tmpMSiteAdmin = in.readByte();
        mSiteAdmin = tmpMSiteAdmin == 0 ? null : tmpMSiteAdmin == 1;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeInt(mId);
        dest.writeString(mNodeId);
        dest.writeString(mAvatarUrl);
        dest.writeString(mGravatarId);
        dest.writeString(mUrl);
        dest.writeString(mHtmlUrl);
        dest.writeString(mFollowersUrl);
        dest.writeString(mFollowingUrl);
        dest.writeString(mGistsUrl);
        dest.writeString(mStarredUrl);
        dest.writeString(mSubscriptionsUrl);
        dest.writeString(mOrganizationsUrl);
        dest.writeString(mReposUrl);
        dest.writeString(mEventsUrl);
        dest.writeString(mReceivedEventsUrl);
        dest.writeString(mType);
        dest.writeByte((byte) (mSiteAdmin == null ? 0 : mSiteAdmin ? 1 : 2));
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getNodeId() {
        return mNodeId;
    }

    public void setNodeId(String nodeId) {
        mNodeId = nodeId;
    }

    public String getAvatarUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return mGravatarId;
    }

    public void setGravatarId(String gravatarId) {
        mGravatarId = gravatarId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getHtmlUrl() {
        return mHtmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        mHtmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return mFollowersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        mFollowersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return mFollowingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        mFollowingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return mGistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        mGistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return mStarredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        mStarredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return mSubscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        mSubscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return mOrganizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        mOrganizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return mReposUrl;
    }

    public void setReposUrl(String reposUrl) {
        mReposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return mEventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        mEventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return mReceivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        mReceivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public Boolean getSiteAdmin() {
        return mSiteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        mSiteAdmin = siteAdmin;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }
}
