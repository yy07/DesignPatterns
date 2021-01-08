package com.example.designpatterns.ChainofResponsibility.ChainofResponsibility2;

public class DeptManager extends Handler {

    public String handleFeeRequest(String user, double fee) {
        String str = "";
        // 部门经理只能处理500元以内的费用申请
        if (fee < 1000) {
            // 为了测试，简单点，只同意小李的申请
            if ("小李".equals(user)) {
                str = "部门经理同意" + user + "聚餐费用" + fee + "元的请求...";
            } else {
                // 其他人的申请一律不同意
                str = "部门经理不同意" + user + "聚餐费用" + fee + "元的请求...";
            }
        } else {
            // 超过1000元的费用申请，继续传递给级别更高的人处理
            if (this.successor != null) {
                return successor.handleFeeRequest(user, fee);
            }

        }
        return str;
    }

}
