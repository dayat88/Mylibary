package com.mylibary.acer.mylibary;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ACER on 12/12/2017.
 */

public class member implements Parcelable {

    private String id_members;
    private Pinjaman pinjaman;


    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_member) {
        this.id_members = id_member;
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(Pinjaman pinjaman) {
        this.pinjaman = pinjaman;
    }

    //Tambahan pracilebel

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id_members);
        dest.writeParcelable(this.pinjaman, flags);
    }

    public member() {
    }

    protected member(Parcel in) {
        this.id_members = in.readString();
        this.pinjaman = in.readParcelable(Pinjaman.class.getClassLoader());
    }

    public static final Parcelable.Creator<member> CREATOR = new Parcelable.Creator<member>() {
        @Override
        public member createFromParcel(Parcel source) {
            return new member(source);
        }

        @Override
        public member[] newArray(int size) {
            return new member[size];
        }
    };
}

