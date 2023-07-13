package backend;

public class blogpost {
    public String title;
    public String webpageTitle;
    public String windowTitle;
    public String content;
    public Boolean windowTitleIsPostTitle;

    public blogpost (String t, String wpt, String wt, String c, Boolean wtipt){
        title = t;
        webpageTitle = wpt;
        windowTitle = wt;
        content = c;
        windowTitleIsPostTitle = wtipt;
    }
}
