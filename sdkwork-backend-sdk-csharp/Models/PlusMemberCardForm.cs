using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusMemberCardForm
    {
        public PlusCard? Card { get; set; }
        public bool? SupplyBonus { get; set; }
        public bool? SupplyBalance { get; set; }
        public string? BonusName { get; set; }
        public string? BalanceName { get; set; }
        public string? Prerogative { get; set; }
        public bool? AutoActivate { get; set; }
        public bool? WxActivate { get; set; }
        public int? CostMoneyUnit { get; set; }
        public int? IncreaseBonus { get; set; }
        public int? InitIncreaseBonus { get; set; }
        public int? MaxIncreaseBonus { get; set; }
        public int? CostBonusUnit { get; set; }
        public int? ReduceMoney { get; set; }
        public int? LeastMoneyToUseBonus { get; set; }
        public int? MaxReduceBonus { get; set; }
    }
}
