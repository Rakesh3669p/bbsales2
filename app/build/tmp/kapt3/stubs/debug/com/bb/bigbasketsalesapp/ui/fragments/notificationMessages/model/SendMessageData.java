package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0016J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0001H\u00c6\u0003J\t\u0010-\u001a\u00020\u0001H\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\t\u0010/\u001a\u00020\bH\u00c6\u0003J\t\u00100\u001a\u00020\u0001H\u00c6\u0003J\t\u00101\u001a\u00020\u0001H\u00c6\u0003J\t\u00102\u001a\u00020\u0001H\u00c6\u0003J\t\u00103\u001a\u00020\u0001H\u00c6\u0003J\t\u00104\u001a\u00020\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0001H\u00c6\u0003J\u00af\u0001\u0010;\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0001H\u00c6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\bH\u00d6\u0001J\t\u0010@\u001a\u00020\nH\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a\u00a8\u0006A"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/SendMessageData;", "", "ChatHistory", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatHistory;", "EmpPhoto", "Employee", "EmployeeID", "", "EmployeePhoto", "", "EmployeeUserID", "Receiver", "ReceiverID", "ReceiverMessage", "ReceiverMessageTime", "ReceiverPhoto", "Sender", "SenderID", "SenderMessage", "SenderMessageTime", "SenderPhoto", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getChatHistory", "()Ljava/util/List;", "getEmpPhoto", "()Ljava/lang/Object;", "getEmployee", "getEmployeeID", "()I", "getEmployeePhoto", "()Ljava/lang/String;", "getEmployeeUserID", "getReceiver", "getReceiverID", "getReceiverMessage", "getReceiverMessageTime", "getReceiverPhoto", "getSender", "getSenderID", "getSenderMessage", "getSenderMessageTime", "getSenderPhoto", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "BBSales_debug"})
public final class SendMessageData {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatHistory> ChatHistory = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmpPhoto = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Employee = null;
    private final int EmployeeID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmployeePhoto = null;
    private final int EmployeeUserID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Receiver = null;
    private final int ReceiverID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ReceiverMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ReceiverMessageTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ReceiverPhoto = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Sender = null;
    private final int SenderID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SenderMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SenderMessageTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SenderPhoto = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.SendMessageData copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatHistory> ChatHistory, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmpPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.Object Employee, int EmployeeID, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeePhoto, int EmployeeUserID, @org.jetbrains.annotations.NotNull()
    java.lang.String Receiver, int ReceiverID, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverMessage, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverMessageTime, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String Sender, int SenderID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderMessage, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderMessageTime, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderPhoto) {
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
    
    public SendMessageData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatHistory> ChatHistory, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmpPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.Object Employee, int EmployeeID, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeePhoto, int EmployeeUserID, @org.jetbrains.annotations.NotNull()
    java.lang.String Receiver, int ReceiverID, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverMessage, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverMessageTime, @org.jetbrains.annotations.NotNull()
    java.lang.Object ReceiverPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String Sender, int SenderID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderMessage, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderMessageTime, @org.jetbrains.annotations.NotNull()
    java.lang.Object SenderPhoto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatHistory> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatHistory> getChatHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmpPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployee() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getEmployeeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployeePhoto() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getEmployeeUserID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceiver() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getReceiverID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getReceiverMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getReceiverMessageTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getReceiverPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSender() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getSenderID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSenderMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSenderMessageTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSenderPhoto() {
        return null;
    }
}