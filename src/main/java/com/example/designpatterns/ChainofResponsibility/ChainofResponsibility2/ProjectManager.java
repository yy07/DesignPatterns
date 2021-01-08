package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility2;

public class ProjectManager extends Handler {

    public String handleFeeRequest(String user,double fee) {
        String str="";
        //项目经理处理权限比较小，只能处理500元以内的费用申请
        if(fee<500){
            //为了测试，简单点，只同意小李的申请
            if("小李".equals(user)){
                str="项目经理同意"+user+"聚餐费用"+fee+"元的请求...";
            }
            else{
                //其他人的申请一律不同意
                str="项目经理不同意"+user+"聚餐费用"+fee+"元的请求...";
            }
        }
        else{
            //超过500元的费用申请，继续传递给级别更高的人处理
            if(this.successor!=null){
                return successor.handleFeeRequest(user, fee);
            }

        }
        return str;
    }

}
