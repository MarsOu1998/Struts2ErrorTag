package Test;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class test2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        this.addActionError("ActionError错误1");
        this.addActionError("ActionError错误2");
        this.addActionMessage("ActionMessage1");
        this.addActionMessage("ActionMessage2");
        this.addFieldError("filederror1","字段错误1");
        this.addFieldError("filederror2","字段错误2");
        return "success";
    }
}
