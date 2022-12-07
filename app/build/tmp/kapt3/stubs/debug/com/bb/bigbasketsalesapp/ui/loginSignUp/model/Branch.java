package com.bb.bigbasketsalesapp.ui.loginSignUp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\bb\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010#\u001a\u00020\t\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u00a2\u0006\u0002\u0010&J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\tH\u00c6\u0003J\t\u0010O\u001a\u00020\u0010H\u00c6\u0003J\t\u0010P\u001a\u00020\tH\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\tH\u00c6\u0003J\t\u0010S\u001a\u00020\tH\u00c6\u0003J\t\u0010T\u001a\u00020\u0001H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0001H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0001H\u00c6\u0003J\t\u0010]\u001a\u00020\tH\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\tH\u00c6\u0003J\t\u0010`\u001a\u00020\u0003H\u00c6\u0003J\t\u0010a\u001a\u00020\tH\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0001H\u00c6\u0003J\t\u0010d\u001a\u00020\tH\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0001H\u00c6\u0003J\t\u0010i\u001a\u00020\tH\u00c6\u0003J\t\u0010j\u001a\u00020\u0003H\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\tH\u00c6\u0003J\u00d3\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020\u00012\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010n\u001a\u00020\u00102\b\u0010o\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010p\u001a\u00020\tH\u00d6\u0001J\t\u0010q\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010(R\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010/R\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0011\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0011\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010-R\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010/R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010(R\u0011\u0010\u001f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0011\u0010!\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0011\u0010\"\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010-R\u0011\u0010#\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0011\u0010$\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010(R\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010(\u00a8\u0006r"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/Branch;", "", "AccountNo", "", "BankName", "Bank_Branch", "BranchCode", "BranchFlag", "BranchId", "", "BranchName", "City", "Count", "Country", "CurrentPage", "DelStatus", "", "DistrictId", "DistrictName", "DivisionBranchMappingId", "DivisionId", "DivisionName", "DivisionNameList", "EmailId", "Flag", "GSTIN", "IFSC_Code", "List", "Organisation", "OrganisationId", "PINCode", "PageSize", "PhoneNumber", "ReferenceId", "SearchKey", "StateId", "StateName", "Street", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IZILjava/lang/String;IILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/String;)V", "getAccountNo", "()Ljava/lang/String;", "getBankName", "getBank_Branch", "getBranchCode", "getBranchFlag", "()Ljava/lang/Object;", "getBranchId", "()I", "getBranchName", "getCity", "getCount", "getCountry", "getCurrentPage", "getDelStatus", "()Z", "getDistrictId", "getDistrictName", "getDivisionBranchMappingId", "getDivisionId", "getDivisionName", "getDivisionNameList", "getEmailId", "getFlag", "getGSTIN", "getIFSC_Code", "getList", "getOrganisation", "getOrganisationId", "getPINCode", "getPageSize", "getPhoneNumber", "getReferenceId", "getSearchKey", "getStateId", "getStateName", "getStreet", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class Branch {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AccountNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BankName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Bank_Branch = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BranchCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchFlag = null;
    private final int BranchId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BranchName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String City = null;
    private final int Count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Country = null;
    private final int CurrentPage = 0;
    private final boolean DelStatus = false;
    private final int DistrictId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DistrictName = null;
    private final int DivisionBranchMappingId = 0;
    private final int DivisionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DivisionNameList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmailId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Flag = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String GSTIN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String IFSC_Code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object List = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Organisation = null;
    private final int OrganisationId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PINCode = null;
    private final int PageSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PhoneNumber = null;
    private final int ReferenceId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchKey = null;
    private final int StateId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String StateName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Street = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.loginSignUp.model.Branch copy(@org.jetbrains.annotations.NotNull()
    java.lang.String AccountNo, @org.jetbrains.annotations.NotNull()
    java.lang.String BankName, @org.jetbrains.annotations.NotNull()
    java.lang.String Bank_Branch, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchFlag, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchName, @org.jetbrains.annotations.NotNull()
    java.lang.String City, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, int CurrentPage, boolean DelStatus, int DistrictId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistrictName, int DivisionBranchMappingId, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.String DivisionNameList, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.String GSTIN, @org.jetbrains.annotations.NotNull()
    java.lang.String IFSC_Code, @org.jetbrains.annotations.NotNull()
    java.lang.Object List, @org.jetbrains.annotations.NotNull()
    java.lang.Object Organisation, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String PINCode, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String PhoneNumber, int ReferenceId, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKey, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.String StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String Street) {
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
    
    public Branch(@org.jetbrains.annotations.NotNull()
    java.lang.String AccountNo, @org.jetbrains.annotations.NotNull()
    java.lang.String BankName, @org.jetbrains.annotations.NotNull()
    java.lang.String Bank_Branch, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchFlag, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchName, @org.jetbrains.annotations.NotNull()
    java.lang.String City, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, int CurrentPage, boolean DelStatus, int DistrictId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistrictName, int DivisionBranchMappingId, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.String DivisionNameList, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailId, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.String GSTIN, @org.jetbrains.annotations.NotNull()
    java.lang.String IFSC_Code, @org.jetbrains.annotations.NotNull()
    java.lang.Object List, @org.jetbrains.annotations.NotNull()
    java.lang.Object Organisation, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.String PINCode, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String PhoneNumber, int ReferenceId, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKey, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.String StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String Street) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBankName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBank_Branch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBranchCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchFlag() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getBranchId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBranchName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
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
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getDelStatus() {
        return false;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getDistrictId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrictName() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getDivisionBranchMappingId() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getDivisionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDivisionNameList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFlag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGSTIN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIFSC_Code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOrganisation() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int getOrganisationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPINCode() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int getReferenceId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchKey() {
        return null;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int getStateId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStateName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreet() {
        return null;
    }
}