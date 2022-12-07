package com.bb.bigbasketsalesapp.locationPicker;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J/\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\t\u0010\u001f\u001a\u00020\u0018H\u00d6\u0001J\b\u0010 \u001a\u00020\u001eH\u0016J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0018H\u00d6\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010\u00a8\u0006&"}, d2 = {"Lcom/bb/bigbasketsalesapp/locationPicker/AddressData;", "Landroid/os/Parcelable;", "latitude", "", "longitude", "addressList", "", "Landroid/location/Address;", "(DDLjava/util/List;)V", "getAddressList", "()Ljava/util/List;", "setAddressList", "(Ljava/util/List;)V", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "getAddressString", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "BBSales_debug"})
public final class AddressData implements android.os.Parcelable {
    private double latitude;
    private double longitude;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends android.location.Address> addressList;
    public static final android.os.Parcelable.Creator<com.bb.bigbasketsalesapp.locationPicker.AddressData> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.locationPicker.AddressData copy(double latitude, double longitude, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.location.Address> addressList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public AddressData(double latitude, double longitude, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.location.Address> addressList) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<android.location.Address> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<android.location.Address> getAddressList() {
        return null;
    }
    
    public final void setAddressList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends android.location.Address> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    private final java.lang.String getAddressString() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.bb.bigbasketsalesapp.locationPicker.AddressData> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.bb.bigbasketsalesapp.locationPicker.AddressData createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.bb.bigbasketsalesapp.locationPicker.AddressData[] newArray(int size) {
            return null;
        }
    }
}