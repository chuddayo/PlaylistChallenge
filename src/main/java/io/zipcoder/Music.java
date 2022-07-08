package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int playListLength = playList.length;
        int closest = playListLength;

        for (int i = 0; i < playListLength; i++) {
            if (playList[i].equals(selection)) {
                int backIndex = playListLength - Math.abs(i - startIndex);
                if (closest > Math.abs(i - startIndex) || closest > backIndex) {
                    closest = Math.min(Math.abs(i - startIndex), backIndex);
                }
            }
        }

        return closest;
    }
}
