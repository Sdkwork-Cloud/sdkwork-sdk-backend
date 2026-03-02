using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserProfileVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public ImageMediaResource? FaceImage { get; set; }
        public VideoMediaResource? FaceVideo { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Gender { get; set; }
        public string? Status { get; set; }
        public string? CountryCode { get; set; }
        public string? ProvinceCode { get; set; }
        public string? CityCode { get; set; }
        public string? DistrictCode { get; set; }
        public string? Address { get; set; }
        public string? Bio { get; set; }
        public string? BirthDate { get; set; }
        public SocialInfoList? SocialInfoList { get; set; }
    }
}
