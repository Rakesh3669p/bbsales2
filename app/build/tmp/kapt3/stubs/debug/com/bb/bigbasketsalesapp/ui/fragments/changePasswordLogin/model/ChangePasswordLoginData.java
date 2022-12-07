package com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bm\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010\'\u001a\u00020\u0001\u00a2\u0006\u0002\u0010(J\t\u0010P\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Q\u001a\u00020\bH\u00c6\u0003J\t\u0010R\u001a\u00020\u0001H\u00c6\u0003J\t\u0010S\u001a\u00020\u0001H\u00c6\u0003J\t\u0010T\u001a\u00020\bH\u00c6\u0003J\t\u0010U\u001a\u00020\u0001H\u00c6\u0003J\t\u0010V\u001a\u00020\bH\u00c6\u0003J\t\u0010W\u001a\u00020\u0001H\u00c6\u0003J\t\u0010X\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Y\u001a\u00020\bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u0001H\u00c6\u0003J\t\u0010[\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0001H\u00c6\u0003J\t\u0010]\u001a\u00020\bH\u00c6\u0003J\t\u0010^\u001a\u00020\u0001H\u00c6\u0003J\t\u0010_\u001a\u00020\bH\u00c6\u0003J\t\u0010`\u001a\u00020\u000bH\u00c6\u0003J\t\u0010a\u001a\u00020\u0001H\u00c6\u0003J\t\u0010b\u001a\u00020\bH\u00c6\u0003J\t\u0010c\u001a\u00020\bH\u00c6\u0003J\t\u0010d\u001a\u00020\u0001H\u00c6\u0003J\t\u0010e\u001a\u00020\u0001H\u00c6\u0003J\t\u0010f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010g\u001a\u00020\u0001H\u00c6\u0003J\t\u0010h\u001a\u00020\u0001H\u00c6\u0003J\t\u0010i\u001a\u00020\bH\u00c6\u0003J\t\u0010j\u001a\u00020\u000bH\u00c6\u0003J\t\u0010k\u001a\u00020\bH\u00c6\u0003J\t\u0010l\u001a\u00020\u0001H\u00c6\u0003J\t\u0010m\u001a\u00020\u0001H\u00c6\u0003J\t\u0010n\u001a\u00020\bH\u00c6\u0003J\t\u0010o\u001a\u00020\u0001H\u00c6\u0003J\t\u0010p\u001a\u00020\u000bH\u00c6\u0003J\t\u0010q\u001a\u00020\bH\u00c6\u0003J\t\u0010r\u001a\u00020\u0005H\u00c6\u0003J\u00e7\u0002\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\'\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010t\u001a\u00020\u00052\b\u0010u\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010v\u001a\u00020\bH\u00d6\u0001J\t\u0010w\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0003\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010*R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00100R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00100R\u0011\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010*R\u0011\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0011\u0010\u0016\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00100R\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010*R\u0011\u0010\u0019\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00100R\u0011\u0010\u001a\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0011\u0010\u001b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0011\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0011\u0010\u001d\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010*R\u0011\u0010\u001e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00100R\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00100R\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010*R\u0011\u0010!\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010*R\u0011\u0010\"\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010*R\u0011\u0010#\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010*R\u0011\u0010$\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00100R\u0011\u0010%\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0011\u0010&\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00100R\u0011\u0010\'\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010*\u00a8\u0006x"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/changePasswordLogin/model/ChangePasswordLoginData;", "", "ActionStatus", "ActiveFlag", "Active_Status", "", "BranchCode", "Branch_Id", "", "Branch_Name", "CreatedDate", "", "CurrentPage", "DelStatus", "Division_Id", "Division_Name", "EmployeeCode", "EmployeeId", "EmployeeName", "EmployeeRoleAssigned_Id", "Employee_Id", "Flag", "Head_Role_Id", "List", "MenuActions", "OrganizationId", "OrganizationName", "PageSize", "Password", "RoleForm", "RoleHierarchy_Id", "RoleId", "RoleList", "RoleName", "SearchKeyWord", "TopAuthority", "TotalCount", "UpdatedDate", "UserId", "Username", "(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;ILjava/lang/Object;Ljava/lang/String;IZILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/Object;)V", "getActionStatus", "()Ljava/lang/Object;", "getActiveFlag", "getActive_Status", "()Z", "getBranchCode", "getBranch_Id", "()I", "getBranch_Name", "getCreatedDate", "()Ljava/lang/String;", "getCurrentPage", "getDelStatus", "getDivision_Id", "getDivision_Name", "getEmployeeCode", "getEmployeeId", "getEmployeeName", "getEmployeeRoleAssigned_Id", "getEmployee_Id", "getFlag", "getHead_Role_Id", "getList", "getMenuActions", "getOrganizationId", "getOrganizationName", "getPageSize", "getPassword", "getRoleForm", "getRoleHierarchy_Id", "getRoleId", "getRoleList", "getRoleName", "getSearchKeyWord", "getTopAuthority", "getTotalCount", "getUpdatedDate", "getUserId", "getUsername", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class ChangePasswordLoginData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActiveFlag = null;
    private final boolean Active_Status = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchCode = null;
    private final int Branch_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Branch_Name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedDate = null;
    private final int CurrentPage = 0;
    private final boolean DelStatus = false;
    private final int Division_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Division_Name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmployeeCode = null;
    private final int EmployeeId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmployeeName = null;
    private final int EmployeeRoleAssigned_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Employee_Id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Flag = null;
    private final int Head_Role_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object List = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MenuActions = null;
    private final int OrganizationId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object OrganizationName = null;
    private final int PageSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RoleForm = null;
    private final int RoleHierarchy_Id = 0;
    private final int RoleId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RoleList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RoleName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchKeyWord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object TopAuthority = null;
    private final int TotalCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String UpdatedDate = null;
    private final int UserId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Username = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginData copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveFlag, boolean Active_Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Branch_Name, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, int CurrentPage, boolean DelStatus, int Division_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Division_Name, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeCode, int EmployeeId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeName, int EmployeeRoleAssigned_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Employee_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Flag, int Head_Role_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object List, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuActions, int OrganizationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object OrganizationName, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String Password, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleForm, int RoleHierarchy_Id, int RoleId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleList, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleName, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object TopAuthority, int TotalCount, @org.jetbrains.annotations.NotNull()
    java.lang.String UpdatedDate, int UserId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Username) {
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
    
    public ChangePasswordLoginData(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveFlag, boolean Active_Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Branch_Name, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, int CurrentPage, boolean DelStatus, int Division_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Division_Name, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeCode, int EmployeeId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeName, int EmployeeRoleAssigned_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Employee_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Flag, int Head_Role_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object List, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuActions, int OrganizationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object OrganizationName, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String Password, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleForm, int RoleHierarchy_Id, int RoleId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleList, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleName, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object TopAuthority, int TotalCount, @org.jetbrains.annotations.NotNull()
    java.lang.String UpdatedDate, int UserId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Username) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getActionStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getActiveFlag() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getActive_Status() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchCode() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getBranch_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranch_Name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getDelStatus() {
        return false;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getDivision_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivision_Name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployeeCode() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getEmployeeId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployeeName() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getEmployeeRoleAssigned_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployee_Id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFlag() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getHead_Role_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMenuActions() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final int getOrganizationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOrganizationName() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRoleForm() {
        return null;
    }
    
    public final int component26() {
        return 0;
    }
    
    public final int getRoleHierarchy_Id() {
        return 0;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int getRoleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRoleList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRoleName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchKeyWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTopAuthority() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedDate() {
        return null;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUsername() {
        return null;
    }
}