using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusVoiceSpeakerVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public string? Voice { get; set; }
        public string? ChannelSpeakerId { get; set; }
        public string? Code { get; set; }
        public string? Channel { get; set; }
        public string? Gender { get; set; }
        public string? AgeType { get; set; }
        public string? Type { get; set; }
        public List<string>? Models { get; set; }
        public TagsContent? Tags { get; set; }
        public string? Status { get; set; }
        public string? Description { get; set; }
    }
}
