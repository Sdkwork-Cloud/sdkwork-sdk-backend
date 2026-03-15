package types

// 妫嬬墝娓告垙鐜╂硶瀹氫箟琛ㄥ崟
type PlusGameDefinitionForm struct {
	Code string `json:"code"`
	GameType string `json:"gameType"`
	Category string `json:"category"`
	Name string `json:"name"`
	Alias string `json:"alias"`
	GameModeCode string `json:"gameModeCode"`
	Description string `json:"description"`
	RuleSummary string `json:"ruleSummary"`
	MinPlayers int `json:"minPlayers"`
	MaxPlayers int `json:"maxPlayers"`
	SeatCount int `json:"seatCount"`
	TeamCount int `json:"teamCount"`
	DefaultRoundCount int `json:"defaultRoundCount"`
	TurnBased bool `json:"turnBased"`
	Ranked bool `json:"ranked"`
	SupportsSpectator bool `json:"supportsSpectator"`
	SupportsTrusteeship bool `json:"supportsTrusteeship"`
	SupportsRobot bool `json:"supportsRobot"`
	SupportsReplay bool `json:"supportsReplay"`
	SupportsFriendRoom bool `json:"supportsFriendRoom"`
	SupportsTournament bool `json:"supportsTournament"`
	SupportsClub bool `json:"supportsClub"`
	SupportsPractice bool `json:"supportsPractice"`
	DifficultyLevel int `json:"difficultyLevel"`
	TutorialUrl string `json:"tutorialUrl"`
	RankingType string `json:"rankingType"`
	DefaultRuleConfig map[string]interface{} `json:"defaultRuleConfig"`
	Metadata map[string]interface{} `json:"metadata"`
	SupportedLeaderboardPeriods []string `json:"supportedLeaderboardPeriods"`
	Enabled bool `json:"enabled"`
}
