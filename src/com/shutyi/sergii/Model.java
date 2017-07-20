package com.shutyi.sergii;

/**
 * Created by S.Shutyi on 18.07.2017.
 */
public class Model {

    private String hello;
    private String world;
    private String sentence;

    // The Program logic

    /**
     * Makes sentence by concatenation this.hello, comma, space, this.world
     * @param comma
     * @param space
     * @return sentence
     */
    public String makeSentence(String comma, String space){
        return sentence = hello + comma + space + world;
    }


    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
