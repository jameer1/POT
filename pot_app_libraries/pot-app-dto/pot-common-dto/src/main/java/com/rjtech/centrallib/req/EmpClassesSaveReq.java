package com.rjtech.centrallib.req;

import java.util.ArrayList;
import java.util.List;

import com.rjtech.centrallib.dto.EmpClassTO;
import com.rjtech.common.dto.ClientTO;


public class EmpClassesSaveReq extends ClientTO {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private List<EmpClassTO> empClassTOs = new ArrayList<EmpClassTO>(5);

    public List<EmpClassTO> getEmpClassTOs() {
        return empClassTOs;
    }

    public void setEmpClassTOs(List<EmpClassTO> empClassTOs) {
        this.empClassTOs = empClassTOs;
    }

}
