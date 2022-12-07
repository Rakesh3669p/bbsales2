package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b8\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0001H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0004H\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0004H\u00c6\u0003J\t\u0010=\u001a\u00020\u0001H\u00c6\u0003J\t\u0010>\u001a\u00020\u0001H\u00c6\u0003J\t\u0010?\u001a\u00020\u0004H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\t\u0010A\u001a\u00020\u0001H\u00c6\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\u0004H\u00c6\u0003J\t\u0010D\u001a\u00020\u0018H\u00c6\u0003J\t\u0010E\u001a\u00020\u0004H\u00c6\u0003J\t\u0010F\u001a\u00020\bH\u00c6\u0003J\t\u0010G\u001a\u00020\u0004H\u00c6\u0003J\t\u0010H\u001a\u00020\u0001H\u00c6\u0003J\t\u0010I\u001a\u00020\u0004H\u00c6\u0003J\t\u0010J\u001a\u00020\bH\u00c6\u0003J\t\u0010K\u001a\u00020\u0001H\u00c6\u0003J\t\u0010L\u001a\u00020\u0004H\u00c6\u0003J\t\u0010M\u001a\u00020\u0001H\u00c6\u0003J\t\u0010N\u001a\u00020\u0004H\u00c6\u0003J\u00ef\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010S\u001a\u00020\u0004H\u00d6\u0001J\t\u0010T\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0011\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u000f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0011\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 \u00a8\u0006U"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/NotificationData;", "", "AcionURL", "ActivityCount", "", "ActivityListData", "ActivityList_Id", "ActivityType", "", "ApprovalStatus", "BranchId", "BranchName", "Count", "CreatedDate", "CurrentPage", "CustomerName", "DivisionId", "DivisionName", "ModelPrevilege", "PageSize", "PersonType", "SearchKeyWord", "SubType", "TotalAmount", "", "Transaction_Id", "Unique_Id", "UserId", "(Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;DILjava/lang/String;I)V", "getAcionURL", "()Ljava/lang/Object;", "getActivityCount", "()I", "getActivityListData", "getActivityList_Id", "getActivityType", "()Ljava/lang/String;", "getApprovalStatus", "getBranchId", "getBranchName", "getCount", "getCreatedDate", "getCurrentPage", "getCustomerName", "getDivisionId", "getDivisionName", "getModelPrevilege", "getPageSize", "getPersonType", "getSearchKeyWord", "getSubType", "getTotalAmount", "()D", "getTransaction_Id", "getUnique_Id", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "BBSales_debug"})
public final class NotificationData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object AcionURL = null;
    private final int ActivityCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActivityListData = null;
    private final int ActivityList_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ActivityType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ApprovalStatus = null;
    private final int BranchId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchName = null;
    private final int Count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedDate = null;
    private final int CurrentPage = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerName = null;
    private final int DivisionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ModelPrevilege = null;
    private final int PageSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PersonType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchKeyWord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String SubType = null;
    private final double TotalAmount = 0.0;
    private final int Transaction_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Unique_Id = null;
    private final int UserId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationData copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object AcionURL, int ActivityCount, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActivityListData, int ActivityList_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String ActivityType, @org.jetbrains.annotations.NotNull()
    java.lang.Object ApprovalStatus, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchName, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String PersonType, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.String SubType, double TotalAmount, int Transaction_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Unique_Id, int UserId) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public NotificationData(@org.jetbrains.annotations.NotNull()
    java.lang.Object AcionURL, int ActivityCount, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActivityListData, int ActivityList_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String ActivityType, @org.jetbrains.annotations.NotNull()
    java.lang.Object ApprovalStatus, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchName, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String PersonType, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.String SubType, double TotalAmount, int Transaction_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Unique_Id, int UserId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAcionURL() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getActivityCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getActivityListData() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getActivityList_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActivityType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getApprovalStatus() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getBranchId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchName() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getDivisionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getModelPrevilege() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPersonType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchKeyWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubType() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int getTransaction_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnique_Id() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
}