package com.company;

public class Kvart {
    private  int number;
    private int area;
    private int floor;
    private int roomcount;
    private String building;
    private int usetime;
    public  Kvart(int num,int ar, int fl, int rc, String build, int use){
        number=num;
        area=ar;
        floor=fl;
        roomcount=rc;
        building=build;
        usetime=use;

    }
    public int getNumber(){return number;}
    public int getArea(){return area;}
    public int getFloor(){return floor;}
    public int getRoomcount(){return roomcount;}
    public  String getBuilding(){return building;}
    public int getUsetime(){return number;}
    public void setNumber(int n){number=n;}
    public void setArea(int n){area=n;}
    public void setFloor(int n){floor=n;}
    public void setRoomcount(int n){roomcount=n;}
    public void setBuilding(String n){building=n;}
    public void setUsetime(int n){usetime=n;}

    public String toString(){
        String desc="номер: ";
        desc+=number;
        desc+=" площадь: ";
        desc+=area;
        desc+=" Этаж: ";
        desc+=floor;
        desc+=" кол-во комнат: ";
        desc+=roomcount;
        desc+=" строение: ";
        desc+=building;
        desc+=" эксплуатация: ";
        desc+=usetime;
        return desc;
    }

}
