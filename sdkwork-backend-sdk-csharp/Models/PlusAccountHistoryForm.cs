using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusAccountHistoryForm
    {
        public string? AssetType { get; set; }
        public int? AccountId { get; set; }
        public string? TransactionId { get; set; }
        public string? TransactionType { get; set; }
        public double? Amount { get; set; }
        public double? BalanceBefore { get; set; }
        public double? BalanceAfter { get; set; }
        public int? RelatedAccountId { get; set; }
        public int? PointsChange { get; set; }
        public int? PointsBefore { get; set; }
        public int? PointsAfter { get; set; }
        public string? SourceType { get; set; }
        public string? SourceId { get; set; }
        public string? ExpiredAt { get; set; }
        public string? Status { get; set; }
        public string? Remarks { get; set; }
    }
}
