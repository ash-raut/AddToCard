package com.example.addtocard;

public class addtocardListData {
    private int imgId;
    private String djName;
    private String address;
    private String add;
   private String cancle;


    public addtocardListData(String djName, String address, String add,String cancle,int imgId) {
        this.djName = djName;
        this.address = address;
       this.add = add;
       this.cancle = cancle;
        this.imgId = imgId;
    }

    public String getDjName(){
        return djName;
    }
    public void setDjName(String djName){
        this.djName = djName;
    }

    public String getCancle() {
        return cancle;
    }
    public void setCancle(String rating) {
        this.cancle = cancle;
    }

    public String getAdd() {
        return add;
    }
    public void setAdd(String add){
        this.add=add;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

}
