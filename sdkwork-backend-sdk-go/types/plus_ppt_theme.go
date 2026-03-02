package types

// PPT主题样式定义
type PlusPptTheme struct {
	ThemeColors []string `json:"themeColors"`
	SubColors []string `json:"subColors"`
	ExportThemeColors []string `json:"exportThemeColors"`
	FontColor string `json:"fontColor"`
	FontName string `json:"fontName"`
	BackgroundColor string `json:"backgroundColor"`
	Shadow PlusPptThemeShadow `json:"shadow"`
	Outline PlusPptThemeOutline `json:"outline"`
}
