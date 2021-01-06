package com.example.designpatterns.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEployee{
    Map<String,IEployee> iEployeeMap = new HashMap<String, IEployee>();
    public Leader(){
        iEployeeMap.put("编程",new EmplyoeeA());
        iEployeeMap.put("写字",new EmployeeB());
    }

    public void doing(String task){
        if (task.equals("编程")){
            IEployee b = iEployeeMap.get("编程");
            b.doing(task);
        }else if (task.equals("写字")){
            IEployee x = iEployeeMap.get("写字");
            x.doing(task);
        }else {
            System.out.println("未招收此员工");
        }
    }
}
