'use strict';

app.factory('TaxonSuperFundService', ["Restangular", "$http", function(Restangular, $http) {
	return {
		getSuperfundTax : function(req) {
			var taxon = Restangular.one("finance/getSuperfundTax")
					.customPOST(req, '', {}, {
						ContentType : 'application/json'
					});
			return taxon;
		},
		
		saveSuperfundTax : function(req) {
			var saveTaxOn = Restangular.one("finance/saveSuperfundTax").customPOST(
					req, '', {}, {
						ContentType : 'application/json'
					});
			return saveTaxOn;
		},
		deleteSuperfundTax: function(req) {
			var deleteTaxon = Restangular.one("finance/deleteSuperfundTax").customPOST(
					req, '', {}, {
						ContentType : 'application/json'
					});
			return deleteTaxon;
		}
	}
}]);
