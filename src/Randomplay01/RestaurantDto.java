package Randomplay01;

import java.util.ArrayList;

import javax.swing.JList;

public class RestaurantDto {

    private String placeName;
    private String categoryName;
    private String categoryDetail;
    private String phone;
    private String addressName;
    private String placeBest;
    private String roadAddressName;
    private String placeUrl;
    private String id;
    private String ImageAddress;

    public RestaurantDto(String placeName, String categoryName, String categoryDetail, String phone, String addressName,
            String placeBest, String roadAddressName, String placeUrl, String id, String imageAddress) {
        this.placeName = placeName;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
        this.phone = phone;
        this.addressName = addressName;
        this.placeBest = placeBest;
        this.roadAddressName = roadAddressName;
        this.placeUrl = placeUrl;
        this.id = id;
        this.ImageAddress = imageAddress;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getPlaceBest() {
        return placeBest;
    }

    public void setPlaceBest(String placeBest) {
        this.placeBest = placeBest;
    }

    public String getRoadAddressName() {
        return roadAddressName;
    }

    public void setRoadAddressName(String roadAddressName) {
        this.roadAddressName = roadAddressName;
    }

    public String getPlaceUrl() {
        return placeUrl;
    }

    public void setPlaceUrl(String placeUrl) {
        this.placeUrl = placeUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageAddress() {
        return this.ImageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.ImageAddress = imageAddress;
    }

    /**
     * ???? ?????? ????
     */
    public void print() {
        System.out.println("| ???????? ???????? :   " + placeName + "\t|");
        System.out.println("| ???????????????? :   " + categoryName + " > " + categoryDetail + "\t|");
        System.out.println("| ???????????? :   " + roadAddressName + "\t|");
        System.out.println("| ???????? ???????? :   " + placeBest + "\t|");
        System.out.println("| ???????? ?????????? :   " + phone + "\t|");
        System.out.println("| ???????????? :   " + placeUrl + "\t|");
    }

    public JList<String> getInfo() {
        JList<String> result = new JList<String>();

        ArrayList<String> resultList = new ArrayList<String>();

        resultList.add("???????? ???????? :   " + placeName);
        resultList.add("????????????????:    " + categoryName);
        resultList.add("????????????:   " + roadAddressName);
        resultList.add("???????? ????????:   " + placeBest);
        resultList.add("???????? ??????????:   " + phone);
        resultList.add("????placeUrl????:   " + placeUrl);

        result = new JList<String>(resultList.toArray(new String[resultList.size()]));

        return result;
    }

    public void setVisible(boolean b) {
    }
}