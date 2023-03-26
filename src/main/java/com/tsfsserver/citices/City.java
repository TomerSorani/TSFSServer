package com.tsfsserver.citices;

import java.util.Arrays;
import java.util.List;

public enum City {
    ARAD("ערד", new Line[]{}),
    KFAR_SABA("כפר-סבא", new Line[]{Line.L_1_KFAR_SABA, Line.L_2_KFAR_SABA, Line.L_3_KFAR_SABA}),
    RAANANA("רעננה", new Line[]{}),
    HERTZELIA("הרצליה", new Line[]{}),
    HOD_HAHSRON("הוד-השרון", new Line[]{}),
    RAMAT_HASHARON("רמת-השרון", new Line[]{}),
    HOLON("חולון", new Line[]{}),
    TEL_AVIV("תל-אביב", new Line[]{}),
    BAT_YAM("בת-ים", new Line[]{}),
    RAMAT_GAN("רמת-גן", new Line[]{}),
    BNEY_BRAK("בני-ברק", new Line[]{}),
    NETANYA("נתניה", new Line[]{}),
    BEER_SHEVA("באר-שבע", new Line[]{});

    private final String displayName;
    private final Line[] lines;

    City(String displayName, Line[] lines) {
        this.displayName = displayName;
        this.lines = lines;
    }

    public Line[] getLines() {
        return lines;
    }
}
