package com.sdkwork.backend

data class PlusPptTheme(
    val themeColors: List<String>? = null,
    val subColors: List<String>? = null,
    val exportThemeColors: List<String>? = null,
    val fontColor: String? = null,
    val fontName: String? = null,
    val backgroundColor: String? = null,
    val shadow: PlusPptThemeShadow? = null,
    val outline: PlusPptThemeOutline? = null
)
