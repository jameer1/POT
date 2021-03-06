'use strict';

/**
 * @ngdoc service
 * @name potApp.module
 * @description # ProjCostCode Service in the potApp.
 */
app.factory('EmpTransferService', ["$q", "Restangular", function($q, Restangular) {
	return {

		getEmpReqTrans : function(req) {
			var getEmployees = Restangular.one("register/getEmpReqTrans")
					.customPOST(req, '', {}, {
						ContentType : 'application/json'
					});
			return getEmployees;
		},
		empReqTransOnLoad : function(req) {
			var getEmployees = Restangular.one("register/empReqTransOnLoad")
					.customPOST(req, '', {}, {
						ContentType : 'application/json'
					});
			return getEmployees;
		},
		saveEmpTransferDetails : function(req) {
			var saveEmployees = Restangular.one("register/saveEmpReqTrans")
			.customPOST(req, '', {}, {
				ContentType : 'application/json'
			});
	return saveEmployees;
},
	}
}]);
