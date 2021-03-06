package com.ace.trade.api;

import com.ace.trade.protocl.pay.CallbackPayMentReq;
import com.ace.trade.protocl.pay.CallbackPayMentRes;
import com.ace.trade.protocl.pay.CreatePayMentReq;
import com.ace.trade.protocl.pay.CreatePayMentRes;

/**
 * Created by Administrator on 2018/3/13 0013.
 */
public interface IPayApi {
    public CreatePayMentRes createPayMent(CreatePayMentReq req);
    public CallbackPayMentRes CallbackPayMent(CallbackPayMentReq req);

}
