package struts;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 将ActionForm强制转换为LoginActionForm
		LoginActionForm loginForm = (LoginActionForm) form;
		// 从LoginActionForm中提取从页面表单传递过来的参数
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();

		// 根据这些参数，执行业务逻辑操作
		if ("admin".equals(username) && "admin".equals(password)) {
			// 如果用户名和密码均为admin，则转向登录成功页面
			return mapping.findForward("success");
		} else {
			// 否则转向登录失败页面
			return mapping.findForward("error");
		}
	}
}
