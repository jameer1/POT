package com.rjtech.mw.controller.dashboards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rjtech.dashboards.constants.DashBoardUrlConstants;
import com.rjtech.dashboards.req.DashBoardGetReq;
import com.rjtech.dashboards.resp.DashBoardsResp;
import com.rjtech.mw.service.dashboards.MWDashBoardsRemainingBudgetService;

@RestController
@RequestMapping(DashBoardUrlConstants.DASHBOARD_URL_CONSTANTS)
public class MWDashBoardRemainingBudgetController {

    @Autowired
    private MWDashBoardsRemainingBudgetService mwDashBoardsRemainingBudgetService;

    @RequestMapping(value = DashBoardUrlConstants.GET_REMAINING_BUDGET_BY_COUNTRY, method = RequestMethod.POST)
    public ResponseEntity<DashBoardsResp> getRemainingBudgetByCountry(@RequestBody DashBoardGetReq dashBoardReq) {
        return new ResponseEntity<DashBoardsResp>(
                mwDashBoardsRemainingBudgetService.getRemainingBudgetByCountry(dashBoardReq), HttpStatus.OK);
    }

    @RequestMapping(value = DashBoardUrlConstants.GET_REMAINING_BUDGET_BY_PROVINCE, method = RequestMethod.POST)
    public ResponseEntity<DashBoardsResp> getRemainingBudgetByProvince(@RequestBody DashBoardGetReq dashBoardReq) {
        return new ResponseEntity<DashBoardsResp>(
                mwDashBoardsRemainingBudgetService.getRemainingBudgetByProvince(dashBoardReq), HttpStatus.OK);
    }

    @RequestMapping(value = DashBoardUrlConstants.GET_REMAINING_BUDGET_BY_PROJECT, method = RequestMethod.POST)
    public ResponseEntity<DashBoardsResp> getRemainingBudgetByProject(@RequestBody DashBoardGetReq dashBoardReq) {
        return new ResponseEntity<DashBoardsResp>(
                mwDashBoardsRemainingBudgetService.getRemainingBudgetByProject(dashBoardReq), HttpStatus.OK);
    }

    @RequestMapping(value = DashBoardUrlConstants.GET_REMAINING_BUDGET_BY_PROJECTMANAGER, method = RequestMethod.POST)
    public ResponseEntity<DashBoardsResp> getRemainingBudgetByProjectManager(
            @RequestBody DashBoardGetReq dashBoardReq) {
        return new ResponseEntity<DashBoardsResp>(
                mwDashBoardsRemainingBudgetService.getRemainingBudgetByProjectManager(dashBoardReq), HttpStatus.OK);
    }
}
