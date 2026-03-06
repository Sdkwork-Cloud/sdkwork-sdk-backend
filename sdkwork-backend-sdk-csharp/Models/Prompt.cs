using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class Prompt
    {
        public string? Contents { get; set; }
        public ChatOptions? Options { get; set; }
        public List<Message>? Instructions { get; set; }
        public Message? LastUserOrToolResponseMessage { get; set; }
        public List<SystemMessage>? SystemMessages { get; set; }
        public List<UserMessage>? UserMessages { get; set; }
        public UserMessage? UserMessage { get; set; }
        public SystemMessage? SystemMessage { get; set; }
    }
}
