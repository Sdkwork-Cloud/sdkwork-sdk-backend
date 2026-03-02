using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusCharacterVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? Name { get; set; }
        public string? Type { get; set; }
        public ImageMediaResource? Avatar { get; set; }
        public ImageMediaResource? ThreeViewImage { get; set; }
        public ImageMediaResource? GridShotsImage { get; set; }
        public VideoMediaResource? AvatarVideo { get; set; }
        public int? AgentId { get; set; }
        public string? Description { get; set; }
        public string? Status { get; set; }
        public string? Personality { get; set; }
        public string? Background { get; set; }
        public string? InteractionSettings { get; set; }
        public string? Version { get; set; }
        public int? UserId { get; set; }
    }
}
