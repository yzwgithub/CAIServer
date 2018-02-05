package util;

public class Image {
    private String imgName;
    private String imgDisc;

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getImgDisc() {
        return imgDisc;
    }

    public void setImgDisc(String imgDisc) {
        this.imgDisc = imgDisc;
    }

    @Override
    public String toString() {
        return "Image{" +
                "imgName='" + imgName + '\'' +
                ", imgDisc='" + imgDisc + '\'' +
                '}';
    }
}
