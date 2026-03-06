using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class AppStoreListingConfig
    {
        public string? Platform { get; set; }
        public string? StoreAppId { get; set; }
        public string? PackageName { get; set; }
        public string? BundleId { get; set; }
        public string? ReleaseTrack { get; set; }
        public string? PrivacyPolicyUrl { get; set; }
        public string? TermsOfServiceUrl { get; set; }
        public string? SupportUrl { get; set; }
        public string? SupportEmail { get; set; }
        public string? MarketingUrl { get; set; }
        public string? Category { get; set; }
        public string? Subcategory { get; set; }
        public string? ContentRating { get; set; }
        public List<string>? Languages { get; set; }
        public List<string>? Countries { get; set; }
        public List<string>? ScreenshotUrls { get; set; }
    }
}
