package struts;

import javax.servlet.http.*;
import org.apache.struts.action.*;

public class LoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// ��ActionFormǿ��ת��ΪLoginActionForm
		LoginActionForm loginForm = (LoginActionForm) form;
		// ��LoginActionForm����ȡ��ҳ������ݹ����Ĳ���
		String username = loginForm.getUsername();
		String password = loginForm.getPassword();

		// ������Щ������ִ��ҵ���߼�����
		if ("admin".equals(username) && "admin".equals(password)) {
			// ����û����������Ϊadmin����ת���¼�ɹ�ҳ��
			return mapping.findForward("success");
		} else {
			// ����ת���¼ʧ��ҳ��
			return mapping.findForward("error");
		}
	}
}
