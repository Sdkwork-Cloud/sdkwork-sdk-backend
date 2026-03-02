using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUser
    {
        public int? TenantId { get; set; }
        public int? OrganizationId { get; set; }
        public string? DataScope { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? V { get; set; }
        public string? Username { get; set; }
        public string? Nickname { get; set; }
        public string? Password { get; set; }
        public string? Platform { get; set; }
        public string? Type { get; set; }
        public string? Gender { get; set; }
        public ImageMediaResource? FaceImage { get; set; }
        public VideoMediaResource? FaceVideo { get; set; }
        public string? Salt { get; set; }
        public string? Scene { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? CountryCode { get; set; }
        public string? ProvinceCode { get; set; }
        public string? CityCode { get; set; }
        public string? DistrictCode { get; set; }
        public string? Address { get; set; }
        public string? Bio { get; set; }
        public string? BirthDate { get; set; }
        public GetUserInfoResponse? OauthUserInfo { get; set; }
        public string? Status { get; set; }
        public List<PlusRole>? Roles { get; set; }
        public UserMetadata? Metadata { get; set; }
        public SocialInfoList? SocialInfoList { get; set; }
        public List<string>? RoleCodes { get; set; }
        public List<GrantedAuthority>? Authorities { get; set; }
    }
}
