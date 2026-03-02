using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class GenerateCharacterVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? RequestId { get; set; }
        public string? TaskId { get; set; }
        public string? TaskStatus { get; set; }
        public List<ImageMediaResource>? CharacterImages { get; set; }
        public string? CharacterId { get; set; }
        public string? CharacterName { get; set; }
        public string? CharacterDescription { get; set; }
        public string? Model { get; set; }
        public int? Duration { get; set; }
        public string? ErrorMessage { get; set; }
    }
}
