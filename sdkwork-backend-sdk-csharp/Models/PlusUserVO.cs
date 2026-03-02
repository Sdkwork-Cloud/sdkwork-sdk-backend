using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public ImageMediaResource? FaceImage { get; set; }
        public ImageMediaResource? FaceVideo { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Gender { get; set; }
        public string? Status { get; set; }
        public List<int>? RoleIds { get; set; }
        public List<string>? RoleNames { get; set; }
        public SocialInfoList? SocialInfoList { get; set; }
    }
}
