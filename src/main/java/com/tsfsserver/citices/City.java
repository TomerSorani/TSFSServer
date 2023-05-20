package com.tsfsserver.citices;

public enum City {
    ARAD("ערד", new Line[]{Line.L_1_ARAD,Line.L_2_ARAD,Line.l_3_ARAD,Line.L_11_ARAD,Line.L_12_ARAD,Line.L_24_KSEYFA,Line.L_25_ARAD,Line.L_47_ARAD,Line.L_386_ARAD,Line.L_388_ARAD,Line.L_400_ARAD,Line.L_559_BEIT_SHEMESH}),

    KFAR_SABA("כפר-סבא", new Line[]{Line.L_1_KFAR_SABA, Line.L_2_KFAR_SABA, Line.L_3_KFAR_SABA, Line.L_8_KFAR_SABA,Line.L_9_HOD_HASHARON,Line.L_10_KFAR_SABA,Line.L_11_HOD_HASHARON,Line.L_13_KFAR_SABA,Line.L_14_KFAR_SABA,Line.L_15_KFAR_SABA,Line.L_17_KFAR_SABA,Line.L_18_RAANANA,Line.L_19_KFAR_SABA,Line.L_20_KFAR_SABA,Line.L_21_KFAR_SABA,Line.L_29_KFAR_SABA,Line.L_37_KFAR_SABA,
            Line.L_39_KFAR_SABA,Line.L_42_KFAR_SABA,Line.L_61_KFAR_SABA,Line.L_80_KFAR_SABA,Line.L_81_KFAR_SABA,Line.L_83_KFAR_SABA,Line.L_84_KFAR_SABA,Line.L_86_KFAR_SABA,Line.L_88_KFAR_SABA,Line.L_89_KFAR_SABA,Line.L_97_KFAR_SABA,Line.L_99_KFAR_SABA,
            Line.L_65_HOD_HASHARON,Line.L_70_KFAR_SABA,Line.L_72_KFAR_SABA,Line.L_91_KFAR_SABA, Line.L_113_KFAR_SABA,Line.L_118_KFAR_SABA,Line.L_123_TEL_AVIV,Line.L_124_TEL_AVIV,Line.L_139_KFAR_SABA,Line.L_140_KFAR_SABA,Line.L_142_KFAR_SABA,Line.L_145_KFAR_SABA,Line.L_148_TEL_AVIV,Line.L_149_TEL_AVIV,Line.L_213_HERTZELIYA,Line.L_222_KFAR_SABA,Line.L_228_KFAR_SABA,
            Line.L_229_KFAR_SABA,Line.L_230_KFAR_SABA,Line.L_231_KFAR_SABA,Line.L_247_TEL_AVIV,Line.L_259_KFAR_SABA,Line.L_444_ELAD,Line.L_561_KFAR_SABA,Line.L_567_KFAR_SABA,Line.L_564_KFAR_SABA,Line.L_572_TEL_AVIV,Line.L_575_TEL_AVIV,Line.L_576_KFAR_SABA,Line.L_610_NETANYA}),

    RAANANA("רעננה", new Line[]{Line.L_1_RAANANA, Line.L_2_RAANANA,Line.L_3_HERTZELIYA, Line.L_4_RAANANA,Line.L_5_RAANANA, Line.L_6_RAANANA, Line.L_8_RAANANA,Line.L_9_HERTZELIYA, Line.L_10_KFAR_SABA, Line.L_15_KFAR_SABA, Line.L_16_RAANANA, Line.L_18_RAANANA,Line.L_19_HERTZELIYA, Line.L_24_RAANANA, Line.L_29_KFAR_SABA, Line.L_30_HOD_HASHARON, Line.L_31_HERTZELIYA,Line.L_32_HERTZELIYA,
            Line.L_39_KFAR_SABA, Line.L_47_TEL_AVIV, Line.L_48_TEL_AVIV, Line.L_51_RAANANA, Line.L_54_RAANANA, Line.L_57_RAANANA, Line.L_63_HERTZELIYA, Line.L_71_RAANANA,Line.L_72_KFAR_SABA, Line.L_75_RAANANA,Line.L_76_RAANANA,Line.L_77_RAANANA,Line.L_79_RAANANA,Line.L_82_RAANANA, Line.L_83_HERTZELIYA,Line.L_84_RAANANA,Line.L_90_RAANANA,Line.L_96_RAANANA,Line.L_97_RAANANA,Line.L_98_RAANANA,Line.L_99_RAANANA,
            Line.L_139_KFAR_SABA,Line.L_147_TEL_AVIV,Line.L_213_HERTZELIYA,Line.L_228_KFAR_SABA,Line.L_229_KFAR_SABA,Line.L_230_KFAR_SABA,Line.L_247_TEL_AVIV,Line.L_347_TEL_AVIV,Line.L_501_TEL_AVIV,Line.L_504_TEL_AVIV,Line.L_505_RAANANA,Line.L_510_TEL_AVIV,Line.L_524_TEL_AVIV,Line.L_525_TEL_AVIV,Line.L_531_TEL_AVIV,Line.L_551_HERTZELIYA,Line.L_572_TEL_AVIV,Line.L_609_NETANYA}),

    HERTZELIA("הרצליה", new Line[]{Line.L_2_HERTZELIYA,Line.L_3_HERTZELIYA,Line.L_9_HERTZELIYA,Line.L_19_HERTZELIYA,Line.L_13_HERTZELIYA,Line.L_27_HERTZELIYA,Line.L_31_HERTZELIYA,Line.L_32_HERTZELIYA,Line.L_39_KFAR_SABA,Line.L_29_KFAR_SABA,Line.L_47_TEL_AVIV,Line.L_48_TEL_AVIV, Line.L_83_HERTZELIYA, Line.L_84_HERTZELIYA, Line.L_96_HERTZELIYA, Line.L_139_KFAR_SABA,Line.L_147_TEL_AVIV,Line.L_213_HERTZELIYA,Line.L_228_KFAR_SABA,Line.L_229_KFAR_SABA,Line.L_230_KFAR_SABA,
            Line.L_347_TEL_AVIV,Line.L_501_TEL_AVIV,Line.L_510_TEL_AVIV,Line.L_524_TEL_AVIV,Line.L_525_TEL_AVIV,Line.L_531_TEL_AVIV,Line.L_551_HERTZELIYA,Line.L_572_TEL_AVIV,Line.L_619_NETANYA,Line.L_621_NETANYA}),
    //ADD TALMIDIM
    HOD_HAHSRON("הוד-השרון", new Line[]{Line.L_1_HOD_HAHSRON,Line.L_4_HOD_HASHARON,Line.L_5_HOD_HASHARON,Line.L_9_HOD_HASHARON,Line.L_11_HOD_HASHARON,Line.L_12_HOD_HASHARON,Line.L_30_HOD_HASHARON,Line.L_42_KFAR_SABA,Line.L_65_HOD_HASHARON,Line.L_77_HOD_HASHARON,Line.L_73_HOD_HASHARON,Line.L_74_HOD_HASHARON,Line.L_76_HOD_HASHARON,Line.L_76_HOD_HASHARON,Line.L_78_HOD_HASHARON,Line.L_95_HOD_HASHARON,Line.L_96_HOD_HASHARON,
            Line.L_142_KFAR_SABA,Line.L_231_KFAR_SABA,Line.L_248_TEL_AVIV,Line.L_249_TEL_AVIV,Line.L_259_KFAR_SABA,Line.L_551_HERTZELIYA, Line.L_561_KFAR_SABA,Line.L_564_KFAR_SABA,Line.L_565_TEL_AVIV,Line.L_570_TEL_AVIV,}),

    RAMAT_HASHARON("רמת-השרון", new Line[]{Line.L_1_RAMAT_HASHARON,Line.L_1_RAMAT_HASHARON,Line.L_909_RAMAT_HASHARON,Line.L_621_NETANYA,Line.L_27_HERTZELIYA,Line.L_32_HERTZELIYA,Line.L_21_TEL_AVIV,Line.L_24_TEL_AVIV,Line.L_619_NETANYA,Line.L_47_TEL_AVIV,Line.L_48_TEL_AVIV,Line.L_531_TEL_AVIV,Line.L_524_TEL_AVIV,Line.L_525_TEL_AVIV}),

    HOLON("חולון", new Line[]{Line.L_2_HOLON,Line.L_22_RISHON_LETZION,Line.L_26_TEL_AVIV,Line.L_35_HOLON,Line.L_77_HOLON,Line.L_126_TEL_AVIV,Line.L_278_TEL_AVIV,Line.L_353_BEER_SHEVA,Line.L_369_TEL_AVIV}),

    TEL_AVIV("תל-אביב", new Line[]{Line.L_6_TEL_AVIV,Line.L_12_TEL_AVIV,Line.L_15_HOLON,Line.L_21_TEL_AVIV,Line.L_24_TEL_AVIV,Line.L_26_TEL_AVIV,Line.L_35_HOLON,Line.L_47_TEL_AVIV,Line.L_48_TEL_AVIV,Line.L_90_TEL_AVIV,Line.L_91_TEL_AVIV, Line.L_123_TEL_AVIV,Line.L_124_TEL_AVIV,Line.L_126_TEL_AVIV,Line.L_230_KFAR_SABA,Line.L_231_KFAR_SABA,Line.L_148_TEL_AVIV,Line.L_149_TEL_AVIV,
            Line.L_248_TEL_AVIV,Line.L_249_TEL_AVIV,Line.L_259_KFAR_SABA,Line.L_278_ELAD, Line.L_278_TEL_AVIV,Line.L_345_TEL_AVIV,Line.L_347_TEL_AVIV,Line.L_349_TEL_AVIV,Line.L_369_TEL_AVIV,Line.L_370_BEER_SHEVA,Line.L_378_TEL_AVIV,Line.L_379_ELAD,Line.L_380_BEER_SHEVA, Line.L_445_ELAD,Line.L_469_BEER_SHEVA,
            Line.L_501_TEL_AVIV,Line.L_504_TEL_AVIV,Line.L_510_TEL_AVIV,Line.L_524_TEL_AVIV,Line.L_525_TEL_AVIV,Line.L_531_TEL_AVIV,Line.L_532_TEL_AVIV,Line.L_565_TEL_AVIV,Line.L_567_KFAR_SABA, Line.L_570_TEL_AVIV,Line.L_572_TEL_AVIV,Line.L_575_TEL_AVIV,
            Line.L_600_NETANYA,Line.L_601_NETANYA,Line.L_602_NETANYA,Line.L_603_NETANYA,Line.L_604_NETANYA,Line.L_605_NETANYA,Line.L_606_NETANYA,Line.L_607_NETANYA,Line.L_608_NETANYA,Line.L_611_NETANYA,Line.L_615_NETANYA,Line.L_616_NETANYA,Line.L_621_NETANYA,Line.L_623_NETANYA,Line.L_650_NETANYA,Line.L_660_TEL_AVIV}),

    BAT_YAM("בת-ים", new Line[]{Line.L_22_RISHON_LETZION,Line.L_26_TEL_AVIV}),

    RAMAT_GAN("רמת-גן", new Line[]{Line.L_21_TEL_AVIV, Line.L_278_ELAD,Line.L_504_TEL_AVIV,Line.L_524_TEL_AVIV,Line.L_525_TEL_AVIV,Line.L_531_TEL_AVIV,Line.L_565_TEL_AVIV,Line.L_567_KFAR_SABA,Line.L_35_HOLON}),

    GIVATIM("גבעתיים", new Line[]{Line.L_35_HOLON, Line.L_278_ELAD}),

    BNEY_BRAK("בני-ברק", new Line[]{Line.L_35_HOLON,Line.L_180_ELAD,Line.L_280_ELAD, Line.L_380_ELAD,Line.L_379_ELAD, Line.L_358_BNEI_BRAK,Line.L_504_TEL_AVIV,Line.L_565_TEL_AVIV,Line.L_567_KFAR_SABA,Line.L_570_BEER_SHEVA,Line.L_612_NETANYA,Line.L_613_NETANYA,Line.L_614_NETANYA,Line.L_621_NETANYA}),

    PETAH_TIQUA("פתח-תקווה", new Line[]{Line.L_42_KFAR_SABA,Line.L_140_KFAR_SABA,Line.L_142_KFAR_SABA,Line.L_179_ELAD,Line.L_279_ELAD,Line.L_283_ELAD,Line.L_379_ELAD, Line.L_446_ELAD,Line.L_551_HERTZELIYA,Line.L_553_HERTZELIYA,Line.L_561_KFAR_SABA,Line.L_616_NETANYA}),

    ROSH_HAAYIN("ראש-העין", new Line[]{Line.L_67_ROSH_HAAYIN, Line.L_176_ELAD,Line.L_276_ELAD, Line.L_444_ELAD}),

    ELAD("אלעד", new Line[]{Line.L_004_ELAD, Line.L_005_ELAD, Line.L_006_ELAD, Line.L_173_ELAD, Line.L_174_ELAD, Line.L_176_ELAD, Line.L_179_ELAD, Line.L_180_ELAD, Line.L_251_ELAD, Line.L_270_ELAD, Line.L_276_ELAD,Line.L_277_ELAD, Line.L_278_ELAD, Line.L_279_ELAD, Line.L_280_ELAD, Line.L_281_ELAD,
            Line.L_282_ELAD, Line.L_283_ELAD, Line.L_377_ELAD, Line.L_379_ELAD, Line.L_453_ELAD, Line.L_477_ELAD, Line.L_577_ELAD}),

    QUIRYAT_UNO("קריית-אונו", new Line[]{Line.L_173_ELAD,Line.L_446_ELAD,Line.L_468_KALANSUA,Line.L_505_RAANANA,Line.L_564_KFAR_SABA,Line.L_621_NETANYA}),

    REHOVOT("רחובות", new Line[]{Line.L_251_ELAD, Line.L_282_ELAD,Line.L_367_BEER_SHEVA,Line.L_371_BEER_SHEVA,Line.L_373_BEER_SHEVA,Line.L_377_BEER_SHEVA}),

    DIMONA("דימונה", new Line[]{Line.L_47_ARAD,Line.L_55_DIMONA,Line.L_66_DIMONA,Line.L_352_ASHDOD,Line.L_357_MODIIN,Line.L_358_BNEI_BRAK,Line.L_359_DIMONA,Line.L_457_JERUSALEM,Line.L_458_JERUSALEM,Line.L_459_BEIT_SHEMESH}),

    YEROCHAM("ירוחם", new Line[]{Line.L_55_DIMONA,Line.L_150_BEER_SHEVA,Line.L_151_BEER_SHEVA,Line.L_152_BEER_SHEVA,Line.L_153_BEER_SHEVA,Line.L_357_MODIIN,Line.L_358_BNEI_BRAK,Line.L_359_DIMONA,Line.L_457_JERUSALEM,Line.L_458_JERUSALEM,Line.L_459_BEIT_SHEMESH,Line.L_660_TEL_AVIV}),

    MITZPE_RAMON("מצפה רמון", new Line[]{Line.L_55_DIMONA,Line.L_60_BEER_SHAVA,Line.L_64_BEER_SHAVA,Line.L_65_BEER_SHAVA,Line.L_160_BEER_SHEVA,Line.L_340_EILAT,Line.L_660_TEL_AVIV}),

    ODAKIM("אופקים", new Line[]{Line.L_359_DIMONA,Line.L_373_BEER_SHEVA,Line.L_378_TEL_AVIV}),

    SDEROT("שדרות", new Line[]{Line.L_145_BEER_SHEVA,Line.L_342_BEER_SHEVA,Line.L_343_BEER_SHEVA,Line.L_347_ASHDOD,Line.L_347_ASHDOD,Line.L_373_BEER_SHEVA,Line.L_353_BEER_SHEVA}),

    NETIVOT("נתיבות", new Line[]{Line.L_322_BEER_SHEVA,Line.L_353_BEER_SHEVA,Line.L_359_DIMONA,Line.L_373_BEER_SHEVA,Line.L_378_TEL_AVIV}),

    KIRYAT_GAT("קריית-גת", new Line[]{Line.L_348_ASHDOD,Line.L_352_ASHDOD,Line.L_367_BEER_SHEVA,Line.L_368_ASHDOD,Line.L_369_TEL_AVIV,Line.L_371_BEER_SHEVA,Line.L_469_BEER_SHEVA}),

    MODIIN("מודיעין", new Line[]{Line.L_281_ELAD, Line.L_357_MODIIN}),

    SHOAM("שוהם", new Line[]{Line.L_282_ELAD, Line.L_444_ELAD, Line.L_453_ELAD}),

    BAREKET("ברקת", new Line[]{Line.L_173_ELAD}),

    LOD("לוד", new Line[]{Line.L_174_ELAD, Line.L_251_ELAD, Line.L_282_ELAD}),

    YAHOD("יהוד", new Line[]{Line.L_173_ELAD, Line.L_446_ELAD}),

    YAVNE("יבנה", new Line[]{Line.L_282_ELAD, Line.L_353_BEER_SHEVA, Line.L_369_TEL_AVIV}),

    OR_YAHODA("אור יהודה", new Line[]{Line.L_173_ELAD, Line.L_446_ELAD}),

    GIVAT_SHMUEL("גבעת שמואל", new Line[]{Line.L_180_ELAD, Line.L_280_ELAD,Line.L_380_ELAD, Line.L_570_BEER_SHEVA, Line.L_358_BNEI_BRAK}),

    NATBAG("נתבג", new Line[]{Line.L_444_ELAD, Line.L_445_ELAD, Line.L_446_ELAD, Line.L_469_BEER_SHEVA}),

    ASHDOD("אשדוד", new Line[]{Line.L_56_ASHDOD,Line.L_251_ELAD,Line.L_283_ELAD, Line.L_368_ASHDOD,Line.L_347_ASHDOD,Line.L_348_ASHDOD,Line.L_352_ASHDOD }),

    JERUSALEM("ירושלים", new Line[]{Line.L_277_ELAD ,Line.L_377_ELAD, Line.L_453_ELAD, Line.L_457_JERUSALEM, Line.L_458_JERUSALEM, Line.L_477_ELAD, Line.L_577_ELAD}),

    BEIT_SHEMESH("בית-שמש", new Line[]{Line.L_624_NETANYA, Line.L_459_BEIT_SHEMESH,Line.L_559_BEIT_SHEMESH}),

    TIBE("טייבה", new Line[]{Line.L_1_TIBE, Line.L_13_KFAR_SABA,Line.L_23_BEIT_BEREL,Line.L_123_TEL_AVIV,Line.L_140_KFAR_SABA,Line.L_213_HERTZELIYA,Line.L_468_KALANSUA}),

    TIRA("טירה", new Line[]{Line.L_3_TIRA,Line.L_4_TIRA, Line.L_13_KFAR_SABA,Line.L_23_BEIT_BEREL,Line.L_113_KFAR_SABA,Line.L_124_TEL_AVIV,Line.L_142_KFAR_SABA,Line.L_213_HERTZELIYA,Line.L_298_BEIT_BEREL,Line.L_468_KALANSUA }),

    KALANSUA("קלנסואה", new Line[]{Line.L_13_KFAR_SABA,Line.L_23_BEIT_BEREL,Line.L_113_KFAR_SABA,Line.L_123_TEL_AVIV,Line.L_140_KFAR_SABA,Line.L_213_HERTZELIYA,Line.L_468_KALANSUA}),

    RISHON_LETZION("ראשון-לציון", new Line[]{Line.L_22_RISHON_LETZION,Line.L_2_HOLON,Line.L_77_HOLON,Line.L_126_TEL_AVIV,Line.L_353_BEER_SHEVA,Line.L_367_BEER_SHEVA,Line.L_369_TEL_AVIV,Line.L_377_BEER_SHEVA,Line.L_371_BEER_SHEVA}),

    NETANYA("נתניה", new Line[]{Line.L_270_ELAD,Line.L_600_NETANYA,Line.L_601_NETANYA,Line.L_601_NETANYA,Line.L_602_NETANYA,Line.L_603_NETANYA,Line.L_604_NETANYA,Line.L_605_NETANYA,Line.L_606_NETANYA,Line.L_607_NETANYA,Line.L_608_NETANYA,Line.L_609_NETANYA,Line.L_610_NETANYA,
            Line.L_611_NETANYA,Line.L_612_NETANYA,Line.L_613_NETANYA,Line.L_614_NETANYA,Line.L_615_NETANYA,Line.L_616_NETANYA,Line.L_617_NETANYA,Line.L_619_NETANYA,Line.L_621_NETANYA,Line.L_624_NETANYA,Line.L_650_NETANYA,Line.L_699_NETANYA}),

    BEER_SHEVA("באר-שבע", new Line[]{Line.L_10_TEL_SHEVA,Line.L_15_TEL_SHEVA,Line.L_20_KSEYFA,Line.L_21_DERIJAT,Line.L_26_BEER_SHEVA,Line.L_28_MITAR,Line.L_30_LAKIYA,Line.L_36_BEER_SHEVA,Line.L_37_KFAR_SABA,Line.L_44_BEER_SHEVA,Line.L_45_BEER_SHEVA,Line.L_46_BEER_SHAVA,Line.L_50_ARARA_DAROM,Line.L_54_BEER_SHEVA,Line.L_59_BEER_SHAVA,Line.L_60_BEER_SHAVA,Line.L_62_BEER_SHAVA,Line.L_64_BEER_SHAVA,Line.L_65_BEER_SHAVA,Line.L_67_BEER_SHAVA,
            Line.L_68_BEER_SHAVA,Line.L_70_BEER_SHAVA,Line.l_126_BEER_SHEVA,Line.L_140_BEER_SHEVA,Line.L_142_BEER_SHEVA,Line.L_144_BEER_SHEVA,Line.L_150_BEER_SHEVA,Line.L_151_BEER_SHEVA,Line.L_152_BEER_SHEVA,Line.L_153_BEER_SHEVA,Line.L_160_BEER_SHEVA,Line.L_170_BEER_SHAVA,Line.L_322_BEER_SHEVA,Line.L_343_BEER_SHEVA,Line.L_348_ASHDOD,Line.L_353_BEER_SHEVA,Line.L_357_MODIIN,Line.L_358_BNEI_BRAK,Line.L_359_DIMONA,Line.L_367_BEER_SHEVA,Line.L_368_ASHDOD,
            Line.L_369_TEL_AVIV,Line.L_370_BEER_SHEVA,Line.L_371_BEER_SHEVA,Line.L_377_BEER_SHEVA,Line.L_380_BEER_SHEVA,Line.L_386_ARAD,Line.L_388_ARAD,Line.L_458_JERUSALEM,Line.L_469_BEER_SHEVA,Line.L_660_TEL_AVIV,Line.L_669_BEER_SHEVA});

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
