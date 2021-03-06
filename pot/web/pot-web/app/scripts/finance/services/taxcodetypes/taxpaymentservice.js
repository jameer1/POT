'use strict';

app.factory('TaxPaymentService', ["Restangular", function(Restangular) {
	
	return {
		getTaxPayment : function(req) {
			var getStatus = Restangular.one("finance/getPaymentReceiver").customPOST(req,
					'', {}, {
						ContentType : 'application/json'
					});
			return getStatus;
		},
		saveTaxPayment : function(req) {
			var saveStatus = Restangular.one("finance/savePaymentReceiver").customPOST(
					req, '', {}, {
						ContentType : 'application/json'
					});
			return saveStatus;
		},
		deleteTaxPayment : function(req) {
			var deleteStatus = Restangular.one("finance/deletePaymentReceiver").customPOST(req, '', {}, {
						ContentType : 'application/json'
					});
			return deleteStatus;
		}

	}

}]);
