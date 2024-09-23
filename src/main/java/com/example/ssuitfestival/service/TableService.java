package com.example.ssuitfestival.service;

import com.example.ssuitfestival.exception.BankDepositNotFoundException;
import com.example.ssuitfestival.exception.MenuNotFoundException;
import com.example.ssuitfestival.service.dto.*;

public interface TableService {
    TableLoginReturnDto tableLogin(TableLoginParamDto tableLoginParamDto);
    TableValidateReturnDto tableValidate(TableValidateParamDto tableValidateParamDto) throws Exception;
    TableMenuReturnDto tableMenu();
    void tableOrder(TableOrderParamDto tableOrderParamDto) throws MenuNotFoundException, BankDepositNotFoundException;
    Boolean isFirstOrder(Integer tableSessionId);
}
