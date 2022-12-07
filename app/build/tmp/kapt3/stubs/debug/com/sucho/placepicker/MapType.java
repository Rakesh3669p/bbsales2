package com.sucho.placepicker;

import java.lang.System;

/**
 * NORMAL: Typical road map. Shows roads, some features built by humans, and important natural features like rivers. Road and feature labels are also visible.
 * HYBRID: SATELLITE photograph data with road maps added. Road and feature labels are also visible.
 * SATELLITE: SATELLITE photograph data. Road and feature labels are not visible.
 * TERRAIN: Topographic data. The map includes colors, contour lines and labels, and perspective shading. Some roads and labels are also visible.
 * NONE: No tiles. The map will be rendered as an empty grid with no tiles loaded.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lcom/sucho/placepicker/MapType;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "NORMAL", "HYBRID", "SATELLITE", "TERRAIN", "NONE", "BBSales_debug"})
public enum MapType implements java.io.Serializable {
    /*public static final*/ NORMAL /* = new NORMAL() */,
    /*public static final*/ HYBRID /* = new HYBRID() */,
    /*public static final*/ SATELLITE /* = new SATELLITE() */,
    /*public static final*/ TERRAIN /* = new TERRAIN() */,
    /*public static final*/ NONE /* = new NONE() */;
    
    MapType() {
    }
}