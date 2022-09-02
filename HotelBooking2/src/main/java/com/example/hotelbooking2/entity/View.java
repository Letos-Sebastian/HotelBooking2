package com.example.hotelbooking2.entity;


import javax.persistence.*;

@Entity
@Table(name="views")
public class View {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int viewId;
    @Column(name="typeOfView")
    private String typeOfView;
    @Column(name="viewExtraPrice")
    private double viewExtraPrice;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public View(){}

    ////////// With arg //////////
    public View(String typeOfView, double viewExtraPrice) {
        this.typeOfView = typeOfView;
        this.viewExtraPrice = viewExtraPrice;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////


    public int getViewId() {
        return viewId;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }

    public String getTypeOfView() {
        return typeOfView;
    }

    public void setTypeOfView(String typeOfView) {
        this.typeOfView = typeOfView;
    }

    public double getViewExtraPrice() {
        return viewExtraPrice;
    }

    public void setViewExtraPrice(double viewExtraPrice) {
        this.viewExtraPrice = viewExtraPrice;
    }

    ////////////////////////////// Define toString() //////////////////////////////

    @Override
    public String toString() {
        return "View{" +
                "viewId=" + viewId +
                ", typeOfView='" + typeOfView + '\'' +
                ", viewExtraPrice=" + viewExtraPrice +
                '}';
    }
}
