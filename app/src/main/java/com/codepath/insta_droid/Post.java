package com.codepath.insta_droid;

import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class Post extends ParseObject {

    private static final String Description = "description";
    private static final String  User = "user";
    private static final String Image = "image";
   // ParseUser User = new ParseUser();

//default constructor
//    public Post(){
//
//    }
//    public Post(String description, String user, String image){
//        this.description = description;
//        this.user = user;
//        this.image = image;
//    }
    public void setDescription(String description){
       put(Description, description);
    }
    public String getDescription(){
        return getString(Description);
    }
    public void setImage(ParseFile image){
        put(Image, image);

    }
    public void getImage(){
        //return getParseFile(Image);
    }
    public void setUser(ParseUser user){
       put(User,user);
    }
//    public String getUser() throws ParseException {
//        ParseUser query = getRelation(User).getQuery();
//        ParseUser postCreatorUser = ParseUser.getObjectId(());
//        return (ParseUser) query.find().get(0);
    }


//    public void saveInBackground (){
//        //SaveCallback
//    }

