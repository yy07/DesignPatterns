package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility2;

public class GeneralManager extends Handler {

    public String handleFeeRequest(String user,double fee) {
        String str="";
        //总经理的权限很大，只要请求到了这里，他都可以处理
        if(fee>=1000){
            //为了测试，简单点，只同意小李的申请
            if("小李".equals(user)){
                str="总经理同意"+user+"聚餐费用"+fee+"元的请求...";
            }
            else{
                //其他人的申请一律不同意
                str="总经理不同意"+user+"聚餐费用"+fee+"元的请求...";
            }
        }
        else{
            //如果还有后继的处理者对象，继续传递
            if(this.successor!=null){
                return successor.handleFeeRequest(user, fee);
            }

        }
        return str;
    }

}
