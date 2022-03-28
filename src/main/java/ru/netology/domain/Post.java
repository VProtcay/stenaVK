package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdById;
    private int data;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String[] postType = {"post", "copy", "reply", "postpone", "suggest"};
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private CommentsInfo commentsInfo;
    private CopyrightInfo copyrightInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSourceInfo postSourceInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;

}
