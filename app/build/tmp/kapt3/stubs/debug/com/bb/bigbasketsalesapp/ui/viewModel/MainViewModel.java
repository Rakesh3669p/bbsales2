package com.bb.bigbasketsalesapp.ui.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b&\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_J\u001a\u0010\r\u001a\u00020]2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aJ\u0014\u0010b\u001a\u0004\u0018\u00010c2\b\u0010d\u001a\u0004\u0018\u00010cH\u0002J\u0010\u0010e\u001a\u00020Q2\u0006\u0010f\u001a\u00020gH\u0002J\u000e\u0010h\u001a\u00020]2\u0006\u0010i\u001a\u00020QJ\u0006\u0010j\u001a\u00020kJ\u000e\u0010\u001e\u001a\u00020]2\u0006\u0010l\u001a\u00020QJ\u0016\u0010!\u001a\u00020]2\u0006\u0010l\u001a\u00020Q2\u0006\u0010m\u001a\u00020QJ\u0016\u0010$\u001a\u00020]2\u0006\u0010n\u001a\u00020Q2\u0006\u0010o\u001a\u00020QJ\u0016\u0010\u0014\u001a\u00020]2\u0006\u0010i\u001a\u00020Q2\u0006\u0010p\u001a\u00020QJ\u001e\u0010\u0017\u001a\u00020]2\u0006\u0010q\u001a\u00020Q2\u0006\u0010r\u001a\u00020Q2\u0006\u0010s\u001a\u00020QJ\u000e\u0010\u001d\u001a\u00020]2\u0006\u0010i\u001a\u00020QJ\u0006\u0010\'\u001a\u00020]J\u0006\u0010*\u001a\u00020]J\u0006\u0010-\u001a\u00020]J\u000e\u0010t\u001a\u00020k2\u0006\u0010u\u001a\u00020QJ\u0006\u00100\u001a\u00020]J\u000e\u0010I\u001a\u00020]2\u0006\u0010v\u001a\u00020QJ\u0006\u00103\u001a\u00020]J\u000e\u0010O\u001a\u00020]2\u0006\u0010w\u001a\u00020QJ\u0006\u00106\u001a\u00020]J\u001a\u00109\u001a\u00020]2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aJ\u0006\u0010;\u001a\u00020]J\u000e\u0010>\u001a\u00020]2\u0006\u0010x\u001a\u00020QJ\u0016\u0010A\u001a\u00020]2\u0006\u0010q\u001a\u00020Q2\u0006\u0010x\u001a\u00020QJ\u001a\u0010D\u001a\u00020]2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0yJ\u0019\u0010z\u001a\u00020k2\u0006\u0010^\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J%\u0010|\u001a\u00020k2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0019\u0010~\u001a\u00020k2\u0006\u0010^\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J\b\u0010\u007f\u001a\u00020kH\u0002J\u001b\u0010\u0080\u0001\u001a\u00020k2\u0006\u0010l\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J#\u0010\u0082\u0001\u001a\u00020k2\u0006\u0010l\u001a\u00020Q2\u0006\u0010m\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J#\u0010\u0084\u0001\u001a\u00020k2\u0006\u0010n\u001a\u00020Q2\u0006\u0010o\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J#\u0010\u0085\u0001\u001a\u00020k2\u0006\u0010i\u001a\u00020Q2\u0006\u0010p\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J\u001b\u0010\u0086\u0001\u001a\u00020k2\u0006\u0010i\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J+\u0010\u0086\u0001\u001a\u00020k2\u0006\u0010q\u001a\u00020Q2\u0006\u0010r\u001a\u00020Q2\u0006\u0010s\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u00020k2\u0006\u0010i\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u0013\u0010\u0089\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J\u0013\u0010\u008b\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J\u0013\u0010\u008c\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J\u0011\u0010\u008d\u0001\u001a\u00020k2\u0006\u0010u\u001a\u00020QH\u0002J&\u0010\u008e\u0001\u001a\u00020k2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u001b\u0010\u008f\u0001\u001a\u00020k2\u0006\u0010v\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u0013\u0010\u0090\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J\u001b\u0010\u0091\u0001\u001a\u00020k2\u0006\u0010w\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J\u0013\u0010\u0092\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J&\u0010\u0093\u0001\u001a\u00020k2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u0013\u0010\u0094\u0001\u001a\u00020kH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008a\u0001J\u001b\u0010\u0095\u0001\u001a\u00020k2\u0006\u0010x\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0081\u0001J#\u0010\u0096\u0001\u001a\u00020k2\u0006\u0010q\u001a\u00020Q2\u0006\u0010x\u001a\u00020QH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u0083\u0001J&\u0010\u0097\u0001\u001a\u00020k2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010}J\u001a\u0010\u0098\u0001\u001a\u00020k2\u0006\u0010^\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J\u001a\u0010\u0099\u0001\u001a\u00020k2\u0006\u0010^\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J\u001b\u0010\u009a\u0001\u001a\u00020k2\u0007\u0010\u009b\u0001\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J\u001a\u0010\u009c\u0001\u001a\u00020k2\u0006\u0010^\u001a\u00020_H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010{J\u000e\u0010J\u001a\u00020]2\u0006\u0010^\u001a\u00020_J\u000f\u0010\u009d\u0001\u001a\u00020]2\u0006\u0010^\u001a\u00020_J\u000f\u0010\u009e\u0001\u001a\u00020]2\u0006\u0010^\u001a\u00020_J\u000e\u0010W\u001a\u00020]2\u0006\u0010^\u001a\u00020_J\u000e\u0010Z\u001a\u00020]2\u0006\u0010^\u001a\u00020_R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\fR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\fR\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\fR\u001d\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\fR\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\fR\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\fR\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\fR\u001d\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\fR\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\fR\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\fR\u001d\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\fR\u001d\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\fR\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\fR\u001d\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\fR\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\fR\u001d\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\fR\u001d\u0010S\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\fR\u001d\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\fR\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\fR\u001d\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u009f\u0001"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/viewModel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;", "session", "Lcom/bb/bigbasketsalesapp/utils/SessionManager;", "(Lcom/bb/bigbasketsalesapp/data/BBSalesRepository;Lcom/bb/bigbasketsalesapp/utils/SessionManager;)V", "addFollowUps", "Lcom/gym/gymapp/utils/SingleLiveEvent;", "Lcom/doctorsplaza/app/utils/Resource;", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/CommonModel;", "getAddFollowUps", "()Lcom/gym/gymapp/utils/SingleLiveEvent;", "changePasswordLogin", "Lcom/bb/bigbasketsalesapp/ui/fragments/changePasswordLogin/model/ChangePasswordLoginModel;", "getChangePasswordLogin", "customerDelete", "getCustomerDelete", "customerDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetCustomerDetails;", "getCustomerDetails", "customerList", "Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerListModel;", "getCustomerList", "downloadLanguage", "", "getDownloadLanguage", "enquiryDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/GetEnquiryData;", "getEnquiryDetails", "followUpDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpsDropdownModel;", "getFollowUpDropDown", "followUpList", "Lcom/bb/bigbasketsalesapp/ui/fragments/followUps/model/FollowUpModel;", "getFollowUpList", "forgotPassword", "Lcom/bb/bigbasketsalesapp/ui/loginSignUp/model/ForgotPasswordModel;", "getForgotPassword", "getEnquiryStatusListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryStatusListModel;", "getGetEnquiryStatusListDropDown", "getEnquiryTypeListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/EnquiryListModel;", "getGetEnquiryTypeListDropDown", "getIndustryListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/IndustryListModel;", "getGetIndustryListDropDown", "getNotificationMessageCount", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/NotificationAnMessageCount;", "getGetNotificationMessageCount", "getSourceListDropDown", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SourceListModel;", "getGetSourceListDropDown", "getUserProfile", "Lcom/bb/bigbasketsalesapp/ui/fragments/profile/model/GetUserProfileModel;", "getGetUserProfile", "logOut", "getLogOut", "notifications", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/NotificationModel;", "getNotifications", "offerList", "Lcom/bb/bigbasketsalesapp/ui/fragments/offers/model/OfferModel;", "getOfferList", "productList", "Lcom/bb/bigbasketsalesapp/ui/fragments/productList/model/ProductListModel;", "getProductList", "revenueList", "Lcom/bb/bigbasketsalesapp/ui/fragments/revenue/model/RevenueModel;", "getRevenueList", "salesAchievementsAndTargets", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/SalesAchievementsAndTargetsModel;", "getSalesAchievementsAndTargets", "saveCustomerDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/SaveCustomerBasicsModel;", "getSaveCustomerDetails", "tilesData", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/TileDataModel;", "getTilesData", "translatedString", "", "getTranslatedString", "updateCustomer", "getUpdateCustomer", "updateEnquiry", "getUpdateEnquiry", "updateLocation", "Lcom/bb/bigbasketsalesapp/ui/fragments/commonModel/LocationUpdateModel;", "getUpdateLocation", "updateUserProfile", "getUpdateUserProfile", "addFollowUp", "Lkotlinx/coroutines/Job;", "jsonObject", "Lcom/google/gson/JsonObject;", "params", "", "checkResponseBody", "", "body", "checkThrowable", "t", "", "deleteCustomer", "customerId", "downloadLang", "", "organisationID", "enquiryId", "phoneEmail", "from", "userId", "pageNo", "pageSize", "searchKeyword", "getLang", "date", "selectedYear", "month", "searchKey", "", "safeAddFollowUpsCall", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeChangePasswordLoginCall", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeCustomerDetailsCall", "safeDownloadLang", "safeFollowUpDropDownCall", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeFollowUpListCall", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeForgotPasswordCall", "safeGetCustomerDetailsCall", "safeGetCustomerListCall", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeGetEnquiryDetailsCall", "safeGetEnquiryStatusListDropDownCall", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeGetEnquiryTypeListDropDownCall", "safeGetIndustryListDropDownCall", "safeGetLanguage", "safeGetNotificationMessageCall", "safeGetSalesAchievementsAndTargetsCall", "safeGetSourceListDropDownCall", "safeGetTilesDataCall", "safeGetUserProfileCall", "safeLogOutCall", "safeNotificationsCall", "safeOfferListCall", "safeProductListCall", "safeRevenueListCall", "safeUpdateCustomerDetailsCall", "safeUpdateEnquiryDetailsCall", "safeUpdateLocationCall", "json", "safeUpdateUserProfileCall", "updateCustomerDetails", "updateEnquiryDetails", "BBSales_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.bb.bigbasketsalesapp.data.BBSalesRepository repository = null;
    private final com.bb.bigbasketsalesapp.utils.SessionManager session = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel>> getUserProfile = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> updateUserProfile = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel>> changePasswordLogin = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileDataModel>> tilesData = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SalesAchievementsAndTargetsModel>> salesAchievementsAndTargets = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryListModel>> getIndustryListDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryListModel>> getEnquiryTypeListDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusListModel>> getEnquiryStatusListDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SourceListModel>> getSourceListDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel>> customerList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails>> customerDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> customerDelete = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> updateCustomer = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> saveCustomerDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData>> enquiryDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> updateEnquiry = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel>> notifications = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel>> productList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel>> offerList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel>> followUpList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel>> followUpDropDown = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> addFollowUps = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel>> forgotPassword = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel>> revenueList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.LocationUpdateModel>> updateLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> logOut = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.String>> translatedString = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.Boolean>> downloadLanguage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.NotificationAnMessageCount>> getNotificationMessageCount = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.data.BBSalesRepository repository, @org.jetbrains.annotations.NotNull()
    com.bb.bigbasketsalesapp.utils.SessionManager session) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.profile.model.GetUserProfileModel>> getGetUserProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> getUpdateUserProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.changePasswordLogin.model.ChangePasswordLoginModel>> getChangePasswordLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.TileDataModel>> getTilesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SalesAchievementsAndTargetsModel>> getSalesAchievementsAndTargets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.IndustryListModel>> getGetIndustryListDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryListModel>> getGetEnquiryTypeListDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.EnquiryStatusListModel>> getGetEnquiryStatusListDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.SourceListModel>> getGetSourceListDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerListModel>> getCustomerList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetCustomerDetails>> getCustomerDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> getCustomerDelete() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> getUpdateCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.SaveCustomerBasicsModel>> getSaveCustomerDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.GetEnquiryData>> getEnquiryDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> getUpdateEnquiry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.NotificationModel>> getNotifications() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.productList.model.ProductListModel>> getProductList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.offers.model.OfferModel>> getOfferList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpModel>> getFollowUpList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.followUps.model.FollowUpsDropdownModel>> getFollowUpDropDown() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> getAddFollowUps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.loginSignUp.model.ForgotPasswordModel>> getForgotPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.revenue.model.RevenueModel>> getRevenueList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.LocationUpdateModel>> getUpdateLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.CommonModel>> getLogOut() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.String>> getTranslatedString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<java.lang.Boolean>> getDownloadLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gym.gymapp.utils.SingleLiveEvent<com.doctorsplaza.app.utils.Resource<com.bb.bigbasketsalesapp.ui.fragments.commonModel.NotificationAnMessageCount>> getGetNotificationMessageCount() {
        return null;
    }
    
    /**
     * ChangePassword
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job changePasswordLogin(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object safeChangePasswordLoginCall(java.util.Map<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * GetUserProfile
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getUserProfile() {
        return null;
    }
    
    private final java.lang.Object safeGetUserProfileCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * update UserProfile
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateUserProfile(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeUpdateUserProfileCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Save Customer Basic Details
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job saveCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeCustomerDetailsCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get All Form DropDowns
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getIndustryListDropDown() {
        return null;
    }
    
    private final java.lang.Object safeGetIndustryListDropDownCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSourceListDropDown() {
        return null;
    }
    
    private final java.lang.Object safeGetSourceListDropDownCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEnquiryTypeListDropDown() {
        return null;
    }
    
    private final java.lang.Object safeGetEnquiryTypeListDropDownCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEnquiryStatusListDropDown() {
        return null;
    }
    
    private final java.lang.Object safeGetEnquiryStatusListDropDownCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Sales And Achievements
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getSalesAchievementsAndTargets(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedYear) {
        return null;
    }
    
    private final java.lang.Object safeGetSalesAchievementsAndTargetsCall(java.lang.String selectedYear, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Customer List
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCustomerList(@org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String pageSize, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKeyword) {
        return null;
    }
    
    private final java.lang.Object safeGetCustomerListCall(java.lang.String pageNo, java.lang.String pageSize, java.lang.String searchKeyword, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Delete Customer
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteCustomer(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
        return null;
    }
    
    private final java.lang.Object safeGetCustomerListCall(java.lang.String customerId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get Customer Details
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCustomerDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    private final java.lang.Object safeGetCustomerDetailsCall(java.lang.String customerId, java.lang.String userId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get Enquiry Details
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getEnquiryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String customerId) {
        return null;
    }
    
    private final java.lang.Object safeGetEnquiryDetailsCall(java.lang.String customerId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get Tiles Data
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getTilesData(@org.jetbrains.annotations.NotNull()
    java.lang.String month) {
        return null;
    }
    
    private final java.lang.Object safeGetTilesDataCall(java.lang.String month, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Update Customer
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateCustomerDetails(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeUpdateCustomerDetailsCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Update Enquiry Data
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateEnquiryDetails(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeUpdateEnquiryDetailsCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get Notifications
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job notifications() {
        return null;
    }
    
    private final java.lang.Object safeNotificationsCall(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job productList(@org.jetbrains.annotations.NotNull()
    java.lang.String pageNo, @org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
        return null;
    }
    
    private final java.lang.Object safeProductListCall(java.lang.String pageNo, java.lang.String searchKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job offerList(@org.jetbrains.annotations.NotNull()
    java.lang.String searchKey) {
        return null;
    }
    
    private final java.lang.Object safeOfferListCall(java.lang.String searchKey, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job followUpList(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationID, @org.jetbrains.annotations.NotNull()
    java.lang.String enquiryId) {
        return null;
    }
    
    private final java.lang.Object safeFollowUpListCall(java.lang.String organisationID, java.lang.String enquiryId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addFollowUp(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeAddFollowUpsCall(com.google.gson.JsonObject jsonObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job followUpDropDown(@org.jetbrains.annotations.NotNull()
    java.lang.String organisationID) {
        return null;
    }
    
    private final java.lang.Object safeFollowUpDropDownCall(java.lang.String organisationID, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * forgot Password
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job forgotPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String from) {
        return null;
    }
    
    private final java.lang.Object safeForgotPasswordCall(java.lang.String phoneEmail, java.lang.String from, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * forgot Password
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job revenueList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object safeRevenueListCall(java.util.Map<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * updateLocation
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateLocation(@org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject jsonObject) {
        return null;
    }
    
    private final java.lang.Object safeUpdateLocationCall(com.google.gson.JsonObject json, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * logOut
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job logOut(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> params) {
        return null;
    }
    
    private final java.lang.Object safeLogOutCall(java.util.Map<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    /**
     * Get Notification and Message Count
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getNotificationMessageCount() {
        return null;
    }
    
    private final java.lang.Object safeGetNotificationMessageCall(java.util.Map<java.lang.String, java.lang.String> params, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void downloadLang() {
    }
    
    private final void safeDownloadLang() {
    }
    
    public final void getLang(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    private final void safeGetLanguage(java.lang.String date) {
    }
    
    private final java.lang.Object checkResponseBody(java.lang.Object body) {
        return null;
    }
    
    private final java.lang.String checkThrowable(java.lang.Throwable t) {
        return null;
    }
}