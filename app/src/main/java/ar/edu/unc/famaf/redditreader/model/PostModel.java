package ar.edu.unc.famaf.redditreader.model;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by smarro on 9/29/16.
 */
public class PostModel {

    private String mTitle;
    private String mAuthor;
    private String mSubreddit;
    private int mComments;
    private String mPostDate;
    private String mImage;
    private String mId;


    public PostModel(String mId, String mTitle, String mAuthor, String mSubreddit, int mComments, String mPostDate, String mImage) {
        this.mId = mId;
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mSubreddit = mSubreddit;
        this.mComments = mComments;
        this.mImage = mImage;
        this.mPostDate = mPostDate;

// prints "moments ago"
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }


    public String getmImage() {
        return mImage;
    }

    public void setmImage(String mImage) {
        this.mImage = mImage;
    }

    public String getmPostDate() {


        return mPostDate;
    }

    public void setmPostDate(String mPostDate) {
        this.mPostDate = mPostDate;
    }

    public int getmComments() {
        return mComments;
    }

    public void setmComments(int mComments) {
        this.mComments = mComments;
    }

    public String getmSubreddit() {
        return mSubreddit;
    }

    public void setmSubreddit(String mSubreddit) {
        this.mSubreddit = mSubreddit;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public void setmAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }
}

