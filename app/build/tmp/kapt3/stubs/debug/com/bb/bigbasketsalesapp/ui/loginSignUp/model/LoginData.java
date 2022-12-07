package com.bb.bigbasketsalesapp.ui.loginSignUp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\t\u00104\u001a\u00020\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\rH\u00c6\u0003J\t\u0010A\u001a\u00020\rH\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\u00c9\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010D\u001a\u00020\r2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0006H\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!\u00a8\u0006H"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/LoginData;", "", "ActiveFlag", "", "Branch", "", "", "BranchIds", "BranchList", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/Branch;", "Branch_Id", "CreatedDate", "DefaultUser", "", "Delstatus", "Division_Id", "EmployeeID", "Organization_Id", "Password", "RoleID", "StateName", "UpdatedDate", "UserLogId", "UserName", "User_Id", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;ZZIIILjava/lang/Object;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", "getActiveFlag", "()Ljava/lang/String;", "getBranch", "()Ljava/util/List;", "getBranchIds", "getBranchList", "getBranch_Id", "()I", "getCreatedDate", "getDefaultUser", "()Z", "getDelstatus", "getDivision_Id", "getEmployeeID", "getOrganization_Id", "getPassword", "()Ljava/lang/Object;", "getRoleID", "getStateName", "getUpdatedDate", "getUserLogId", "getUserName", "getUser_Id", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class LoginData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ActiveFlag = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> Branch = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BranchIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch> BranchList = null;
    private final int Branch_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedDate = null;
    private final boolean DefaultUser = false;
    private final boolean Delstatus = false;
    private final int Division_Id = 0;
    private final int EmployeeID = 0;
    private final int Organization_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Password = null;
    private final int RoleID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String StateName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String UpdatedDate = null;
    private final int UserLogId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String UserName = null;
    private final int User_Id = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.loginSignUp.model.LoginData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> Branch, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchIds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch> BranchList, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, boolean DefaultUser, boolean Delstatus, int Division_Id, int EmployeeID, int Organization_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Password, int RoleID, @org.jetbrains.annotations.NotNull()
    java.lang.String StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String UpdatedDate, int UserLogId, @org.jetbrains.annotations.NotNull()
    java.lang.String UserName, int User_Id) {
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
    
    public LoginData(@org.jetbrains.annotations.NotNull()
    java.lang.String ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> Branch, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchIds, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch> BranchList, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, boolean DefaultUser, boolean Delstatus, int Division_Id, int EmployeeID, int Organization_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Password, int RoleID, @org.jetbrains.annotations.NotNull()
    java.lang.String StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String UpdatedDate, int UserLogId, @org.jetbrains.annotations.NotNull()
    java.lang.String UserName, int User_Id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getActiveFlag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getBranch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBranchIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch> getBranchList() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getBranch_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getDefaultUser() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getDelstatus() {
        return false;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getDivision_Id() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getEmployeeID() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getOrganization_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPassword() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getRoleID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedDate() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getUserLogId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getUser_Id() {
        return 0;
    }
}