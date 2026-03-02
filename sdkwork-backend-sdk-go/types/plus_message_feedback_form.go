package types

// Chat Message Feedback Form
type PlusMessageFeedbackForm struct {
	Id string `json:"id"`
	ConversationId string `json:"conversationId"`
	Rating string `json:"rating"`
}
