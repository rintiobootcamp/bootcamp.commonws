package com.bootcamp.commons.ws.usecases.pivotone;

/**
 *
 * @author Bello
 */
public class LikeWS {

    private int like;
    private int unlike;

    /**
     * Get the number of like
     *
     * @return the number of like
     */
    public int getLike() {
        return like;
    }

    /**
     * Set the number of like
     *
     * @param like the number to set
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * Get the number of unlike
     *
     * @return the number of unlike
     */
    public int getUnlike() {
        return unlike;
    }

    /**
     * Set the number of unlike
     *
     * @param unlike the number to set
     */
    public void setUnlike(int unlike) {
        this.unlike = unlike;
    }
}
