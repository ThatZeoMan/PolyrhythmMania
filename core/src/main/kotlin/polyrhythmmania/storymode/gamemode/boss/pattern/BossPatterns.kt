package polyrhythmmania.storymode.gamemode.boss.pattern


/**
 * NOTE: This pattern repository is kept entirely separate from [polyrhythmmania.gamemodes.endlessmode.EndlessPatterns]
 * so changes to one do not inadvertently affect the other.
 */
object BossPatterns {

    const val BOSS_INPUT_PATTERNS_VERSION: Int = 1

    /*
    From CubeType.kt:
    '-' -> NONE
    'P' -> PISTON
    '#' -> PLATFORM
    
    '_' -> NO_CHANGE
    'O' -> PISTON_OPEN
     */

    val boss1_x_pat0 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P---P---##",
    )
    val boss1_x_pat1 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_x_pat2 = Pattern(
        rowUpside   = "##P-#P-P-#",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_x_pat3 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P--P--P--#",
    )
    val boss1_x_pat4 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-#P-P-###",
    )
    val boss1_x_pat5 = Pattern(
        rowUpside   = "##P-P-P-##",
        rowDownside = "P-#P-P-###",
    )
    val boss1_x_pat6 = Pattern(
        rowUpside   = "##P-P-P-##",
        rowDownside = "#P-P-P-###",
    )
    val boss1_x_pat7 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P---#P---#",
    )
    val boss1_x_pat8 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-#P-P-P-#",
    )
    val boss1_x_pat9 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "#P-P-P-P-#",
    )
    val boss1_x_pat10 = Pattern(
        rowUpside   = "####P-P-##",
        rowDownside = "#P-P-P-###",
    )
    val boss1_x_pat11 = Pattern(
        rowUpside   = "##P-P-P-##",
        rowDownside = "#P-P-P-P-#",
    )
    val boss1_x_pat12 = Pattern(
        rowUpside   = "###P-##P-#",
        rowDownside = "#PP-#PP-##",
    )


    val boss1_c_var1_pat0 = Pattern(
        rowUpside   = "#P-#P-P-##",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_c_var1_pat1 = Pattern(
        rowUpside   = "#P-#P-P-##",
        rowDownside = "P---P---##",
    )
    val boss1_c_var1_pat2 = Pattern(
        rowUpside   = "#P-#P-P-##",
        rowDownside = "P--PP--###",
    )
    
    val boss1_c_var2_pat0 = Pattern(
        rowUpside   = "#P-P-#P-##",
        rowDownside = "P-P-##P-##",
    )
    val boss1_c_var2_pat1 = Pattern(
        rowUpside   = "#P-P-#P-##",
        rowDownside = "P-P-#PP-##",
    )
    val boss1_c_var2_pat2 = Pattern(
        rowUpside   = "#P-P-#P-##",
        rowDownside = "P-PP-#P-##",
    )
    
    val boss1_c_var3_pat0 = Pattern(
        rowUpside   = "P--P--P--#",
        rowDownside = "P--P--P--#",
    )
    val boss1_c_var3_pat1 = Pattern(
        rowUpside   = "P--P--P--#",
        rowDownside = "P-P-#P-###",
    )
    val boss1_c_var3_pat2 = Pattern(
        rowUpside   = "P--P--P--#",
        rowDownside = "P-P-P-P-##",
    )


    val boss1_d_var1_pat0 = Pattern(
        rowUpside   = "#####P-P-P-",
        rowDownside = "#P-P-P-P-P-",
    )
    val boss1_d_var1_pat1 = Pattern(
        rowUpside   = "#P---P---P-",
        rowDownside = "#P-P-P-P-P-",
    )
    
    val boss1_d_var2_pat0 = Pattern(
        rowUpside   = "##P-##P-P-",
        rowDownside = "P-P-P-P-P-",
    )
    val boss1_d_var2_pat1 = Pattern(
        rowUpside   = "##P-P-##P-",
        rowDownside = "P-P-P-P-P-",
    )
    
    val boss1_d_var3_pat0 = Pattern(
        rowUpside   = "#####P-P-P-",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_d_var3_pat1 = Pattern(
        rowUpside   = "#P-##P-P-P-",
        rowDownside = "P-P-P-#P-#",
    )
    
    
    val boss1_e_samurai_pat0 = Pattern(
        rowUpside   = "#P-#######",
        rowDownside = "P-########",
    )
    val boss1_e_samurai_pat1 = Pattern(
        rowUpside   = "#PPPPPPP-#",
        rowDownside = "P-########",
    )
    val boss1_e_stomp_pat0 = Pattern(
        rowUpside   = "#P--PPP--#",
        rowDownside = "P--P--P--#",
    )
    val boss1_e_bunny_pat0 = Pattern(
        rowUpside   = "##P--P--##",
        rowDownside = "##P-P-####",
    )
    val boss1_e_tap_pat0 = Pattern(
        rowUpside   = "##P-P-####",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_e_toss_pat0 = Pattern(
        rowUpside   = "#P-P-P-P-#",
        rowDownside = "----------",
    )
    val boss1_e_toss_pat1 = Pattern(
        rowUpside   = "----------",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_e_spaceball_pat0 = Pattern(
        rowUpside   = "P-P-######",
        rowDownside = "P-P-######",
    )
    val boss1_e_spaceball_ssp_start = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "....####P#",
        rowDownsideTailEnd = "#.",
        silent = true
    )
    val boss1_e_spaceball_ssp_flicker0 = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "........#.",
        rowDownsideTailEnd = "..",
        silent = true
    )
    val boss1_e_spaceball_ssp_flicker1 = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "........P.",
        rowDownsideTailEnd = "..",
        silent = true
    )
    val boss1_e_spaceball_ssp_end = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "........P-",
        rowDownsideTailEnd = "--",
        silent = false
    )
    val boss1_e_badminton_pat0 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-#P-P-###",
    )
    val boss1_e_badminton_ssp_start = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "######P---",
        rowDownsideTailEnd = "..",
        silent = false
    )
    val boss1_e_badminton_ssp_cue = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "......^...",
        rowDownsideTailEnd = "..",
        silent = false
    )
    val boss1_e_badminton_ssp_end = Pattern(
        rowUpside   = "..........",
        rowUpsideTailEnd = "..",
        rowDownside = "......P...",
        rowDownsideTailEnd = "..",
        silent = false
    )
    
    
    val boss1_f_var1_pat0 = Pattern(
        rowUpside   = "#P-P-P-P-#",
        rowDownside = "P--###P--#",
    )
    val boss1_f_var1_pat1 = Pattern(
        rowUpside   = "#P-P-P-P-#",
        rowDownside = "P--P--P--#",
    )
    
    val boss1_f_var2_pat0 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-#P-P-###",
    )
    val boss1_f_var2_pat1 = Pattern(
        rowUpside   = "##P---P---",
        rowDownside = "P-#P-P-P-#",
    )
    
    val boss1_f_var3_pat0 = Pattern(
        rowUpside   = "P--P--P--#",
        rowDownside = "P-P-P-P-##",
    )
    val boss1_f_var3_pat1 = Pattern(
        rowUpside   = "PP-P--P---",
        rowDownside = "P-P-P-P-##",
    )

    
    val endlessEasy: List<Pattern> = listOf(
        Pattern(rowUpside = "##P---P---", rowDownside = "P---P---"), // This should stay first
        Pattern(rowUpside = "P--PP-P-#", rowDownside = ""),
        Pattern(rowUpside = "######P-", rowDownside = "P-P-P-P-"),
        Pattern(rowUpside = "##P---P-", rowDownside = "P-P-P-P-"),
        Pattern(rowUpside = "P-P-P-P-", rowDownside = "P-P-P-P-"),
        Pattern(rowUpside = "P---P---", rowDownside = "P-P-P-P-"),
        Pattern(rowUpside = "P-PP--##", rowDownside = "P--P--##"),
        Pattern(rowUpside = "P----P-#", rowDownside = "####P--#"),
        Pattern(rowUpside = "P-P---##", rowDownside = "####P-##"),
        Pattern(rowUpside = "#P-P---#", rowDownside = "#P---P-#"),
        Pattern(rowUpside = "##P--P-#", rowDownside = "##P--P-#"),
        Pattern(rowUpside = "#P-P---#", rowDownside = "#P---P-#"),
        Pattern(rowUpside = "P--P---#", rowDownside = "#P-P-P-#"),
    )
    val endlessMedium: List<Pattern> = listOf(
        Pattern(rowUpside = "P-P-P-P-", rowDownside = "###P--P--"),
        Pattern(rowUpside = "P-P-P-P-", rowDownside = "P--P--P--"),
        Pattern(rowUpside = "P-##P-P-", rowDownside = "P--P--P--"),
        Pattern(rowUpside = "P--P--", rowDownside = "####P-"),
        Pattern(rowUpside = "P--P--P--", rowDownside = "####P-"),
        Pattern(rowUpside = "P--P--", rowDownside = "P---P---"),
        Pattern(rowUpside = "P--P--P--", rowDownside = "P---P---"),
        Pattern(rowUpside = "#P-P-P-P-", rowDownside = "##P---P---"),
        Pattern(rowUpside = "#P-##P-P-#", rowDownside = "##P-##P-##"),
        Pattern(rowUpside = "P-P--P-#", rowDownside = "P--P-P-#"),
        Pattern(rowUpside = "P-P-P-##", rowDownside = "#P-P-###"),
        Pattern(rowUpside = "P-P-P-P-##", rowDownside = "#P-P-P-###"),
        Pattern(rowUpside = "P---P-P-", rowDownside = "##P--P--"),
        Pattern(rowUpside = "P---P---", rowDownside = "P-P--P--"),
        Pattern(rowUpside = "#P--PP-#", rowDownside = "PP--PP-#"),
        Pattern(rowUpside = "P--PP--#", rowDownside = "##P--P-#"),
        Pattern(rowUpside = "PP---P--#", rowDownside = "##PP--P-#"),
        Pattern(rowUpside = "#P---PP-", rowDownside = "P-PPP---"),
        Pattern(rowUpside = "PP-P-PP-", rowDownside = ""),
        Pattern(rowUpside = "PPPP-P-#", rowDownside = ""),
    )

}
