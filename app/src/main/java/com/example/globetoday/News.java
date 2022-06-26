package com.example.globetoday;

public class News {
    /** String resource ID for the Heading of news */
    private String nHeading;

    /** String resource ID for the Author name */
    private String nAuthorName;

    /** String resource ID for the Url of news article */
    private String nUrl;

    /** String resource ID for the news article */
    private String nArticle;

    /** Date resource for the News */
    private String nDate;

    /**Image Resource ID for News*/
    private int nImageResourceId;
    /**
     * Create a new Word object.
     *
     * @param Heading is the heading of fetched news article
     * @param Author is the name of the author whi published the Article
     * @param url is the news link that will direct us to news webSource
     * @param Article is the detailed description of news Article
     * @param Date is the date of publishing of news article
     * @param ImageResourceId is the link to Image attached to the Article
     */
    public News(String Heading , String Author , String url , String Article ,String Date, int ImageResourceId) {
        nHeading = Heading;
        nAuthorName = Author;
        nUrl = url;
        nArticle = Article;
        nImageResourceId = ImageResourceId;
//        StringBuilder str = new StringBuilder(Date);
//        nDate = str.substring(0,str.indexOf("T"));
        nDate=Date;
    }

    /**
     * @return Heading
     */
    public String getHeading(){return nHeading;}
    /**
     * @return Author Name
     */
    public String getAuthorName(){return nAuthorName;}
    /**
     * @return Article
     */
    public String getArticle(){return nArticle;}
    /**
     * @return News Url
     */
    public String getUrl(){return nUrl;}
    /**
     * @return Date
     */
    public String getDate(){return nDate;}
    /**
     * @return Image Resource ID
     */
    public int getImageResourceId(){return nImageResourceId;}

    public Boolean hasImage(){
        if(nImageResourceId!=0)
            return true ;
        return false;
    }
}
