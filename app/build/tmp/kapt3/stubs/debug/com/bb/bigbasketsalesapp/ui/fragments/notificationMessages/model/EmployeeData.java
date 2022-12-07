package com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\t\n\u0003\b\u0091\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00cf\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u0006\u0012\u0006\u0010\'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010)\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\u0001\u0012\u0006\u0010+\u001a\u00020\u0006\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020\u0001\u0012\u0006\u0010/\u001a\u00020\u000b\u0012\u0006\u00100\u001a\u00020\u0001\u0012\u0006\u00101\u001a\u00020\u000b\u0012\u0006\u00102\u001a\u00020\u000b\u0012\u0006\u00103\u001a\u00020\u0001\u0012\u0006\u00104\u001a\u00020\u0001\u0012\u0006\u00105\u001a\u00020\u0001\u0012\u0006\u00106\u001a\u00020\u0001\u0012\u0006\u00107\u001a\u00020\u000b\u0012\u0006\u00108\u001a\u00020\u0001\u0012\u0006\u00109\u001a\u00020\u000b\u0012\u0006\u0010:\u001a\u00020\u000b\u0012\u0006\u0010;\u001a\u00020\u0001\u0012\u0006\u0010<\u001a\u00020\u0006\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010>\u001a\u00020\u0001\u0012\u0006\u0010?\u001a\u00020\u0006\u00a2\u0006\u0002\u0010@J\n\u0010\u0080\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0001H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020-H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a2\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0006H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\u0001H\u00c6\u0003J\u00c6\u0004\u0010\u00b9\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u00012\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u000b2\b\b\u0002\u00102\u001a\u00020\u000b2\b\b\u0002\u00103\u001a\u00020\u00012\b\b\u0002\u00104\u001a\u00020\u00012\b\b\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\u00012\b\b\u0002\u00107\u001a\u00020\u000b2\b\b\u0002\u00108\u001a\u00020\u00012\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010<\u001a\u00020\u00062\b\b\u0002\u0010=\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u00012\b\b\u0002\u0010?\u001a\u00020\u0006H\u00c6\u0001J\u0015\u0010\u00ba\u0001\u001a\u00020\u00042\t\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u000bH\u00d6\u0001J\n\u0010\u00bd\u0001\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010BR\u0011\u0010\b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010BR\u0011\u0010\t\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010BR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010BR\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010BR\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010KR\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010BR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010KR\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010KR\u0011\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010FR\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010FR\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010KR\u0011\u0010\u0017\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010BR\u0011\u0010\u0018\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010BR\u0011\u0010\u0019\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010KR\u0011\u0010\u001a\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010BR\u0011\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010BR\u0011\u0010\u001c\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010BR\u0011\u0010\u001d\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010KR\u0011\u0010\u001e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010BR\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010FR\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010BR\u0011\u0010!\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010FR\u0011\u0010\"\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010FR\u0011\u0010#\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010FR\u0011\u0010$\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010FR\u0011\u0010%\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010KR\u0011\u0010&\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010FR\u0011\u0010\'\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010BR\u0011\u0010(\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010BR\u0011\u0010)\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010BR\u0011\u0010*\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010BR\u0011\u0010+\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010FR\u0011\u0010,\u001a\u00020-\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0011\u0010.\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010BR\u0011\u0010/\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010KR\u0011\u00100\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010BR\u0011\u00101\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010KR\u0011\u00102\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010KR\u0011\u00103\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010BR\u0011\u00104\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010BR\u0011\u00105\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010BR\u0011\u00106\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010BR\u0011\u00107\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010KR\u0011\u00108\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010BR\u0011\u00109\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010KR\u0011\u0010:\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010KR\u0011\u0010;\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010BR\u0011\u0010<\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010FR\u0011\u0010=\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010FR\u0011\u0010>\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010BR\u0011\u0010?\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010F\u00a8\u0006\u00be\u0001"}, d2 = {"Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/EmployeeData;", "", "ActionStatus", "ActiveFlag", "", "BloodGroup", "", "Br_Id", "BranchAddress", "BranchCode", "BranchId", "", "BranchList", "BranchListPOP", "Branch_Id", "Branch_Name", "ChatDetails", "Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatDetails;", "Count", "CurrentPage", "DOB", "DOJ", "DepartmentId", "DepartmentList", "DesignationName", "Designation_Id", "DistrictList", "DivisionDescription", "DivisionList", "Division_Id", "Division_Name", "EmailId", "EmpData", "Emp_Dob", "Emp_Doj", "EmployeeName", "EmployeePhoto", "Employee_Id", "Employeecode", "ExportList", "FileName", "Flag", "GSTIN", "Gender", "MobileNo", "", "ModelPrevilege", "OrganisationId", "OrganisationName", "PageSize", "RoleId", "RoleLists", "RoleName", "SearchKeyWord", "Session_Flag", "StateId", "StateList", "UserId", "User_Id", "active_status", "dateofbrth", "dateofjoin", "genderList", "statusvalue", "(Ljava/lang/Object;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatDetails;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;JLjava/lang/Object;ILjava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;IILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "getActionStatus", "()Ljava/lang/Object;", "getActiveFlag", "()Z", "getBloodGroup", "()Ljava/lang/String;", "getBr_Id", "getBranchAddress", "getBranchCode", "getBranchId", "()I", "getBranchList", "getBranchListPOP", "getBranch_Id", "getBranch_Name", "getChatDetails", "()Lcom/bb/bigbasketsalesapp/ui/fragments/notificationMessages/model/ChatDetails;", "getCount", "getCurrentPage", "getDOB", "getDOJ", "getDepartmentId", "getDepartmentList", "getDesignationName", "getDesignation_Id", "getDistrictList", "getDivisionDescription", "getDivisionList", "getDivision_Id", "getDivision_Name", "getEmailId", "getEmpData", "getEmp_Dob", "getEmp_Doj", "getEmployeeName", "getEmployeePhoto", "getEmployee_Id", "getEmployeecode", "getExportList", "getFileName", "getFlag", "getGSTIN", "getGender", "getMobileNo", "()J", "getModelPrevilege", "getOrganisationId", "getOrganisationName", "getPageSize", "getRoleId", "getRoleLists", "getRoleName", "getSearchKeyWord", "getSession_Flag", "getStateId", "getStateList", "getUserId", "getUser_Id", "getActive_status", "getDateofbrth", "getDateofjoin", "getGenderList", "getStatusvalue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "BBSales_debug"})
public final class EmployeeData {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ActionStatus = null;
    private final boolean ActiveFlag = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String BloodGroup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Br_Id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchAddress = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchCode = null;
    private final int BranchId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object BranchListPOP = null;
    private final int Branch_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Branch_Name = null;
    @org.jetbrains.annotations.Nullable()
    private final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatDetails ChatDetails = null;
    private final int Count = 0;
    private final int CurrentPage = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DOB = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String DOJ = null;
    private final int DepartmentId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DepartmentList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DesignationName = null;
    private final int Designation_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DistrictList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionDescription = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DivisionList = null;
    private final int Division_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Division_Name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmailId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object EmpData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Emp_Dob = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Emp_Doj = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmployeeName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String EmployeePhoto = null;
    private final int Employee_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Employeecode = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ExportList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object FileName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Flag = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object GSTIN = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Gender = null;
    private final long MobileNo = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ModelPrevilege = null;
    private final int OrganisationId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object OrganisationName = null;
    private final int PageSize = 0;
    private final int RoleId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RoleLists = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object RoleName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SearchKeyWord = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Session_Flag = null;
    private final int StateId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object StateList = null;
    private final int UserId = 0;
    private final int User_Id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object active_status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateofbrth = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateofjoin = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object genderList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String statusvalue = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.EmployeeData copy(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, boolean ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.lang.String BloodGroup, @org.jetbrains.annotations.NotNull()
    java.lang.Object Br_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchAddress, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchList, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchListPOP, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Branch_Name, @org.jetbrains.annotations.Nullable()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatDetails ChatDetails, int Count, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.String DOB, @org.jetbrains.annotations.NotNull()
    java.lang.String DOJ, int DepartmentId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DepartmentList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DesignationName, int Designation_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionDescription, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionList, int Division_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Division_Name, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmpData, @org.jetbrains.annotations.NotNull()
    java.lang.String Emp_Dob, @org.jetbrains.annotations.NotNull()
    java.lang.String Emp_Doj, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeeName, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeePhoto, int Employee_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Employeecode, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object FileName, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.Object GSTIN, @org.jetbrains.annotations.NotNull()
    java.lang.String Gender, long MobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object OrganisationName, int PageSize, int RoleId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleLists, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleName, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object Session_Flag, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, int UserId, int User_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object active_status, @org.jetbrains.annotations.NotNull()
    java.lang.String dateofbrth, @org.jetbrains.annotations.NotNull()
    java.lang.String dateofjoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object genderList, @org.jetbrains.annotations.NotNull()
    java.lang.String statusvalue) {
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
    
    public EmployeeData(@org.jetbrains.annotations.NotNull()
    java.lang.Object ActionStatus, boolean ActiveFlag, @org.jetbrains.annotations.NotNull()
    java.lang.String BloodGroup, @org.jetbrains.annotations.NotNull()
    java.lang.Object Br_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchAddress, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchCode, int BranchId, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchList, @org.jetbrains.annotations.NotNull()
    java.lang.Object BranchListPOP, int Branch_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Branch_Name, @org.jetbrains.annotations.Nullable()
    com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatDetails ChatDetails, int Count, int CurrentPage, @org.jetbrains.annotations.NotNull()
    java.lang.String DOB, @org.jetbrains.annotations.NotNull()
    java.lang.String DOJ, int DepartmentId, @org.jetbrains.annotations.NotNull()
    java.lang.Object DepartmentList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DesignationName, int Designation_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictList, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionDescription, @org.jetbrains.annotations.NotNull()
    java.lang.Object DivisionList, int Division_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object Division_Name, @org.jetbrains.annotations.NotNull()
    java.lang.String EmailId, @org.jetbrains.annotations.NotNull()
    java.lang.Object EmpData, @org.jetbrains.annotations.NotNull()
    java.lang.String Emp_Dob, @org.jetbrains.annotations.NotNull()
    java.lang.String Emp_Doj, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeeName, @org.jetbrains.annotations.NotNull()
    java.lang.String EmployeePhoto, int Employee_Id, @org.jetbrains.annotations.NotNull()
    java.lang.String Employeecode, @org.jetbrains.annotations.NotNull()
    java.lang.Object ExportList, @org.jetbrains.annotations.NotNull()
    java.lang.Object FileName, @org.jetbrains.annotations.NotNull()
    java.lang.Object Flag, @org.jetbrains.annotations.NotNull()
    java.lang.Object GSTIN, @org.jetbrains.annotations.NotNull()
    java.lang.String Gender, long MobileNo, @org.jetbrains.annotations.NotNull()
    java.lang.Object ModelPrevilege, int OrganisationId, @org.jetbrains.annotations.NotNull()
    java.lang.Object OrganisationName, int PageSize, int RoleId, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleLists, @org.jetbrains.annotations.NotNull()
    java.lang.Object RoleName, @org.jetbrains.annotations.NotNull()
    java.lang.Object SearchKeyWord, @org.jetbrains.annotations.NotNull()
    java.lang.Object Session_Flag, int StateId, @org.jetbrains.annotations.NotNull()
    java.lang.Object StateList, int UserId, int User_Id, @org.jetbrains.annotations.NotNull()
    java.lang.Object active_status, @org.jetbrains.annotations.NotNull()
    java.lang.String dateofbrth, @org.jetbrains.annotations.NotNull()
    java.lang.String dateofjoin, @org.jetbrains.annotations.NotNull()
    java.lang.Object genderList, @org.jetbrains.annotations.NotNull()
    java.lang.String statusvalue) {
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
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getActiveFlag() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBloodGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBr_Id() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchCode() {
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
    public final java.lang.Object getBranchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranchListPOP() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getBranch_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getBranch_Name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatDetails component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bb.bigbasketsalesapp.ui.fragments.notificationMessages.model.ChatDetails getChatDetails() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDOB() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDOJ() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getDepartmentId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDepartmentList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDesignationName() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getDesignation_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDistrictList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivisionList() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int getDivision_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDivision_Name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmailId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getEmpData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmp_Dob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmp_Doj() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployeeName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployeePhoto() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int getEmployee_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmployeecode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getExportList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFileName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFlag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getGSTIN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final long component39() {
        return 0L;
    }
    
    public final long getMobileNo() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getModelPrevilege() {
        return null;
    }
    
    public final int component41() {
        return 0;
    }
    
    public final int getOrganisationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getOrganisationName() {
        return null;
    }
    
    public final int component43() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    public final int component44() {
        return 0;
    }
    
    public final int getRoleId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRoleLists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getRoleName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSearchKeyWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSession_Flag() {
        return null;
    }
    
    public final int component49() {
        return 0;
    }
    
    public final int getStateId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStateList() {
        return null;
    }
    
    public final int component51() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final int component52() {
        return 0;
    }
    
    public final int getUser_Id() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getActive_status() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateofbrth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateofjoin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getGenderList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatusvalue() {
        return null;
    }
}