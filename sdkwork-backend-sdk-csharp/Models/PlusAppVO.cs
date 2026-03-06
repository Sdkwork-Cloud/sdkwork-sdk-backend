using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAppVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Name { get; set; }
        public ImageMediaResource? Icon { get; set; }
        public AssetMediaResourceList? ResourceList { get; set; }
        public int? ProjectId { get; set; }
        public string? Description { get; set; }
        public string? Version { get; set; }
        public string? IconUrl { get; set; }
        public string? AccessUrl { get; set; }
        public AppConfig? Config { get; set; }
        public string? Status { get; set; }
        public string? AppType { get; set; }
        public AppPlatforms? Platforms { get; set; }
        public AppPlatforms? InstallPlatforms { get; set; }
        public AppInstallSkill? InstallSkill { get; set; }
        public AppInstallConfig? InstallConfig { get; set; }
        public string? PackageName { get; set; }
        public string? BundleId { get; set; }
        public string? StoreUrl { get; set; }
        public string? DownloadUrl { get; set; }
    }
}
