package com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0003\b\u0082\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0005\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0001\u0012\u0006\u0010\'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0001\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0001\u0012\u0006\u00100\u001a\u00020\u0001\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0001\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0005\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0001\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0001\u0012\u0006\u0010;\u001a\u00020\u0001\u0012\u0006\u0010<\u001a\u00020\u0001\u0012\u0006\u0010=\u001a\u00020\u0001\u0012\u0006\u0010>\u001a\u00020\u0005\u0012\u0006\u0010?\u001a\u00020\u0001\u0012\u0006\u0010@\u001a\u00020\u0001\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010D\u001a\u00020\u0005\u0012\u0006\u0010E\u001a\u00020\u0005\u0012\u0006\u0010F\u001a\u00020\u0001\u0012\u0006\u0010G\u001a\u00020\u0001\u0012\u0006\u0010H\u001a\u00020\u0001\u0012\u0006\u0010I\u001a\u00020\u0001\u0012\u0006\u0010J\u001a\u00020\u0005\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\u0001\u0012\u0006\u0010M\u001a\u00020B\u0012\u0006\u0010N\u001a\u00020\u0001\u0012\u0006\u0010O\u001a\u00020\u0001\u0012\u0006\u0010P\u001a\u00020\u0001\u0012\u0006\u0010Q\u001a\u00020\u0001\u0012\u0006\u0010R\u001a\u00020\u0001\u0012\u0006\u0010S\u001a\u00020\u0005\u0012\u0006\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010W\u001a\u00020\u0001\u0012\u0006\u0010X\u001a\u00020\u0001\u0012\u0006\u0010Y\u001a\u00020\u0001\u0012\u0006\u0010Z\u001a\u00020\u0003\u0012\u0006\u0010[\u001a\u00020\\\u0012\u0006\u0010]\u001a\u00020\u0003\u0012\u0006\u0010^\u001a\u00020\u0001\u0012\u0006\u0010_\u001a\u00020\u0003\u0012\f\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a\u0012\u0006\u0010c\u001a\u00020\u0005\u0012\u0006\u0010d\u001a\u00020\u0005\u0012\u0006\u0010e\u001a\u00020\u0003\u0012\u0006\u0010f\u001a\u00020\u0001\u0012\u0006\u0010g\u001a\u00020\u0005\u0012\u0006\u0010h\u001a\u00020\u0003\u0012\u0006\u0010i\u001a\u00020\u0001\u0012\u0006\u0010j\u001a\u00020\u0005\u0012\u0006\u0010k\u001a\u00020\u0001\u0012\u0006\u0010l\u001a\u00020\u0001\u0012\u0006\u0010m\u001a\u00020\u0005\u0012\u0006\u0010n\u001a\u00020\u0005\u0012\u0006\u0010o\u001a\u00020\u0003\u0012\u0006\u0010p\u001a\u00020\u0001\u0012\u0006\u0010q\u001a\u00020\u0003\u0012\u0006\u0010r\u001a\u00020\u0001\u0012\u0006\u0010s\u001a\u00020\u0001\u0012\u0006\u0010t\u001a\u00020\u0001\u0012\u0006\u0010u\u001a\u00020\u0005\u0012\u0006\u0010v\u001a\u00020\u0001\u0012\u0006\u0010w\u001a\u00020\u0001\u00a2\u0006\u0002\u0010xJ\n\u0010\u00ef\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f0\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00f1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00f2\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00f3\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00f4\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f6\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00f7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f8\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00f9\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00fa\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00fc\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00fd\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00fe\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ff\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0083\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0085\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a0\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a1\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a2\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a3\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a4\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a5\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a6\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a7\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a8\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a9\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00aa\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ac\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ad\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ae\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00af\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b0\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b1\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b2\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b3\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b4\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b5\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b6\u0002\u001a\u00020BH\u00c6\u0003J\n\u0010\u00b7\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b8\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b9\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ba\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00bb\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00bc\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00bd\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00be\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bf\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00c0\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c1\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c2\u0002\u001a\u00020BH\u00c6\u0003J\n\u0010\u00c3\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c4\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c5\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c6\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c7\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00c8\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00c9\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ca\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cb\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cc\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cd\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ce\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00cf\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00d0\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d1\u0002\u001a\u00020\\H\u00c6\u0003J\n\u0010\u00d2\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d3\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00d4\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00d5\u0002\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u00d6\u0002\u001a\b\u0012\u0004\u0012\u00020b0aH\u00c6\u0003J\n\u0010\u00d7\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d8\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d9\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00da\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00db\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00dc\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dd\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00de\u0002\u001a\u00020\u0005H\u00c6\u0003J\u00f0\b\u0010\u00df\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00012\b\b\u0002\u0010\'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00012\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00012\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010<\u001a\u00020\u00012\b\b\u0002\u0010=\u001a\u00020\u00012\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010@\u001a\u00020\u00012\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020\u00052\b\b\u0002\u0010F\u001a\u00020\u00012\b\b\u0002\u0010G\u001a\u00020\u00012\b\b\u0002\u0010H\u001a\u00020\u00012\b\b\u0002\u0010I\u001a\u00020\u00012\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00012\b\b\u0002\u0010M\u001a\u00020B2\b\b\u0002\u0010N\u001a\u00020\u00012\b\b\u0002\u0010O\u001a\u00020\u00012\b\b\u0002\u0010P\u001a\u00020\u00012\b\b\u0002\u0010Q\u001a\u00020\u00012\b\b\u0002\u0010R\u001a\u00020\u00012\b\b\u0002\u0010S\u001a\u00020\u00052\b\b\u0002\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020\u00032\b\b\u0002\u0010W\u001a\u00020\u00012\b\b\u0002\u0010X\u001a\u00020\u00012\b\b\u0002\u0010Y\u001a\u00020\u00012\b\b\u0002\u0010Z\u001a\u00020\u00032\b\b\u0002\u0010[\u001a\u00020\\2\b\b\u0002\u0010]\u001a\u00020\u00032\b\b\u0002\u0010^\u001a\u00020\u00012\b\b\u0002\u0010_\u001a\u00020\u00032\u000e\b\u0002\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a2\b\b\u0002\u0010c\u001a\u00020\u00052\b\b\u0002\u0010d\u001a\u00020\u00052\b\b\u0002\u0010e\u001a\u00020\u00032\b\b\u0002\u0010f\u001a\u00020\u00012\b\b\u0002\u0010g\u001a\u00020\u00052\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00012\b\b\u0002\u0010j\u001a\u00020\u00052\b\b\u0002\u0010k\u001a\u00020\u00012\b\b\u0002\u0010l\u001a\u00020\u00012\b\b\u0002\u0010m\u001a\u00020\u00052\b\b\u0002\u0010n\u001a\u00020\u00052\b\b\u0002\u0010o\u001a\u00020\u00032\b\b\u0002\u0010p\u001a\u00020\u00012\b\b\u0002\u0010q\u001a\u00020\u00032\b\b\u0002\u0010r\u001a\u00020\u00012\b\b\u0002\u0010s\u001a\u00020\u00012\b\b\u0002\u0010t\u001a\u00020\u00012\b\b\u0002\u0010u\u001a\u00020\u00052\b\b\u0002\u0010v\u001a\u00020\u00012\b\b\u0002\u0010w\u001a\u00020\u0001H\u00c6\u0001J\u0015\u0010\u00e0\u0002\u001a\u00020B2\t\u0010\u00e1\u0002\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00e2\u0002\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00e3\u0002\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010~R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010|R\u0012\u0010\b\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010zR\u0012\u0010\t\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010~R\u0012\u0010\n\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010zR\u0012\u0010\u000b\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010~R\u0012\u0010\f\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010~R\u0012\u0010\r\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010|R\u0012\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010~R\u0012\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010zR\u0012\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010~R\u0012\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010|R\u0012\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010~R\u0012\u0010\u0013\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010~R\u0012\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010~R\u0012\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010|R\u0012\u0010\u0016\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010~R\u0012\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010~R\u0012\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010~R\u0012\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010|R\u0012\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010zR\u0012\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010~R\u0012\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010zR\u0012\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010|R\u0012\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010|R\u0012\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010zR\u0012\u0010 \u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010~R\u0012\u0010!\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010|R\u0012\u0010\"\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010|R\u0012\u0010#\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010zR\u0012\u0010$\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010|R\u0012\u0010%\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010|R\u0012\u0010&\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010~R\u0012\u0010\'\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010|R\u0012\u0010(\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a0\u0001\u0010|R\u0012\u0010)\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010|R\u0012\u0010*\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0001\u0010zR\u0012\u0010+\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010~R\u0012\u0010,\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010|R\u0012\u0010-\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010zR\u0012\u0010.\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010zR\u0012\u0010/\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010~R\u0012\u00100\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a8\u0001\u0010~R\u0012\u00101\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a9\u0001\u0010|R\u0012\u00102\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010~R\u0012\u00103\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010zR\u0012\u00104\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010|R\u0012\u00105\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010|R\u0012\u00106\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010zR\u0012\u00107\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00af\u0001\u0010~R\u0012\u00108\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b0\u0001\u0010|R\u0012\u00109\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010zR\u0012\u0010:\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010~R\u0012\u0010;\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010~R\u0012\u0010<\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b4\u0001\u0010~R\u0012\u0010=\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010~R\u0012\u0010>\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b6\u0001\u0010|R\u0012\u0010?\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b7\u0001\u0010~R\u0012\u0010@\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b8\u0001\u0010~R\u0013\u0010A\u001a\u00020B\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b9\u0001\u0010\u00ba\u0001R\u0012\u0010C\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bb\u0001\u0010|R\u0012\u0010D\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bc\u0001\u0010|R\u0012\u0010E\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bd\u0001\u0010|R\u0012\u0010F\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00be\u0001\u0010~R\u0012\u0010G\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bf\u0001\u0010~R\u0012\u0010H\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c0\u0001\u0010~R\u0012\u0010I\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c1\u0001\u0010~R\u0012\u0010J\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c2\u0001\u0010|R\u0012\u0010K\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c3\u0001\u0010zR\u0012\u0010L\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c4\u0001\u0010~R\u0013\u0010M\u001a\u00020B\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c5\u0001\u0010\u00ba\u0001R\u0012\u0010N\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c6\u0001\u0010~R\u0012\u0010O\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c7\u0001\u0010~R\u0012\u0010P\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c8\u0001\u0010~R\u0012\u0010Q\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c9\u0001\u0010~R\u0012\u0010R\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ca\u0001\u0010~R\u0012\u0010S\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cb\u0001\u0010|R\u0012\u0010T\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cc\u0001\u0010zR\u0012\u0010U\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cd\u0001\u0010zR\u0012\u0010V\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ce\u0001\u0010zR\u0012\u0010W\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cf\u0001\u0010~R\u0012\u0010X\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d0\u0001\u0010~R\u0012\u0010Y\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d1\u0001\u0010~R\u0012\u0010Z\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d2\u0001\u0010zR\u0013\u0010[\u001a\u00020\\\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00d3\u0001\u0010\u00d4\u0001R\u0012\u0010]\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d5\u0001\u0010zR\u0012\u0010^\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d6\u0001\u0010~R\u0012\u0010_\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d7\u0001\u0010zR\u0019\u0010`\u001a\b\u0012\u0004\u0012\u00020b0a\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00d8\u0001\u0010\u00d9\u0001R\u0012\u0010c\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00da\u0001\u0010|R\u0012\u0010d\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00db\u0001\u0010|R\u0012\u0010e\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00dc\u0001\u0010zR\u0012\u0010f\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00dd\u0001\u0010~R\u0012\u0010g\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00de\u0001\u0010|R\u0012\u0010h\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00df\u0001\u0010zR\u0012\u0010i\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e0\u0001\u0010~R\u0012\u0010j\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e1\u0001\u0010|R\u0012\u0010k\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e2\u0001\u0010~R\u0012\u0010l\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e3\u0001\u0010~R\u0012\u0010m\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e4\u0001\u0010|R\u0012\u0010n\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e5\u0001\u0010|R\u0012\u0010o\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e6\u0001\u0010zR\u0012\u0010p\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e7\u0001\u0010~R\u0012\u0010q\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e8\u0001\u0010zR\u0012\u0010r\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e9\u0001\u0010~R\u0012\u0010s\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ea\u0001\u0010~R\u0012\u0010t\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00eb\u0001\u0010~R\u0012\u0010u\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ec\u0001\u0010|R\u0012\u0010v\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ed\u0001\u0010~R\u0012\u0010w\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ee\u0001\u0010~\u00a8\u0006\u00e4\u0002"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/EnquiryData;", "", "AddedBy", "", "AddedUser", "", "Ambience", "AssignPerson", "AssignTo", "AssignedBy", "AssignedByID", "AssignedDate", "AssignedEmployees", "BestTimeToContact", "BranchCode", "BranchID", "BranchList", "BranchName", "BusinessVolume", "CRFile", "CRNo", "City", "ColorCode", "Competitors", "ConfirmedDate", "Country", "CountryID", "CountryList", "CreatedBy", "CreatedDate", "CreatedOn", "CustomerCategoryID", "CustomerCategoryList", "CustomerCategoryName", "CustomerCode", "CustomerID", "CustomerName", "CustomerPOCName", "CustomerViewModel", "DBAEmail", "DBAMobileNo", "DBAName", "DeleteStatus", "DistrictList", "Ditstrict", "DitstrictID", "DivisionId", "EmployeeIds", "EmployeeList", "EnquiryDetails", "EnquiryEquipmentTypeDetailsList", "EnquiryID", "EnquiryNo", "EnquiryStatus", "EnquiryStatusID", "EnquiryStatusViewModel", "EnquiryType", "EnquiryTypeID", "EnquiryTypeViewModel", "EquipmentCount", "EquipmentType", "EquipmentTypeList", "ExpectedBusinessPerMonth", "ExportList", "FollowStatus", "FollowUpColorStatus", "", "FollowUp_Date", "FollowupDate", "FromDate", "HowIsStoreFront", "HowToJoin", "HowToServeUrself", "Image", "Industry", "IndustryID", "IndustryViewModel", "IsDefaultUser", "MainNeeds", "MenuFile", "ModelCustomer", "ModelPrevilege", "Need", "NextFollowUpDate", "NoOfSeats", "OrganisationID", "OrganisationId", "PINCode", "Period", "PreviousAssign", "PreviousAssignID", "ProjBusinessValue", "", "Quantity", "Region", "RegionID", "RegionViewModel", "", "Lcom/bb/bigbasketsalesapp/ui/fragments/manageCustomers/model/RegionViewModel;", "Remarks", "Source", "SourceID", "SourceViewModel", "State", "StateID", "StateList", "Status", "StoreFile", "StoreInterior", "StreetName", "ToDate", "TurnOver", "Typology", "UserID", "UserList", "VATFile", "VATNo", "WebsiteName", "ZipCode", "lstEnquiryViewModel", "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IDILjava/lang/Object;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getAddedBy", "()I", "getAddedUser", "()Ljava/lang/String;", "getAmbience", "()Ljava/lang/Object;", "getAssignPerson", "getAssignTo", "getAssignedBy", "getAssignedByID", "getAssignedDate", "getAssignedEmployees", "getBestTimeToContact", "getBranchCode", "getBranchID", "getBranchList", "getBranchName", "getBusinessVolume", "getCRFile", "getCRNo", "getCity", "getColorCode", "getCompetitors", "getConfirmedDate", "getCountry", "getCountryID", "getCountryList", "getCreatedBy", "getCreatedDate", "getCreatedOn", "getCustomerCategoryID", "getCustomerCategoryList", "getCustomerCategoryName", "getCustomerCode", "getCustomerID", "getCustomerName", "getCustomerPOCName", "getCustomerViewModel", "getDBAEmail", "getDBAMobileNo", "getDBAName", "getDeleteStatus", "getDistrictList", "getDitstrict", "getDitstrictID", "getDivisionId", "getEmployeeIds", "getEmployeeList", "getEnquiryDetails", "getEnquiryEquipmentTypeDetailsList", "getEnquiryID", "getEnquiryNo", "getEnquiryStatus", "getEnquiryStatusID", "getEnquiryStatusViewModel", "getEnquiryType", "getEnquiryTypeID", "getEnquiryTypeViewModel", "getEquipmentCount", "getEquipmentType", "getEquipmentTypeList", "getExpectedBusinessPerMonth", "getExportList", "getFollowStatus", "getFollowUpColorStatus", "()Z", "getFollowUp_Date", "getFollowupDate", "getFromDate", "getHowIsStoreFront", "getHowToJoin", "getHowToServeUrself", "getImage", "getIndustry", "getIndustryID", "getIndustryViewModel", "getIsDefaultUser", "getMainNeeds", "getMenuFile", "getModelCustomer", "getModelPrevilege", "getNeed", "getNextFollowUpDate", "getNoOfSeats", "getOrganisationID", "getOrganisationId", "getPINCode", "getPeriod", "getPreviousAssign", "getPreviousAssignID", "getProjBusinessValue", "()D", "getQuantity", "getRegion", "getRegionID", "getRegionViewModel", "()Ljava/util/List;", "getRemarks", "getSource", "getSourceID", "getSourceViewModel", "getState", "getStateID", "getStateList", "getStatus", "getStoreFile", "getStoreInterior", "getStreetName", "getToDate", "getTurnOver", "getTypology", "getUserID", "getUserList", "getVATFile", "getVATNo", "getWebsiteName", "getZipCode", "getLstEnquiryViewModel", "component1", "component10", "component100", "component101", "component102", "component103", "component104", "component105", "component106", "component107", "component108", "component109", "component11", "component110", "component111", "component112", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class EnquiryData {
    private final int AddedBy = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AddedUser = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Ambience = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String AssignPerson = null;
    private final int AssignTo = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object AssignedBy = null;
    private final int AssignedByID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object AssignedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object AssignedEmployees = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BestTimeToContact = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchCode = null;
    private final int BranchID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BranchName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BusinessVolume = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CRFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CRNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String City = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ColorCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Competitors = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ConfirmedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Country = null;
    private final int CountryID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CountryList = null;
    private final int CreatedBy = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedOn = null;
    private final int CustomerCategoryID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerCategoryList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerCategoryName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerCode = null;
    private final int CustomerID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerPOCName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DBAEmail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DBAMobileNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DBAName = null;
    private final int DeleteStatus = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DistrictList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Ditstrict = null;
    private final int DitstrictID = 0;
    private final int DivisionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmployeeIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmployeeList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EnquiryDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EnquiryEquipmentTypeDetailsList = null;
    private final int EnquiryID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EnquiryNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EnquiryStatus = null;
    private final int EnquiryStatusID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EnquiryStatusViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EnquiryType = null;
    private final int EnquiryTypeID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EnquiryTypeViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EquipmentCount = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EquipmentType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EquipmentTypeList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ExpectedBusinessPerMonth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ExportList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object FollowStatus = null;
    private final boolean FollowUpColorStatus = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FollowUp_Date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FollowupDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String FromDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowIsStoreFront = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowToJoin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowToServeUrself = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Industry = null;
    private final int IndustryID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object IndustryViewModel = null;
    private final boolean IsDefaultUser = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MainNeeds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MenuFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ModelCustomer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ModelPrevilege = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Need = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String NextFollowUpDate = null;
    private final int NoOfSeats = 0;
    private final int OrganisationID = 0;
    private final int OrganisationId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object PINCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Period = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object PreviousAssign = null;
    private final int PreviousAssignID = 0;
    private final double ProjBusinessValue = 0.0;
    private final int Quantity = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Region = null;
    private final int RegionID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.RegionViewModel> RegionViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Remarks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Source = null;
    private final int SourceID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SourceViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String State = null;
    private final int StateID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StateList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StoreFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StoreInterior = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String StreetName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ToDate = null;
    private final int TurnOver = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Typology = null;
    private final int UserID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object UserList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object VATFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object VATNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String WebsiteName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ZipCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object lstEnquiryViewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.EnquiryData copy(int AddedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String AddedUser, @org.jetbrains.annotations.NotNull()
    java.lang.Object Ambience, @org.jetbrains.annotations.NotNull()
    java.lang.String AssignPerson, int AssignTo, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedBy, int AssignedByID, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedEmployees, @org.jetbrains.annotations.NotNull()
    java.lang.String BestTimeToContact, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int BranchID, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchList, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchName, @org.jetbrains.annotations.NotNull()
    java.lang.Object BusinessVolume, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRNo, @org.jetbrains.annotations.NotNull()
    java.lang.String City, @org.jetbrains.annotations.NotNull()
    java.lang.Object ColorCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Competitors, @org.jetbrains.annotations.NotNull()
    java.lang.Object ConfirmedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, int CountryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object CountryList, int CreatedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedOn, int CustomerCategoryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerCategoryList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCategoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCode, int CustomerID, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerPOCName, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAMobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAName, int DeleteStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictList, @org.jetbrains.annotations.NotNull()
    java.lang.String Ditstrict, int DitstrictID, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeIds, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeList, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryDetails, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryEquipmentTypeDetailsList, int EnquiryID, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryNo, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryStatus, int EnquiryStatusID, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryStatusViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryType, int EnquiryTypeID, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryTypeViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentCount, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentType, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentTypeList, @org.jetbrains.annotations.NotNull()
    java.lang.String ExpectedBusinessPerMonth, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object FollowStatus, boolean FollowUpColorStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String FollowUp_Date, @org.jetbrains.annotations.NotNull()
    java.lang.String FollowupDate, @org.jetbrains.annotations.NotNull()
    java.lang.String FromDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowIsStoreFront, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToJoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToServeUrself, @org.jetbrains.annotations.NotNull()
    java.lang.Object Image, @org.jetbrains.annotations.NotNull()
    java.lang.String Industry, int IndustryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object IndustryViewModel, boolean IsDefaultUser, @org.jetbrains.annotations.NotNull()
    java.lang.Object MainNeeds, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelCustomer, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, @org.jetbrains.annotations.NotNull()
    java.lang.Object Need, @org.jetbrains.annotations.NotNull()
    java.lang.String NextFollowUpDate, int NoOfSeats, int OrganisationID, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object PINCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Period, @org.jetbrains.annotations.NotNull()
    java.lang.Object PreviousAssign, int PreviousAssignID, double ProjBusinessValue, int Quantity, @org.jetbrains.annotations.NotNull()
    java.lang.Object Region, int RegionID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.RegionViewModel> RegionViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String Remarks, @org.jetbrains.annotations.NotNull()
    java.lang.String Source, int SourceID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SourceViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String State, int StateID, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, @org.jetbrains.annotations.NotNull()
    java.lang.String Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreInterior, @org.jetbrains.annotations.NotNull()
    java.lang.String StreetName, @org.jetbrains.annotations.NotNull()
    java.lang.String ToDate, int TurnOver, @org.jetbrains.annotations.NotNull()
    java.lang.Object Typology, int UserID, @org.jetbrains.annotations.NotNull()
    java.lang.Object UserList, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATNo, @org.jetbrains.annotations.NotNull()
    java.lang.String WebsiteName, @org.jetbrains.annotations.NotNull()
    java.lang.Object ZipCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object lstEnquiryViewModel) {
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
    
    public EnquiryData(int AddedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String AddedUser, @org.jetbrains.annotations.NotNull()
    java.lang.Object Ambience, @org.jetbrains.annotations.NotNull()
    java.lang.String AssignPerson, int AssignTo, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedBy, int AssignedByID, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object AssignedEmployees, @org.jetbrains.annotations.NotNull()
    java.lang.String BestTimeToContact, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int BranchID, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchList, @org.jetbrains.annotations.NotNull()
    java.lang.String BranchName, @org.jetbrains.annotations.NotNull()
    java.lang.Object BusinessVolume, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRNo, @org.jetbrains.annotations.NotNull()
    java.lang.String City, @org.jetbrains.annotations.NotNull()
    java.lang.Object ColorCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Competitors, @org.jetbrains.annotations.NotNull()
    java.lang.Object ConfirmedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, int CountryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object CountryList, int CreatedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedOn, int CustomerCategoryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerCategoryList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCategoryName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCode, int CustomerID, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerPOCName, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAMobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.String DBAName, int DeleteStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictList, @org.jetbrains.annotations.NotNull()
    java.lang.String Ditstrict, int DitstrictID, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeIds, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmployeeList, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryDetails, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryEquipmentTypeDetailsList, int EnquiryID, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryNo, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryStatus, int EnquiryStatusID, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryStatusViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String EnquiryType, int EnquiryTypeID, @org.jetbrains.annotations.NotNull()
    java.lang.Object EnquiryTypeViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentCount, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentType, @org.jetbrains.annotations.NotNull()
    java.lang.Object EquipmentTypeList, @org.jetbrains.annotations.NotNull()
    java.lang.String ExpectedBusinessPerMonth, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object FollowStatus, boolean FollowUpColorStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String FollowUp_Date, @org.jetbrains.annotations.NotNull()
    java.lang.String FollowupDate, @org.jetbrains.annotations.NotNull()
    java.lang.String FromDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowIsStoreFront, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToJoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToServeUrself, @org.jetbrains.annotations.NotNull()
    java.lang.Object Image, @org.jetbrains.annotations.NotNull()
    java.lang.String Industry, int IndustryID, @org.jetbrains.annotations.NotNull()
    java.lang.Object IndustryViewModel, boolean IsDefaultUser, @org.jetbrains.annotations.NotNull()
    java.lang.Object MainNeeds, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelCustomer, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, @org.jetbrains.annotations.NotNull()
    java.lang.Object Need, @org.jetbrains.annotations.NotNull()
    java.lang.String NextFollowUpDate, int NoOfSeats, int OrganisationID, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object PINCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object Period, @org.jetbrains.annotations.NotNull()
    java.lang.Object PreviousAssign, int PreviousAssignID, double ProjBusinessValue, int Quantity, @org.jetbrains.annotations.NotNull()
    java.lang.Object Region, int RegionID, @org.jetbrains.annotations.NotNull()
    java.util.List<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.RegionViewModel> RegionViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String Remarks, @org.jetbrains.annotations.NotNull()
    java.lang.String Source, int SourceID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SourceViewModel, @org.jetbrains.annotations.NotNull()
    java.lang.String State, int StateID, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, @org.jetbrains.annotations.NotNull()
    java.lang.String Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreInterior, @org.jetbrains.annotations.NotNull()
    java.lang.String StreetName, @org.jetbrains.annotations.NotNull()
    java.lang.String ToDate, int TurnOver, @org.jetbrains.annotations.NotNull()
    java.lang.Object Typology, int UserID, @org.jetbrains.annotations.NotNull()
    java.lang.Object UserList, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATNo, @org.jetbrains.annotations.NotNull()
    java.lang.String WebsiteName, @org.jetbrains.annotations.NotNull()
    java.lang.Object ZipCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object lstEnquiryViewModel) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getAddedBy() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddedUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAmbience() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAssignPerson() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getAssignTo() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAssignedBy() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getAssignedByID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAssignedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAssignedEmployees() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBestTimeToContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchCode() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getBranchID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBranchName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBusinessVolume() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCRFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCRNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getColorCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompetitors() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getConfirmedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getCountryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCountryList() {
        return null;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int getCreatedBy() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedOn() {
        return null;
    }
    
    public final int component28() {
        return 0;
    }
    
    public final int getCustomerCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerCategoryList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerCategoryName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerCode() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int getCustomerID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerPOCName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDBAEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDBAMobileNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDBAName() {
        return null;
    }
    
    public final int component39() {
        return 0;
    }
    
    public final int getDeleteStatus() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDistrictList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDitstrict() {
        return null;
    }
    
    public final int component42() {
        return 0;
    }
    
    public final int getDitstrictID() {
        return 0;
    }
    
    public final int component43() {
        return 0;
    }
    
    public final int getDivisionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployeeIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmployeeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnquiryDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEnquiryEquipmentTypeDetailsList() {
        return null;
    }
    
    public final int component48() {
        return 0;
    }
    
    public final int getEnquiryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnquiryNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnquiryStatus() {
        return null;
    }
    
    public final int component51() {
        return 0;
    }
    
    public final int getEnquiryStatusID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEnquiryStatusViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnquiryType() {
        return null;
    }
    
    public final int component54() {
        return 0;
    }
    
    public final int getEnquiryTypeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEnquiryTypeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEquipmentCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEquipmentType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component58() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEquipmentTypeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getExpectedBusinessPerMonth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component60() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getExportList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component61() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFollowStatus() {
        return null;
    }
    
    public final boolean component62() {
        return false;
    }
    
    public final boolean getFollowUpColorStatus() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowUp_Date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component64() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowupDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component65() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component66() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowIsStoreFront() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component67() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowToJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component68() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowToServeUrself() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component69() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component70() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIndustry() {
        return null;
    }
    
    public final int component71() {
        return 0;
    }
    
    public final int getIndustryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component72() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getIndustryViewModel() {
        return null;
    }
    
    public final boolean component73() {
        return false;
    }
    
    public final boolean getIsDefaultUser() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component74() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMainNeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component75() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMenuFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component76() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getModelCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component77() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getModelPrevilege() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component78() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component79() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNextFollowUpDate() {
        return null;
    }
    
    public final int component80() {
        return 0;
    }
    
    public final int getNoOfSeats() {
        return 0;
    }
    
    public final int component81() {
        return 0;
    }
    
    public final int getOrganisationID() {
        return 0;
    }
    
    public final int component82() {
        return 0;
    }
    
    public final int getOrganisationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component83() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPINCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component84() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPeriod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component85() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPreviousAssign() {
        return null;
    }
    
    public final int component86() {
        return 0;
    }
    
    public final int getPreviousAssignID() {
        return 0;
    }
    
    public final double component87() {
        return 0.0;
    }
    
    public final double getProjBusinessValue() {
        return 0.0;
    }
    
    public final int component88() {
        return 0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component89() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRegion() {
        return null;
    }
    
    public final int component90() {
        return 0;
    }
    
    public final int getRegionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.RegionViewModel> component91() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.bb.bigbasketsalesapp.ui.fragments.manageCustomers.model.RegionViewModel> getRegionViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component92() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component93() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    public final int component94() {
        return 0;
    }
    
    public final int getSourceID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component95() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSourceViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component96() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    public final int component97() {
        return 0;
    }
    
    public final int getStateID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component98() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStateList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component99() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component100() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStoreFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component101() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStoreInterior() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component102() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreetName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component103() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToDate() {
        return null;
    }
    
    public final int component104() {
        return 0;
    }
    
    public final int getTurnOver() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component105() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTypology() {
        return null;
    }
    
    public final int component106() {
        return 0;
    }
    
    public final int getUserID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component107() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getUserList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component108() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getVATFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component109() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getVATNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component110() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWebsiteName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component111() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getZipCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component112() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLstEnquiryViewModel() {
        return null;
    }
}