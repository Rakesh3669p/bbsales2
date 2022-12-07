package com.bb.bigbasketsalesapp.ui.fragments.customersList.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0003\b\u00ff\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00ad\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0012\u0012\u0006\u0010$\u001a\u00020\r\u0012\u0006\u0010%\u001a\u00020\r\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\r\u0012\u0006\u0010)\u001a\u00020\r\u0012\u0006\u0010*\u001a\u00020\u0012\u0012\u0006\u0010+\u001a\u00020\r\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0012\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\b\u0012\u0006\u00103\u001a\u00020\u0012\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\r\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0012\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\r\u0012\u0006\u0010D\u001a\u00020\r\u0012\u0006\u0010E\u001a\u00020\u0012\u0012\u0006\u0010F\u001a\u00020\r\u0012\u0006\u0010G\u001a\u00020\u0003\u0012\u0006\u0010H\u001a\u00020\n\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0003\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\r\u0012\u0006\u0010M\u001a\u00020\u0012\u0012\u0006\u0010N\u001a\u00020\r\u0012\u0006\u0010O\u001a\u00020\u0003\u0012\u0006\u0010P\u001a\u00020\u0003\u0012\u0006\u0010Q\u001a\u00020\u0012\u0012\u0006\u0010R\u001a\u00020\u0003\u0012\u0006\u0010S\u001a\u00020\u0003\u0012\u0006\u0010T\u001a\u00020\u0012\u0012\u0006\u0010U\u001a\u00020\n\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010W\u001a\u00020\u0003\u0012\u0006\u0010X\u001a\u00020\r\u0012\u0006\u0010Y\u001a\u00020\u0003\u0012\u0006\u0010Z\u001a\u00020\u0003\u0012\u0006\u0010[\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\\J\n\u0010\u00b7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00c1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c3\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00c4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c5\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00c7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c8\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00c9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ca\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00cb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cc\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00cd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ce\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00cf\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00d0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d1\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00d2\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00d3\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00d4\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00d5\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00d6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d9\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00da\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00db\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dd\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00de\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00df\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e1\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e2\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00e3\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00e4\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u00e5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00e8\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00e9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ea\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00eb\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ec\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ed\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ee\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00ef\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f0\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00f1\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00f2\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00f3\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00f4\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\nH\u00c6\u0003J\n\u0010\u00f6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f7\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fa\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u00fc\u0001\u001a\u00020\rH\u00c6\u0003J\n\u0010\u00fd\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fe\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ff\u0001\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0012H\u00c6\u0003J\n\u0010\u0083\u0002\u001a\u00020\nH\u00c6\u0003J\n\u0010\u0084\u0002\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0085\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0002\u001a\u00020\rH\u00c6\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0003H\u00c6\u0003J\u00dc\u0006\u0010\u008c\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\r2\b\b\u0002\u0010%\u001a\u00020\r2\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\b2\b\b\u0002\u0010(\u001a\u00020\r2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u0010+\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\r2\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020\u00122\b\b\u0002\u0010=\u001a\u00020\u00032\b\b\u0002\u0010>\u001a\u00020\u00032\b\b\u0002\u0010?\u001a\u00020\u00032\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\r2\b\b\u0002\u0010D\u001a\u00020\r2\b\b\u0002\u0010E\u001a\u00020\u00122\b\b\u0002\u0010F\u001a\u00020\r2\b\b\u0002\u0010G\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u00020\n2\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00032\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\r2\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010N\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u00032\b\b\u0002\u0010P\u001a\u00020\u00032\b\b\u0002\u0010Q\u001a\u00020\u00122\b\b\u0002\u0010R\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u00122\b\b\u0002\u0010U\u001a\u00020\n2\b\b\u0002\u0010V\u001a\u00020\u00032\b\b\u0002\u0010W\u001a\u00020\u00032\b\b\u0002\u0010X\u001a\u00020\r2\b\b\u0002\u0010Y\u001a\u00020\u00032\b\b\u0002\u0010Z\u001a\u00020\u00032\b\b\u0002\u0010[\u001a\u00020\u0003H\u00c6\u0001J\u0015\u0010\u008d\u0002\u001a\u00020\b2\t\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\n\u0010\u008f\u0002\u001a\u00020\rH\u00d6\u0001J\n\u0010\u0090\u0002\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010^R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010^R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010^R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010^R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010^R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010^R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010^R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010^R\u0011\u0010\u0014\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010hR\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010mR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010^R\u0011\u0010\u0017\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010hR\u0011\u0010\u0018\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010hR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010^R\u0011\u0010\u001a\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010mR\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010^R\u0011\u0010\u001c\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010mR\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010^R\u0011\u0010\u001d\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010mR\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010cR\u0011\u0010 \u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010^R\u0011\u0010!\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010hR\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010^R\u0011\u0010#\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010mR\u0011\u0010$\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010hR\u0012\u0010%\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010hR\u0012\u0010&\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010^R\u0012\u0010\'\u001a\u00020\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010cR\u0012\u0010(\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010hR\u0012\u0010)\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010hR\u0012\u0010*\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010mR\u0012\u0010+\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010hR\u0012\u0010,\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010^R\u0012\u0010-\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010^R\u0012\u0010.\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010mR\u0012\u0010D\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010hR\u0012\u0010/\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010^R\u0012\u00100\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010^R\u0012\u00101\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010^R\u0012\u00102\u001a\u00020\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010cR\u0012\u00103\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010mR\u0012\u00104\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010^R\u0012\u00105\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010^R\u0012\u00106\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010^R\u0012\u00107\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010hR\u0012\u00108\u001a\u00020\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010cR\u0012\u00109\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010^R\u0012\u0010:\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010^R\u0012\u0010;\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010^R\u0012\u0010<\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010mR\u0012\u0010=\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010^R\u0012\u0010>\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010^R\u0012\u0010?\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010^R\u0012\u0010@\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010^R\u0012\u0010A\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010^R\u0012\u0010B\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010^R\u0012\u0010C\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010hR\u0012\u0010E\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a0\u0001\u0010mR\u0012\u0010F\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010hR\u0012\u0010G\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0001\u0010^R\u0012\u0010H\u001a\u00020\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a3\u0001\u0010eR\u0012\u0010I\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010^R\u0012\u0010J\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010^R\u0012\u0010K\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010^R\u0012\u0010L\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010hR\u0012\u0010M\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a8\u0001\u0010mR\u0012\u0010N\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a9\u0001\u0010hR\u0012\u0010O\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010^R\u0012\u0010P\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010^R\u0012\u0010Q\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010mR\u0012\u0010R\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010^R\u0012\u0010S\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010^R\u0012\u0010T\u001a\u00020\u0012\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00af\u0001\u0010mR\u0012\u0010U\u001a\u00020\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b0\u0001\u0010eR\u0012\u0010V\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010^R\u0012\u0010W\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010^R\u0012\u0010X\u001a\u00020\r\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010hR\u0012\u0010Y\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b4\u0001\u0010^R\u0012\u0010Z\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010^R\u0012\u0010[\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b6\u0001\u0010^\u00a8\u0006\u0091\u0002"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/customersList/model/CustomerData;", "Ljava/io/Serializable;", "ActionStatus", "", "ActiveFlag", "ActiveStatus", "Ambience", "AuthorityApproval", "", "BalanceAmount", "", "BestTimeToContact", "BranchId", "", "BusinessType", "CRFile", "CRNo", "City", "", "Competitors", "Count", "Country", "CountryList", "Country_Id", "CurrentPage", "CustomerAddress", "CustomerCode", "CustomerList", "CustomerName", "CustomerPhoto", "CustomerPOCName", "CustomerStatus", "CustomerStatus1", "CustomerType", "CustomerTypeList", "CustomerTypeName", "Customer_Id", "Customer_Type_Id", "DBAName", "Del_Status", "DistrictID", "DistrictId", "DistrictName", "DivisionId", "DivisionList", "DivisionName", "EmailID", "ExportList", "Flag", "Flag1", "GSTCalculation", "GSTNomber", "HowIsStoreFront", "HowToJoin", "HowToServeUrself", "IndustryID", "IsNDPApplicable", "Landline", "MainNeeds", "MenuFile", "MobileNo", "MobileNo1", "MobileNo2", "ModelPrevilege", "Need", "NoOfSeats", "OnboardingStatus", "OrganisationId", "EnquiryID", "PINCode", "PageSize", "Quantity", "Returnamount", "SearchKeyWord", "SearchStatus", "Session_Flag", "SourceID", "State", "StateId", "StateList", "StateName", "Status", "StoreFile", "StoreInterior", "Street", "TotalAmount", "TurnOver", "Typology", "UserId", "VATFile", "VATNo", "WebsiteName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZDLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Object;ILjava/lang/Object;Ljava/lang/String;IILjava/lang/Object;ZIILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IILjava/lang/String;ILjava/lang/Object;DLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;DLjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getActionStatus", "()Ljava/lang/Object;", "getActiveFlag", "getActiveStatus", "getAmbience", "getAuthorityApproval", "()Z", "getBalanceAmount", "()D", "getBestTimeToContact", "getBranchId", "()I", "getBusinessType", "getCRFile", "getCRNo", "getCity", "()Ljava/lang/String;", "getCompetitors", "getCount", "getCountry", "getCountryList", "getCountry_Id", "getCurrentPage", "getCustomerAddress", "getCustomerCode", "getCustomerList", "getCustomerName", "getCustomerPOCName", "getCustomerPhoto", "getCustomerStatus", "getCustomerStatus1", "getCustomerType", "getCustomerTypeList", "getCustomerTypeName", "getCustomer_Id", "getCustomer_Type_Id", "getDBAName", "getDel_Status", "getDistrictID", "getDistrictId", "getDistrictName", "getDivisionId", "getDivisionList", "getDivisionName", "getEmailID", "getEnquiryID", "getExportList", "getFlag", "getFlag1", "getGSTCalculation", "getGSTNomber", "getHowIsStoreFront", "getHowToJoin", "getHowToServeUrself", "getIndustryID", "getIsNDPApplicable", "getLandline", "getMainNeeds", "getMenuFile", "getMobileNo", "getMobileNo1", "getMobileNo2", "getModelPrevilege", "getNeed", "getNoOfSeats", "getOnboardingStatus", "getOrganisationId", "getPINCode", "getPageSize", "getQuantity", "getReturnamount", "getSearchKeyWord", "getSearchStatus", "getSession_Flag", "getSourceID", "getState", "getStateId", "getStateList", "getStateName", "getStatus", "getStoreFile", "getStoreInterior", "getStreet", "getTotalAmount", "getTurnOver", "getTypology", "getUserId", "getVATFile", "getVATNo", "getWebsiteName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class CustomerData implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActionStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActiveFlag = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActiveStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Ambience = null;
    private final boolean AuthorityApproval = false;
    private final double BalanceAmount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BestTimeToContact = null;
    private final int BranchId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BusinessType = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CRFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CRNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String City = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Competitors = null;
    private final int Count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CountryList = null;
    private final int Country_Id = 0;
    private final int CurrentPage = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerCode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerPhoto = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerPOCName = null;
    private final boolean CustomerStatus = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerStatus1 = null;
    private final int CustomerType = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object CustomerTypeList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CustomerTypeName = null;
    private final int Customer_Id = 0;
    private final int Customer_Type_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DBAName = null;
    private final boolean Del_Status = false;
    private final int DistrictID = 0;
    private final int DistrictId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DistrictName = null;
    private final int DivisionId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmailID = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ExportList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Flag = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Flag1 = null;
    private final boolean GSTCalculation = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String GSTNomber = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowIsStoreFront = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowToJoin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object HowToServeUrself = null;
    private final int IndustryID = 0;
    private final boolean IsNDPApplicable = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Landline = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MainNeeds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MenuFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String MobileNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MobileNo1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object MobileNo2 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ModelPrevilege = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Need = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object NoOfSeats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object OnboardingStatus = null;
    private final int OrganisationId = 0;
    private final int EnquiryID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String PINCode = null;
    private final int PageSize = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Quantity = null;
    private final double Returnamount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchKeyWord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Session_Flag = null;
    private final int SourceID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String State = null;
    private final int StateId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StateList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StateName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StoreFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StoreInterior = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Street = null;
    private final double TotalAmount = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object TurnOver = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Typology = null;
    private final int UserId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object VATFile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object VATNo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object WebsiteName = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.customersList.model.CustomerData copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object Ambience, boolean AuthorityApproval, double BalanceAmount, @org.jetbrains.annotations.NotNull()
    java.lang.Object BestTimeToContact, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BusinessType, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRNo, @org.jetbrains.annotations.NotNull()
    java.lang.String City, @org.jetbrains.annotations.NotNull()
    java.lang.Object Competitors, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, @org.jetbrains.annotations.NotNull()
    java.lang.Object CountryList, int Country_Id, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerPOCName, boolean CustomerStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerStatus1, int CustomerType, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerTypeList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerTypeName, int Customer_Id, int Customer_Type_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object DBAName, boolean Del_Status, int DistrictID, int DistrictId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistrictName, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailID, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag1, boolean GSTCalculation, @org.jetbrains.annotations.NotNull()
    java.lang.String GSTNomber, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowIsStoreFront, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToJoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToServeUrself, int IndustryID, boolean IsNDPApplicable, @org.jetbrains.annotations.NotNull()
    java.lang.Object Landline, @org.jetbrains.annotations.NotNull()
    java.lang.Object MainNeeds, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuFile, @org.jetbrains.annotations.NotNull()
    java.lang.String MobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object MobileNo1, @org.jetbrains.annotations.NotNull()
    java.lang.Object MobileNo2, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, @org.jetbrains.annotations.NotNull()
    java.lang.Object Need, @org.jetbrains.annotations.NotNull()
    java.lang.Object NoOfSeats, @org.jetbrains.annotations.NotNull()
    java.lang.Object OnboardingStatus, int OrganisationId, int EnquiryID, @org.jetbrains.annotations.NotNull()
    java.lang.String PINCode, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.Object Quantity, double Returnamount, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object Session_Flag, int SourceID, @org.jetbrains.annotations.NotNull()
    java.lang.String State, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreInterior, @org.jetbrains.annotations.NotNull()
    java.lang.String Street, double TotalAmount, @org.jetbrains.annotations.NotNull()
    java.lang.Object TurnOver, @org.jetbrains.annotations.NotNull()
    java.lang.Object Typology, int UserId, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object WebsiteName) {
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
    
    public CustomerData(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.lang.Object ActiveStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object Ambience, boolean AuthorityApproval, double BalanceAmount, @org.jetbrains.annotations.NotNull()
    java.lang.Object BestTimeToContact, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BusinessType, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object CRNo, @org.jetbrains.annotations.NotNull()
    java.lang.String City, @org.jetbrains.annotations.NotNull()
    java.lang.Object Competitors, int Count, @org.jetbrains.annotations.NotNull()
    java.lang.String Country, @org.jetbrains.annotations.NotNull()
    java.lang.Object CountryList, int Country_Id, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerCode, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerName, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerPhoto, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerPOCName, boolean CustomerStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerStatus1, int CustomerType, @org.jetbrains.annotations.NotNull()
    java.lang.Object CustomerTypeList, @org.jetbrains.annotations.NotNull()
    java.lang.String CustomerTypeName, int Customer_Id, int Customer_Type_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object DBAName, boolean Del_Status, int DistrictID, int DistrictId, @org.jetbrains.annotations.NotNull()
    java.lang.String DistrictName, int DivisionId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionName, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailID, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag1, boolean GSTCalculation, @org.jetbrains.annotations.NotNull()
    java.lang.String GSTNomber, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowIsStoreFront, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToJoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object HowToServeUrself, int IndustryID, boolean IsNDPApplicable, @org.jetbrains.annotations.NotNull()
    java.lang.Object Landline, @org.jetbrains.annotations.NotNull()
    java.lang.Object MainNeeds, @org.jetbrains.annotations.NotNull()
    java.lang.Object MenuFile, @org.jetbrains.annotations.NotNull()
    java.lang.String MobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object MobileNo1, @org.jetbrains.annotations.NotNull()
    java.lang.Object MobileNo2, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, @org.jetbrains.annotations.NotNull()
    java.lang.Object Need, @org.jetbrains.annotations.NotNull()
    java.lang.Object NoOfSeats, @org.jetbrains.annotations.NotNull()
    java.lang.Object OnboardingStatus, int OrganisationId, int EnquiryID, @org.jetbrains.annotations.NotNull()
    java.lang.String PINCode, int PageSize, @org.jetbrains.annotations.NotNull()
    java.lang.Object Quantity, double Returnamount, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchStatus, @org.jetbrains.annotations.NotNull()
    java.lang.Object Session_Flag, int SourceID, @org.jetbrains.annotations.NotNull()
    java.lang.String State, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateName, @org.jetbrains.annotations.NotNull()
    java.lang.String Status, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object StoreInterior, @org.jetbrains.annotations.NotNull()
    java.lang.String Street, double TotalAmount, @org.jetbrains.annotations.NotNull()
    java.lang.Object TurnOver, @org.jetbrains.annotations.NotNull()
    java.lang.Object Typology, int UserId, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATFile, @org.jetbrains.annotations.NotNull()
    java.lang.Object VATNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object WebsiteName) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getActiveStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAmbience() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getAuthorityApproval() {
        return false;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getBalanceAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBestTimeToContact() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getBranchId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBusinessType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCRFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCRNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCompetitors() {
        return null;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCountryList() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getCountry_Id() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerPhoto() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerPOCName() {
        return null;
    }
    
    public final boolean component25() {
        return false;
    }
    
    public final boolean getCustomerStatus() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerStatus1() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int getCustomerType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCustomerTypeList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerTypeName() {
        return null;
    }
    
    public final int component30() {
        return 0;
    }
    
    public final int getCustomer_Id() {
        return 0;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int getCustomer_Type_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDBAName() {
        return null;
    }
    
    public final boolean component33() {
        return false;
    }
    
    public final boolean getDel_Status() {
        return false;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int getDistrictID() {
        return 0;
    }
    
    public final int component35() {
        return 0;
    }
    
    public final int getDistrictId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrictName() {
        return null;
    }
    
    public final int component37() {
        return 0;
    }
    
    public final int getDivisionId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getExportList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFlag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFlag1() {
        return null;
    }
    
    public final boolean component44() {
        return false;
    }
    
    public final boolean getGSTCalculation() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGSTNomber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowIsStoreFront() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowToJoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getHowToServeUrself() {
        return null;
    }
    
    public final int component49() {
        return 0;
    }
    
    public final int getIndustryID() {
        return 0;
    }
    
    public final boolean component50() {
        return false;
    }
    
    public final boolean getIsNDPApplicable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component51() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLandline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMainNeeds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMenuFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMobileNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMobileNo1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getMobileNo2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getModelPrevilege() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component58() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNeed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getNoOfSeats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component60() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOnboardingStatus() {
        return null;
    }
    
    public final int component61() {
        return 0;
    }
    
    public final int getOrganisationId() {
        return 0;
    }
    
    public final int component62() {
        return 0;
    }
    
    public final int getEnquiryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component63() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPINCode() {
        return null;
    }
    
    public final int component64() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component65() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getQuantity() {
        return null;
    }
    
    public final double component66() {
        return 0.0;
    }
    
    public final double getReturnamount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component67() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchKeyWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component68() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component69() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSession_Flag() {
        return null;
    }
    
    public final int component70() {
        return 0;
    }
    
    public final int getSourceID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component71() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    public final int component72() {
        return 0;
    }
    
    public final int getStateId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component73() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStateList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component74() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStateName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component75() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component76() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStoreFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component77() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStoreInterior() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component78() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreet() {
        return null;
    }
    
    public final double component79() {
        return 0.0;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component80() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTurnOver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component81() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTypology() {
        return null;
    }
    
    public final int component82() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component83() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getVATFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component84() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getVATNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component85() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWebsiteName() {
        return null;
    }
}